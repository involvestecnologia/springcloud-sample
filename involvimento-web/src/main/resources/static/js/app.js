(function () {
    angular.module('involvimento', [])
    
    .config(function($httpProvider) {
		$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
	}).controller('carregarDados', function($scope, $http) {
		
		$scope.nroparticipantes = "0";

		$scope.loadParticipantes = function(){
			
			$http.get('../web-spring/participantes/nro')
			.success(function(data) {
				$scope.nroparticipantes = data;		
			}).error(function() {
				$scope.nroparticipantes = "0";
			});
			
		};
		
		$scope.forceError = function(){
			
			$http.get('../web-spring/participantes/forceError')
			.success(function(data) {
						
			}).error(function() {
				
			});
			
		};
		
		$scope.loadParticipantes();
		$scope.forceError();
	});
})();