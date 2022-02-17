#!/bin/sh

cd $(dirname $0)

echo Removing old images...
docker compose down && \
docker rmi \
  monolith-application \
  payment-sales-application \
  refund-payment-app \
  notify-payment-situation-app \
  create-payment-app

echo
echo Building images...
mvn clean compile package -q -DskipTests=true -Dmaven.artifact.threads=20
docker compose build -q

echo Done.