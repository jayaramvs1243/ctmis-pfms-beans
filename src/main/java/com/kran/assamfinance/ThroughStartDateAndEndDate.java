package com.kran.assamfinance;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThroughStartDateAndEndDate {

	@JsonProperty(value = "BranchId")
	private Long branchId;
	@JsonProperty(value = "BankId")
	private Long bankId;
	@JsonProperty(value = "BankName")
	private String bankName;
	@JsonProperty(value = "BranchCode")
	private String branchCode;
	@JsonProperty(value = "IFSCCode")
	private String ifscCode;
	@JsonProperty(value = "BranchAddress")
	private String branchAddress;
	@JsonProperty(value = "State")
	private String state;
	@JsonProperty(value = "District")
	private String district;
	@JsonProperty(value = "BankStatus")
	private String bankStatus;
	@JsonProperty(value = "BranchStatus")
	private String branchStatus;
	@JsonProperty(value = "CreatedDate")
	private Date createdDate;
	@JsonProperty(value = "APIResponseStatus")
	private String apiResponseStatus;

}
