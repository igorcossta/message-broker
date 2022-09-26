# Getting Started

### Guides

The following guides illustrate how to use some features concretely:

* Run RabbitMQ in docker with <code>docker run -d --hostname my-rabbit --name some-rabbit -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=123456 -p 5672:5672 -p 15672:15672 rabbitmq:3-management</code> or <code>docker compose up -d</code>
* Run **Demo1** and **Demo2** Project
* make a **POST** request to <code>curl -d '{"id":"10", "quantity":"100"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/v1/stock </code>
