FROM maven:latest AS build
WORKDIR /moneymind
COPY ./moneymind/pom.xml .
RUN mvn dependency:go-offline

COPY ./moneymind/src ./src
RUN mvn package

FROM openjdk:latest
WORKDIR /moneymind
COPY --from=build /moneymind /moneymind

CMD ["java", "-cp", "/moneymind", "com.fatecapi.moneymind.MoneymindApplication"]
