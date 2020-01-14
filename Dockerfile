FROM openjdk:8
EXPOSE 8090
ADD target/boot-jenkins-docker.jar boot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/boot-jenkins-docker.jar"]