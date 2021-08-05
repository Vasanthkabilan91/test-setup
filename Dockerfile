FROM java:8

EXPOSE 8080

ADD target/test-setup.jar test-setup.jar

ENTRYPOINT ["java", "-jar", "test-setup.jar"]