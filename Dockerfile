FROM openjdk:17
LABEL maintainer="susmita.net"
ADD target/spring-boot-docker1.jar spring-boot-docker1.jar
ENTRYPOINT ["java","-jar","spring-boot-docker1.jar"]