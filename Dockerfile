FROM openjdk:8

RUN mkdir peea
COPY target/peeaSpringBoot-0.0.1-SNAPSHOT.jar ./peea
ENTRYPOINT java -jar -Djava.net.preferIPv4Stack=true  -Dspring.profiles.active=docker ./peea/peeaSpringBoot-0.0.1-SNAPSHOT.jar