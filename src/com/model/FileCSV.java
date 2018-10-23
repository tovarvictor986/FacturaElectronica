package com.model;

public class FileCSV {	
	
	private String  stsInvoiceAuthorization;
	private String  stsFrom;	
	private String  stsTo;
	private String  stsProviderID;	
	private String  stsSoftwareID;	
	private String  xadesSigningTime;	
	private String  dsX509IssuerName;	
	private String  dsX509SerialNumber;	
	private String  xadesIdentifier;	
	private String  xadesClaimedRole;	
	private String  cbcUBLVersionID;	
	private String  cbcProfileID;	
	private String  cbcUUID;	
	private String  cbcIssueDate;	
	private String  cbcIssueTime;	
	private String  cbcInvoiceTypeCode;	
	private String  cbcNote;	
	private String  stsSoftwareSecurityCode;
	private String  tipo;//VALIDAR NOMBRE DE CAMPO EN XML	
	private String  stsPrefix;	
	private String  cbcStartDate;
	private String  cliente;//VALIDAR NOMBRE DE CAMPO EN XML
	private String  tercero;//VALIDAR NOMBRE DE CAMPO EN XML	
	private String  cbcEndDate;
	private String  mora;//VALIDAR NOMBRE DE CAMPO EN XML -- ESTE CAMPO NO VA EN EL XML
	private String  cbcTaxAmount;
	private String  cbcTaxAmount2;//VALIDAR SI ES EL MISMO VALOR DEL CAMPO ANTERIOR	
	private String  cbcTaxableAmount;
	private String  iva;//VALIDAR NOMBRE DE CAMPO EN XML
	private String  retIva;//VALIDAR NOMBRE DE CAMPO EN XML    ----NO APLICA
	//private String  saldo;//VALIDAR NOMBRE DE CAMPO EN XML    ----NO APLICA
	//private String  fecRec;//VALIDAR NOMBRE DE CAMPO EN XML    ----NO APLICA
	//private String  ingreso;//VALIDAR NOMBRE DE CAMPO EN XML    ----NO APLICA
	//private String  netoCuota;//VALIDAR NOMBRE DE CAMPO EN XML    ----NO APLICA
	//private String  ingresoNeto;//VALIDAR NOMBRE DE CAMPO EN XML    ----NO APLICA
	private String  numeroFact;//HACE PARTE DE CAMPO UUID
	private String  fechaFactura;//HACE PARTE DE CAMPO UUID
	private String  valorFactura;//HACE PARTE DE CAMPO UUID
	private String  codImpuesto1;//HACE PARTE DE CAMPO UUID	
	private String  valorImpuesto1;//HACE PARTE DE CAMPO UUID	
	private String  codImpuesto2;//HACE PARTE DE CAMPO UUID	
	private String  valorImpuesto2;//HACE PARTE DE CAMPO UUID	
	private String  codImpuesto3;//HACE PARTE DE CAMPO UUID	
	private String  valorImpuesto3;//HACE PARTE DE CAMPO UUID		
	private String  valorIva;//HACE PARTE DE CAMPO UUID	
	private String  nitGfi;//HACE PARTE DE CAMPO UUID		
	private String  tipodeAdquiriente;//HACE PARTE DE CAMPO UUID
	private String  nitQuienFactura;//HACE PARTE DE CAMPO UUID
	private String  claveFacturacion;//HACE PARTE DE CAMPO UUID	
	private String  dsDigestValue;	
	private String  dsSignatureValue;
	private String  dsX509Certificate;
	private String  dsSignature;	
	private String  cbcDocumentCurrencyCode;
	private String  cbcAdditionalAccountID;	
	private String  cbcID;
	private String  cbcName;
	private String  cbcDepartment;
	private String  cbcCitySubdivisionName;
	private String  cbcCityName;
	private String  cbcLine;
	private String  cbcIdentificationCode;
	private String  cbcTaxLevelCode;	
	private String  cbcRegistrationName;
	private String  cbcTaxAmount3;//VALIDAR SI ES EL MISMO VALOR DE LAS LINEAS 31 Y 32
	private String  cbcTaxEvidenceIndicator;
	private String  cbcTaxableAmount2;//VALIDAR SI ES EL MISMO VALOR DE LA LINEA 33
	private String  cbcPercent;
	private String  cbcLineExtensionAmount;
	private String  cbcTaxExclusiveAmount;
	private String  cbcPayableAmount;
	private String  cbcInvoicedQuantity;
	private String  cbcLineExtensionAmount2;//VALIDAR SI ES EL MISMO VALOR DE LA LINEA 74 [CANTIDAD, VALOR POR DEFECTO 1]
	private String  cbcDescription;
	private String  cbcPriceAmount;
	
	
	public FileCSV() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getStsInvoiceAuthorization() {
		return stsInvoiceAuthorization;
	}


	public void setStsInvoiceAuthorization(String stsInvoiceAuthorization) {
		this.stsInvoiceAuthorization = stsInvoiceAuthorization;
	}


	public String getStsFrom() {
		return stsFrom;
	}


	public void setStsFrom(String stsFrom) {
		this.stsFrom = stsFrom;
	}


	public String getStsTo() {
		return stsTo;
	}


	public void setStsTo(String stsTo) {
		this.stsTo = stsTo;
	}


	public String getStsProviderID() {
		return stsProviderID;
	}


	public void setStsProviderID(String stsProviderID) {
		this.stsProviderID = stsProviderID;
	}


	public String getStsSoftwareID() {
		return stsSoftwareID;
	}


	public void setStsSoftwareID(String stsSoftwareID) {
		this.stsSoftwareID = stsSoftwareID;
	}


	public String getXadesSigningTime() {
		return xadesSigningTime;
	}


	public void setXadesSigningTime(String xadesSigningTime) {
		this.xadesSigningTime = xadesSigningTime;
	}


	public String getDsX509IssuerName() {
		return dsX509IssuerName;
	}


	public void setDsX509IssuerName(String dsX509IssuerName) {
		this.dsX509IssuerName = dsX509IssuerName;
	}


	public String getDsX509SerialNumber() {
		return dsX509SerialNumber;
	}


	public void setDsX509SerialNumber(String dsX509SerialNumber) {
		this.dsX509SerialNumber = dsX509SerialNumber;
	}


	public String getXadesIdentifier() {
		return xadesIdentifier;
	}


	public void setXadesIdentifier(String xadesIdentifier) {
		this.xadesIdentifier = xadesIdentifier;
	}


	public String getXadesClaimedRole() {
		return xadesClaimedRole;
	}


	public void setXadesClaimedRole(String xadesClaimedRole) {
		this.xadesClaimedRole = xadesClaimedRole;
	}


	public String getCbcUBLVersionID() {
		return cbcUBLVersionID;
	}


	public void setCbcUBLVersionID(String cbcUBLVersionID) {
		this.cbcUBLVersionID = cbcUBLVersionID;
	}


	public String getCbcProfileID() {
		return cbcProfileID;
	}


	public void setCbcProfileID(String cbcProfileID) {
		this.cbcProfileID = cbcProfileID;
	}


	public String getCbcUUID() {
		return cbcUUID;
	}


	public void setCbcUUID(String cbcUUID) {
		this.cbcUUID = cbcUUID;
	}


	public String getCbcIssueDate() {
		return cbcIssueDate;
	}


	public void setCbcIssueDate(String cbcIssueDate) {
		this.cbcIssueDate = cbcIssueDate;
	}


	public String getCbcIssueTime() {
		return cbcIssueTime;
	}


	public void setCbcIssueTime(String cbcIssueTime) {
		this.cbcIssueTime = cbcIssueTime;
	}


	public String getCbcInvoiceTypeCode() {
		return cbcInvoiceTypeCode;
	}


	public void setCbcInvoiceTypeCode(String cbcInvoiceTypeCode) {
		this.cbcInvoiceTypeCode = cbcInvoiceTypeCode;
	}


	public String getCbcNote() {
		return cbcNote;
	}


	public void setCbcNote(String cbcNote) {
		this.cbcNote = cbcNote;
	}


	public String getStsSoftwareSecurityCode() {
		return stsSoftwareSecurityCode;
	}


	public void setStsSoftwareSecurityCode(String stsSoftwareSecurityCode) {
		this.stsSoftwareSecurityCode = stsSoftwareSecurityCode;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getStsPrefix() {
		return stsPrefix;
	}


	public void setStsPrefix(String stsPrefix) {
		this.stsPrefix = stsPrefix;
	}


	public String getCbcStartDate() {
		return cbcStartDate;
	}


	public void setCbcStartDate(String cbcStartDate) {
		this.cbcStartDate = cbcStartDate;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getTercero() {
		return tercero;
	}


	public void setTercero(String tercero) {
		this.tercero = tercero;
	}


	public String getCbcEndDate() {
		return cbcEndDate;
	}


	public void setCbcEndDate(String cbcEndDate) {
		this.cbcEndDate = cbcEndDate;
	}


	public String getMora() {
		return mora;
	}


	public void setMora(String mora) {
		this.mora = mora;
	}


	public String getCbcTaxAmount() {
		return cbcTaxAmount;
	}


	public void setCbcTaxAmount(String cbcTaxAmount) {
		this.cbcTaxAmount = cbcTaxAmount;
	}


	public String getCbcTaxAmount2() {
		return cbcTaxAmount2;
	}


	public void setCbcTaxAmount2(String cbcTaxAmount2) {
		this.cbcTaxAmount2 = cbcTaxAmount2;
	}


	public String getCbcTaxableAmount() {
		return cbcTaxableAmount;
	}


	public void setCbcTaxableAmount(String cbcTaxableAmount) {
		this.cbcTaxableAmount = cbcTaxableAmount;
	}


	public String getIva() {
		return iva;
	}


	public void setIva(String iva) {
		this.iva = iva;
	}


	public String getRetIva() {
		return retIva;
	}


	public void setRetIva(String retIva) {
		this.retIva = retIva;
	}


//	public String getSaldo() {
//		return saldo;
//	}
//
//
//	public void setSaldo(String saldo) {
//		this.saldo = saldo;
//	}
//
//
//	public String getFecRec() {
//		return fecRec;
//	}
//
//
//	public void setFecRec(String fecRec) {
//		this.fecRec = fecRec;
//	}
//
//
//	public String getIngreso() {
//		return ingreso;
//	}
//
//
//	public void setIngreso(String ingreso) {
//		this.ingreso = ingreso;
//	}
//
//
//	public String getNetoCuota() {
//		return netoCuota;
//	}
//
//
//	public void setNetoCuota(String netoCuota) {
//		this.netoCuota = netoCuota;
//	}
//
//
//	public String getIngresoNeto() {
//		return ingresoNeto;
//	}
//
//
//	public void setIngresoNeto(String ingresoNeto) {
//		this.ingresoNeto = ingresoNeto;
//	}


	public String getNumeroFact() {
		return numeroFact;
	}


	public void setNumeroFact(String numeroFact) {
		this.numeroFact = numeroFact;
	}


	public String getFechaFactura() {
		return fechaFactura;
	}


	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	public String getValorFactura() {
		return valorFactura;
	}


	public void setValorFactura(String valorFactura) {
		this.valorFactura = valorFactura;
	}


	public String getCodImpuesto1() {
		return codImpuesto1;
	}


	public void setCodImpuesto1(String codImpuesto1) {
		this.codImpuesto1 = codImpuesto1;
	}


	public String getValorImpuesto1() {
		return valorImpuesto1;
	}


	public void setValorImpuesto1(String valorImpuesto1) {
		this.valorImpuesto1 = valorImpuesto1;
	}


	public String getCodImpuesto2() {
		return codImpuesto2;
	}


	public void setCodImpuesto2(String codImpuesto2) {
		this.codImpuesto2 = codImpuesto2;
	}


	public String getValorImpuesto2() {
		return valorImpuesto2;
	}


	public void setValorImpuesto2(String valorImpuesto2) {
		this.valorImpuesto2 = valorImpuesto2;
	}


	public String getCodImpuesto3() {
		return codImpuesto3;
	}


	public void setCodImpuesto3(String codImpuesto3) {
		this.codImpuesto3 = codImpuesto3;
	}


	public String getValorImpuesto3() {
		return valorImpuesto3;
	}


	public void setValorImpuesto3(String valorImpuesto3) {
		this.valorImpuesto3 = valorImpuesto3;
	}


	public String getValorIva() {
		return valorIva;
	}


	public void setValorIva(String valorIva) {
		this.valorIva = valorIva;
	}


	public String getNitGfi() {
		return nitGfi;
	}


	public void setNitGfi(String nitGfi) {
		this.nitGfi = nitGfi;
	}


	public String getTipodeAdquiriente() {
		return tipodeAdquiriente;
	}


	public void setTipodeAdquiriente(String tipodeAdquiriente) {
		this.tipodeAdquiriente = tipodeAdquiriente;
	}


	public String getNitQuienFactura() {
		return nitQuienFactura;
	}


	public void setNitQuienFactura(String nitQuienFactura) {
		this.nitQuienFactura = nitQuienFactura;
	}


	public String getClaveFacturacion() {
		return claveFacturacion;
	}


	public void setClaveFacturacion(String claveFacturacion) {
		this.claveFacturacion = claveFacturacion;
	}


	public String getDsDigestValue() {
		return dsDigestValue;
	}


	public void setDsDigestValue(String dsDigestValue) {
		this.dsDigestValue = dsDigestValue;
	}


	public String getDsSignatureValue() {
		return dsSignatureValue;
	}


	public void setDsSignatureValue(String dsSignatureValue) {
		this.dsSignatureValue = dsSignatureValue;
	}


	public String getDsX509Certificate() {
		return dsX509Certificate;
	}


	public void setDsX509Certificate(String dsX509Certificate) {
		this.dsX509Certificate = dsX509Certificate;
	}


	public String getDsSignature() {
		return dsSignature;
	}


	public void setDsSignature(String dsSignature) {
		this.dsSignature = dsSignature;
	}


	public String getCbcDocumentCurrencyCode() {
		return cbcDocumentCurrencyCode;
	}


	public void setCbcDocumentCurrencyCode(String cbcDocumentCurrencyCode) {
		this.cbcDocumentCurrencyCode = cbcDocumentCurrencyCode;
	}


	public String getCbcAdditionalAccountID() {
		return cbcAdditionalAccountID;
	}


	public void setCbcAdditionalAccountID(String cbcAdditionalAccountID) {
		this.cbcAdditionalAccountID = cbcAdditionalAccountID;
	}


	public String getCbcID() {
		return cbcID;
	}


	public void setCbcID(String cbcID) {
		this.cbcID = cbcID;
	}


	public String getCbcName() {
		return cbcName;
	}


	public void setCbcName(String cbcName) {
		this.cbcName = cbcName;
	}


	public String getCbcDepartment() {
		return cbcDepartment;
	}


	public void setCbcDepartment(String cbcDepartment) {
		this.cbcDepartment = cbcDepartment;
	}


	public String getCbcCitySubdivisionName() {
		return cbcCitySubdivisionName;
	}


	public void setCbcCitySubdivisionName(String cbcCitySubdivisionName) {
		this.cbcCitySubdivisionName = cbcCitySubdivisionName;
	}


	public String getCbcCityName() {
		return cbcCityName;
	}


	public void setCbcCityName(String cbcCityName) {
		this.cbcCityName = cbcCityName;
	}


	public String getCbcLine() {
		return cbcLine;
	}


	public void setCbcLine(String cbcLine) {
		this.cbcLine = cbcLine;
	}


	public String getCbcIdentificationCode() {
		return cbcIdentificationCode;
	}


	public void setCbcIdentificationCode(String cbcIdentificationCode) {
		this.cbcIdentificationCode = cbcIdentificationCode;
	}


	public String getCbcTaxLevelCode() {
		return cbcTaxLevelCode;
	}


	public void setCbcTaxLevelCode(String cbcTaxLevelCode) {
		this.cbcTaxLevelCode = cbcTaxLevelCode;
	}


	public String getCbcRegistrationName() {
		return cbcRegistrationName;
	}


	public void setCbcRegistrationName(String cbcRegistrationName) {
		this.cbcRegistrationName = cbcRegistrationName;
	}


	public String getCbcTaxAmount3() {
		return cbcTaxAmount3;
	}


	public void setCbcTaxAmount3(String cbcTaxAmount3) {
		this.cbcTaxAmount3 = cbcTaxAmount3;
	}


	public String getCbcTaxEvidenceIndicator() {
		return cbcTaxEvidenceIndicator;
	}


	public void setCbcTaxEvidenceIndicator(String cbcTaxEvidenceIndicator) {
		this.cbcTaxEvidenceIndicator = cbcTaxEvidenceIndicator;
	}


	public String getCbcTaxableAmount2() {
		return cbcTaxableAmount2;
	}


	public void setCbcTaxableAmount2(String cbcTaxableAmount2) {
		this.cbcTaxableAmount2 = cbcTaxableAmount2;
	}


	public String getCbcPercent() {
		return cbcPercent;
	}


	public void setCbcPercent(String cbcPercent) {
		this.cbcPercent = cbcPercent;
	}


	public String getCbcLineExtensionAmount() {
		return cbcLineExtensionAmount;
	}


	public void setCbcLineExtensionAmount(String cbcLineExtensionAmount) {
		this.cbcLineExtensionAmount = cbcLineExtensionAmount;
	}


	public String getCbcTaxExclusiveAmount() {
		return cbcTaxExclusiveAmount;
	}


	public void setCbcTaxExclusiveAmount(String cbcTaxExclusiveAmount) {
		this.cbcTaxExclusiveAmount = cbcTaxExclusiveAmount;
	}


	public String getCbcPayableAmount() {
		return cbcPayableAmount;
	}


	public void setCbcPayableAmount(String cbcPayableAmount) {
		this.cbcPayableAmount = cbcPayableAmount;
	}


	public String getCbcInvoicedQuantity() {
		return cbcInvoicedQuantity;
	}


	public void setCbcInvoicedQuantity(String cbcInvoicedQuantity) {
		this.cbcInvoicedQuantity = cbcInvoicedQuantity;
	}


	public String getCbcLineExtensionAmount2() {
		return cbcLineExtensionAmount2;
	}


	public void setCbcLineExtensionAmount2(String cbcLineExtensionAmount2) {
		this.cbcLineExtensionAmount2 = cbcLineExtensionAmount2;
	}


	public String getCbcDescription() {
		return cbcDescription;
	}


	public void setCbcDescription(String cbcDescription) {
		this.cbcDescription = cbcDescription;
	}


	public String getCbcPriceAmount() {
		return cbcPriceAmount;
	}


	public void setCbcPriceAmount(String cbcPriceAmount) {
		this.cbcPriceAmount = cbcPriceAmount;
	}
		
	
}
