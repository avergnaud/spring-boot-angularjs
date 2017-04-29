(function(angular) {
	var PersonneFactory = function($resource) {
		return $resource(
				'/personnes/:id', 
				{
					id : '@id'
				}, 
				{
					update : {
						method : "PUT"
					},
					remove : {
						method : "DELETE"
					}
				}
		);
	};

	PersonneFactory.$inject = [ '$resource' ];
	angular.module("myApp.services").factory("Personne", PersonneFactory);
}(angular));