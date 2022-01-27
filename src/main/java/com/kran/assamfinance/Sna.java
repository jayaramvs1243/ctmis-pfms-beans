package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sna {

	@JsonProperty(value = "SNA")
	private char sna;
	@JsonProperty(value = "CenterShare")
	private double centerShare;
	@JsonProperty(value = "StateShare")
	private double stateShare;
	@JsonProperty(value = "SNAUniqueAgencyCode")
	private String snaUniqueAgencyCode;
	@JsonProperty(value = "SNAAgencyName")
	private String snaAgencyName;
	@JsonProperty(value = "SNAAccountNumber")
	private String snaAccountNumber;
	@JsonProperty(value = "BankName")
	private String bankName;
	@JsonProperty(value = "State")
	private String state;
	@JsonProperty(value = "APIResponseStatus")
	private String apiResponseStatus;

}
