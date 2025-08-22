# Translator
## Description
Converts Time given by user in other spoken form
## Features
- convert time to words in spoken form,extensible for multiple language. As of now it just supports one
## Tech Stack Used
- Java
- Constants for storing time in words
- JUnit for testing
- Gradle for building the project
- Interfaces and template/strategy pattern for extensibility
## How to run
1. Clone the repository:
   ```bash
   git clone https://github.com/Divyrajput123/SmartBear.git
   cd translator
   ```
## Run Tests
    cd translator
    ./gradlew test
    ```
## Run main program
./gradlew run
## Project structure
translator/
├── build.gradle
├── src/
│   ├── main/java/
│   │   ├── accent/
│   │   │   ├── British.java
│   │   ├── language factory/
│   │   │   ├── LanguageFactory.java
│   │   └── util/
│   │         ├── Translator.java
│   │         ├── NumberToWordConverter.java
│   │         ├── TimeParser.java

│   │       
│   └── test/java/
│        └── util/
│             └── TranslatorTest.java
│
└── README.md

   