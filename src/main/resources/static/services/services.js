'use strict'

var app = angular.module('app');   

    app.factory('getAllProjects', ["$resource","$rootScope", function($resource, $rootScope) {
        return $resource("http://localhost:8090/v1/bugsmanagement/getAllProjects/C123" , {}, {
            get: {
                method: "GET",
                isArray: true
            }
        });
    }]);

    app.factory('getProject', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            getProjectDetail : function(projectId){
        return $resource("http://localhost:8090/v1/bugsmanagement/getProject?customerId=C123&projectId="+projectId, {}, {
            get: {
                method: "GET"
            }
        });
        }
    }
    }]);

    app.factory('getAllBugs', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            getEmployeeBugs : function(employeeId){
        return $resource("http://localhost:8090/v1/bugsmanagement/getAllBugs?customerId=C123&employeeId="+employeeId, {}, {
            get: {
                method: "GET",
                isArray: true
            }
        });
        }
    }
    }]);

    app.factory('changeBugStatus', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            setStatus : function(bugId, status){
        return $resource("http://localhost:8090/v1/bugsmanagement/changeBugStatus?customerId=C123&bugId="+bugId+"&status="+status, {}, {
            post: {
                method: "POST"
            }
        });
        }
    }
    }]);

    app.factory('getAllFiles', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            getAllFiles : function(employeeId){
        return $resource("http://localhost:8090/v1/bugsmanagement/getAllFiles?customerId=C123&employeeId="+employeeId, {}, {
            get: {
                method: "GET",
                isArray: true
            }
        });
        }
    }
    }]);

    app.factory('createBug', ["$http","$rootScope", function($http, $rootScope) {
        return{
            setBug : function(data){
            return $http({
                  method: 'POST',

                  url: "http://localhost:8090/v1/bugsmanagement/createBug?customerId=C123",
                  data: data,
                  headers: {
//                    createBug:data
                  }
                });
            }
        }
    }]);

    app.factory('editProject', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            editProjectDetail : function(projectId){
        return $resource("http://localhost:8090/v1/bugsmanagement/editProject?customerId=C123&projectId="+projectId, {}, {
            get: {
                method: "GET"
            }
        });
        }
    }
    }]);

    app.factory('newProject', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            setnewProject : function(){
        return $resource("http://localhost:8090/v1/bugsmanagement/newProject?customerId=C123", {}, {
            get: {
                method: "GET"
            }
        });
        }
    }
    }]);

    app.factory('saveProject', ["$http","$rootScope", function($http, $rootScope) {
        return{
            updateStatus : function(data){
                return $http({
                      method: 'POST',

                      url: "http://localhost:8090/v1/bugsmanagement/saveProject?customerId=C123",
                      data: data,
                      headers: {
//                        statusChange:data
                      }
                });
            }
        }
    }]);

    app.factory('bugsAssign', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            bugsAssign : function(bugId){
        return $resource("http://localhost:8090/v1/bugsmanagement/bugsAssign?customerId=C123&bugId="+bugId, {}, {
            get: {
                method: "GET"
            }
        });
        }
    }
    }]);

    app.factory('assignBug', ["$http","$rootScope", function($http, $rootScope) {
        return{
            assignBug : function(data){
                return $http({
                      method: 'POST',

                      url: "http://localhost:8090/v1/bugsmanagement/assignBug?customerId=C123",
                      data: data,
                      headers: {
//                        statusChange:data
                      }
                });
            }
        }
    }]);

    app.factory('bugFixed', ["$resource","$rootScope", function($resource,$rootScope) {
        return{
            bugFixed : function(bugId, status){
        return $resource("http://localhost:8090/v1/bugsmanagement/bugFixed?customerId=C123&bugId="+bugId+"&status="+status, {}, {
            post: {
                method: "POST"
            }
        });
        }
    }
    }]);