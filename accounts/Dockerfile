
# Start with a base image containing Java Runtime
FROM eclipse-temurin:25-jre

# Information around who maintains the image
LABEL "org.opencontainers.image.authors"="easybytes.com"

# Add the application's JAR to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]