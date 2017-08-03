var myApp = angular.module('myApp',[]);

myApp.controller('index', ['$scope','$http', function($scope,$http) {
	
	$scope.data = {
    		"time" : "",
    		"tnResponseDateTimeStamp" : "",
    		"creditLimit" : "",
    		"outstanding" : "",
    		"remainingLimit" : "",
    		"pendingDrawdownAmount" : "",
    		"pendingDebitAmount" : "",
    		"returnStatus" : ""
    };

	
	$scope.getInqCredit = function() { 
		var url = "/servives/creditLimit";
		$http.get(url).success(function(response){
			$scope.resp = response;
			$scope.data = $scope.resp[0];
		});
	};
	
	$scope.setInqCredit = function() {
		
		var url = "/servives/creditLimit";
		$http.post(url, $scope.data).success(function(response){
		$scope.datas = response;

		$scope.data = $scope.datas[0];

		
		});
	};
    
	$scope.init = function() {
    	$scope.getInqCredit();
    }
	
	$scope.init();
}]);