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
        <h3 class="text-center text-white pt-5">Search Patient Database</h3>
         <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-lg-6">
                    <div id="login-box" class="col-lg-12">
                    <div align="center">
				 
            <div class="span6" style ="background-color:#EAEAEA">
						<h3 class="text-center">${msg}</h3>
						<form:form action="${action}" modelAttribute="patient" method="post"
							class="form-horizontal">
							<h3 class="text-center">
								<span class="text-success"> ${success}</span> <span
									class="text-error text-center">${error}</span>
							</h3>
							<div class="control-group">
								<label class="control-label" for="fname">First Name*</label>
								<div class="controls">
									<form:input path="fname" placeholder="First Name" />
									<div class="has-error">
										<form:errors path="fname" class="text-error" />
									</div>
								</div>

							</div>
							<div class="control-group">
								<label class="control-label" for="lname">Last Name*</label>
								<div class="controls">
									<form:input path="lname" placeholder="Last Name" />
									<div class="has-error">
										<form:errors path="lname" class="text-error" />
									</div>
								</div>

							</div>
							<div class="control-group">
								<label class="control-label" for="docEmail">Physician's Email*</label>
								<div class="controls">
									<form:input path="docEmail" placeholder="Physician's Email" />
									<div class="has-error">
										<form:errors path="docEmail" class="text-error" />
									</div>
								</div>

							</div>
							<div class="control-group">
								<label class="control-label" for="o2Level">02 Saturation Level*</label>
								<div class="controls">
									<form:input path="o2Level" placeholder="02 Saturation Level" />
									<div class="has-error">
										<form:errors path="o2Level" class="text-error" />
									</div>
								</div>

							</div>
								<div class="control-group">
								<label class="control-label" for="heartbeat">Heartbeat*</label>
								<div class="controls">
									<form:input path="heartbeat" placeholder="Heartbeat" />
									<div class="has-error">
										<form:errors path="heartbeat" class="text-error" />
									</div>
								</div>

							</div>
									
							<div class="control-group">
								<label class="control-label" for="temperature">Temperature*</label>
								<div class="controls">
									<form:input path="temperature" placeholder="Temperature" />
									<div class="has-error">
										<form:errors path="temperature" class="text-error" />
									</div>
								</div>

							</div>
							<div class="control-group">
								<label class="control-label" for="respiratoryRate">Respiratory Rate*</label>
								<div class="controls">
									<form:input path="respiratoryRate" placeholder="Respiratory Rate" />
									<div class="has-error">
										<form:errors path="respiratoryRate" class="text-error" />
									</div>
								</div>

							</div>
							<div class="control-group">
								<label class="control-label" for="systolicBloodPressure">Systolic Blood Pressure*</label>
								<div class="controls">
									<form:input path="systolicBloodPressure" placeholder="Systolic Blood Pressure" />
									<div class="has-error">
										<form:errors path="systolicBloodPressure" class="text-error" />
									</div>
								</div>

							</div>
							<div class="control-group">
								<label class="control-label" for="diastolicBloodPressure">Diastolic Blood Pressure*</label>
								<div class="controls">
									<form:input path="diastolicBloodPressure" placeholder="Diastolic Blood Pressure" />
									<div class="has-error">
										<form:errors path="diastolicBloodPressure" class="text-error" />
									</div>
								</div>

							</div>
							
							<div class="control-group">
								<div class="controls">
									<button type="submit" id="submit" class="btn btn-info btn-sm">Submit</button>
									<a href="patientDatabase" class="btn btn-info btn-sm">Cancel</a>
								</div>

							</div>
						</form:form>

					</div>
					</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>