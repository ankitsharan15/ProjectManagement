//services for api  call
var app = angular.module('app');

// app.factory('userRepository',function ($http){

//    return {

//         getByCategory:function(product){

//            var url="/category/"+product;

//            return $http.get(url);

//        }

//    };

// });
// app.factory('productsRepository',function ($http){
    
//      return {
//           getByProduct:function(productId){
//              var url="/product/"+productId;
//              return $http.get(url);
//          }
//      };
//   });
// app.factory('orderRepository',function ($http){
//      return {
//           postByOrders:function(order){
//              var url="/orders/checkout";
//              return $http.post(url,order)
//          }
//      };
//   });
// app.factory('orderDetails',function ($http,$q,$log){
//      return {         
//            getUserOrders:function(email){
//              var deferred = $q.defer();
//              var res;
//                var url="/orders/history";
//                $http.post(url,email)
//                .success(function(results) {                 
//                            deferred.resolve(
//                              JSON.stringify(results)
//                               );
//                         }).error(function(msg, code) {
//                            deferred.reject(msg);
//                            $log.error(msg, code);
//                         });
//                       return deferred.promise;

//          }
//      };
// });
