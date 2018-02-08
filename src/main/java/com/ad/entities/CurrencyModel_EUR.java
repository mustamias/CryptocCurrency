package com.ad.entities;


import com.fasterxml.jackson.annotation.JsonProperty;



public class CurrencyModel_EUR extends CurrencyModel  {

	@JsonProperty("price_eur") 
	private double price_eur;
	@JsonProperty("24h_volume_eur")
	private double h24_volume_eur;
	@JsonProperty("market_cap_eur")
	private double market_cap_eur;
	public double getPrice_eur() {
		return price_eur;
	}
	public void setPrice_eur(double price_eur) {
		this.price_eur = price_eur;
	}
	public double getH24_volume_eur() {
		return h24_volume_eur;
	}
	public void setH24_volume_eur(double h24_volume_eur) {
		this.h24_volume_eur = h24_volume_eur;
	}
	public double getMarket_cap_eur() {
		return market_cap_eur;
	}
	public void setMarket_cap_eur(double market_cap_eur) {
		this.market_cap_eur = market_cap_eur;
	}
	
	

	
	
	
	
	
	
	
	
	
}
