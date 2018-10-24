package com.model;

public  class Constants {
	//CLASE CON LOS VALORES CONSTANTES 
	public static final String STS_INVOICE_AUTHOTIZATION="9000000500018090";//Numero de resolucion de Facturacion
	public static final String STS_FROM="980000000";//Rango de numeracion minimo 
	public static final String STS_TO="985000000";//Rango de numeracion minimo 
	public static final String STS_PROVIDER_ID="900373123";//Identificador
	public static final String XADES_SIGNING_TIME="2016-11-28T17:08:55.040-05:00";//Formato fecha/hora cuando se haga registro en XML
	public static final String DSX_509_SERIAL_NUMBER="6605235186989070000";//variable por defecto
	public static final String XADES_INDENTIFIER="http://facturaelectronica.dian.gov.co/politicadefirma/v1/politicadefirmav1.pdf";//variable por defecto
	public static final String CDC_UBL_VERSION_ID="UBL 2.0";//variable por defecto
	public static final String CBC_PROFILE_ID="DIAN 1.0";//variable por defecto
	public static final String STS_SOFTWARE_SECURITY_CODE="74d8a47cc4537942a8b77d06839f15ce872645ca851e7b0687c887d82379076c3395920037220bdbb45210dfcb9bcdc5";//Identificador
	public static final String DS_DIGEST_VALUE="";//	
	public static final String DS_SIGNATURE_VALUE="";//Ubicación de la firma
	public static final String DS_X509_VERTIFICATE="";//Certificado publico
	public static final String DS_SIGNATURE="";//
	public static final String CBC_ADDITIONAL_ACCOUNT_ID="1";//TIPO
	public static final String CBC_INDENTIFICACION_CODE="CO";//Codigo de identificacion del pais
	public static final String CBC_TAX_LEVEL_CODE="0";//Régimen
	public static final String CBC_REGISTRATION_NAME="";//Razon social/opcional
	public static final String CBC_TAX_EVIDENCE_INDICATOR="false";//Impuesto retenido
	public static final String CBC_PERCENT="19";//Porcentaje
	public static final String CBC_INVOICE_QUANTITY="1";//CANTIDAD
	
	private Constants() {
		
	}	
	
	
}
