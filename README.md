# spring-boot-microservices
Sample project on microservices using spring-boot in which we have three services.

1. Movie Catalog Service - Calls the movie info and ratings data service. Merges them together to form a response which contains some data from both services.
2. Movie Info Service - Calls an external API https://api.themoviedb.org to get movie title and movie overview.
3. Ratings Data Service - Gets the movie ratings info.

# Technology Used:
1. Spring Boot
2. Spring Cloud
3. Eureka for Discovery Server
