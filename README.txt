MavenProject

This project is a multimodule project consisting of a web module (WAR) and an admin module (JAR).

## Project Structure
The project has the following structure:
├── jar
│ └── admin
│ ├── services
│ └── utils
└── war
└── web

- The `jar` directory contains the admin module, which consists of the `services` and `utils` subdirectories.
- The `war` directory contains the web module.

## Build Instructions

Maven
1. Install Apache Maven if you haven't already.
2. Open a terminal or command prompt.
3. Navigate to the root directory of the project (where the pom.xml file is located).
4. Run the following command to build the project: mvn clean package
5. The WAR artifact will be generated in the war/web/target directory with the name your-web-module.war.
6. The JAR artifact will be generated in the jar/admin/services/target directory with the name your-admin-module.jar

Run test with Maven
1. Open a terminal or command prompt.
2. Navigate to the root directory of the project (where the pom.xml file is located).
3. Run the following command to execute tests:mvn test

///////////////Gradle/////////////////////////////////////////////////////////////////////////////
Create all files according to schema.
- root
  - settings.gradle
  - build.gradle
  - admin
    - build.gradle
  - web
    - build.gradle
  - utils
    - build.gradle
  - services
    - build.gradle


## Building with Gradle
1. To build the project using Gradle, navigate to the project directory and run the following command:
./gradlew build

2. This will compile the source code, run the tests, and generate two artifacts: `web-module.war` for the web module and `admin-module.jar` for the admin module.
To build the web module separately, use the following command:
./gradlew buildWar

3. To build the admin module separately, use the following command:
./gradlew buildJar

4. To run the tests, use the following command:
./gradlew test

5.To build the project and generate the artifacts, navigate to the root directory of your
project in the command line and run the following command:
./gradlew assemble












