package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankMaster {

	@JsonProperty(value = "BankId")
	private Long bankId;
	@JsonProperty(value = "BankName")
	private String bankName;
	@JsonProperty(value = "BankIINNumber")
	private String bankIINNumber;
	@JsonProperty(value = "BankStatus")
	private String bankStatus;
	@JsonProperty(value = "APIResponseStatus")
	private String apiResponseStatus;
}
