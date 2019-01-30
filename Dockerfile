FROM openjdk:8-alpine

COPY target/uberjar/clojure-sample.jar /clojure-sample/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojure-sample/app.jar"]
