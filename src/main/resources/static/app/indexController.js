var myApp = angular.module('myApp',[]);

myApp.controller('index', ['$scope','$http', function($scope,$http) {
	
	$scope.data = {
    		"delayResponseTime" : "",
    		"tradeNavigatorTransactionNo" : "",
    		"tradeNavigatorTransactionTimeStamp" : "",
    		"interestAmount" : "",
    		"repaymentFee" : "",
    		"returnStatus" : "",
    		"returnCode" : "",
    		"returnMessage" : ""
    };

	
	$scope.getDrawdownTrans = function() { 
		var url = "/servives/drawdown";
		$http.get(url).success(function(response){
			$scope.resp = response;
			$scope.data = $scope.resp[0];
		});
	};
	
	$scope.setDrawdownTrans = function() {
		
		var url = "/servives/drawdown";
		$http.post(url, $scope.data).success(function(response){
		$scope.datas = response;

		$scope.data = $scope.datas[0];

		
		});
	};
    
	$scope.init = function() {
    	$scope.getDrawdownTrans();
    }
	
	$scope.init();
}]);