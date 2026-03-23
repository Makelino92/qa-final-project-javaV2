FROM maven:3.8.4-openjdk-17
WORKDIR /app
COPY . /app
RUN mvn -B package -DskipTests
CMD ["mvn", "test"]
