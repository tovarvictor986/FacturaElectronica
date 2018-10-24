<%@page import="com.model.Constants"%>
<%@ page import="com.model.FileCSV"%>
<%@ page import="com.model.CreateXML"%>
<%@ page import="com.model.Constants.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.io.File"%>

<%
	String file = request.getParameter("dataFile");
	String filePathOnServer = application.getRealPath("dataFile");	
	//out.println("file> "+file);
	//out.println("<br />");
	//out.println("filePathOnServer "+filePathOnServer);
	//out.println("<br />");
	//out.println(request.getRealPath(file));//ESTA LA QUE SACA LA RUTA COMPLETA ASUMIENDO 
	//QUE EL ARCHIVO ESTA EN LA RAIZ DE LA APLICACION
	FileInputStream fis = new FileInputStream("C:/temp/input/"+file);//("C:/Users/vtovar/Documents/TXTtoXML/DATA_PRUEBA.csv");
	DataInputStream dis = new DataInputStream(fis);
	BufferedReader d = new BufferedReader(new InputStreamReader(dis));
	int i = 0;
	int j = 0;
	String tmp;
	FileCSV fileCSV = new FileCSV();
	while ((tmp = d.readLine())!= null) {
		String line = tmp;//d.readLine();
		String[] words = line.split(";");		
		for (String str : words) {
			//out.println("STR " + str + "<br />");	
			if(str.isEmpty()||str.trim().equals("")){
				str = "";				
			}
			//SE AGREGAN LAS PARTES CONSTANTES DEL XML
			//fileCSV.setStsInvoiceAuthorization(Constants.stsInvoiceAuthorization);
			//
			switch (j) {
	            case 1:  
	            	//fileCSV.setStsInvoiceAuthorization(str);//OK
	            	fileCSV.setStsInvoiceAuthorization(Constants.STS_INVOICE_AUTHOTIZATION);
                    break;
	            case 2:  
	            	fileCSV.setStsFrom(str);//OK                   
	            	break;
	            case 3:  
	            	fileCSV.setStsTo(str);//OK
	                break;
	            case 4:  
	            	fileCSV.setStsProviderID(str);//OK
	                break;
	            case 5:  
	            	fileCSV.setStsSoftwareID(str);//OK
	                break;
	            case 6:  
	            	fileCSV.setXadesSigningTime(str);//OK
	                break;
	            case 7:  
	            	fileCSV.setDsX509IssuerName(str);//OK
	                break;
	            case 8:  
	            	fileCSV.setDsX509SerialNumber(str);//OK
	                break;
	            case 9:  
	            	fileCSV.setDsX509SerialNumber(str);//OK -->VALOR X DEFECTO 6605235186989070000
	                break;
	            case 10: 
	            	fileCSV.setXadesClaimedRole(str);//OK
	                break;
	            case 11: 
	            	fileCSV.setCbcUBLVersionID(str);//OK
	                break;
	            case 12: 
	            	fileCSV.setCbcProfileID(str);//OK
	                break;
	            case 13: 
	            	fileCSV.setCbcUUID(str);//OK
	                break;
	            case 14: 
	            	fileCSV.setCbcIssueDate(str);//OK
	                break;
	            case 15: 
	            	fileCSV.setCbcIssueTime(str);//OK
	                break;
	            case 16: 
	            	fileCSV.setCbcNote(str);//OK
	                break;
	            case 17: 
	            	fileCSV.setStsSoftwareSecurityCode(str);//OK
	                break;
	            case 18: 
	            	fileCSV.setCbcInvoiceTypeCode(str);//OK
	                break;
	            case 19: 
	            	fileCSV.setStsPrefix(str);//OK
	                break;
	            case 20: 
	            	fileCSV.setCbcStartDate(str);//OK
	                break;
	            case 21: 
	            	fileCSV.setCliente(str);//OK
	                break;
	            case 22: 
	            	fileCSV.setTercero(str);//OK
	                break;
	            case 23: 
	            	fileCSV.setCbcEndDate(str);//OK
	                break;
	            case 24: 
	            	fileCSV.setCbcTaxAmount(str);//OK
	                break;
	            case 25: 
	            	fileCSV.setCbcTaxAmount(str);//OK
	                break;
	            case 26: 
	            	fileCSV.setCbcTaxableAmount(str);//OK
	                break;
	            case 27: 
	            	fileCSV.setIva(str);//OK
	                break;
	            case 28: 
	            	fileCSV.setCbcTaxAmount(str);//OK
	                break;
	            case 29: 
	            	fileCSV.setCbcTaxAmount2(str);//OK
	                break;
	            case 30: 
	            	fileCSV.setCbcTaxAmount3(str);//OK
	                break;
	            case 31: 
	            	fileCSV.setNumeroFact(str);//OK
	                break;
	            case 32: 
	            	fileCSV.setFechaFactura(str);//OK
	                break;
	            case 33: 
	            	fileCSV.setValorFactura(str);//OK
	                break;
	            case 34: 
	            	fileCSV.setCodImpuesto1(str);//OK
	                break;
	            case 35: 
	            	fileCSV.setValorImpuesto1(str);//OK
	                break;
	            case 36: 
	            	fileCSV.setCodImpuesto2(str);//OK
	                break;
	            case 37: 
	            	fileCSV.setValorImpuesto2(str);//OK
	                break;
	            case 38: 
	            	fileCSV.setCodImpuesto3(str);//OK
	                break;
	            case 39: 
	            	fileCSV.setValorImpuesto3(str);//OK
	                break;
	            case 40: 
	            	fileCSV.setValorIva(str);//OK
	                break;
	            case 41:
	            	fileCSV.setNitGfi(str);//OK
	                break;
	            case 42: 
	            	fileCSV.setTipodeAdquiriente(str);//OK
	                break;
	            case 43: 
	            	fileCSV.setNitQuienFactura(str);//OK
	                break;
	            case 44: 
	            	fileCSV.setClaveFacturacion(str);//OK
	                break;
	            case 45: 
	            	fileCSV.setDsDigestValue(str);//OK
	                break;
	            case 46: 
	            	fileCSV.setDsSignatureValue(str);//OK
	                break;
	            case 47: 
	            	fileCSV.setDsX509Certificate(str);//OK
	                break;
	            case 48: 
	            	fileCSV.setDsSignature(str);//OK
	                break;
	            case 49: 
	            	fileCSV.setCbcDocumentCurrencyCode(str);//OK
	                break;
	            case 50: 
	            	fileCSV.setCbcAdditionalAccountID(str);//OK
	                break;
	            case 51: 
	            	fileCSV.setCbcID(str);//OK
	                break;
	            case 52: 
	            	fileCSV.setCbcName(str);//OK
	                break;
	            case 53: 
	            	fileCSV.setCbcDepartment(str);//OK
	                break;
	            case 54: 
	            	fileCSV.setCbcCitySubdivisionName(str);//OK
	                break;
	            case 55: 
	            	fileCSV.setCbcCityName(str);//OK
	                break;
	            case 56: 
	            	fileCSV.setCbcLine(str);//OK
	                break;
	            case 57: 
	            	fileCSV.setCbcIdentificationCode(str);//OK
	                break;
	            case 58: 
	            	fileCSV.setCbcTaxLevelCode(str);//OK
	                break;
	            case 59: 
	            	fileCSV.setCbcRegistrationName(str);//OK
	                break;
	            case 60: 
	            	fileCSV.setCbcTaxAmount(str);//OK
	                break;
	            case 61: 
	            	fileCSV.setCbcTaxEvidenceIndicator(str);//OK
	                break;
	            case 62: 
	            	fileCSV.setCbcTaxableAmount(str);//OK
	                break;
	            case 63: 
	            	fileCSV.setCbcPercent(str);//OK
	                break;
	            case 64: 
	            	fileCSV.setCbcLineExtensionAmount (str);//OK
	                break;
	            case 65: 
	            	fileCSV.setCbcTaxExclusiveAmount(str);//OK
	                break;
	            case 66: 
	            	fileCSV.setCbcPayableAmount(str);//OK
	                break;
	            case 67: 
	            	fileCSV.setCbcInvoicedQuantity(str);//OK
	                break;
	            case 68: 
	            	fileCSV.setCbcLineExtensionAmount(str);//OK
	                break;
	            case 69: 
	            	fileCSV.setCbcDescription(str);//OK
	                break;
	            case 70: 
	            	fileCSV.setCbcPriceAmount(str);//OK
	                break;
// 	            case 73: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;
// 	            case 74: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;   
// 	            case 75: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;
// 	            case 76: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;
// 	            case 77: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;
// 	            case 78: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;
// 	            case 79: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;
// 	            case 80: 
// 	            	fileCSV.setStsInvoiceAuthorization(str);
// 	                break;
	            //default: 
	            //	fileCSV.setStsInvoiceAuthorization(str);
	             //   break;			
			}
		j++;
		System.out.println("CONTADORXXXS "+i);
		CreateXML createXML = new CreateXML();
		createXML.create(fileCSV,i);		
	}
		i++;
}
%>
 <center>
 	<h1>Documento Procesado</h1>	        
 	<a href='../index.jsp'>Regresar...</a>   
</center>
