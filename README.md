CRUD avec Angularjs 

# build and run the app

mvn spring-boot:run

http://localhost:8090/api/personnes

Saisie d'une première personne :

curl -X POST -H "Content-Type:application/json" -d '{ "prenom" : "Charles", "nom" : "Fourier" }' http://localhost:8090/api/personnes

Requêtes :

http://localhost:8090/

http://localhost:8090/api/personnes