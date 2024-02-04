<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTERING DATA</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src= "https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
 <style>#div{
width:600px;height:400px;margin:auto;margin-top:100px;background-color:Orange;
}</style>
</head>
<body class="container-fluid" >
<div class="card" id="div">
<h2 class=" card-header text-Center text-light bg-danger ">REGISTER DATA INTO DB</h2>
<form class="form" action="register" method="Post">
<table class="table table-hover table-strip">

<tr>
<td >EQUIP_ID</td>
<td> <input type="text" name="equip_id" placeholder="ENTER EQUIP_ID"> </td>
</tr>

<tr>
<td >TYPE</td>
<td> <input type="text" name="type" placeholder="ENTER TYPE"></td>
</tr>

<tr>
<td >COLOR</td>
<td> <input type="text" name="color" placeholder="ENTER COLOR"></td>
</tr>

<tr>
<td >LOCATION</td>
<td> <input type="text" name="location" placeholder="ENTER LOCATION"></td>
</tr>

<tr>
<td >INSTALL_DATE</td>
<td><input type="text" name="install_date" placeholder="yyyy-mm-dd" value=""min="1997-01-01" max="2030-12-31"></td>
</tr>

<tr>
<td><button type="submit" class="btn btn-outline-success">REGISTER</button></td>
<td><button type="reset" class="btn btn-outline-danger">RESET</button></td>
</tr>

</table>
</form>
</body>
</html>