How to run SuperGeeVids from your machine

Extract contents of SuperGeeVids.zip



# run the attached database backup from a mysql database (/SuperGeeVid/Dump20180219.sql)
# edit datasource from /SuperGeeVid/supervid-api/src/main/resources/application.properties according to your machine

#login saved in db - 
username: basil
password: basil


Run the command below
========================
$> cd SuperGeeVids
$> ./mvnw install && ./mvnw spring-boot:run -pl supervid-api

(I have used a maven wrapper to support a multi-module application.)

# This will install all necessary Spring dependencies, build and run the application from the intergration module which is supervid-api

# Once Started open the swagger page to test the backend
http://localhost:8333/supergroup/swagger-ui.html


Code
==================

The app is divided into 4 Modules that handle different components of the applicatin

* supervid-api - This is the point of integration, it exposes a restapi which can be used by other application to use the backend
 	
* supervid-common - This is a repository for all utilities used by the code, includes portions of code that are shared within the applion

* supervid-persistence -  Handles db related stuff

* supervid-businesslogic - Complex logic of code



