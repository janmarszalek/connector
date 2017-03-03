var app = angular.module('team', []);
app.controller('team', function ($scope, $http) {
    $http.get('http://localhost:8080/getTeam').then(function (response) {
        $scope.team = response.data;
    });
});
app.controller('project', function ($scope, $http) {
    $http.get('http://localhost:8080/getProjects').then(function (response) {
        $scope.project = response.data;
    });
});

app.controller('teamProject', function ($scope, $http) {
    $http.get('http://localhost:8080/getTeamProjects').then(function (response) {
        $scope.teamProject = response.data;
    });
});

function format(date) {
    if (Object.prototype.toString.call(date) === '[object Date]') {
        return date.getFullYear() + '-' + date.getMonth();
    } else {
        return date;
    }
}