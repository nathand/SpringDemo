function User($scope, $http) {
    $http.get('http://localhost:8080/api').
        success(function(data) {
            $scope.data = data;
        });
}
