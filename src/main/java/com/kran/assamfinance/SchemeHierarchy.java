package com.kran.assamfinance;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchemeHierarchy {

	@JsonProperty(value = "HiearchyName")
	private String hiearchyName;
	@JsonProperty(value = "HierarchyLocation")
	private String hierarchyLocation;
	@JsonProperty(value = "HierarchyLevelOrder")
	private String hierarchyLevelOrder;
	@JsonProperty(value = "EntryDate")
	private Date entryDate;
	@JsonProperty(value = "APIResponsestatus")
	private String apiResponsestatus;

}
