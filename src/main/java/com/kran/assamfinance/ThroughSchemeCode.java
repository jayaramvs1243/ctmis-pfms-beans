package com.kran.assamfinance;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThroughSchemeCode {

	@JsonProperty(value = "SchemeCode")
	private String schemeCode;
	@JsonProperty(value = "SchemeName")
	private String schemeName;
	@JsonProperty(value = "ComponentCode")
	private String componentCode;
	@JsonProperty(value = "ComponentName")
	private String componentName;
	@JsonProperty(value = "EntryDate")
	private Date entryDate;
	@JsonProperty(value = "APIResponsestatus")
	private String apiResponsestatus;

}
