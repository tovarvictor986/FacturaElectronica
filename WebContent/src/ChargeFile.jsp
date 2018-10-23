<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/styles.css"
	media="screen" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Procesar CSV</title>
</head>
<body style="text-align: center">
	<h1>Seleccione Archivo CSV a Procesar</h1>
	<ul>
		<li><a href="ChargeFile.jsp">Cargar Archivo</a>
		</li>
		<li><a href="ListFiles.jsp">Ver XML Generados</a>
		</li>
	</ul>
	<br>
	<form method="post" action="ProcessFile.jsp">
		Seleccione Archivo CSV a Procesar: 
		<input type="file" name="dataFile" required id="dataFile" /><br /> <br /> <input type="submit"
			value="Procesar" />
	</form>
</body>
</html>