var myApp = angular.module('myApp',[]);

myApp.controller('index', ['$scope','$http', function($scope,$http) {
//	$scope.data = [];
	
	$scope.output = "first <3";
	
	$scope.getDrawdownTrans = function() { 
		var url = "/servives/drawdown";
		$http.get(url).success(function(response){
		$scope.data = response;
		console.log($scope.data);
		
		});
	};
	
	$scope.setDrawdownTrans = function(datas) {
		console.log(datas);
		$scope.data=datas;
		
		var url = "/servives/drawdown1";
		$http.post(url).success(function(response){
		$scope.datas = response;
		console.log($scope.data);
		
		});
	};
	
}]);