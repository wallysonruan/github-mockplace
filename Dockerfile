FROM openjdk:17-oracle

COPY /backend/build/libs/catalog-0.0.1-SNAPSHOT.jar ./usr/src

EXPOSE 8080

CMD java -jar ./usr/src/catalog-0.0.1-SNAPSHOT.jar
