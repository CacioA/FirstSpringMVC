<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="car">
	
		Car brand: <form:input path="carBrand" />
			<form:errors path="carBrand" cssClass="error"/>
		<br><br>
	
		Car model: <form:input path="carModel" />
		
		<br><br>
		
		Country: 
		
		<form:select path="country">
			
			<form:options items="${car.countryOptions}"/>				
		
		</form:select>
	
		<br></br>
		
		Gearbox:
		<br></br>
		Manual <form:radiobutton path="gearbox" value="Manual"/>
		Automatic <form:radiobutton path="gearbox" value="Automatic"/>
		Sequential <form:radiobutton path="gearbox" value="Sequential"/>	
		<br></br>
			
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>