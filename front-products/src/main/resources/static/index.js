(function () {
    'use strict';

    angular
        .module('app', [])
        .config(config)
        .run(run);

    function config($httpProvider) {
        };
    }

    function run() {
})();

angular.module('app').controller('indexController', function ($scope, $http) {
    $scope.getProductsList function() {
    $http.get('localhost:1313/cloud/api/v1/products/')
    .then(function (response) {
        $scope.ProductsList = response.data;
    });
    };

    $scope.getProductsList();
});