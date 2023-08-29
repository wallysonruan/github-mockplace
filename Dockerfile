FROM openjdk:17-oracle
RUN microdnf install findutils
COPY /backend/build/libs/catalog-0.0.1-SNAPSHOT.jar ./home
WORKDIR /home/

EXPOSE 8080

CMD java -jar ./catalog-0.0.1-SNAPSHOT.jar
