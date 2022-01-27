package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DistrictLgd {

	@JsonProperty(value = "StateLGDCode")
	private String stateLgdCode;
	@JsonProperty(value = "StateName")
	private String stateName;
	@JsonProperty(value = "DistrictLGDCode")
	private String districtLgdCode;
	@JsonProperty(value = "DistrictName")
	private String districtName;
	@JsonProperty(value = "APIResponseStatus")
	private String apiResponseStatus;

}
