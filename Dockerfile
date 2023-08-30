FROM eclipse-temurin:17

COPY /backend/build/libs/*.jar ./usr/src

EXPOSE 8080

CMD java -jar ./usr/src/*.jar
