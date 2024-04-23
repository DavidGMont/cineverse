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

-

## 🎨 Author

TBD

## 🙌 Acknowledgments

TBD
