FROM openjdk:18-alpine AS build

RUN apk add --no-cache curl tar bash

COPY . .

RUN ./mvnw clean package -Pprod

FROM openjdk:18-alpine

COPY --from=build /target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
