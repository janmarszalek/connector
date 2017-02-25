angular.module('team', [])
    .controller('data', function ($scope, $http) {
        $http.get('http://localhost:8080/getTeam').then(function (response) {
            $scope.team = response.data;
        });
    });