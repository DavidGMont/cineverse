# 🎥 Cineverse: RESTful API built with Microservices

This project is a learning experiment focusing on innovative technologies in Java using Spring Boot. It employs various
Spring Cloud modules like Eureka Server, Config Server, their respective client implementation, and Reactive Gateway.
The API is built using Spring Web, JPA, and MySQL Connector, along with MapStruct for mapping.

- [🌐 Overview](#-overview)
    - [The challenge](#the-challenge)
    - [Screenshot](#screenshot)
    - [Links](#links)
- [🔨 My process](#-my-process)
    - [Built with](#built-with)
    - [What I learned](#what-i-learned)
    - [Continued development](#continued-development)
    - [Useful resources](#useful-resources)
- [🎨 Author](#-author)
- [🙌 Acknowledgments](#-acknowledgments)

## 🌐 Overview

The API consists of two services: `movies-service` and `catalog-service`. The primary functionality is handling requests
through the Gateway, which then redirects to the registered service (`catalog-service`). The `catalog-service`
communicates with `movie-service` to retrieve a list of movies for a specified genre. The main endpoints include
creating movies and searching for genres. Communication between services is facilitated by Feign.

### The challenge

Users should be able to:

TBD

### Screenshot

TBD

### Links

- Solution URL: [TBD](https://your-solution-url.com)
- Live Site URL: [TBD](https://your-live-site-url.com)

## 🔨 My process

### Built with

- Java 21
- Spring Boot
- Spring Cloud
    - Commons (LoadBalancer)
    - Config (Config Server & Config Client)
    - Netflix (Eureka Server & Eureka Discovery Client)
    - Gateway (Gateway Reactive Server)
    - OpenFeign
- Spring Web
- Spring Data JPA
- MySQL Connector
- MapStruct
- Docker

### What I learned

TBD

### Continued development

Future plans include the addition of RabbitMQ and distributed tracing.

### Useful resources

- When creating entities with Spring Data JPA and Hibernate, it's a good practice to implement the `Serializable`
  interface along with the `serialVersionUID` field. This is useful because it prevents the `InvalidClassException` from
  being thrown when the entity is serialized. `Serializable` is used in Java in a variety of contexts, like when
  persisting objects to a file or sending them over the
  network. [Source](https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it).
- It's recommended to use `@Serial` annotation "to help a compiler catch mis-declared serialization-related fields and
  methods". [Source](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Serial.html).
- Java Records, introduced in Java 16, are a great way to create simple data carriers. They are immutable and
  Serializable by default, there is no need to add the `serialVersionUID` field and the `@Serial` annotation, as they
  are serialized in a different
  way. [Source](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Record.html).

## 🎨 Author

TBD

## 🙌 Acknowledgments

TBD
