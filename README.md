# e-commerce

e-commerce app

# DOCKER command

docker compose up -d
docker compose down

docker images
docker image rm IMAGE_ID

# If you need to stop and remove all containers, networks,

# and all images used by any service in docker-compose.yml file, use the command:

docker compose down --rmi all

# MYSQL

bash-4.2# mysql -h 127.0.0.1 -umysqluser -pmysqlpw
SHOW DATABASES;
CREATE DATABASE IF NOT EXISTS product;

# pgadmin

http://localhost:5050/

# mongo-express

http://localhost:8081/

# Add fake data for product service

curl -d "count=10" -X POST http://localhost:8050/api/fake/category
curl -d "count=10" -X POST http://localhost:8050/api/fake/product

# GIT

git status
git branch
git add .
git commit -m "COMMENT TEXT"
git push origin develop

###############################
GET http://localhost:8222/api/v1/products
Accept: application/json

POST http://localhost:8222/api/v1/customers
Content-Type: application/json

{
"firstname": "John",
"lastname": "Doe",
"email": "john@mail.com",
"address": {
"street": "Street name",
"houseNumber": "123",
"zipCode":"50001"
}
}

POST http://localhost:8222/api/v1/orders
Content-Type: application/json

{
"reference": "DS-20240626",
"amount": "900",
"paymentMethod": "PAYPAL",
"customerId": "667c871db3c37e0b1b2c0935",
"products": [
{
"productId": 1,
"quantity": 1
},
{
"productId": 2,
"quantity": 1
},
{
"productId": 3,
"quantity": 1
}
]
}