package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PanchayatLgd {

	@JsonProperty(value = "StateLGDCode")
	private String stateLgdCode;
	@JsonProperty(value = "StateName")
	private String stateName;
	@JsonProperty(value = "DistrictLGDCode")
	private String districtLgdCode;
	@JsonProperty(value = "DistrictName")
	private String districtName;
	@JsonProperty(value = "BlockLGDCode")
	private String blockLgdCode;
	@JsonProperty(value = "BlockName")
	private String blockName;
	@JsonProperty(value = "PanchayatLGDCode")
	private String panchayatLgdCode;
	@JsonProperty(value = "PanchayatName")
	private String panchayatName;
	@JsonProperty(value = "APIResponsestatus")
	private String apiResponsestatus;
	
}
