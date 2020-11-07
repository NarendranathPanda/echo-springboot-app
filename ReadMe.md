# Regular way
build: 
  mvn clean install 

test:
  mvn test 
run: 
  java -jar target/echo.jar

# Container way 

  
build : 
 docker build -t narenp/echo-springboot-app .
run: 
 docker run -d -p 8080:8080 narenp/echo-springboot-app --name=echo
   
# URLS
default url  : http://localhost:8080/
to test echo : http://localhost:8080/echo?value=hello

health check : http://localhost:8080/healthz
metric url: http://localhost:8080/metrics

