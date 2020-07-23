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
        <h3 class="text-center text-white pt-5">Edit User Data</h3>
        
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-lg-6">
                    <div id="login-box" class="col-lg-12">
                    <div align="center">
				 <div class="span6" style ="background-color:#EAEAEA">
						<h3 class="text-center">${msg}</h3>
						<form action="editUserData" method="post" name="saveEditedUserData" id= "register" class="form-horizontal">
                        
                            <h3 class="text-center text-info">Register</h3>
                            <div class="form-group">
                                <label for="email" class="text-info">Email:</label><br>
                                <input type="text" name="email" id="email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="password" name="password" id="password" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Repeat Password:</label><br>
                                <input type="password" name="repeatpass" id="repeatpass" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="fname" class="text-info">First Name:</label><br>
                                <input type="text" name="fname" id="fname" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="lmame" class="text-info">Last Name:</label><br>
                                <input type="text" name="lname" id="lname" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="phone" class="text-info">Phone Number:</label><br>
                                <input type="text" name="phone" id="phone" class="form-control">
                            </div>
                           <div class="form-group">
                             <br>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Submit">
                            </div>
                            <div id="register-link" class="text-right">
                                <a href="profile" class="text-info">Return to Profile</a>
                            </div>
                        </form>
					</div>
					</div>
                    </div>
                </div>
            </div>
        </div>
    
</body>