CRUD avec Angularjs (persistence in memory)

# build and run the app

mvn spring-boot:run

http://localhost:8090/

# backend :

http://localhost:8090/personnes

Saisie d'une première personne :

curl -X POST -H "Content-Type:application/json" -d '{ "prenom" : "Adrien" }' http://localhost:8090/personnes

Personnes :

http://localhost:8090/personnes

# frontend :

http://localhost:8090/