package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankByIfscCode {

	@JsonProperty(value = "BankName")
	private String bankName;
	@JsonProperty(value = "BranchCode")
	private String branchCode;
	@JsonProperty(value = "BranchAddress")
	private String branchAddress;
	@JsonProperty(value = "APIResponseStatus")
	private String apiResponseStatus;

}
