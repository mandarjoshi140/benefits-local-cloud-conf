# benefits-local-cloud-conf
To setup local spring cloud server

# Prerequisites
- Java
- Gradle
- Spring cloud config files 

# Setup
Update application.properties with the location of your config file
```
spring.cloud.config.server.native.search-locations=file:///C:/workspace/config
```
Currently the server will run in 8888 port. If you want, update it in the same file.
# Running the application
Run following command in cmd 
```
gradle bootRun
```
# Outcome 
You should be able to get your configurations using following paths
```
/{application}/{profile}
/{application}-{profile}.yml
/{application}-{profile}.properties
```
In which {application} refers to the client’s application name and the {profile} to the client’s current active application profile.