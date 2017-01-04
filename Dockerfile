FROM frolvlad/alpine-oraclejdk8:slim
ADD ./target/*-SNAPSHOT.jar /opt/app/spring-boot-test.jar
WORKDIR /opt/app
CMD java -jar spring-boot-test.jar