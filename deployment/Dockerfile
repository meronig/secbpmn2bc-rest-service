# Use an official Node.js runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the project’s jar file into the container
COPY secbpmn2bc-be.jar secbpmn2bc-be.jar

# Expose port 8080
EXPOSE 8080

# Start the Vite development server
CMD ["java", "-jar", "secbpmn2bc-be.jar" ]