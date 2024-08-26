# Use an official openjdk image as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper scripts and project files to the container
COPY mvnw .
COPY mvnw.cmd .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Install Maven and package the Gatling simulation
RUN apt-get update && apt-get install -y maven
RUN ./mvnw clean package

# Set environment variables for custom parameters
ARG baseUrl
ARG userCount
ARG durationSeconds


CMD ["./mvnw", "test", "-Dtest=io.gatling.demo.Main"]
# Run the Gatling simulation with custom parameters
#CMD ["./mvnw", "gatling:test", "-Dgatling.simulationClass=io.test.Main", "-DbaseUrl=${baseUrl}", "-DuserCount=${userCount}", "-DdurationSeconds=${durationSeconds}"]
