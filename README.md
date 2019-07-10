# MicroCoin Java Client

[![GitHub license](https://img.shields.io/github/license/MicroCoinHU/MicroCoin-Java-Client.svg)](https://github.com/MicroCoinHU/MicroCoin-Java-Client/blob/master/LICENSE) [![CodeFactor](https://www.codefactor.io/repository/github/microcoinhu/microcoin-java-client/badge/master)](https://www.codefactor.io/repository/github/microcoinhu/microcoin-java-client/overview/master)

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>hu.microcoin</groupId>
    <artifactId>hu.microcoin.client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "hu.microcoin:hu.microcoin.client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn package`
```

Then manually install the following JARs:

* target/hu.microcoin.client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import Api.AccountApi;

public class AccountApiExample {

    public static void main(String[] args) {
        AccountApi apiInstance = new AccountApi();
        ChangeKeyRequest changeKey = new ChangeKeyRequest(); // ChangeKeyRequest | The signed transaction
        try {
            ChangeKey result = apiInstance.commitChangeKey(changeKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#commitChangeKey");
            e.printStackTrace();
        }
    }
}

```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.



