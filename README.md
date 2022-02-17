# Modular deployment with Spring Boot Application
Application for demonstration of modularization at run time with Spring Boot. You can run each application alone or aggregate them.

## Requirements
- Java 17
- Maven 3.8.4

## Setup
Run `build.sh` script, this will remove old images (if present), build all applications and create docker images.

## Run
You can run all applications with `docker compose up` or choose which one is run with `docker compose up <image-name>`

The following images are available:
- **Standalone**:
  - create-payment-app
  - refund-payment-app 
  - notify-payment-situation-app
- **Aggregations**
  - monolith-application 
  - payment-sales-application

## Testing

To test applications use following requests:

- Create payment
  - standalone: `curl -XPOST http://localhost:8080/payment`
  - monolith-application: `curl -XPOST http://localhost:8083/payment`
  - sales-application: `curl -XPOST http://localhost:8084/payment`
  
- Refund payment
  - standalone: `curl -XPOST http://localhost:8081/refund/991`
  - monolith-application: `curl -XPOST http://localhost:8083/refund/992`
  - sales-application: `curl -XPOST http://localhost:8084/refund/993`

- Notify payment
  - standalone: `curl -XPOST http://localhost:8082/notify/771`
  - monolith-application: `curl -XPOST http://localhost:8083/notify/772`
