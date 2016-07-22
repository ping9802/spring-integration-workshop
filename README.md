# Spring Integration Workshop

## Config

`@IntegrationComponentScan` Spring Integration supports the discovery of interfaces annotated with @MessagingGateway 
`@EnableIntegration`

## Concepts
[http://www.javaworld.com/article/2142107/spring-framework/open-source-java-projects-spring-integration.html]
[http://www.enterpriseintegrationpatterns.com/patterns/messaging/](http://www.enterpriseintegrationpatterns.com/patterns/messaging/)

One of the primary goals of Spring Integration is to simplify the development of enterprise integration solutions through inversion of control. This means that you should not have to implement consumers and producers directly, and you should not even have to build Messages and invoke send or receive operations on a Message Channel. Instead, you should be able to focus on your specific domain model with an implementation based on plain Objects. Then, by providing declarative configuration, you can "connect" your domain-specific code to the messaging infrastructure provided by Spring Integration.

### Message

### Message Channel

### Message Endpoint

### Service Activator
[http://www.enterpriseintegrationpatterns.com/patterns/messaging/MessagingAdapter.html]

### Channel Adapter

### @MessagingGateway

#### @Gateway

## Patterns

### Transformer

### Filter

### Router

### Router

### Aggregator

## Spring Integration Java DSL
[https://spring.io/blog/2014/11/25/spring-integration-java-dsl-line-by-line-tutorial]

The IntegrationFlow bean definition. It is the central component of the Spring Integration Java DSL, although it does not play any role at runtime, just during the bean registration phase.
The IntegrationFlow is a Consumer functional interface


