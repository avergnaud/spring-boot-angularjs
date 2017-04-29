(function(angular) {
  var AppController = function($scope, $timeout, Personne) {
	  
	Personne.query(function(response) {
      $scope.personnes = response ? response : [];
    });
    
    $scope.addPersonne = function(prenom) {
      new Personne({
    	  prenom: prenom,
        checked: false
      }).$save(function(personne) {
        $scope.personnes.push(personne);
      });
      $scope.newPersonne = "";
    };
    
    $scope.updatePersonne = function(personne, context) {
      personne.$update();
      context.showMessage = true;
      // Affichage pendant 1 seconde
      $timeout(function() {
    	  context.showMessage = false;
      }, 1000);
    };
    
    $scope.deletePersonne = function(personne) {
      personne.$remove(function() {
        $scope.personnes.splice($scope.personnes.indexOf(personne), 1);
      });
    };
  };
  
  AppController.$inject = ['$scope', '$timeout', 'Personne'];
  angular.module("myApp.controllers").controller("AppController", AppController);
}(angular));