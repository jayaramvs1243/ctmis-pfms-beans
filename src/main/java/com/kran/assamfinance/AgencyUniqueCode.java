package com.kran.assamfinance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgencyUniqueCode {
	
	@JsonProperty(value = "UniqueAgencyCode")
	private String uniqueAgencyCode;
	@JsonProperty(value = "AgencyName")
	private String agencyName;
	@JsonProperty(value = "BankName")
	private String bankName;
	@JsonProperty(value = "AccountNumber")
	private String accountNumber;
	@JsonProperty(value = "IFSCCode")
	private String ifscCode;
	@JsonProperty(value = "StateLGDCode")
	private String stateLgdCode;
	@JsonProperty(value = "DistrictLGDCode")
	private String districtLgdCode;
	@JsonProperty(value = "BlockLGDCode")
	private String blockLgdCode;
	@JsonProperty(value = "PanchayatLGDCode")
	private String panchayatLgdCode;
	@JsonProperty(value = "VillageCode")
	private String villageCode;
	@JsonProperty(value = "TehsilLGDCode")
	private String tehsilLgdCode;
	@JsonProperty(value = "TownLGDCode")
	private String townLgdCode;
	@JsonProperty(value = "WardLGDCode")
	private String wardLgdCode;
	@JsonProperty(value = "CityName")
	private String cityName;
	@JsonProperty(value = "APIResponsestatus")
	private String apiResponsestatus;
	@JsonProperty(value = "CenterSchemeCode")
	private String centerSchemeCode;
	@JsonProperty(value = "StateSchemeCode")
	private String stateSchemeCode;

}
