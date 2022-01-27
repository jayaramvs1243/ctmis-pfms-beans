package com.kran.assamfinance;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgencyMapping {
	
	@JsonProperty(value = "ParentAgencyCode")
	private String parentAgencyCode;
	@JsonProperty(value = "ParentAgencyName")
	private String parentAgencyName;
	@JsonProperty(value = "ParentBankName")
	private String parentBankName;
	@JsonProperty(value = "ParentIFSCCode")
	private String parentIFSCCode;
	@JsonProperty(value = "ParentAccountNumber")
	private String parentAccountNumber;
	@JsonProperty(value = "SchemeHierarchyLevel")
	private String schemeHierarchyLevel;
	@JsonProperty(value = "ChildAgencyCode")
	private String childAgencyCode;
	@JsonProperty(value = "ChildAgencyName")
	private String childAgencyName;
	@JsonProperty(value = "ChildBankName")
	private String childBankName;
	@JsonProperty(value = "ChildIFSCCode")
	private String childIfscCode;
	@JsonProperty(value = "ChildAccountNumber")
	private String childAccountNumber;
	@JsonProperty(value = "EntryDate")
	private Date entryDate;
	@JsonProperty(value = "Status")
	private String status;
	@JsonProperty(value = "APIResponsestatus")
	private String apiResponsestatus;
	
}
