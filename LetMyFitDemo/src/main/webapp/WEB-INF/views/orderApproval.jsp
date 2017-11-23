<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script>

function approveOrder(orderId) {
	var xhttp = new XMLHttpRequest();
	var addPrice=document.getElementById("addPrice"+orderId).value;
	var orderNo=document.getElementById("addPrice"+orderId).orderNo;
	var url = "http://localhost:8080/approveOrder/" + orderId+"/"+100+"/"+1234;
	xhttp.open("POST", url, true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send();
	var response = JSON.parse(xhttp.responseText);
	document.getElementById("errorMessage").innerHTML = "Order Approved";
}

function rejectOrder(orderId) {
	var xhttp = new XMLHttpRequest();
	var orderNo=document.getElementById("addPrice"+orderId).orderNo;
	var url = "http://localhost:8080/rejectOrder/"+orderId+"/"+1234;
	xhttp.open("POST", url, true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send();
	var response = JSON.parse(xhttp.responseText);
	document.getElementById("errorMessage").innerHTML = "Order Rejected";
}

function fittingsPopup(orderId){

	var data=document.getElementById("fittingspopup"+orderId).getAttribute("value");
	var w = window.open("", "popupWindow","width=600, height=400, scrollbars=yes");
	var tblRow = "<html><title>Fittings</title>";
	tblRow += "<table><tr><td>Parameter</td><td>Size</td></tr>";
	 for ( var key in data ) {
	     htmlText += '<tr><td>';
         htmlText += '<td>' + data[key].fittingtype + '</td>';
         htmlText += '<td>' + data[key].size + '</td></tr>';
     }
	 w.innerHTML=htmlText;
}


</script>

<title>Insert title here</title>
</head>
<body>


 <div id="errorMessage"></div>
  <table border="1">
    <thead>
      <tr>
      <td style="width: 5%;background-color: #93969b">OrderId</td>
      <td style="width: 25%;background-color: #93969b">Product</td>
      <td style="width: 20%;background-color: #93969b">UserId</td>
      <td style="width: 10%;background-color: #93969b">Fittings</td>
      <td style="width: 10%;background-color: #93969b">Price</td>
      <td style="width: 10%;background-color: #93969b">Additional Price</td>
      <td style="width: 10%;background-color: #93969b"></td>
      <td style="width: 10%;background-color: #93969b"></td>
      </tr>
    </thead>
    
    <tbody>
    <c:forEach  var="order" items="${orderDetails}">
    <tr bordercolor="blue">
       <td style="width: 5%;"><c:out value="${order.orderId}"/></td>
       <td style="width: 25%;"><img src=""></td>
       <td style="width: 20%;"><c:out value="${order.userId}"/></td>
       <td style="width: 10%;"> <div id="fittingspopup${order.orderId}" value="${order.measurements}" "><img src="#"  onmouseover="fittingsPopup(${order.orderId})"/></div></td>
       <td style="width: 10%;"><c:out value="${order.price}"/></td>
       <td style="width: 10%;"><input type="text" name="addPrice" id="addPrice${order.orderId}" value="${order.addPrice}" orderNo="${order.orderNumber}"/></td>
       <td style="width: 10%;"><button name="approveOrder" onclick="approveOrder(${order.orderId});">Approve Order</button></td>
       <td style="width: 10%;"><button name="rejectOrder" onclick="rejectOrder(${order.orderId});">Reject Order</button></td>
       </tr>
    </c:forEach>
  </tbody>
  </table>
  
</body>
</html>







