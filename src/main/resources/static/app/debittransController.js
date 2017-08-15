var myApp = angular.module('myApp',[]);

myApp.controller('index', ['$scope','$http', function($scope,$http) {
	
	$scope.data = {
    		"time" : "",
    		"paymentTransactionNo" : "",
    		"tnTransactionTimeStamp" : "",
    		"debitFee" : "",
    		"debitAmount" : "",
    		"returnStatus" : "",
    		"returnCode" : "",
    		"returnMessage" : "",
    		"loanTransactionNo" : "",
    		"drawdownDate" : "",
    		"maturityDate" : "",
    		"drawdownAmount" : "",
    		"interestAmount" : "",
    		"repaymentFee" : "",
    		"time" : "",
    		"paymentTransactionNo" : "",
    		"tnTransactionTimeStamp" : "",
    		"debitFee" : "",
    		"debitAmount" : "",
    		"returnStatus" : "",
    		"returnCode" : "",
    		"returnMessage" : "",
    		"loanTransactionNo" : "",
    		"drawdownDate" : "",
    		"maturityDate" : "",
    		"drawdownAmount" : "",
    		"interestAmount" : "",
    		"repaymentFee" : ""
    };

	
	$scope.getDebitTrans = function() { 
		var url = "/servives/debitTrans";
		$http.get(url).success(function(response){
			$scope.resp = response;
			$scope.data = $scope.resp[0];
		});
	};
	
	$scope.setDebitTrans = function() {
		
		var url = "/servives/debitTrans";
		$http.post(url, $scope.data).success(function(response){
		$scope.datas = response;

		$scope.data = $scope.datas[0];

		
		});
	};
    
$scope.reset = function() {
		
		$scope.data = {
				"time" : "0",
	    		"paymentTransactionNo" : "999999999999",
	    		"tnTransactionTimeStamp" : "20121016104035",
	    		"debitFee" : "35.00",
	    		"debitAmount" : "1981031.00",
	    		"returnStatus" : "D",
	    		"returnCode" : "3",
	    		"returnMessage" : "Success",
	    		"loanTransactionNo" : "999999999999",
	    		"drawdownDate" : "20131224",
	    		"maturityDate" : "20130607",
	    		"drawdownAmount" : "1265.00",
	    		"interestAmount" : "0.00",
	    		"repaymentFee" : "0.00",
	    		"paymentTransactionNo2" : "999999999999",
	    		"tnTransactionTimeStamp2" : "20121016104035",
	    		"debitFee2" : "35.00",
	    		"debitAmount2" : "2783.00",
	    		"returnStatus2" : "D",
	    		"returnCode2" : "2",
	    		"returnMessage2" : "Success",
	    		"loanTransactionNo2" : "999999999999",
	    		"drawdownDate2" : "20130607",
	    		"maturityDate2" : "20130607",
	    		"drawdownAmount2" : "1265.00",
	    		"interestAmount2" : "0.00",
	    		"repaymentFee2" : "0.00"
	    };
		
		}
	
	$scope.init = function() {
    	$scope.getDebitTrans();
    }
	
	$scope.init();
}]);