(function() {
    'use strict';
                                         
    var app = angular.module('application', []);
	app.controller('sendDrawdownTrans',function($scope){
		 $scope.datas =[];       
        $scope.data ={};        
        $scope.addData = function (datas) { 
            datas.push($scope.data);
			//console.log(datas);
        };
		
		
	});
})();