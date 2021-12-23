# WEB Automation 
---

WEB automation project



## Pre-requisites:

- Java 8
- Maven
- Docker
- Docker Compose



###DOCKER

```
sudo docker run -d -p 4444:4444 -e SE_NODE_MAX_SESSIONS=16 -e SE_NODE_OVERRIDE_MAX_SESSIONS=true --shm-size="2g" selenium/standalone-chrome:4.1.0-20211209
```

```
sudo docker run -d -p 4444:4444 -e SE_NODE_MAX_SESSIONS=16 -e SE_NODE_OVERRIDE_MAX_SESSIONS=true --shm-size="2g" selenium/standalone-firefox:4.1.0-20211209
```



###DOCKER-COMPOSE

```
sudo docker-compose up
```

```
sudo docker-compose -f docker-compose.yml up -d
```

```
sudo docker-compose down
```



###Running Tests

```
mvn clean test
```



###Accessing remote GRID 

```
http://localhost:4444/ui/index.html#/
```



###DOCKERFILE

```
sudo docker build .
```
