<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="java.io.*,java.util.*"%>
<style>body {
  margin: 0;
  padding: 0;
  background-color: #17a2b8;
  height: 100vh;
}
#login .container #login-row #login-column #login-box {
  margin-top: 120px;
  width: 1400px;
  height: 400px;
  border: 1px solid #9C9C9C;
  background-color: #EAEAEA;
}
#login .container #login-row #login-column #login-box #login-form {
  padding: 20px;
}
#login .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
</style>
<title>Claim Hospital Database</title>
<body>
    <div id="login">
        <h3 class="text-center text-white pt-5">User Database</h3>
        
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-lg-6">
                    <div id="login-box" class="col-lg-12">
			<table border="1" style ="background-color:#EAEAEA" cellpadding="5">
        <tr>
            <th>Email</th>
            <th>Password</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Phone Number</th>
            <th>Action</th>
        </tr>
        
        <tr>
            <td>${result.email}</td>
            <td>${result.password}</td>
            <td>${result.fname}</td>
            <td>${result.lname}</td>
            <td>${result.phone}</td>
            <td>
                <a href="editUserData?id=${result.id}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="deleteUserData?id=${result.id}">Delete</a>
            </td>
        </tr>
       
    </table>
                    </div>
                </div>
            </div>
        </div>
    
</body>
 	