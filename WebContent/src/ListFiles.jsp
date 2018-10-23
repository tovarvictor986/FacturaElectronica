<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
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
	<h1>Lista Archivos XML Generados</h1>
	<ul>
		<li><a href="ChargeFile.jsp">Cargar Archivo</a></li>
		<li><a href="ListFiles.jsp">Ver XML Generados</a></li>
	</ul>
	<br>
	<%!public void GetDirectory(String a_Path, Vector a_files, Vector a_folders) {
		File l_Directory = new File(a_Path);
		File[] l_files = l_Directory.listFiles();

		for (int c = 0; c < l_files.length; c++) {
			if (l_files[c].isDirectory()) {
				a_folders.add(l_files[c].getName());
			} else {
				a_files.add(l_files[c].getName());
			}
		}

	}%>

	<%
		Vector l_Files = new Vector(), l_Folders = new Vector();
		GetDirectory("C:/temp/output/", l_Files, l_Folders);

		for (int a = 0; a < l_Files.size(); a++) {
			String path = "Download.jsp?id="
					+ l_Files.elementAt(a).toString();
			out.println("<a href=\"" + path + "\">"
					+ l_Files.elementAt(a).toString() + "</a>");
			out.println("<br />");
		}
	%>
</body>
</html>