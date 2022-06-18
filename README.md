# Beatrice
An open source, small microblogging system. Beatrice is designed to supply a minimal microservice for microblogs looking to eliminate monolithic backends. Its goals are outlined below. 

## Goals
- Develop a basic microservice system that can be forked and quickly configured according to a user's database and hosting specifications
- Utilize a minimal microservice framework designed for the Java programming language
- Provide out of the box support for SQL and NoSQL (MongoDB) databases
- Implement shared logic for REST and GraphQL APIs

Some of these goals may seem counterintuitive to the minimalist approach. But, they are designed to act as modules constituting options for the end user. The goal is to approach this modularity in a way that is as simple as possible.

## Dependencies
Beatrice requires Gradle and the Micronaut framework. Using your favorite IDE or Text Editor, importing the project through gradle should be fairly straightforward. 

## Run
Use the standard `./gradelw run` to run the service.
