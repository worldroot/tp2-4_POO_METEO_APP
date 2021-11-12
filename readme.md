#Dependencies 

----
### 1. Spring web java
	
A Spring MVC is a Java framework which is used to build web applications. It follows the Model-View-Controller design pattern. It implements all the basic features of a core spring framework like Inversion of Control, Dependency Injection.

----

### 2. Spring Data JPA

Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers. It makes it easier to build Spring-powered applications that use data access technologies.

Implementing a data access layer of an application has been cumbersome for quite a while. Too much boilerplate code has to be written to execute simple queries as well as perform pagination, and auditing. Spring Data JPA aims to significantly improve the implementation of data access layers by reducing the effort to the amount that’s actually needed. As a developer you write your repository interfaces, including custom finder methods, and Spring will provide the implementation automatically.

----
###3. Hibernate

Hibernate is one of the popular implementations of JPA. Hibernate understands the mappings that we add between objects and tables. It ensures that data is stored/retrieved from the database based on the mappings.

---
###4. H2

H2 is one of the popular in-memory databases written in Java. H2 can be embedded in Java applications or run in the client-server mode.
Spring Boot provides excellent integration support for H2 using simple properties configuration.
To make itself even more helpful, H2 also provides a console view to maintain and interact with the database tables and data using the GUI interface.

###5 Devtools


DevTools stands for Developer Tool. The aim of the module is to try and improve the development time while working with the Spring Boot application. Spring Boot DevTools pick up the changes and restart the application. We can implement the DevTools in our project by adding the following dependency in the pom. xml file.

---
###6  Thymeleaf

The Thymeleaf is an open-source Java library that is licensed under the Apache License 2.0. ... It is a server-side Java template engine for both web (servlet-based) and non-web (offline) environments. It is perfect for modern-day HTML5 JVM web development. It provides full integration with Spring Framework.


1. Avec quelle partie du code avons-nous param´etr´e l’url d’appel /greeting ?
2. Avec quelle partie du code avons-nous choisi le fichier HTML `a afficher ?
3. Comment envoyons-nous le nom `a qui nous disons bonjour avec le second lien ?
Etape 17 
La Table Address a ete créer

Etape 18 ´
Expliquez l’apparition de la nouvelle table en vous aidant de vos cours sur Hibernate, et
de la d´ependance Hibernate de Spring. Ajoutez la r´eponse dans le README.

Etape 20
SELECT * FROM ADDRESS;
ID  	CONTENT  	CREATION  
1	57 boulevard demorieux	2021-11-05 17:15:32.37
2	51 allee du gamay , 34080 montpellier	2021-11-05 17:15:32.378


 Faut-il une cl´e API pour appeler Meteo Concept ?
 Oui biensur il faut un clé API pour avoir accés aux ressources du endpoint de meteo concept
— Quelle URL appeler ?
https://api.meteo-concept.com/api/forecast/daily
— Quelle methode HTTP utiliser ?
GET
— Comment passer les parametres d’appels ?
A travers des request params dans l'url ou dans le header

— O`u est l’information dont j’ai besoin dans la r´eponse :
tmin	integer	Température minimale à 2 mètres en °C
tmax	integer	Température maximale à 2 mètres en °C


— Pour afficher la temp´erature du lieu vis´e par les coordonn´ees GPS

— Pour afficher la prevision de m´et´eo du lieu vis´e par les coordonn´ees GP

https://api.meteo-concept.com/api/forecast/daily?insee=city_code


GITHUB LINK: https://github.com/worldroot/tp2-4_POO_METEO_APP