DB: 
http://localhost:8080/h2-console

TEST:
// start

curl -X POST "http://localhost:8080/start/1" -H  "accept: */*" -d ""

// get question

curl -X GET "http://localhost:8080/question/by-patient-id/1" -H  "accept: */*"

// send 

curl -X POST "http://localhost:8080/send-answer/" -H  "accept: */*" -H  "Content-Type: application/json" -d "{\"userId\":1,\"questionId\":1,\"answer\":0}"


Swagger: https://hackzurichroche.herokuapp.com/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

