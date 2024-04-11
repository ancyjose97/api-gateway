package com.cts.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
}
 /*Benefits of using microservices
  * 
  * 1.  Creation of an application architecture that’s independently deployable and decentralized
2. Massive scalability when and if needed
3. New versions of microservices that can be rolled out incrementally, thus reducing downtime
4. Detecting unwanted behavior before an old application version is completely replaced
5. Use of multiple coding languages
6. Prevention of systemic failure due to a root cause in an isolated component
7. Real-time load balancing
  *  
  *  
  *  */

/* 10 microservices design patterns for better architecture
 * 
 * 1. Database per service pattern
 * A database dedicated to one service can’t be accessed by other services. This is one of the reasons that makes it much easier to scale and understand from a whole end-to-end business aspect.

Picture a scenario where your databases have different needs or access requirements. The data owned by one service may be largely relational, while a second service might be better served by a NoSQL solution and a third service may require a vector database. In this scenario, using dedicated services for each database could help you manage them more easily.

2. Saga pattern
A saga is a series of local transactions. In microservices applications, a saga patterncan help maintain data consistency during distributed transactions.

The saga pattern is an alternative solution to other design patterns that allows for multiple transactions by giving rollback opportunities.

3. API gateway pattern
For large applications with multiple clients, implementing an API gateway pattern is a compelling option One of the largest benefits is that 
it insulates the client from needing to know how services have been partitioned. However, different teams will value the API gateway pattern for 
different reasons. One of these possible reasons is because it grants a single entry point for a group of microservices by working as a
 reverse proxy between client apps and the services. Another is that clients don’t need to know how services are partitioned, and service 
 boundaries can evolve independently since the client knows nothing about them.
 * 4. Aggregator design pattern
An aggregator design pattern is used to collect pieces of data from various microservices and returns an aggregate for processing. Although similar to the backend-for-frontend (BFF) design pattern, an aggregator is more generic and not explicitly used for UI.

To complete tasks, the aggregator pattern receives a request and sends out requests to multiple services, based on the tasks it was assigned. Once every service has answered the requests, this design pattern combines the results and initiates a response to the original request.

5. Circuit breaker design pattern
This pattern is usually applied between services that are communicating synchronously. 
A developer might decide to utilize the circuit breaker when a service is exhibiting high latency or is completely unresponsive. 
The utility here is that failure across multiple systems is prevented when a single microservice is unresponsive. Therefore, calls won’t be piling up and using the system resources, which could cause significant delays within the app or even a string of service failures.

6.CQRS Design Pattern
CQRS is one of the important pattern when querying between microservices. We can use CQRS design pattern in order to avoid 
complex queries to get rid of inefficient joins. CQRS stands for Command and Query Responsibility Segregation. Basically this
 pattern separates read and update operations for a database.
 * CQRS also offers to use “separation of concerns” principles and separate reading database and the writing database with 2 database. By this way we can even use different database for reading and writing database types like using no-sql for reading and using relational database for crud operations.

7. Asynchronous messaging
If a service doesn’t need to wait for a response and can continue running its code post-failure, asynchronous messaging can be used. Using this design pattern, microservices can communicate in a way that’s fast and responsive. Sometimes this pattern is referred to as event-driven communication.

To achieve the fastest, most responsive app, developers can use a message queue to maximize efficiency while minimizing response delays. This pattern can help connect multiple microservices without creating dependencies or tightly coupling them. While there are tradeoffs one makes with async communication (such as eventual consistency), it’s still a flexible, scalable approach to designing a microservices architecture.

8.  Event-Driven Pattern
In a microservices architecture, maintaining data consistency among services can be challenging. The Event-Driven pattern provides a solution to this issue.

In the Event-Driven pattern, services publish events when their state changes. Other services subscribe to these events and update their state accordingly. This way, each service can maintain its consistency without the need for synchronous communication.
 * 9. Strangler
Developers mostly use the strangler design pattern to incrementally transform a monolith application to microservices. This is accomplished by replacing old functionality with a new service — and, consequently, this is how the pattern receives its name. Once the new service is ready to be executed, the old service is “strangled” so the new one can take over.

To accomplish this successful transfer from monolith to microservices, a facade interface is used by developers that allows them to expose individual services and functions. The targeted functions are broken free from the monolith so they can be “strangled” and replaced.
 * 
 * 10. Decomposition patterns
Decomposition design patterns are used to break a monolithic application into smaller, more manageable microservices. 
A developer can achieve this in one of three ways:
 * 1. Decomposition by business capability
 * Many businesses have more than one business capability. For example, an e-commerce store is likely to have capabilities
 *  that include managing product catalogs, inventory, orders, and delivery. A single monolithic application might have been 
 *  used for every service in the past, but say, for example, the business decides to create a microservices application to manage these 
 *  services moving forward. In this common scenario, the business might choose to use decomposition by business capability.
 * 2. Decomposition by subdomain
 * This is well suited for exceptionally large and complex applications that utilize a lot of business logic. 
 * 3. Decomposition by transaction
 * This is an appropriate pattern for many transactional operations across multiple components or services. 
 * Developers could choose this option when there are strict consistency requirements. For example, consider cases where an 
 * insurance claim is submitted. The claim request might interact with both a Customers application and Claims microservices at the same time.
 * 
 * 
 * */
 