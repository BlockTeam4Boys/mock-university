FROM openjdk:8-jdk-alpine
ADD ./target/mock.jar mock.jar
EXPOSE 8888
CMD java -jar mock.jar
