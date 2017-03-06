<%--
  Created by IntelliJ IDEA.
  User: Shan
  Date: 2017/2/18
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="http://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC Demo 首页</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h1>这里是SpringMVC Demo首页ffff</h1> ${msg}
<br/>
  <h3>  ${name}</h3>

<h3>出现此页面，说明配置成功。</h3>d

<div ng-app="myApp" ng-controller="myCtrl" ng-init="quantity=2;cost=2.4">
    <p> your name :<input type="text" ng-model="name"></p>
    <h2>{{name}}</h2>
    <h2>********************** test ******************</h2>
    <p>No.1  :{{5+10}}</p>
    <h2>********************** test 2 *******************</h2>
    <input type="text" ng-model="firstName"> </br>
    <input type="text" ng-model="lastName"> </br>
    <h2>姓名 :  {{firstName +" "+lastName}} </h2>
    <p> 数量:{{quantity}} 单价{{cost}} 总价{{quantity*cost}}</p>
    <p> <span ng-bind="quantity*cost"></span> </p>

</div>

<script>
    var app = angular.module('myApp',[]);
    app.controller('myCtrl',function ($scope) {
        $scope.firstName = "John";
        $scope.lastName = "Shan";

    })
</script>



<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>

</html>