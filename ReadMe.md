# Regular way
####################
build: 
  mvn clean install 

run: 
  java -jar target/echo.jar

# Container way 
##################
  
build : 
  docker build -t narenp/echo-springboot-app .
run: 
  docker run -p 8080:8080 narenp/echo-springboot-app 
  
  
  
  
  


default url  : http://localhost:8080/
to test echo : http://localhost:8080/?value=hello

health check : http://localhost:8080/healthz
