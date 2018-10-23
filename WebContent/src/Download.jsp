<%@ page import="java.io.*"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.io.File"%>
<%
String nomFile = request.getParameter("id");
	try {
		//nomFile = "101020181451200.xml";
		FileInputStream archivo = new FileInputStream("C:\\temp\\output\\" + nomFile);
		int longitud = archivo.available();
		byte[] datos = new byte[longitud];
		archivo.read(datos);
		archivo.close();
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition",
				"attachment;filename=" + nomFile);
		ServletOutputStream ouputStream = response.getOutputStream();
		ouputStream.write(datos);
		ouputStream.flush();
		ouputStream.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
%>