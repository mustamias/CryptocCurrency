package com.ad.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyModel_CNY extends CurrencyModel { 
	
	@JsonProperty("price_cny") 
	private double price_cny;
	@JsonProperty("24h_volume_cny")
	private double h24_volume_cny;
	@JsonProperty("market_cap_cny")
	private double market_cap_cny;
	
	
	public double getPrice_cny() {
		return price_cny;
	}
	public void setPrice_cny(double price_cny) {
		this.price_cny = price_cny;
	}
	public double getH24_volume_cny() {
		return h24_volume_cny;
	}
	public void setH24_volume_cny(double h24_volume_cny) {
		this.h24_volume_cny = h24_volume_cny;
	}
	public double getMarket_cap_cny() {
		return market_cap_cny;
	}
	public void setMarket_cap_cny(double market_cap_cny) {
		this.market_cap_cny = market_cap_cny;
	}
	
	
	

}
