package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateLgd {

	@JsonProperty(value = "StateLGDCode")
	private String stateLgdCode;
	@JsonProperty(value = "StateName")
	private String stateName;
	@JsonProperty(value = "APIResponsestatus")
	private String apiResponsestatus;

}
