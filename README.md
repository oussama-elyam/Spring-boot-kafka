# Spring-boot-kafka

## Project Overview

In this project, we aim to send product data from the publisher, which will be consumed by the subscriber. Before you start the project, familiarize yourself with the following concepts:

## Kafka and ZooKeeper

Kafka and ZooKeeper are frequently used in conjunction, each playing a specific role in distributed systems. Kafka is focused on data streaming and processing, while ZooKeeper provides coordination and management services.

- **Publish-Subscribe Model**
- **Consumers & Producers**
- **Brokers, Topics, Partitions, Replication**
- **Consumer Groups**
- **Connect & Streams**

## Demo

To run the demonstration, follow these steps:

1. Inside our Apache Kafka binary files directory:
    - Run ZooKeeper:
      ```
      c://kafka>./bin/windows/zookeeper-server-start.bat ./config/zookeeper.properties
      ```
    - Run Kafka:
      ```
      c://kafka>./bin/windows/kafka-server-start.bat ./config/server.properties
      ```
2. Run the Publisher and Consumer Spring Boot projects.

## Resources

- **Guide:** [Microservices with Java, Spring Boot, and Apache Kafka](https://blog.devgenius.io/microservices-with-java-spring-boot-and-apache-kafka-2-17e2113e4edc)
- **Download Kafka:** [Apache Kafka Downloads](https://kafka.apache.org/downloads)
- **Installation Guide for Kafka and ZooKeeper:** [How to Install and Run Apache Kafka on Windows](https://www.geeksforgeeks.org/how-to-install-and-run-apache-kafka-on-windows/)
