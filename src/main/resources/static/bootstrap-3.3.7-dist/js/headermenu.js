var routerApp = angular.module('routerApp', [ 'ui.router' ]);

routerApp.config(function($stateProvider, $urlRouterProvider) {

	$urlRouterProvider.otherwise('/sendDrawdownTrans');

	$stateProvider

	.state('/sendDrawdownTrans', {
		url : '/sendDrawdownTrans',
		templateUrl : 'sendDrawdownTrans.html'

	});

})
