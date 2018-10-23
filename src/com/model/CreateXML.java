package com.model;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.w3c.dom.Attr;
/**
 *
 * @author skargopolov
 */
public class CreateXML {		
    
	public CreateXML() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public void create(FileCSV fileXML, int i) {
        //String personXMLStringValue = null;
		//System.out.println("entra a crear xml");
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        
        try {
        	DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        	//Elemento raíz
            Document doc = docBuilder.newDocument();
            Element feInvoice = doc.createElement("fe:Invoice");
            doc.appendChild(feInvoice);
            
          //Se agrega un atributo al nodo elemento y su valor
            Attr xmlnsfe = doc.createAttribute("xmlns:fe");
            xmlnsfe.setValue("http://www.dian.gov.co/contratos/facturaelectronica/v1");
            feInvoice.setAttributeNode(xmlnsfe);
            
            Attr xmlnscac = doc.createAttribute("xmlns:cac");
            xmlnscac.setValue("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2");
            feInvoice.setAttributeNode(xmlnscac);
            
            Attr xmlnscbc = doc.createAttribute("xmlns:cbc");
            xmlnscbc.setValue("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2");
            feInvoice.setAttributeNode(xmlnscbc);
            
            Attr xmlnsclm54217 = doc.createAttribute("xmlns:clm54217");
            xmlnsclm54217.setValue("urn:un:unece:uncefact:codelist:specification:54217:2001");
            feInvoice.setAttributeNode(xmlnsclm54217);
            
            Attr xmlnsclm66411 = doc.createAttribute("xmlns:clm66411");
            xmlnsclm66411.setValue("urn:un:unece:uncefact:codelist:specification:66411:2001");
            feInvoice.setAttributeNode(xmlnsclm66411);
            
            Attr xmlnsclmIANAMIMEMediaType = doc.createAttribute("xmlns:clmIANAMIMEMediaType");
            xmlnsclmIANAMIMEMediaType.setValue("urn:un:unece:uncefact:codelist:specification:IANAMIMEMediaType:2003");
            feInvoice.setAttributeNode(xmlnsclmIANAMIMEMediaType);
           
            Attr xmlnsext = doc.createAttribute("xmlns:ext");
            xmlnsext.setValue("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2");
            feInvoice.setAttributeNode(xmlnsext);
            
            Attr xmlnsqdt = doc.createAttribute("xmlns:qdt");
            xmlnsqdt.setValue("urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2");
            feInvoice.setAttributeNode(xmlnsqdt);
            
            Attr xmlnssts = doc.createAttribute("xmlns:sts");
            xmlnssts.setValue("http://www.dian.gov.co/contratos/facturaelectronica/v1/Structures");
            feInvoice.setAttributeNode(xmlnssts);
            
            Attr xmlnsudt = doc.createAttribute("xmlns:udt");
            xmlnsudt.setValue("urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2");
            feInvoice.setAttributeNode(xmlnsudt);            
            
            Attr xmlnsxsi = doc.createAttribute("xmlns:xsi");
            xmlnsxsi.setValue("http://www.w3.org/2001/XMLSchema-instance");
            feInvoice.setAttributeNode(xmlnsxsi);            
            
            Attr xsischemaLocation = doc.createAttribute("xsi:schemaLocation");
            xsischemaLocation.setValue("http://www.dian.gov.co/contratos/facturaelectronica/v1 ../xsd/DIAN_UBL.xsd urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2 ../../ubl2/common/UnqualifiedDataTypeSchemaModule-2.0.xsd urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2 ../../ubl2/common/UBL-QualifiedDatatypes-2.0.xsd");
            feInvoice.setAttributeNode(xsischemaLocation); 
            
          //Primer elemento
            Element extUBLExtensions = doc.createElement("ext:UBLExtensions");
            feInvoice.appendChild(extUBLExtensions);
            
          //Primer elemento
            Element extUBLExtension = doc.createElement("ext:UBLExtension");
            extUBLExtensions.appendChild(extUBLExtension);
            
          //extExtensionContent elemento
            Element extExtensionContent = doc.createElement("ext:ExtensionContent");
            extUBLExtension.appendChild(extExtensionContent);
            
          //stsDianExtensions elemento
            Element stsDianExtensions = doc.createElement("sts:DianExtensions");
            extExtensionContent.appendChild(stsDianExtensions);
            
          //stsDianExtensions elemento
            Element stsInvoiceControl = doc.createElement("sts:InvoiceControl");
            stsDianExtensions.appendChild(stsInvoiceControl);
            
          //stsDianExtensions elemento
            Element stsInvoiceAuthorization = doc.createElement("sts:InvoiceAuthorization");
            stsInvoiceControl.appendChild(stsInvoiceAuthorization);
            //stsInvoiceAuthorization.setTextContent("9000000500018095");
            stsInvoiceAuthorization.setTextContent(fileXML.getStsInvoiceAuthorization());
            
          //stsDianExtensions elemento
            Element stsAuthorizationPeriod = doc.createElement("sts:AuthorizationPeriod");
            stsInvoiceControl.appendChild(stsAuthorizationPeriod);            
            
            Element cbcStartDate = doc.createElement("cbc:StartDate");
            stsAuthorizationPeriod.appendChild(cbcStartDate);
            //cbcStartDate.setTextContent("2016-04-26");
            cbcStartDate.setTextContent(fileXML.getCbcStartDate());
            
            Element cbcEndDate = doc.createElement("cbc:EndDate");
            stsAuthorizationPeriod.appendChild(cbcEndDate);
            //cbcEndDate.setTextContent("2016-04-26");
            cbcEndDate.setTextContent(fileXML.getCbcEndDate());
            
          //sts:AuthorizedInvoices elemento
            Element stsAuthorizedInvoices = doc.createElement("sts:AuthorizedInvoices");
            stsInvoiceControl.appendChild(stsAuthorizedInvoices); 
            
            Element stsPrefix = doc.createElement("sts:Prefix");
            stsAuthorizedInvoices.appendChild(stsPrefix);
            //stsPrefix.setTextContent("PRUE");
            stsPrefix.setTextContent(fileXML.getStsPrefix());
            
            Element stsFrom = doc.createElement("sts:From");
            stsAuthorizedInvoices.appendChild(stsFrom);
            //tsFrom.setTextContent("980000000");
            stsFrom.setTextContent(fileXML.getStsFrom());
            
            Element stsTo = doc.createElement("sts:To");
            stsAuthorizedInvoices.appendChild(stsTo);
            //stsTo.setTextContent("985000000");
            stsTo.setTextContent(fileXML.getStsTo());
            
            Element dsSignedInfo = doc.createElement("ds:SignedInfo");
            feInvoice.appendChild(dsSignedInfo);           
         
            Element stsInvoiceSource = doc.createElement("sts:InvoiceSource");
            stsDianExtensions.appendChild(stsInvoiceSource);
            
            Element cbcIdentificationCode = doc.createElement("cbc:IdentificationCode");
            stsInvoiceSource.appendChild(cbcIdentificationCode);
            
            Attr listAgencyID = doc.createAttribute("listAgencyID");
            listAgencyID.setValue("6");
            cbcIdentificationCode.setAttributeNode(listAgencyID);
            
            Attr listAgencyName = doc.createAttribute("listAgencyName");
            listAgencyName.setValue("United Nations Economic Commission for Europe");
            cbcIdentificationCode.setAttributeNode(listAgencyName);
            
            Attr listSchemeURI = doc.createAttribute("listSchemeURI");
            listSchemeURI.setValue("urn:oasis:names:specification:ubl:codelist:gc:CountryIdentificationCode-2.0");
            cbcIdentificationCode.setAttributeNode(listSchemeURI);


            Element stsSoftwareProvider = doc.createElement("sts:SoftwareProvider");
            stsDianExtensions.appendChild(stsSoftwareProvider);
            
            Element stsProviderID = doc.createElement("sts:ProviderID");
            stsSoftwareProvider.appendChild(stsProviderID);
            
            Attr schemeAgencyID = doc.createAttribute("schemeAgencyID");
            schemeAgencyID.setValue("195");
            stsProviderID.setAttributeNode(schemeAgencyID);
            
            Attr schemeAgencyName = doc.createAttribute("schemeAgencyName");
            schemeAgencyName.setValue("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
            stsProviderID.setAttributeNode(schemeAgencyName);
            
            //stsProviderID.setTextContent("900373123");
            stsProviderID.setTextContent(fileXML.getStsProviderID());
            
            
            Element stsSoftwareID = doc.createElement("sts:SoftwareID");
            stsSoftwareProvider.appendChild(stsSoftwareID);
            
            Attr schemeAgencyID2 = doc.createAttribute("schemeAgencyID");
            schemeAgencyID2.setValue("195");
            stsSoftwareID.setAttributeNode(schemeAgencyID2);
            
            Attr schemeAgencyName2 = doc.createAttribute("schemeAgencyName");
            schemeAgencyName2.setValue("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
            stsSoftwareID.setAttributeNode(schemeAgencyName2);
            
            //stsSoftwareID.setTextContent("bc4f22ac-1277-4c71-a376-827baaea0a8e");
            stsSoftwareID.setTextContent(fileXML.getStsSoftwareID());
            
            Element stsSoftwareSecurityCode = doc.createElement("sts:SoftwareSecurityCode");
            stsDianExtensions.appendChild(stsSoftwareSecurityCode);
            
            Attr schemeAgencyID3 = doc.createAttribute("schemeAgencyID");
            schemeAgencyID3.setValue("195");
            stsSoftwareSecurityCode.setAttributeNode(schemeAgencyID3);
            
            Attr schemeAgencyName3 = doc.createAttribute("schemeAgencyName");
            schemeAgencyName3.setValue("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
            stsSoftwareSecurityCode.setAttributeNode(schemeAgencyName3);
            
            //stsSoftwareSecurityCode.setTextContent("74d8a47cc4537942a8b77d06839f15ce872645ca851e7b0687c887d82379076c3395920037220bdbb45210dfcb9bcdc5");
            stsSoftwareSecurityCode.setTextContent(fileXML.getStsSoftwareSecurityCode());
                        
            Element extUBLExtension2 = doc.createElement("ext:UBLExtension");
            extUBLExtensions.appendChild(extUBLExtension2);
            
            Element extExtensionContent2 = doc.createElement("ext:ExtensionContent");
            extUBLExtensions.appendChild(extExtensionContent2);
            
            Element dsSignature = doc.createElement("ds:Signature");
            extExtensionContent2.appendChild(dsSignature);
            
            Attr xmlnsds = doc.createAttribute("xmlns:ds");
            xmlnsds.setValue("http://www.w3.org/2000/09/xmldsig#");
            dsSignature.setAttributeNode(xmlnsds);
            
            Attr Id = doc.createAttribute("Id");
            Id.setValue("xmldsig-6b980c9f-13e8-4f8d-8f7e-c536dd84fef3");
            dsSignature.setAttributeNode(Id);
            
            Element dsSignedInfo2 = doc.createElement("ds:SignedInfo");
            dsSignature.appendChild(dsSignedInfo2);
            
            Element dsCanonicalizationMethod = doc.createElement("ds:CanonicalizationMethod");
            dsSignedInfo2.appendChild(dsCanonicalizationMethod);
            
            Attr Algorithm = doc.createAttribute("Algorithm");
            Algorithm.setValue("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
            dsCanonicalizationMethod.setAttributeNode(Algorithm);
            
            Element dsSignatureMethod = doc.createElement("ds:SignatureMethod");
            dsSignedInfo2.appendChild(dsSignatureMethod); 
            
            Element dsReference = doc.createElement("ds:Reference");
            dsSignedInfo2.appendChild(dsReference);
            
            Attr Id6 = doc.createAttribute("Id");
            Id6.setValue("xmldsig-6b980c9f-13e8-4f8d-8f7e-c536dd84fef3-ref0");
            dsReference.setAttributeNode(Id6);
            
            Attr uri = doc.createAttribute("URI");
            uri.setValue("");
            dsReference.setAttributeNode(uri);
            
            Element dsTransforms = doc.createElement("ds:Transforms");
            dsReference.appendChild(dsTransforms);
            
            Element dsTransform = doc.createElement("ds:Transform");
            dsTransforms.appendChild(dsTransform);
            
            Attr Algorithm2 = doc.createAttribute("Algorithm");
            Algorithm2.setValue("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
            dsTransform.setAttributeNode(Algorithm2);
            
            Element dsDigestMethod = doc.createElement("ds:DigestMethod");
            dsReference.appendChild(dsDigestMethod);
            
            Attr Algorithm3 = doc.createAttribute("Algorithm");
            Algorithm3.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
            dsDigestMethod.setAttributeNode(Algorithm3);            
            
            Element dsDigestValue = doc.createElement("ds:DigestValue");
            dsReference.appendChild(dsDigestValue);
            //dsDigestValue.setTextContent("t2Du9FY+5IhGlOyb5a1bIZ5GBTs=");
            dsDigestValue.setTextContent(fileXML.getDsDigestValue());
            
            Element dsReference2 = doc.createElement("ds:Reference");
            dsSignedInfo2.appendChild(dsReference2);
            
            Attr uri2 = doc.createAttribute("URI");
            uri2.setValue("#xmldsig-87d128b5-aa31-4f0b-8e45-3d9cfa0eec26-keyinfo");
            dsReference2.setAttributeNode(uri2);
            
            Element dsDigestMethod2 = doc.createElement("ds:DigestMethod");
            dsReference2.appendChild(dsDigestMethod2);
            
            Attr Algorithm4 = doc.createAttribute("Algorithm");
            Algorithm4.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
            dsDigestMethod2.setAttributeNode(Algorithm4);            
            
            Element dsDigestValue2 = doc.createElement("ds:DigestValue");
            dsReference2.appendChild(dsDigestValue2);
            //dsDigestValue2.setTextContent("q1DIAyvZzwKVhDMhSDtEtfvAWUs=");
            dsDigestValue2.setTextContent(fileXML.getDsDigestValue());
            
            Element dsReference3 = doc.createElement("ds:Reference");
            dsSignedInfo2.appendChild(dsReference3);
            
            Attr type = doc.createAttribute("TYPE");
            type.setValue("http://uri.etsi.org/01903#SignedProperties");
            dsReference3.setAttributeNode(type);
            
            Attr uri3 = doc.createAttribute("URI");
            uri3.setValue("http://uri.etsi.org/01903#SignedProperties");
            dsReference3.setAttributeNode(uri3);
            
            Element dsDigestMethod3 = doc.createElement("ds:DigestMethod");
            dsReference3.appendChild(dsDigestMethod3);
            
            Attr Algorithm5 = doc.createAttribute("Algorithm");
            Algorithm5.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
            dsDigestMethod3.setAttributeNode(Algorithm5);            
            
            Element dsDigestValue3 = doc.createElement("ds:DigestValue");
            dsReference3.appendChild(dsDigestValue3);
            //dsDigestValue3.setTextContent("tt9MeU6ZqMibtV0SeLqs7hRmmqE=");
            dsDigestValue3.setTextContent(fileXML.getDsDigestValue());
            
            Element dsSignatureValue = doc.createElement("ds:SignatureValue");
            dsSignature.appendChild(dsSignatureValue);
            
            Attr id = doc.createAttribute("Id");
            id.setValue("xmldsig-6b980c9f-13e8-4f8d-8f7e-c536dd84fef3-sigvalue");
            dsSignatureValue.setAttributeNode(id);
            /*dsSignatureValue.setTextContent("\nh/b+KN2PvOPc4jkkLTmW4eY2QhdBMEG11Px8vS9xgaCZYisK4jZn3xdLickqZGnzCT/ZoJjWGrPY"+
										  "\n6PaD5y+r+6n0wcdwfUs4Ai/vwKR2oeXqNWWbAWDLvaqMp+HFg7GDZ1fKgwo+iPSHqUVw3X41GJ6P"+
										  "\nex/0UC+4BlvoE/1NgKHgipKUUnes0T3MLjPxQBItYgknAGgjUvrK3g/Brs4N5cecBlceOUJ/Eq0V"+
										  "\nIgk+qZzoGQamU6Sn1njXgE7NLZC+PgzTnqMAkXj83eB/ckBUo0+q3YcDGskmwtT8t2UVlJO+rN+I"+
										  "\nkFsUvCw4Y0UZmuBhCT9FyvjAEnrD2+yj2rm6lA==\n");*/
            
            dsSignatureValue.setTextContent(fileXML.getDsDigestValue());
            
            Element dsKeyInfo = doc.createElement("ds:KeyInfo");
            dsSignature.appendChild(dsKeyInfo);
            
            Attr id2 = doc.createAttribute("Id");
            id2.setValue("xmldsig-87d128b5-aa31-4f0b-8e45-3d9cfa0eec26-keyinfo");
            dsSignatureValue.setAttributeNode(id2);
            
            Element dsX509Data = doc.createElement("ds:X509Data");
            dsKeyInfo.appendChild(dsX509Data);
            
            Element dsX509Certificate = doc.createElement("ds:X509Certificate");
            dsX509Data.appendChild(dsX509Certificate);
            /*dsX509Certificate.setTextContent("\nMIIIoTCCBomgAwIBAgIIW6qCaBJlC8wwDQYJKoZIhvcNAQELBQAwgbQxIzAhBgkqhkiG9w0BCQEW"+
            		"\nFGluZm9AYW5kZXNzY2QuY29tLmNvMSMwIQYDVQQDExpDQSBBTkRFUyBTQ0QgUy5BLiBDbGFzZSBJ"+
            		"\nSTEwMC4GA1UECxMnRGl2aXNpb24gZGUgY2VydGlmaWNhY2lvbiBlbnRpZGFkIGZpbmFsMRMwEQYD"+
            		"\nVQQKEwpBbmRlcyBTQ0QuMRQwEgYDVQQHEwtCb2dvdGEgRC5DLjELMAkGA1UEBhMCQ08wHhcNMTYw"+
            		"\nOTI0MTczNTAzWhcNMTkwOTI0MTczNTAzWjCCAUExHTAbBgNVBAkTFENhbGxlIEZhbHNhIE5vIDEy"+
            		"\nIDM0MT4wPAYJKoZIhvcNAQkBFi9wZXJzb25hX2p1cmlkaWNhX3BydWViYXNAZW1wcmVzYXBhcmFw"+
            		"\ncnVlYmFzLmNvbTEbMBkGA1UEAxMSVXN1YXJpbyBkZSBQcnVlYmFzMREwDwYDVQQFEwgxMTExMTEx"+
            		"\nMTEZMBcGA1UEDBMQUGVyc29uYSBKdXJpZGljYTFgMF4GA1UECxNXQ2VydGlmaWNhZG8gZGUgUGVy"+
            		"\nc29uYSBKdXJpZGljYSBlbWl0aWRvIHBvciBBbmRlcyBTQ0QgQXYuIENhcnJlcmEgNDUgTm8gMTAz"+
            		"\nIC0gMzQgT0YgMjA1MQ8wDQYDVQQHEwZCb2dvdGExFTATBgNVBAgTDEN1bmRpbmFtYXJjYTELMAkG"+
            		"\nA1UEBhMCQ08wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCe+qPn79yQ45r2uSSDMn4s"+
            		"\ncNGzCdwmOgLpDV8NqI96x5B38lnYa9w7w7eVX5DZvhRm3DQHukXHbYc9eghVtakZ4MKjsVIDc775"+
            		"\nBbGwP6BVe4KTUXr6qF/wAEuGR3MEe21qzuEaoFmEzZXDWH9o9XQFq6nHo1OYLUQrQ7jHKyzNq0pH"+
            		"\nPkq5p8cbw5iXcG3CRnAr7DIeJzjLC9vHoA5InF5+lTI6cD1jkXJ7aPrxK4hKmctZjI/LnMa7q8Ir"+
            		"\nuxnBeci64xu5X1KVOIiFx4EAqwZo+2aQJQQHOzbPmJj8EtmuZ+/4ukGLYqgEo49f63kTOjwVGSQc"+
            		"\nB4ei+iXZCruaJV8jAgMBAAGjggMlMIIDITA3BggrBgEFBQcBAQQrMCkwJwYIKwYBBQUHMAGGG2h0"+
            		"\ndHA6Ly9vY3NwLmFuZGVzc2NkLmNvbS5jbzAdBgNVHQ4EFgQUbp89+LkPGuGx/opVG6EamsmLnxcw"+
            		"\nDAYDVR0TAQH/BAIwADAfBgNVHSMEGDAWgBSoS7T0C6e2W9SgKIUQnQQTM8Sn9zCCAeMGA1UdIASC"+
            		"\nAdowggHWMIIB0gYNKwYBBAGB9EgBAgkCAjCCAb8wggF4BggrBgEFBQcCAjCCAWoeggFmAEwAYQAg"+
            		"\nAHUAdABpAGwAaQB6AGEAYwBpAPMAbgAgAGQAZQAgAGUAcwB0AGUAIABjAGUAcgB0AGkAZgBpAGMA"+
            		"\nYQBkAG8AIABlAHMAdADhACAAcwB1AGoAZQB0AGEAIABhACAAbABhAHMAIABQAG8AbADtAHQAaQBj"+
            		"\nAGEAcwAgAGQAZQAgAEMAZQByAHQAaQBmAGkAYwBhAGQAbwAgAGQAZQAgAFAAZQByAHMAbwBuAGEA"+
            		"\nIABKAHUAcgDtAGQAaQBjAGEAIAAoAFAAQwApACAAeQAgAEQAZQBjAGwAYQByAGEAYwBpAPMAbgAg"+
            		"\nAGQAZQAgAFAAcgDhAGMAdABpAGMAYQBzACAAZABlACAAQwBlAHIAdABpAGYAaQBjAGEAYwBpAPMA"+
            		"\nbgAgACgARABQAEMAKQAgAGUAcwB0AGEAYgBsAGUAYwBpAGQAYQBzACAAcABvAHIAIABBAG4AZABl"+
            		"\nAHMAIABTAEMARDBBBggrBgEFBQcCARY1aHR0cDovL3d3dy5hbmRlc3NjZC5jb20uY28vZG9jcy9E"+
            		"\nUENfQW5kZXNTQ0RfVjIuMi5wZGYwRgYDVR0fBD8wPTA7oDmgN4Y1aHR0cDovL3d3dy5hbmRlc3Nj"+
            		"\nZC5jb20uY28vaW5jbHVkZXMvZ2V0Q2VydC5waHA/Y3JsPTEwDgYDVR0PAQH/BAQDAgXgMB0GA1Ud"+
            		"\nJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDBDA6BgNVHREEMzAxgS9wZXJzb25hX2p1cmlkaWNhX3By"+
            		"\ndWViYXNAZW1wcmVzYXBhcmFwcnVlYmFzLmNvbTANBgkqhkiG9w0BAQsFAAOCAgEAkjyFBKltp8DL"+
            		"\nk35/n8mvBPNxciuUUHj/EzEnzOoYaWAcFLOSGA71Z7VwrldyVImQnsREWpbsMblIY5NI7OLztzMS"+
            		"\nCMpWeXR/g8H5HcQu6CUroQqRPiOOfEgyCAFVPHGKHY7e8zzoNzqeSZ3fxGPF6sXhN0BxpEmqlB/+"+
            		"\nHM4SdQchqyRqqEMX86FlnxS2J4trgLvrQeSFEzb/PJNI578hr31LeFn93GPEYPhK7cxZeDFgNTgf"+
            		"\nBm2gSwaYrjE8JV9aG29G+XZuviXfRQifNcwRCPZF2Tj4MWUqsX9apdxlodBJjnqTnwK5c4UBzYuN"+
            		"\nBJcrNVdwLdAvuGgWotrxGLfaoJYXunms2bCx3oqw0/kEiNgM+E6sualeojUztiWG/dz/nBsFD2jx"+
            		"\nRfoah/V8jnGLG0hJhhvadd3iRZ/CliBFazk1HrSUISUvblGkVvZx3ChTM3qZCIa/cK2tpeLTRkmo"+
            		"\neTR22DfXj44uNc/9RS1BQyv4TI/m/3miHRO3AEFwXgwsnIkRrZYiZQd6qezQfqLQGw8cod6/gxkE"+
            		"\nNi86lOlPkOuB4MoFdQI5HUZQbsVQIY33rHpbFiyIquWZUNLYryfSGD2cLc2WdW8hxwU/keTwrDW4"+
								"\n0YO/3zbwYfOqpWvYJw535X7Hcw/lBo49ZJxwy+TvzazO4eA7QrfqF5fVQzL/v24=");   */         
            dsX509Certificate.setTextContent(fileXML.getDsX509Certificate());
            
            
            Element dsObject = doc.createElement("ds:Object");
            dsSignature.appendChild(dsObject);            
            
            Element xadesQualifyingProperties = doc.createElement("xades:QualifyingProperties");
            dsObject.appendChild(xadesQualifyingProperties);
            
            Attr xmlnsxades = doc.createAttribute("xmlns:xades");
            xmlnsxades.setValue("http://uri.etsi.org/01903/v1.3.2#");
            xadesQualifyingProperties.setAttributeNode(xmlnsxades);
            
            Attr xmlnsxades141 = doc.createAttribute("xmlns:xades141");
            xmlnsxades141.setValue("http://uri.etsi.org/01903/v1.4.1#");
            xadesQualifyingProperties.setAttributeNode(xmlnsxades141);
            
            Attr Target = doc.createAttribute("Target");
            Target.setValue("#xmldsig-6b980c9f-13e8-4f8d-8f7e-c536dd84fef3");
            xadesQualifyingProperties.setAttributeNode(Target);            
            
            Element xadesSignedProperties = doc.createElement("xades:SignedProperties");
            xadesQualifyingProperties.appendChild(xadesSignedProperties);
            
            Attr idxadesSignedProperties = doc.createAttribute("Id");
            idxadesSignedProperties.setValue("xmldsig-6b980c9f-13e8-4f8d-8f7e-c536dd84fef3-signedprops");
            xadesSignedProperties.setAttributeNode(idxadesSignedProperties);            
            
            Element xadesSignedSignatureProperties = doc.createElement("xades:SignedSignatureProperties");
            xadesSignedProperties.appendChild(xadesSignedSignatureProperties);
            
            Element xadesSigningTime = doc.createElement("xades:SigningTime");
            xadesSignedSignatureProperties.appendChild(xadesSigningTime);
            //xadesSigningTime.setTextContent("2016-11-28T17:08:55.040-05:00");
            xadesSigningTime.setTextContent(fileXML.getXadesSigningTime());
            
            Element xadesSigningCertificate = doc.createElement("xades:SigningCertificate");
            xadesSignedSignatureProperties.appendChild(xadesSigningCertificate);            
            
            Element xadesCert = doc.createElement("xades:Cert");
            xadesSignedSignatureProperties.appendChild(xadesCert);            
            
            Element xadesCertDigest = doc.createElement("xades:CertDigest");
            xadesCert.appendChild(xadesCertDigest);            
            
            Element dsDigestMethod4 = doc.createElement("ds:DigestMethod");
            xadesCertDigest.appendChild(dsDigestMethod4);
            
            Attr Algorithm6 = doc.createAttribute("Algorithm");
            Algorithm6.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
            dsDigestMethod4.setAttributeNode(Algorithm6);  
            
            Element dsDigestValue4 = doc.createElement("ds:DigestMethod");
            xadesCertDigest.appendChild(dsDigestValue4);
            //dsDigestValue4.setTextContent("swW5vT+5GW4EGEZD72SCMPYHJx8=");            
            dsDigestValue4.setTextContent(fileXML.getDsDigestValue());
            
            Element xadesIssuerSerial = doc.createElement("xades:IssuerSerial");
            xadesCert.appendChild(xadesIssuerSerial);            
            
            Element dsX509IssuerName = doc.createElement("ds:X509IssuerName");
            xadesIssuerSerial.appendChild(dsX509IssuerName);
            /*dsX509IssuerName.setTextContent("\nC=CO,L=Bogota D.C.,O=Andes"+
						            		"\nSCD.,OU=Division de certificacion entidad final,CN=CA ANDES"+
						            		"\nSCD S.A. Clase"+
						            		"\nII,1.2.840.113549.1.9.1=#1614696e666f40616e6465737363642e636f6d2e636f");  */
            dsX509IssuerName.setTextContent(fileXML.getDsX509IssuerName());
            
            Element dsX509SerialNumber = doc.createElement("ds:X509SerialNumber");
            xadesIssuerSerial.appendChild(dsX509SerialNumber);
            //dsX509SerialNumber.setTextContent("6605235186989075404\n"); 
            dsX509SerialNumber.setTextContent(fileXML.getDsX509SerialNumber());
            
            
            //********
            Element xadesCert2 = doc.createElement("xades:Cert");
            xadesSignedSignatureProperties.appendChild(xadesCert2);            
            
            Element xadesCertDigest2 = doc.createElement("xades:CertDigest");
            xadesCert2.appendChild(xadesCertDigest2);            
            
            Element dsDigestMethod5 = doc.createElement("ds:DigestMethod");
            xadesCertDigest2.appendChild(dsDigestMethod5);
            
            Attr Algorithm7 = doc.createAttribute("Algorithm");
            Algorithm7.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
            dsDigestMethod5.setAttributeNode(Algorithm7);  
            
            Element dsDigestValue5 = doc.createElement("ds:DigestMethod");
            xadesCertDigest2.appendChild(dsDigestValue5);
            //dsDigestValue5.setTextContent("ydBrkDUi4OLwpDJACttO8PSuHdE=");            
            dsDigestValue5.setTextContent("ydBrkDUi4OLwpDJACttO8PSuHdE=");
            
            Element xadesIssuerSerial2 = doc.createElement("xades:IssuerSerial");
            xadesCert2.appendChild(xadesIssuerSerial2);            
            
            Element dsX509IssuerName2 = doc.createElement("ds:X509IssuerName");
            xadesIssuerSerial2.appendChild(dsX509IssuerName2);
            dsX509IssuerName2.setTextContent("\nC=CO,L=Bogota D.C.,O=Andes"+
						            		"\nSCD,OU=Division de certificacion,CN=ROOT CA ANDES SCD"+
						            		"\nS.A.,1.2.840.113549.1.9.1=#1614696e666f40616e6465737363642e636f6d2e636f");  
            
            Element dsX509SerialNumber2 = doc.createElement("ds:X509SerialNumber");
            xadesIssuerSerial2.appendChild(dsX509SerialNumber2);
            dsX509SerialNumber2.setTextContent("8136867327090815624\n");
            
            
            //*******333
            Element xadesCert3 = doc.createElement("xades:Cert");
            xadesSignedSignatureProperties.appendChild(xadesCert3);            
            
            Element xadesCertDigest3 = doc.createElement("xades:CertDigest");
            xadesCert3.appendChild(xadesCertDigest3);            
            
            Element dsDigestMethod6 = doc.createElement("ds:DigestMethod");
            xadesCertDigest3.appendChild(dsDigestMethod6);
            
            Attr Algorithm8 = doc.createAttribute("Algorithm");
            Algorithm8.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
            dsDigestMethod6.setAttributeNode(Algorithm8);  
            
            Element dsDigestValue6 = doc.createElement("ds:DigestMethod");
            xadesCertDigest3.appendChild(dsDigestValue6);
            dsDigestValue6.setTextContent("OXeITae4OgBq7RWNUGqshhvKGk8=");            
            
            Element xadesIssuerSerial3 = doc.createElement("xades:IssuerSerial");
            xadesCert3.appendChild(xadesIssuerSerial3);            
            
            Element dsX509IssuerName3 = doc.createElement("ds:X509IssuerName");
            xadesIssuerSerial3.appendChild(dsX509IssuerName3);
            dsX509IssuerName3.setTextContent("C=CO,L=Bogota D.C.,O=Andes"+
						            		"\nSCD,OU=Division de certificacion,CN=ROOT CA ANDES SCD"+
						            		"\nS.A.,1.2.840.113549.1.9.1=#1614696e666f40616e6465737363642e636f6d2e636f");  
            
            Element dsX509SerialNumber3 = doc.createElement("ds:X509SerialNumber");
            xadesIssuerSerial3.appendChild(dsX509SerialNumber3);
            dsX509SerialNumber3.setTextContent("3184328748892787122\n");             
            
            //******
            
            Element xadesSignaturePolicyIdentifier = doc.createElement("xades:SignaturePolicyIdentifier");
            xadesSignedSignatureProperties.appendChild(xadesSignaturePolicyIdentifier);   
            
            Element xadesSignaturePolicyId = doc.createElement("xades:SignaturePolicyId");
            xadesSignaturePolicyIdentifier.appendChild(xadesSignaturePolicyId);   
            
            Element xadesSigPolicyId = doc.createElement("xades:SigPolicyId");
            xadesSignaturePolicyId.appendChild(xadesSigPolicyId); 
            
            Element xadesIdentifier = doc.createElement("xades:Identifier");
            xadesSigPolicyId.appendChild(xadesIdentifier); 
            xadesIdentifier.setTextContent("http://facturaelectronica.dian.gov.co/politicadefirma/v1/politicadefirmav1.pdf"); 
            
            Element xadesSigPolicyHash = doc.createElement("xades:SigPolicyHash");
            xadesSigPolicyId.appendChild(xadesSigPolicyHash); 
            //xadesSigPolicyHash.setTextContent("2jmj7l5rSw0yVb/vlWAYkK/YBwk=");
            
            Element dsDigestMethod8 = doc.createElement("xades:SigPolicyId");
            xadesSigPolicyHash.appendChild(dsDigestMethod8);
            
            Attr Algorithm9 = doc.createAttribute("Algorithm");
            Algorithm9.setValue("http://www.w3.org/2000/09/xmldsig#sha1");
            dsDigestMethod8.setAttributeNode(Algorithm9);
            
            Element dsDigestValue8 = doc.createElement("ds:DigestValue");
            xadesSigPolicyHash.appendChild(dsDigestValue8);
            dsDigestValue8.setTextContent("2jmj7l5rSw0yVb/vlWAYkK/YBwk=");            
            
            Element xadesSignerRole = doc.createElement("xades:SignerRole");
            xadesSignedSignatureProperties.appendChild(xadesSignerRole);            
            
            Element xadesClaimedRoles = doc.createElement("xades:ClaimedRoles");
            xadesSignerRole.appendChild(xadesClaimedRoles);
            
            Element xadesClaimedRole = doc.createElement("xades:ClaimedRole");
            xadesClaimedRoles.appendChild(xadesClaimedRole);
            xadesClaimedRole.setTextContent("supplier");             
            
            Element cbcUBLVersionID = doc.createElement("cbc:UBLVersionID");
            feInvoice.appendChild(cbcUBLVersionID);
            cbcUBLVersionID.setTextContent("UBL 2.0"); 
            
            Element cbcProfileID = doc.createElement("cbc:ProfileID");
            feInvoice.appendChild(cbcProfileID);
            cbcProfileID.setTextContent("DIAN 1.0");
            
            Element cbcID = doc.createElement("cbc:ID");
            feInvoice.appendChild(cbcID);
            cbcID.setTextContent("PRUE980391949");
            
            Element cbcUUID = doc.createElement("cbc:UUID");
            feInvoice.appendChild(cbcUUID);
            cbcUUID.setTextContent("15ee05242602f5ddbdb785c3ddfe87eff4b037f1");
            
            Attr schemeAgencyID4 = doc.createAttribute("schemeAgencyID");
            schemeAgencyID4.setValue("195");
            cbcUUID.setAttributeNode(schemeAgencyID4);
            
            Attr schemeAgencyName4 = doc.createAttribute("schemeAgencyName");
            schemeAgencyName4.setValue("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
            cbcUUID.setAttributeNode(schemeAgencyName4);
            
            Element cbcIssueDate = doc.createElement("cbc:IssueDate");
            feInvoice.appendChild(cbcIssueDate);
            cbcIssueDate.setTextContent("2016-11-28");
            
            Element cbcIssueTime = doc.createElement("cbc:IssueTime");
            feInvoice.appendChild(cbcIssueTime);
            cbcIssueTime.setTextContent("06:11:31");
            
            Element cbcInvoiceTypeCode = doc.createElement("cbc:InvoiceTypeCode");
            feInvoice.appendChild(cbcInvoiceTypeCode);

            Attr listAgencyID2 = doc.createAttribute("listAgencyID");
            listAgencyID2.setValue("195");
            cbcInvoiceTypeCode.setAttributeNode(listAgencyID2);
            
            Attr listAgencyName2 = doc.createAttribute("listAgencyName");
            listAgencyName2.setValue("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
            cbcInvoiceTypeCode.setAttributeNode(listAgencyName2);
            
            Attr listSchemeURI2 = doc.createAttribute("listSchemeURI");
            listSchemeURI2.setValue("http://www.dian.gov.co/contratos/facturaelectronica/v1/InvoiceType");
            cbcInvoiceTypeCode.setAttributeNode(listSchemeURI2);
            cbcInvoiceTypeCode.setTextContent("1");
            
            Element cbcNote = doc.createElement("cbc:Note");
            feInvoice.appendChild(cbcNote);
            cbcInvoiceTypeCode.setTextContent("\nSet de pruebas ="+
							            		"\nf-s0001_900373123_bc4f2_R9000000500018095-PRUE-A_cufePRUE980391949_4Z_900373123"+
							            		"\n2016-11-28 politica de firma DIAN&#13;"+
							            		"\nNumFac: PRUE980391949&#13;"+
							            		"\nFecFac: 20161128061131&#13;"+
							            		"\nValFac: 1845839.84&#13;"+
							            		"\nCodImp1: 01&#13;"+
									            "\nValImp1: 0.00&#13;"+
									            "\nCodImp2: 02&#13;"+
									            "\nValImp2: 76417.76&#13;"+
									            "\nCodImp3:"+
												"\n03&#13;"+
									            "\nValImp3: 178308.12&#13;"+
									            "\nValImp: 2157528.31&#13;"+
									            "\nNitOFE:"+
												"\n900373123&#13;"+
									            "\nTipAdq: 31&#13;"+
									            "\nNumAdq: 800199436&#13;"+
									            "\nString:"+
												"\nPRUE980391949201611280611311845839.84010.000276417.7603178308.122157528.3190037312331800199436dd85db55545bd6566f36b0fd3be9fd8555c36e&#13;");
            
            
            
            Element cbcDocumentCurrencyCode = doc.createElement("cbc:DocumentCurrencyCode");
            feInvoice.appendChild(cbcDocumentCurrencyCode);
            cbcDocumentCurrencyCode.setTextContent("\nCOP\n");
            
            
            Element feAccountingSupplierParty = doc.createElement("fe:AccountingSupplierParty");
            feInvoice.appendChild(feAccountingSupplierParty);
            
            Element cbcAdditionalAccountID = doc.createElement("cbc:AdditionalAccountID");
            feAccountingSupplierParty.appendChild(cbcAdditionalAccountID);
            cbcAdditionalAccountID.setTextContent("\n1\n");            
            
            Element feParty = doc.createElement("fe:Party");
            feAccountingSupplierParty.appendChild(feParty);
            
            Element cacPartyIdentification = doc.createElement("cac:PartyIdentification");
            feParty.appendChild(cacPartyIdentification);            
            
            Element cbcID2 = doc.createElement("cbc:ID");
            cacPartyIdentification.appendChild(cbcID2);
            cbcID2.setTextContent("900373123\n"); 
                       
            Attr chemeAgencyID = doc.createAttribute("chemeAgencyID");
            chemeAgencyID.setValue("195");
            cbcID2.setAttributeNode(chemeAgencyID);
            
            Attr schemeAgencyName5 = doc.createAttribute("schemeAgencyName");
            schemeAgencyName5.setValue("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
            cbcID2.setAttributeNode(schemeAgencyName5);
            
            Attr schemeID = doc.createAttribute("schemeID");
            schemeID.setValue("31");
            cbcID2.setAttributeNode(schemeID);
            
            Element cacPartyName = doc.createElement("cac:PartyName");
            feParty.appendChild(cacPartyName); 
            
            Element cbcName = doc.createElement("cbc:Name");
            cacPartyName.appendChild(cbcName);
            cbcName.setTextContent("\nPJ - 900373123 - Adquiriente FE\n"); 
            
            Element fePhysicalLocation = doc.createElement("fe:PhysicalLocation");
            feParty.appendChild(fePhysicalLocation); 
            
            Element feAddress = doc.createElement("fe:Address");
            fePhysicalLocation.appendChild(feAddress);
            
            Element cbcDepartment = doc.createElement("cbc:Department");
            fePhysicalLocation.appendChild(cbcDepartment);
            cbcDepartment.setTextContent("\nDistrito Capital\n"); 
            
            Element cbcCitySubdivisionName = doc.createElement("cbc:CitySubdivisionName");
            fePhysicalLocation.appendChild(cbcCitySubdivisionName);
            cbcCitySubdivisionName.setTextContent("\nCentro\n"); 
            
            Element cbcCityName = doc.createElement("cbc:CityName");
            fePhysicalLocation.appendChild(cbcCityName);
            cbcCityName.setTextContent("\nBogotá\n"); 
            
            Element cacAddressLine = doc.createElement("cac:AddressLine");
            fePhysicalLocation.appendChild(cacAddressLine);
            
            Element cbcLine = doc.createElement("cbc:Line");
            cacAddressLine.appendChild(cbcLine);
            cbcLine.setTextContent("\ncarrera 8 Nº 6C - 78\n"); 
            
            Element cacCountry = doc.createElement("cac:Country");
            fePhysicalLocation.appendChild(cacCountry);
            
            Element cbcIdentificationCode2 = doc.createElement("cbc:IdentificationCode");
            cacCountry.appendChild(cbcIdentificationCode2);
            cbcIdentificationCode2.setTextContent("\nCO\n"); 
            
            Element fePartyTaxScheme = doc.createElement("fe:PartyTaxScheme");
            feParty.appendChild(fePartyTaxScheme);
            
            Element cbcTaxLevelCode = doc.createElement("cbc:TaxLevelCode");
            fePartyTaxScheme.appendChild(cbcTaxLevelCode);
            cbcTaxLevelCode.setTextContent("\n0\n"); 
            
            Element cacTaxScheme = doc.createElement("cac:TaxScheme");
            fePartyTaxScheme.appendChild(cacTaxScheme);
            
            Element fePartyLegalEntity = doc.createElement("fe:PartyLegalEntity");
            feParty.appendChild(fePartyLegalEntity);
            
            Element cbcRegistrationName = doc.createElement("cbc:RegistrationName");
            fePartyLegalEntity.appendChild(cbcRegistrationName);
            cbcRegistrationName.setTextContent("\nPJ - 900373123\n");
            
            //*********            
            Element feAccountingCustomerParty = doc.createElement("fe:AccountingCustomerParty");
            feInvoice.appendChild(feAccountingCustomerParty);
            
            Element cbcAdditionalAccountID2 = doc.createElement("cbc:AdditionalAccountID");
            feAccountingCustomerParty.appendChild(cbcAdditionalAccountID2);
            cbcAdditionalAccountID2.setTextContent("\n1\n");            
            
            Element feParty2 = doc.createElement("fe:Party");
            feAccountingCustomerParty.appendChild(feParty2);
            
            Element cacPartyIdentification2 = doc.createElement("cac:PartyIdentification");
            feParty2.appendChild(cacPartyIdentification2);
            
            Element cbcID3 = doc.createElement("cbc:ID");
            cacPartyIdentification2.appendChild(cbcID3);
            cbcID3.setTextContent("800199436\n");
            
            Attr schemeAgencyID5 = doc.createAttribute("schemeAgencyID");
            schemeAgencyID5.setValue("195");
            cbcID3.setAttributeNode(schemeAgencyID5);
            
            Attr schemeAgencyName6 = doc.createAttribute("schemeAgencyName");
            schemeAgencyName6.setValue("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
            cbcID3.setAttributeNode(schemeAgencyName6);
            
            Attr schemeID2 = doc.createAttribute("schemeID");
            schemeID2.setValue("31");
            cbcID3.setAttributeNode(schemeID2);
            
            Element cacPartyName2 = doc.createElement("cac:PartyName");
            feParty2.appendChild(cacPartyName2);
            
            Element cbcName2 = doc.createElement("cbc:Name");
            cacPartyName2.appendChild(cbcName2);
            cbcName2.setTextContent("\nPJ - 800199436 - Adquiriente FE\n");
            
            Element fePhysicalLocation2 = doc.createElement("fe:PhysicalLocation");
            feParty2.appendChild(fePhysicalLocation2);
            
            Element feAddress2 = doc.createElement("fe:Address");
            fePhysicalLocation2.appendChild(feAddress2);
            
            Element cbcDepartment2 = doc.createElement("cbc:Department");
            feAddress2.appendChild(cbcDepartment2);
            cbcDepartment2.setTextContent("\nHuila\n");
            
            Element cbcCitySubdivisionName2 = doc.createElement("cbc:CitySubdivisionName");
            feAddress2.appendChild(cbcCitySubdivisionName2);
            cbcCitySubdivisionName2.setTextContent("\nCentro\n");
            
            Element cbcCityName2 = doc.createElement("cbc:CityName");
            feAddress2.appendChild(cbcCityName2);
            cbcCityName2.setTextContent("\nAipe\n");
            
            Element cacAddressLine2 = doc.createElement("cac:AddressLine");
            feAddress2.appendChild(cacAddressLine2);
            
            Element cbcLine2 = doc.createElement("cbc:Line");
            cacAddressLine2.appendChild(cbcLine2);            
            cbcLine2.setTextContent("\ncarrera 8 Nº 6C - 101\n");            
            
            Element cacCountry2 = doc.createElement("cac:Country");
            feAddress2.appendChild(cacCountry2);
            
            Element cbcIdentificationCode3 = doc.createElement("cbc:IdentificationCode");
            cacCountry2.appendChild(cbcIdentificationCode3);            
            cbcIdentificationCode3.setTextContent("\nCO\n");
            
            Element fePartyTaxScheme2 = doc.createElement("fe:PartyTaxScheme");
            feParty2.appendChild(fePartyTaxScheme2);
            
            Element cbcTaxLevelCode2 = doc.createElement("cbc:TaxLevelCode");
            fePartyTaxScheme2.appendChild(cbcTaxLevelCode2);            
            cbcTaxLevelCode2.setTextContent("\n0\n");
            
            Element cacTaxScheme2 = doc.createElement("cac:TaxScheme");
            fePartyTaxScheme2.appendChild(cacTaxScheme2); 
            
            Element fePartyLegalEntity2 = doc.createElement("fe:PartyLegalEntity");
            feParty2.appendChild(fePartyLegalEntity2);
            
            Element cbcRegistrationName2 = doc.createElement("cbc:RegistrationName");
            fePartyLegalEntity2.appendChild(cbcRegistrationName2);            
            cbcRegistrationName2.setTextContent("\nPJ - 800199436\n");
            
            Element feTaxTotal = doc.createElement("fe:TaxTotal");
            feInvoice.appendChild(feTaxTotal);
            
            Element cbcTaxAmount = doc.createElement("cbc:TaxAmount");
            feTaxTotal.appendChild(cbcTaxAmount);
            cbcTaxAmount.setTextContent("\n178308.12\n");
            
            Attr currencyID = doc.createAttribute("currencyID");
            currencyID.setValue("COP");
            cbcTaxAmount.setAttributeNode(currencyID);
            
            Element cbcTaxEvidenceIndicator = doc.createElement("cbc:TaxEvidenceIndicator");
            feTaxTotal.appendChild(cbcTaxEvidenceIndicator);
            cbcTaxEvidenceIndicator.setTextContent("\nfalse\n");
            
            Element feTaxSubtotal = doc.createElement("fe:TaxSubtotal");
            feTaxTotal.appendChild(feTaxSubtotal);

            Element cbcTaxableAmount = doc.createElement("cbc:TaxableAmount");
            feTaxSubtotal.appendChild(cbcTaxableAmount);
            cbcTaxableAmount.setTextContent("1845839.84\n");
            
            Attr currencyID2 = doc.createAttribute("currencyID");
            currencyID.setValue("COP");
            cbcTaxableAmount.setAttributeNode(currencyID2);
            
            Element cbcTaxAmount2 = doc.createElement("cbc:TaxAmount");
            feTaxSubtotal.appendChild(cbcTaxAmount2);
            cbcTaxAmount2.setTextContent("178308.12\n");
            
            Attr currencyID3 = doc.createAttribute("currencyID");
            currencyID3.setValue("COP");
            cbcTaxAmount2.setAttributeNode(currencyID3);
            
            Element cbcPercent = doc.createElement("cbc:Percent");
            feTaxSubtotal.appendChild(cbcPercent);
            cbcPercent.setTextContent("\n9.66\n");
            
            Element cacTaxCategory = doc.createElement("cac:TaxCategory");
            feTaxSubtotal.appendChild(cacTaxCategory);
            
            Element cacTaxScheme3 = doc.createElement("cac:TaxScheme");
            cacTaxCategory.appendChild(cacTaxScheme3);
            
            Element cbcID4 = doc.createElement("cbc:ID");
            cacTaxScheme3.appendChild(cbcID4);
            cbcID4.setTextContent("03\n");
            
            //******************
            
            Element feTaxTotal2 = doc.createElement("fe:TaxTotal");
            feInvoice.appendChild(feTaxTotal2);
            
            Element cbcTaxAmount3 = doc.createElement("cbc:TaxAmount");
            feTaxTotal2.appendChild(cbcTaxAmount3);
            cbcTaxAmount3.setTextContent("\n36.91\n");
            
            Attr currencyID4 = doc.createAttribute("currencyID");
            currencyID4.setValue("COP");
            cbcTaxAmount3.setAttributeNode(currencyID4);
            
            Element cbcTaxEvidenceIndicator2 = doc.createElement("cbc:TaxEvidenceIndicator");
            feTaxTotal2.appendChild(cbcTaxEvidenceIndicator2);
            cbcTaxEvidenceIndicator2.setTextContent("\nfalse\n");
            
            Element feTaxSubtotal2 = doc.createElement("fe:TaxSubtotal");
            feTaxTotal2.appendChild(feTaxSubtotal2);

            Element cbcTaxableAmount2 = doc.createElement("cbc:TaxableAmount");
            feTaxSubtotal2.appendChild(cbcTaxableAmount2);
            cbcTaxableAmount2.setTextContent("1845839.84\n");
            
            Attr currencyID5 = doc.createAttribute("currencyID");
            currencyID5.setValue("COP");
            cbcTaxableAmount2.setAttributeNode(currencyID5);
            
            Element cbcTaxAmount4 = doc.createElement("cbc:TaxAmount");
            feTaxSubtotal2.appendChild(cbcTaxAmount4);
            cbcTaxAmount4.setTextContent("36.91\n");
            
            Attr currencyID6 = doc.createAttribute("currencyID");
            currencyID6.setValue("COP");
            cbcTaxAmount4.setAttributeNode(currencyID6);
            
            Element cbcPercent2 = doc.createElement("cbc:Percent");
            feTaxSubtotal2.appendChild(cbcPercent2);
            cbcPercent2.setTextContent("\n0.0020\n");
            
            Element cacTaxCategory2 = doc.createElement("cac:TaxCategory");
            feTaxSubtotal2.appendChild(cacTaxCategory2);
            
            Element cacTaxScheme4 = doc.createElement("cac:TaxScheme");
            cacTaxCategory2.appendChild(cacTaxScheme4);
            
            Element cbcID5 = doc.createElement("cbc:ID");
            cacTaxScheme4.appendChild(cbcID5);
            cbcID5.setTextContent("08\n");
            
            
            //2******************
            
            Element feTaxTotal3 = doc.createElement("fe:TaxTotal");
            feInvoice.appendChild(feTaxTotal3);
            
            Element cbcTaxAmount5 = doc.createElement("cbc:TaxAmount");
            feTaxTotal3.appendChild(cbcTaxAmount5);
            cbcTaxAmount5.setTextContent("\n73.83\n");
            
            Attr currencyID7 = doc.createAttribute("currencyID");
            currencyID7.setValue("COP");
            cbcTaxAmount5.setAttributeNode(currencyID7);
            
            Element cbcTaxEvidenceIndicator3 = doc.createElement("cbc:TaxEvidenceIndicator");
            feTaxTotal3.appendChild(cbcTaxEvidenceIndicator3);
            cbcTaxEvidenceIndicator3.setTextContent("\nfalse\n");
            
            Element feTaxSubtotal3 = doc.createElement("fe:TaxSubtotal");
            feTaxTotal3.appendChild(feTaxSubtotal3);

            Element cbcTaxableAmount3 = doc.createElement("cbc:TaxableAmount");
            feTaxSubtotal3.appendChild(cbcTaxableAmount3);
            cbcTaxableAmount3.setTextContent("11845839.84\n");
            
            Attr currencyID8 = doc.createAttribute("currencyID");
            currencyID8.setValue("COP");
            cbcTaxableAmount3.setAttributeNode(currencyID8);
            
            Element cbcTaxAmount6 = doc.createElement("cbc:TaxAmount");
            feTaxSubtotal3.appendChild(cbcTaxAmount6);
            cbcTaxAmount6.setTextContent("73.83\n");
            
            Attr currencyID9 = doc.createAttribute("currencyID");
            currencyID9.setValue("COP");
            cbcTaxAmount6.setAttributeNode(currencyID9);
            
            Element cbcPercent3 = doc.createElement("cbc:Percent");
            feTaxSubtotal3.appendChild(cbcPercent3);
            cbcPercent3.setTextContent("\n0.0040\n");
            
            Element cacTaxCategory3 = doc.createElement("cac:TaxCategory");
            feTaxSubtotal3.appendChild(cacTaxCategory3);
            
            Element cacTaxScheme5 = doc.createElement("cac:TaxScheme");
            cacTaxCategory3.appendChild(cacTaxScheme5);
            
            Element cbcID6 = doc.createElement("cbc:ID");
            cacTaxScheme5.appendChild(cbcID6);
            cbcID6.setTextContent("07\n");
            
            //3******************
            
            Element feTaxTotal4 = doc.createElement("fe:TaxTotal");
            feInvoice.appendChild(feTaxTotal4);
            
            Element cbcTaxAmount7 = doc.createElement("cbc:TaxAmount");
            feTaxTotal4.appendChild(cbcTaxAmount7);
            cbcTaxAmount7.setTextContent("\n17535.47\n");
            
            Attr currencyID10 = doc.createAttribute("currencyID");
            currencyID10.setValue("COP");
            cbcTaxAmount7.setAttributeNode(currencyID10);
            
            Element cbcTaxEvidenceIndicator4 = doc.createElement("cbc:TaxEvidenceIndicator");
            feTaxTotal4.appendChild(cbcTaxEvidenceIndicator4);
            cbcTaxEvidenceIndicator4.setTextContent("\nfalse\n");
            
            Element feTaxSubtotal4 = doc.createElement("fe:TaxSubtotal");
            feTaxTotal4.appendChild(feTaxSubtotal4);

            Element cbcTaxableAmount4 = doc.createElement("cbc:TaxableAmount");
            feTaxSubtotal4.appendChild(cbcTaxableAmount4);
            cbcTaxableAmount4.setTextContent("1845839.84\n");
            
            Attr currencyID11 = doc.createAttribute("currencyID");
            currencyID11.setValue("COP");
            cbcTaxableAmount4.setAttributeNode(currencyID11);
            
            Element cbcTaxAmount8 = doc.createElement("cbc:TaxAmount");
            feTaxSubtotal4.appendChild(cbcTaxAmount8);
            cbcTaxAmount8.setTextContent("17535.47\n");
            
            Attr currencyID12 = doc.createAttribute("currencyID");
            currencyID12.setValue("COP");
            cbcTaxAmount8.setAttributeNode(currencyID12);
            
            Element cbcPercent4 = doc.createElement("cbc:Percent");
            feTaxSubtotal4.appendChild(cbcPercent4);
            cbcPercent4.setTextContent("\n0.95\n");
            
            Element cacTaxCategory4 = doc.createElement("cac:TaxCategory");
            feTaxSubtotal4.appendChild(cacTaxCategory4);
            
            Element cacTaxScheme6 = doc.createElement("cac:TaxScheme");
            cacTaxCategory4.appendChild(cacTaxScheme6);
            
            Element cbcID7 = doc.createElement("cbc:ID");
            cacTaxScheme6.appendChild(cbcID7);
            cbcID7.setTextContent("05\n");
            
            
            //4******************
            
            Element feTaxTotal5 = doc.createElement("fe:TaxTotal");
            feInvoice.appendChild(feTaxTotal5);
            
            Element cbcTaxAmount9 = doc.createElement("cbc:TaxAmount");
            feTaxTotal5.appendChild(cbcTaxAmount9);
            cbcTaxAmount9.setTextContent("\n553.75\n");
            
            Attr currencyID13 = doc.createAttribute("currencyID");
            currencyID13.setValue("COP");
            cbcTaxAmount9.setAttributeNode(currencyID13);
            
            Element cbcTaxEvidenceIndicator5 = doc.createElement("cbc:TaxEvidenceIndicator");
            feTaxTotal5.appendChild(cbcTaxEvidenceIndicator5);
            cbcTaxEvidenceIndicator5.setTextContent("\nfalse\n");
            
            Element feTaxSubtotal5 = doc.createElement("fe:TaxSubtotal");
            feTaxTotal5.appendChild(feTaxSubtotal5);

            Element cbcTaxableAmount5 = doc.createElement("cbc:TaxableAmount");
            feTaxSubtotal5.appendChild(cbcTaxableAmount5);
            cbcTaxableAmount5.setTextContent("11845839.84\n");
            
            Attr currencyID14 = doc.createAttribute("currencyID");
            currencyID14.setValue("COP");
            cbcTaxableAmount5.setAttributeNode(currencyID14);
            
            Element cbcTaxAmount10 = doc.createElement("cbc:TaxAmount");
            feTaxSubtotal5.appendChild(cbcTaxAmount10);
            cbcTaxAmount10.setTextContent("553.75\n");
            
            Attr currencyID15 = doc.createAttribute("currencyID");
            currencyID15.setValue("COP");
            cbcTaxAmount10.setAttributeNode(currencyID15);
            
            Element cbcPercent5 = doc.createElement("cbc:Percent");
            feTaxSubtotal5.appendChild(cbcPercent5);
            cbcPercent5.setTextContent("\n0.03\n");
            
            Element cacTaxCategory5 = doc.createElement("cac:TaxCategory");
            feTaxSubtotal5.appendChild(cacTaxCategory5);
            
            Element cacTaxScheme7 = doc.createElement("cac:TaxScheme");
            cacTaxCategory5.appendChild(cacTaxScheme7);
            
            Element cbcID8 = doc.createElement("cbc:ID");
            cacTaxScheme7.appendChild(cbcID8);
            cbcID8.setTextContent("06\n");
            
            //5******************
            
            Element feTaxTotal6 = doc.createElement("fe:TaxTotal");
            feInvoice.appendChild(feTaxTotal6);
            
            Element cbcTaxAmount11 = doc.createElement("cbc:TaxAmount");
            feTaxTotal6.appendChild(cbcTaxAmount11);
            cbcTaxAmount11.setTextContent("\n38762.63\n");
            
            Attr currencyID16 = doc.createAttribute("currencyID");
            currencyID16.setValue("COP");
            cbcTaxAmount11.setAttributeNode(currencyID16);
            
            Element cbcTaxEvidenceIndicator6 = doc.createElement("cbc:TaxEvidenceIndicator");
            feTaxTotal6.appendChild(cbcTaxEvidenceIndicator6);
            cbcTaxEvidenceIndicator6.setTextContent("\nfalse\n");
            
            Element feTaxSubtotal6 = doc.createElement("fe:TaxSubtotal");
            feTaxTotal6.appendChild(feTaxSubtotal6);

            Element cbcTaxableAmount6 = doc.createElement("cbc:TaxableAmount");
            feTaxSubtotal6.appendChild(cbcTaxableAmount6);
            cbcTaxableAmount6.setTextContent("1845839.84\n");
            
            Attr currencyID17 = doc.createAttribute("currencyID");
            currencyID17.setValue("COP");
            cbcTaxableAmount6.setAttributeNode(currencyID17);
            
            Element cbcTaxAmount12 = doc.createElement("cbc:TaxAmount");
            feTaxSubtotal6.appendChild(cbcTaxAmount12);
            cbcTaxAmount12.setTextContent("38762.63\n");
            
            Attr currencyID18 = doc.createAttribute("currencyID");
            currencyID18.setValue("COP");
            cbcTaxAmount12.setAttributeNode(currencyID18);
            
            Element cbcPercent6 = doc.createElement("cbc:Percent");
            feTaxSubtotal6.appendChild(cbcPercent6);
            cbcPercent6.setTextContent("\n2.1\n");
            
            Element cacTaxCategory6 = doc.createElement("cac:TaxCategory");
            feTaxSubtotal6.appendChild(cacTaxCategory6);
            
            Element cacTaxScheme8 = doc.createElement("cac:TaxScheme");
            cacTaxCategory6.appendChild(cacTaxScheme8);
            
            Element cbcID9 = doc.createElement("cbc:ID");
            cacTaxScheme8.appendChild(cbcID9);
            cbcID9.setTextContent("04\n");
            
            //6******************
            
            Element feTaxTotal7 = doc.createElement("fe:TaxTotal");
            feInvoice.appendChild(feTaxTotal7);
            
            Element cbcTaxAmount13 = doc.createElement("cbc:TaxAmount");
            feTaxTotal7.appendChild(cbcTaxAmount13);
            cbcTaxAmount13.setTextContent("\n76417.76\n");
            
            Attr currencyID19 = doc.createAttribute("currencyID");
            currencyID19.setValue("COP");
            cbcTaxAmount13.setAttributeNode(currencyID19);
            
            Element cbcTaxEvidenceIndicator7 = doc.createElement("cbc:TaxEvidenceIndicator");
            feTaxTotal7.appendChild(cbcTaxEvidenceIndicator7);
            cbcTaxEvidenceIndicator7.setTextContent("\nfalse\n");
            
            Element feTaxSubtotal7 = doc.createElement("fe:TaxSubtotal");
            feTaxTotal7.appendChild(feTaxSubtotal7);

            Element cbcTaxableAmount7 = doc.createElement("cbc:TaxableAmount");
            feTaxSubtotal7.appendChild(cbcTaxableAmount7);
            cbcTaxableAmount7.setTextContent("1845839.84\n");
            
            Attr currencyID20 = doc.createAttribute("currencyID");
            currencyID20.setValue("COP");
            cbcTaxableAmount7.setAttributeNode(currencyID20);
            
            Element cbcTaxAmount14 = doc.createElement("cbc:TaxAmount");
            feTaxSubtotal7.appendChild(cbcTaxAmount14);
            cbcTaxAmount14.setTextContent("76417.76\n");
            
            Attr currencyID21 = doc.createAttribute("currencyID");
            currencyID21.setValue("COP");
            cbcTaxAmount14.setAttributeNode(currencyID21);
            
            Element cbcPercent7 = doc.createElement("cbc:Percent");
            feTaxSubtotal7.appendChild(cbcPercent7);
            cbcPercent7.setTextContent("\n4.14\n");
            
            Element cacTaxCategory7 = doc.createElement("cac:TaxCategory");
            feTaxSubtotal7.appendChild(cacTaxCategory7);
            
            Element cacTaxScheme9 = doc.createElement("cac:TaxScheme");
            cacTaxCategory7.appendChild(cacTaxScheme9);
            
            Element cbcID10 = doc.createElement("cbc:ID");
            cacTaxScheme9.appendChild(cbcID10);
            cbcID10.setTextContent("02\n");
            
            //******
            
            Element feLegalMonetaryTotal = doc.createElement("fe:LegalMonetaryTotal");
            feInvoice.appendChild(feLegalMonetaryTotal);
            
            
            Element cbcLineExtensionAmount = doc.createElement("cbc:LineExtensionAmount");
            feLegalMonetaryTotal.appendChild(cbcLineExtensionAmount);
            cbcLineExtensionAmount.setTextContent("1845839.84\n");
            
            Attr currencyID22 = doc.createAttribute("currencyID");
            currencyID22.setValue("COP");
            cbcLineExtensionAmount.setAttributeNode(currencyID22);            
            
            Element cbcTaxExclusiveAmount = doc.createElement("cbc:TaxExclusiveAmount");
            feLegalMonetaryTotal.appendChild(cbcTaxExclusiveAmount);
            cbcTaxExclusiveAmount.setTextContent("311688.47\n");
            
            Attr currencyID23 = doc.createAttribute("currencyID");
            currencyID23.setValue("COP");
            cbcTaxExclusiveAmount.setAttributeNode(currencyID23); 
           
            Element cbcPayableAmount = doc.createElement("cbc:PayableAmount");
            feLegalMonetaryTotal.appendChild(cbcPayableAmount);
            cbcPayableAmount.setTextContent("2157528.31\n");
            
            Attr currencyID24 = doc.createAttribute("currencyID");
            currencyID24.setValue("COP");
            cbcPayableAmount.setAttributeNode(currencyID24); 
            
            Element feInvoiceLine = doc.createElement("fe:InvoiceLine");
            feInvoice.appendChild(feInvoiceLine);
            
            Element cbcIDInvoiceLine = doc.createElement("cbc:ID");
            feInvoiceLine.appendChild(cbcIDInvoiceLine);
            cbcIDInvoiceLine.setTextContent("1\n");
            
            Element cbcInvoicedQuantity = doc.createElement("cbc:InvoicedQuantity");
            feInvoiceLine.appendChild(cbcInvoicedQuantity);
            cbcInvoicedQuantity.setTextContent("321\n");
            
            Element cbcLineExtensionAmount2 = doc.createElement("cbc:LineExtensionAmount");
            feInvoiceLine.appendChild(cbcLineExtensionAmount2);
            cbcLineExtensionAmount2.setTextContent("1845839.8428527543\n");
            
            Attr currencyID26 = doc.createAttribute("currencyID");
            currencyID26.setValue("COP");
            cbcLineExtensionAmount2.setAttributeNode(currencyID26); 
            
            Element feItem = doc.createElement("fe:Item");
            feInvoiceLine.appendChild(feItem);
            
            Element cbcDescription = doc.createElement("cbc:Description");
            feInvoiceLine.appendChild(cbcDescription);
            feItem.setTextContent("Línea-1 PRUE980391949\n"+
								  "f-s0001_900373123_bc4f2_R9000000500018095-PRUE-A_cufe\n");
            
            Element fePrice = doc.createElement("fe:Price");
            feInvoiceLine.appendChild(fePrice);
            
            Element cbcPriceAmount = doc.createElement("cbc:PriceAmount");
            fePrice.appendChild(cbcPriceAmount);
            cbcPriceAmount.setTextContent("5750.279884276493");
            
            Attr currencyID25 = doc.createAttribute("currencyID");
            currencyID25.setValue("COP");
            cbcPriceAmount.setAttributeNode(currencyID25);          
            
            
            //Se escribe el contenido del XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            
            //********
            //Caso 3: obtenerhora y fecha y salida por pantalla con formato:
            //Date date = new Date();
            //DateFormat hourdateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
            //System.out.println();
            //String nameFile = hourdateFormat.format(date);
            //System.out.println(hourdateFormat.format(date));
            String nameFile = "face_f"+fileXML.getNitGfi();
	        int size = 10-String.valueOf(i).length();
	        for(int a=0; a<size; a++){
	        	nameFile=nameFile+"0";
	        }
	        nameFile = nameFile+i;
	        System.out.println("NOMBRE ARCHIVO > "+nameFile);
            //********           
            
            StreamResult result = new StreamResult(new File("C:/temp/output/"+nameFile+".xml"));
            //StreamResult result = new StreamResult(new File("C:/Users/vtovar/Documents/TXTtoXML/DATA_PRUEBA.xml"));
            transformer.transform(source, result);
            
            System.out.println("archivo creadoXXX");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(personXMLStringValue);
    }
}