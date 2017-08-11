var myApp = angular.module('myApp',[]);

myApp.controller('index', ['$scope','$http', function($scope,$http) {
	
	$scope.data = {
    		"time" : "",
    		"tradeNavigatorTransactionNo" : "",
    		"tradeNavigatorTransactionTimeStamp" : "",
    		"interestAmount" : "",
    		"repaymentFee" : "",
    		"returnStatus" : "",
    		"returnCode" : "",
    		"returnMessage" : "",
    		"tradeNavigatorTransactionNo2" : "",
    		"tradeNavigatorTransactionTimeStamp2" : "",
    		"interestAmount2" : "",
    		"repaymentFee2" : "",
    		"returnStatus2" : "",
    		"returnCode2" : "",
    		"returnMessage2" : ""
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
    
$scope.reset = function() {
		
		$scope.data = {
	    		"time" : "0",
	    		"tradeNavigatorTransactionNo" : "TEMP",
	    		"tradeNavigatorTransactionTimeStamp" : "20160523160000",
	    		"interestAmount" : "400",
	    		"repaymentFee" : "100",
	    		"returnStatus" : "B",
	    		"returnCode" : "2",
	    		"returnMessage" : "Drawdown Success",
	    		"tradeNavigatorTransactionNo2" : "TEMP",
	    		"tradeNavigatorTransactionTimeStamp2" : "20160523160000",
	    		"interestAmount2" : "400",
	    		"repaymentFee2" : "100",
	    		"returnStatus2" : "B",
	    		"returnCode2" : "2",
	    		"returnMessage2" : "Drawdown Success"
	    };
		
		}
	
	$scope.init = function() {
    	$scope.getDrawdownTrans();
    }
	
	$scope.init();
}]);