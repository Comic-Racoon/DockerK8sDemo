
#download java
FROM openjdk:11
#copy jar from local to image
ARG JAR_FILE=target/docker-k8sDemo-0.0.1-SNAPSHOT.jar
ARG App_home=/opt/deployment/

RUN mkdir $App_home

COPY  ${JAR_FILE} ${App_home}app.jar

WORKDIR ${App_home}

EXPOSE 8080
#run application

ENTRYPOINT ["java", "-jar", "app.jar"]