# blank-junit5-maven3
Blank project for Java 11 with JUnit 5, Maven 3 support and Maven Plugins

## Build

```sh
mvn clean package
```

## Test

```sh
mvn test
```

## Plugins

* Maven Clean Plugin
* Maven Compiler Plugin
* Maven Deploy Plugin
* Maven Install Plugin
* Maven Jar Plugin
* Maven Resources Plugin
* Maven Site Plugin
* Maven Surefire Plugin
* Maven Project Info Reports Plugin
* Versions Maven Plugin
* Spotify Format Code Plugin (google's style by default)

### Spotify Format Code Plugin

* Format all files command:
```sh
mvn com.spotify.fmt:fmt-maven-plugin:format
```