
FROM openjdk:8u171-jre-alpine

#Working directory
WORKDIR /app

COPY target/test-setup.jar ./test-setup.jar

CMD ["java", "-jar", "./test-setup.jar"]
