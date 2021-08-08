<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Car Registration Form</title>
	<style>
		.error{color=red}
	</style>
</head>

<body>

	<form:form action="processForm" modelAttribute="car">
	
		
		Car model (*): <form:input path="carModel" />
			<form:errors path="carModel" cssClass="error"/>
		<br><br>
		
		Car Year (*): <form:input path="carYear" />
			<form:errors path="carYear" cssClass="error"/>
		<br><br>
		
		Country: 
		
		<form:select path="country">
			
			<form:options items="${car.countryOptions}"/>				
			<form:errors path="country" cssClass="error"/>
		</form:select>
	
		<br></br>
		
		Gearbox (*):
		<br></br>
		Manual <form:radiobutton path="gearbox" value="Manual"/>
		<br></br>
		Automatic <form:radiobutton path="gearbox" value="Automatic"/>
		<br></br>
		<form:errors path="gearbox" cssClass="error"/>
		<br></br>
			
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>