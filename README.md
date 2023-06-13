# openehr-rm-java [![Stability: Experimental](https://masterminds.github.io/stability/experimental.svg)](https://masterminds.github.io/stability/experimental.html)

This repository contains the Java interface types for the openEHR [RM specifications](https://specifications.openehr.org/releases/RM).

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
        url = uri('https://maven.pkg.github.com/openehr-java-api/openehr-rm-java')
        credentials {
            username = project.findProperty('gpr.user')
            password = project.findProperty('gpr.key')
        }
    }
}

ext['openehrRmVersion'] = '1.1.0-alpha-3'

dependencies {
    api "com.experimental-software.java-api:openehr-rm-common:${openehrRmVersion}"
    api "com.experimental-software.java-api:openehr-rm-data-structures:${openehrRmVersion}"
    api "com.experimental-software.java-api:openehr-rm-data-types:${openehrRmVersion}"
    api "com.experimental-software.java-api:openehr-rm-demographic:${openehrRmVersion}"
    api "com.experimental-software.java-api:openehr-rm-ehr:${openehrRmVersion}"
    api "com.experimental-software.java-api:openehr-rm-ehr-extract:${openehrRmVersion}"
    api "com.experimental-software.java-api:openehr-rm-integration:${openehrRmVersion}"
    api "com.experimental-software.java-api:openehr-rm-support:${openehrRmVersion}"
}
```

**Also see**

- [Working with the Gradle registry | docs.github.com](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry)

### Versions

The Package version number consists of two parts: (1) the version number of the corresponding openEHR component and (2) a Package-specific suffix. Those two parts are separated by the first hyphen.

The suffix has four different types:

1. `alpha`: releases for development tests
2. `beta`: release candidates for system tests
3. `RELEASE`: official Package for corresponding openEHR component version
4. `RELEASE-patch`: if necessary, bug fixes for the released Package

Except for the `RELEASE` which is terminal, each type is followed by another hyphen and then an integer number that gets incremented with every new release.

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

## Legal notice

openEHR is a trademark of [openEHR International](https://openehr.org/about/contacts).

The specifications are distributed under the [Attribution-NoDerivs 3.0 Unported (CC BY-ND 3.0)](https://creativecommons.org/licenses/by-nd/3.0/deed.en_GB) license.

This project transpiles the specification to the Java programming language, under the assumption that it is allowed usage according to the "Principles" section in their Intellectual Property notice: https://openehr.org/governance/intellectual_property.

This project is not affiliated nor endorsed by openEHR International.

## References

- https://specifications.openehr.org/releases/RM/Release-1.1.0
- https://github.com/openEHR/specifications-RM
