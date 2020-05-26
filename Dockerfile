FROM openjdk:8-jdk-alpine
ADD ./target/mockuniver.jar mockuniver.jar
EXPOSE 8888
CMD java -jar mockuniver.jar
