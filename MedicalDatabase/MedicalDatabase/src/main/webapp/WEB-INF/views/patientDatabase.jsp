<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>body {
  margin: 0;
  padding: 0;
  background-color: #17a2b8;
  height: 100vh;
}
#login .container #login-row #login-column #login-box {
  margin-top: 120px;
  max-width: 600px;
  height: 220px;
  border: 1px solid #9C9C9C;
  background-color: #EAEAEA;
}
#login .container #login-row #login-column #login-box #login-form {
  padding: 20px;
}
#login .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
button{
    margin: 10px;
}
</style>
<title>Claim Hospital Database</title>
<body>
    <div id="login">
        <h3 class="text-center text-white pt-5">Welcome to the Claim Hospital Database!</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <div>  
                        <br/>  						
                        	<a href="addToPatientDatabase"><button type="button" class="btn btn-info btn-md" style="float: left;">Add a New Patient's Data</button></a>
                        	<a href="viewPatientData"><button type="button" class="btn btn-info btn-md" style="float: left;">View a Patient's Data and/or Update Existing Patient's Data</button></a>&nbsp;
    						<a href="viewUserData"><button type="button" class="btn btn-info btn-md" style="float: left;">To User Database</button></a><br/>
    					</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>