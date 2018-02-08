package com.ad.entities;


import com.fasterxml.jackson.annotation.JsonProperty;


public class CurrencyModel{
	
	
	@JsonProperty("id")  
	private String id;
	@JsonProperty("name")  
	private String name;
	@JsonProperty("symbol") 
	private String symbol;
	@JsonProperty("rank")
	private int rank;
	@JsonProperty("price_usd")
	private double price_usd;
	@JsonProperty("price_btc")
	private double price_btc;
	@JsonProperty("24h_volume_usd")
	private double h24_volume_usd;
	@JsonProperty("market_cap_usd")
	private double market_cap_usd;
	@JsonProperty("available_supply")
	private double available_supply;
	@JsonProperty("total_supply")
	private double total_supply;
	@JsonProperty("max_supply")
	private double max_supply;
	@JsonProperty("percent_change_1h")
	private double percent_change_1h;
	@JsonProperty("percent_change_24h")
	private double percent_change_24h;
	@JsonProperty("percent_change_7d")
	private double percent_change_7d;
	@JsonProperty("last_updated")
	private long last_updated;
	
	
	
	public CurrencyModel() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSymbol() {
		return symbol;
	}



	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}



	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}



	public double getPrice_usd() {
		return price_usd;
	}



	public void setPrice_usd(double price_usd) {
		this.price_usd = price_usd;
	}



	public double getPrice_btc() {
		return price_btc;
	}



	public void setPrice_btc(double price_btc) {
		this.price_btc = price_btc;
	}



	public double getH24_volume_usd() {
		return h24_volume_usd;
	}



	public void setH24_volume_usd(double h24_volume_usd) {
		this.h24_volume_usd = h24_volume_usd;
	}



	public double getMarket_cap_usd() {
		return market_cap_usd;
	}



	public void setMarket_cap_usd(double market_cap_usd) {
		this.market_cap_usd = market_cap_usd;
	}



	public double getAvailable_supply() {
		return available_supply;
	}



	public void setAvailable_supply(double available_supply) {
		this.available_supply = available_supply;
	}



	public double getTotal_supply() {
		return total_supply;
	}



	public void setTotal_supply(double total_supply) {
		this.total_supply = total_supply;
	}



	public double getMax_supply() {
		return max_supply;
	}



	public void setMax_supply(double max_supply) {
		this.max_supply = max_supply;
	}



	public double getPercent_change_1h() {
		return percent_change_1h;
	}



	public void setPercent_change_1h(double percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}



	public double getPercent_change_24h() {
		return percent_change_24h;
	}



	public void setPercent_change_24h(double percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}



	public double getPercent_change_7d() {
		return percent_change_7d;
	}



	public void setPercent_change_7d(double percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
	}



	public long getLast_updated() {
		return last_updated;
	}



	public void setLast_updated(long last_updated) {
		this.last_updated = last_updated;
	}
	
	
	
	
	
	
	
	

	

}
