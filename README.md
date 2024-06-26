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

# mongo-express
http://localhost:8081/

# zipkin
http://localhost:9411/

# Keycloak
http://localhost:9098/

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
curl -XPOST 'http://localhost:9098/realms/micro-services/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_secret=Z9WiIIzVKKDgOWrD9KW1Scz6AhoqBInX' \
--data-urlencode 'client_id=micro-services-api' \
--data-urlencode 'grant_type=client_credentials'

Response:
{"access_token":"eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnRzQ0OFl6dWhLRHEwc096X1pyTVMyNkZzaHIzTVVoblN3aXFzcmN6aTRjIn0.eyJleHAiOjE3MTk2MDgzNTIsImlhdCI6MTcxOTYwODA1MiwianRpIjoiODdkYTA0ZjgtOThjOC00ZjVhLWE5YTYtY2ViNjgyNjczZTQwIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo5MDk4L3JlYWxtcy9taWNyby1zZXJ2aWNlcyIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjNWUxYTlkOC0wNjA1LTQzNmUtOGE2Zi1mYjExYjZmNTRiOTEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJtaWNyby1zZXJ2aWNlcy1hcGkiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIi8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsImRlZmF1bHQtcm9sZXMtbWljcm8tc2VydmljZXMiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7Im1pY3JvLXNlcnZpY2VzLWFwaSI6eyJyb2xlcyI6WyJ1bWFfcHJvdGVjdGlvbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjbGllbnRIb3N0IjoiMTkyLjE2OC4yMjQuMSIsInByZWZlcnJlZF91c2VybmFtZSI6InNlcnZpY2UtYWNjb3VudC1taWNyby1zZXJ2aWNlcy1hcGkiLCJjbGllbnRBZGRyZXNzIjoiMTkyLjE2OC4yMjQuMSIsImNsaWVudF9pZCI6Im1pY3JvLXNlcnZpY2VzLWFwaSJ9.tSLNs_wQAwd9uxuEgcvpFHMzS7pxpsIU965_G3OkB74EIJ8PYRDBOAF533a86fKCJG-fvqV4ApFZn1JfvXCoFefJDOzhMQCBQGsj0xhNu4IH2DalSZ2pjNJIaoP-NwnfvedT-wxPrlv45Rho04XDDaxHeIa0LKevt4hnnUifu8flGqIxYm0heDVPU23SY4cNm5VQaZLekG3TL5RYwFbAjkIgm4CuTJyid0QmGCz8egoS-YYiAekCznEqUACJEN21Gpq8eRPaULy07-ld52tR3h9R1v2RJ9o4hhWAMHvID8sl0itU9mIjhR-F5fEsxr2VRR0mopG10fty4VOL2RViKg","expires_in":300,"refresh_expires_in":0,"token_type":"Bearer","not-before-policy":0,"scope":"profile email"}


GET http://localhost:8222/api/v1/products
Accept: application/json
Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnRzQ0OFl6dWhLRHEwc096X1pyTVMyNkZzaHIzTVVoblN3aXFzcmN6aTRjIn0.eyJleHAiOjE3MTk2MTAwNTIsImlhdCI6MTcxOTYwOTc1MiwianRpIjoiMDE2MWI2NWItYTg5Ni00ZWNmLWJlNTYtYjhiZGYyYjBhMjAyIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo5MDk4L3JlYWxtcy9taWNyby1zZXJ2aWNlcyIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjNWUxYTlkOC0wNjA1LTQzNmUtOGE2Zi1mYjExYjZmNTRiOTEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJtaWNyby1zZXJ2aWNlcy1hcGkiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIi8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsImRlZmF1bHQtcm9sZXMtbWljcm8tc2VydmljZXMiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7Im1pY3JvLXNlcnZpY2VzLWFwaSI6eyJyb2xlcyI6WyJ1bWFfcHJvdGVjdGlvbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjbGllbnRIb3N0IjoiMTkyLjE2OC4yMjQuMSIsInByZWZlcnJlZF91c2VybmFtZSI6InNlcnZpY2UtYWNjb3VudC1taWNyby1zZXJ2aWNlcy1hcGkiLCJjbGllbnRBZGRyZXNzIjoiMTkyLjE2OC4yMjQuMSIsImNsaWVudF9pZCI6Im1pY3JvLXNlcnZpY2VzLWFwaSJ9.LHTb073ifUvkdi-TgfVbI46gDMja5153Dpg_EpNiSTySZXY0TrY81Ii9yAuli9RyCtl0XWx4QKKeCgCCjA0nsD9poZ3HkRpg4jzrPCh4W68jTVKssHM8hIRkJsGfYBFJ1r3lfKAmVm29PXXw72ulNVjmYyFU_afxu4t_ojMVNU-uCTsS1tegV_Zmoggv6OjcnT_LB2vb64b9fC0T8GEUZj4Dmw6Efc6ofwQgJcW9cPxBWYjWyGnbjI-st5MAvt-8mgkVVTtzuykVovV9DidKOPdNVT0O4usFZZtBNRoDinz2mhDJxvf3HE1YCJytdgZaxenDNHWSOhajTTArp-Rjow


POST http://localhost:8222/api/v1/customers
Content-Type: application/json   
Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnRzQ0OFl6dWhLRHEwc096X1pyTVMyNkZzaHIzTVVoblN3aXFzcmN6aTRjIn0.eyJleHAiOjE3MTk2MTAwNTIsImlhdCI6MTcxOTYwOTc1MiwianRpIjoiMDE2MWI2NWItYTg5Ni00ZWNmLWJlNTYtYjhiZGYyYjBhMjAyIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo5MDk4L3JlYWxtcy9taWNyby1zZXJ2aWNlcyIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjNWUxYTlkOC0wNjA1LTQzNmUtOGE2Zi1mYjExYjZmNTRiOTEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJtaWNyby1zZXJ2aWNlcy1hcGkiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIi8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsImRlZmF1bHQtcm9sZXMtbWljcm8tc2VydmljZXMiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7Im1pY3JvLXNlcnZpY2VzLWFwaSI6eyJyb2xlcyI6WyJ1bWFfcHJvdGVjdGlvbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjbGllbnRIb3N0IjoiMTkyLjE2OC4yMjQuMSIsInByZWZlcnJlZF91c2VybmFtZSI6InNlcnZpY2UtYWNjb3VudC1taWNyby1zZXJ2aWNlcy1hcGkiLCJjbGllbnRBZGRyZXNzIjoiMTkyLjE2OC4yMjQuMSIsImNsaWVudF9pZCI6Im1pY3JvLXNlcnZpY2VzLWFwaSJ9.LHTb073ifUvkdi-TgfVbI46gDMja5153Dpg_EpNiSTySZXY0TrY81Ii9yAuli9RyCtl0XWx4QKKeCgCCjA0nsD9poZ3HkRpg4jzrPCh4W68jTVKssHM8hIRkJsGfYBFJ1r3lfKAmVm29PXXw72ulNVjmYyFU_afxu4t_ojMVNU-uCTsS1tegV_Zmoggv6OjcnT_LB2vb64b9fC0T8GEUZj4Dmw6Efc6ofwQgJcW9cPxBWYjWyGnbjI-st5MAvt-8mgkVVTtzuykVovV9DidKOPdNVT0O4usFZZtBNRoDinz2mhDJxvf3HE1YCJytdgZaxenDNHWSOhajTTArp-Rjow

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
Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJnRzQ0OFl6dWhLRHEwc096X1pyTVMyNkZzaHIzTVVoblN3aXFzcmN6aTRjIn0.eyJleHAiOjE3MTk2MTAwNTIsImlhdCI6MTcxOTYwOTc1MiwianRpIjoiMDE2MWI2NWItYTg5Ni00ZWNmLWJlNTYtYjhiZGYyYjBhMjAyIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo5MDk4L3JlYWxtcy9taWNyby1zZXJ2aWNlcyIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJjNWUxYTlkOC0wNjA1LTQzNmUtOGE2Zi1mYjExYjZmNTRiOTEiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJtaWNyby1zZXJ2aWNlcy1hcGkiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIi8qIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsImRlZmF1bHQtcm9sZXMtbWljcm8tc2VydmljZXMiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7Im1pY3JvLXNlcnZpY2VzLWFwaSI6eyJyb2xlcyI6WyJ1bWFfcHJvdGVjdGlvbiJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjbGllbnRIb3N0IjoiMTkyLjE2OC4yMjQuMSIsInByZWZlcnJlZF91c2VybmFtZSI6InNlcnZpY2UtYWNjb3VudC1taWNyby1zZXJ2aWNlcy1hcGkiLCJjbGllbnRBZGRyZXNzIjoiMTkyLjE2OC4yMjQuMSIsImNsaWVudF9pZCI6Im1pY3JvLXNlcnZpY2VzLWFwaSJ9.LHTb073ifUvkdi-TgfVbI46gDMja5153Dpg_EpNiSTySZXY0TrY81Ii9yAuli9RyCtl0XWx4QKKeCgCCjA0nsD9poZ3HkRpg4jzrPCh4W68jTVKssHM8hIRkJsGfYBFJ1r3lfKAmVm29PXXw72ulNVjmYyFU_afxu4t_ojMVNU-uCTsS1tegV_Zmoggv6OjcnT_LB2vb64b9fC0T8GEUZj4Dmw6Efc6ofwQgJcW9cPxBWYjWyGnbjI-st5MAvt-8mgkVVTtzuykVovV9DidKOPdNVT0O4usFZZtBNRoDinz2mhDJxvf3HE1YCJytdgZaxenDNHWSOhajTTArp-Rjow

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