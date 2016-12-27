FROM frolvlad/alpine-oraclejdk8:slim
ADD ./target/*-SNAPSHOT.jar /opt/app/hello-world.jar
WORKDIR /opt/app
CMD java -jar hello-world.jar