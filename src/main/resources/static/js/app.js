var app = angular.module('app', ["ngRoute"]);
app.controller('Ctrl', function ($scope,$location,$rootScope,projects,bugs,Files) {	
$scope.user = 'Ankit Sharan';

projects.getProjects().then(function(response){
$scope.allProjects = response.data;
});
    $scope.anupa='nai mili';
bugs.getBugs().then(function(response){
$scope.allBugs = response.data;
});
//          var url="http://10.177.1.114:8090/v1/bugsmanagement/getAllFiles?customerId=C123&employeeId=E001";
//          $scope.allFiles = $http.get(url);
//    Files.getAllFiles().then(function(response){
//    $scope.allFiles = response.data;
//        var x = $scope.allFiles;
//        console.log("and the data is :"+x);
//    });
});
app.directive('ngEnter', function() {
        return function(scope, element, attrs) {
            element.bind("keydown keypress", function(event) {
                if(event.which === 13) {
                    scope.$apply(function(){
                        scope.$eval(attrs.ngEnter, {'event': event});
                    });

                    event.preventDefault();
                }
            });
        };
    });

app.directive('a', function() {
    return {
        restrict: 'E',
        link: function(scope, elem, attrs) {
            if(attrs.href === '#email_modal'||'#email_modal1'){
                elem.on('click', function(e){
                    e.preventDefault();
                });
            }
        }
   };
}); 
// app.config(function($routeProvider) {
//     $routeProvider
//     .when("/home", {
//         templateUrl : "Templates/home.html",
//         controller: 'homeController'
//     })
// });

// app.controller('homeController', function($scope,$rootScope,userRepository) {
// 	  $('.carousel.carousel-slider').carousel({fullWidth: true});
//     userRepository.getByCategory('phone').success(function(data) {
//            $scope.phones = data;
//         });
//     userRepository.getByCategory('fashion').success(function(data) {
//            $scope.fashion= data;
//         });
           
// });

