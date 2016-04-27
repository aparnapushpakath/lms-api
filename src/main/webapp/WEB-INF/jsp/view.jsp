<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="<c:url value='/js/app.js' />"></script>
<script src="<c:url value='/js/jscontroller/userservice.js' />"></script>
<script src="<c:url value='/js/jscontroller/usercontroller.js' />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-app="myApp">

	<h3>User Management Portal</h3>
	<div ng-controller="UserController as ctrl">

		<form ng-submit="ctrl.submit()" name="myForm">

			<input type="hidden" ng-model="ctrl.user.id" />
			<div>
				<label for="firstname">First Name</label> <input type="text"
					ng-model="ctrl.user.firstname" id="firstname" />

			</div>
			<div>
				<label for="phone">Phone</label> <input type="text"
					ng-model="ctrl.user.phone" id="phone"
					placeholder="Enter your Phone" />
			</div>
			<div>
				<label for="lastname">Last Name</label> <input type="text"
					ng-model="ctrl.user.lastname" id="lastname"
					placeholder="Enter your Last name" />
			</div>
			<div>
				<input type="submit" value="{{!ctrl.user.id ? 'Add' : 'Update'}}" />
				<button type="button" ng-click="ctrl.reset()"
					class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset
					Form</button>
			</div>
		</form>
		<div>List of Users</div>
		<table>
			<thead>
				<tr>
					<th>ID.</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Phone</th>
					<th width="10%"></th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="u in ctrl.users">
					<td><span ng-bind="u.id"></span></td>
					<td><span ng-bind="u.firstname"></span></td>
					<td><span ng-bind="u.lastname"></span></td>
					<td><span ng-bind="u.phone"></span></td>
					<td>
						<button type="button" ng-click="ctrl.edit(u.id)"
							class="btn btn-success custom-width">Edit</button>
						<button type="button" ng-click="ctrl.remove(u.id)"
							class="btn btn-danger custom-width">Remove</button>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>