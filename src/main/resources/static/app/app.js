angular.module('myApp',['ui.router'])
         .config(['$stateProvider','$urlRouterProvider',
         function($stateProvider,$urlRouterProvider){
             $urlRouterProvider.otherwise('servives/drawdown');
//start servives/drawdown

             $stateProvider
             .state('servives',{
                    url: '/drawdown',
                    abstract:true,
                    templateUrl: 'index.html',
                    controller:'index as vm'
                })
                .state('servives.drawdown',{
                    url: '/drawdown',
                    templateUrl: 'sendDrawdownTrans.html',
                    controller:'sendDrawdownTransCtrl as vm'
                })
                ;
         }])
         
         .controller('index', ['$scope','$http', function($scope,$http) {
			$scope.data = [];
	
			$scope.output = "first test <3";
			$scope.list = [
				{
					"name" : "mar1",
						"price" : 1001
				},
				{
					"name" : "mar2",
					"price" : 1002
				}
			];
			
			
			$scope.controllerFunction = function() { 
				
				var url = "/service/drawdown";
				$http.get(url).success(function(response){
				$scope.data = response;
				console.log($scope.data);
				
				});
			};
			
		}]);
