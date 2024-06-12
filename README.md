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

# Add fake data
curl -d "count=10" -X POST http://localhost:8050/api/fake/category
curl -d "count=10" -X POST http://localhost:8050/api/fake/product