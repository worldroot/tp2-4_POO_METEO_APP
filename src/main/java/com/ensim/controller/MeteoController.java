package com.ensim.controller;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;


import com.ensim.model.Address;
import com.ensim.model.AddressRepository;

@Controller
public class MeteoController {
	
	@Autowired
	AddressRepository addressRepository ;
	
	@PostMapping ("/meteo")
	public String createAddress ( @RequestParam("address") String addresse, Model model) {
		System.out.println("address:"+ 	addresse);
		
		//addressRepository.save(adr);
        model.addAttribute("address", addresse);
        
        String uri = "https://api-adresse.data.gouv.fr/search/?q="+addresse;
        RestTemplate restTemplate = new RestTemplate();
        String result =  restTemplate.getForObject(uri, String.class);
        
        

        JSONObject jsonObject = new JSONObject(result);
        
        System.out.println("Resultat:"+ jsonObject	);
        JSONArray arr = jsonObject.getJSONArray("features");
        
        JSONObject propertiesObject = new JSONObject(arr.getJSONObject(0).get("properties"));
        arr.getJSONObject(0).getJSONObject("properties").get("citycode");
        
        
        
      //  model.addAttribute("GEO",   arr.getJSONObject(0).getJSONObject("properties").get("citycode"));
        
        String token = "83db2eff867db32b62d221e86fe6d998c5779aa11803e81ff104dc27b861a1fa";
        // api meto
        String urimeteo = "https://api.meteo-concept.com/api/forecast/daily?token="+token+"&insee="+arr.getJSONObject(0).getJSONObject("properties").get("citycode");
        RestTemplate restTemplate2 = new RestTemplate();
        String result2 =  restTemplate2.getForObject(urimeteo, String.class);
        
        JSONObject jsonObject2 = new JSONObject(result2);

        
        model.addAttribute("GEO", jsonObject2);



		
		return "meteo";
	}
}
