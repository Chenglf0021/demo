/**
 * Created by chenglf on 2019/3/13.
 */
var app=angular.module("myApp",[]);
app.controller("myCon",function ($scope,$http) {
    $http.get("/getUserById/1").then(function (response) {

        $scope.hello=response.data.name
    })
})
