<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>
<body ng-app=""  style="font-family: Helvetica;font-size: 14px; "  bgcolor="#bba" >

<center><h2 style="color:'#c00'">Add Best Fittings For Your Match</h2></center>
	<center><form:form method="POST"
		action="/product/saveorder/harishkumar.gudivada/1?addFitting=true">

		<table style="align-items: center; " width="60%">
			<tr>
				<td>
					<table>
						<tr>
							<td><form:label path="waist">Waist</form:label></td>
							<td><form:input path="waist" /></td>
						</tr>
						<tr>
							<td><form:label path="hip">Hip</form:label></td>
							<td><form:input path="hip" /></td>
						</tr>
						<tr>
							<td><form:label path="hipWaist">Hip Waist</form:label></td>
							<td><form:input path="hipWaist" /></td>
						</tr>
						<tr>
							<td><form:label path="leineNeck">Leine Neck</form:label></td>
							<td><form:input path="leineNeck" /></td>
						</tr>
						<tr>
							<td><form:label path="armLength">Arm Length</form:label></td>
							<td><form:input path="armLength" /></td>
						</tr>
						<tr>
							<td><form:label path="chestToWaist">Chest to Waist</form:label></td>
							<td><form:input path="chestToWaist" /></td>
						</tr>
						<tr>
							<td><form:label path="bust">Bust</form:label></td>
							<td><form:input path="bust" /></td>
						</tr>
						<tr>
							<td><form:label path="belowBust">Below Bust</form:label></td>
							<td><form:input path="belowBust" /></td>
						</tr>
						<tr>
							<td><form:label path="aboveBust">Above Bust</form:label></td>
							<td><form:input path="aboveBust" /></td>
						</tr>
						<tr>
							<td><form:label path="waistToDesiredLength">Waist to Desired Lengtht</form:label></td>
							<td><form:input path="waistToDesiredLength" /></td>
						</tr>
						<tr height="2"><td></td>
							<td   align="right"  ><b><input type="submit" value="Submit" style="font-family: Helvetica;font-size: 12px;height: 25px;background-color: #ddd;color= #999;margin-top: 10px"/></b></td>
						</tr>
					</table>
				</td>
				<td><span  ng-init="myVar = '/resources/images/kurthiMeasurments.png'"><img src="{{myVar}}" style="height:299px"> </td>
			</tr>
			
		</table>
	</form:form></center>

 

</body>
</html>