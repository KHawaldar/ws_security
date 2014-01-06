ws_security
===========

This project will show simple way for  achieving the message level security.

Create a public -private key using keytool
Add the private key to keystore.jks
Store the public key in truststore.

At server side , in genereated xml file (pacakage namae with class file) ex: wsit-com.security.ws.cc.UserTknCreditCardService.xml
add the keystore location as follows
 <sc:KeyStore wspp:visibility="private" location="F:\development\glassfish-4.0\glassfish4\glassfish\domains\domain1\config\keystore.jks" type="JKS" storepass="changeit" alias="wssecurity"/>
 
 This is implemented in glassfish server. 
 
 Create the new user and password under any type of secure realm. 
 Here , I have shown the  file realm.

Open the admin console-->Configurations--->server-config-->Security-->Select the Default realm as file

to add the user , click the Manage users under file realms(security--->file-->Manage users)
-------------
How to add the ws-secure policy to the wsdl.
Use the NetBean IDE.
Open the web services, right click on it, and select the Edit Web Service Attributes.
Check the Secure service--> select the UserName authentication with symmetric keys
Click Config-->select the UserName as Autentication token.
Click Keystore--> Specify the keystore location and load the aliases using the keystore password.

Once done, the NetBean IDE generates the xml file. 
Generate the wsdl file using the wsgen, where we can see the policy file is being attached the wsdl.
