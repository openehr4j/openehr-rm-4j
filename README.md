<div align="right">
  <a href="https://masterminds.github.io/stability/experimental.html">
    <img src="https://masterminds.github.io/stability/experimental.svg">
  </a>
</div>

# openehr-rm-java

This repository contains the Java interface types for the openEHR [RM specifications](https://specifications.openehr.org/releases/RM).

## Overview

| **Subproject**             | **Description** |
|----------------------------|-----------------|
| openehr-rm-common          | TBD             |
| openehr-rm-data-structures | TBD             |
| openehr-rm-data-types      | TBD             |
| openehr-rm-demographic     | TBD             |
| openehr-rm-ehr             | TBD             |
| openehr-rm-ehr-extract     | TBD             |
| openehr-rm-integration     | TBD             |
| openehr-rm-support         | TBD             |

## Usage

The packages are published to GitHub Packages.
So, even though the packages are publicly available, clients that want to apply package need a GitHub access token with the "read:packages" scope.
How to create such an access token is described here: [docs.github.com](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).

### Maven

```xml
<dependency>
  <groupId>com.experimental-software.java-api</groupId>
  <artifactId>openehr-rm-data-types</artifactId>
  <version>1.1.0-alpha-2</version>
</dependency>
```

### Gradle

For Gradle, the GitHub username and access token should be added to the global Gradle properties.

`~/.gradle/gradle.properties`:

```text
gpr.user=jdoe
gpr.key=ghp_**********************************
```

After the configuration of the GitHub Maven repository, the dependency on the required package can be declared as for any other package.

`build.gradle`:

```groovy
repositories {
    maven {
        url = uri('https://maven.pkg.github.com/experimental-software/openehr-rm-java')
        credentials {
            username = project.findProperty('gpr.user')
            password = project.findProperty('gpr.key')
        }
    }
}

dependencies {
    implementation 'com.experimental-software.java-api:openehr-rm-data-types:1.1.0-alpha-2'
}
```

**Also see**

- [Working with the Gradle registry | docs.github.com](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry)

## Development

### Publish to Maven Local

For testing purposes, the packages of this project can be published to [Maven Local](https://www.baeldung.com/maven-local-repository).

```
./gradlew publishToMavenLocal
find ~/.m2/repository/com/experimental-software
```

## Maintenance

### Publish to GitHub Packages

The packages are automatically published after the creation of a new GitHub release.

## References

- https://specifications.openehr.org/releases/RM/Release-1.1.0
- https://github.com/openEHR/specifications-RM
