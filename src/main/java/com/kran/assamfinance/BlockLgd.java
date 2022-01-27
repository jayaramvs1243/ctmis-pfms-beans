package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockLgd {

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
	@JsonProperty(value = "APIResponsestatus")
	private String apiResponsestatus;
}
