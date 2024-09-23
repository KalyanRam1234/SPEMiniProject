FROM openjdk:11

COPY ./spe/target/spe-1.0-SNAPSHOT-jar-with-dependencies.jar ./

WORKDIR ./

CMD ["java", "-jar","spe-1.0-SNAPSHOT-jar-with-dependencies.jar"]
# ENTRYPOINT ["java", "-jar", "spe-1.0-SNAPSHOT-jar-with-dependencies.jar"]