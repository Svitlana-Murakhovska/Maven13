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

### Ant + Ivy (Optional)

1. Install Apache Ant and Ivy if you haven't already.
2. Open a terminal or command prompt.
3. Navigate to the root directory of the project.
4. Run the following command to build the project:

   ```shell
   ant build

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

///////////////gradle

