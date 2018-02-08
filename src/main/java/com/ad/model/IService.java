package com.ad.model;

import java.util.List;

import com.ad.entities.CurrencyModel;
import com.ad.entities.CurrencyModel_CNY;
import com.ad.entities.CurrencyModel_EUR;


public interface IService {

	
	public List<CurrencyModel> Cryptocurrency_Top_100 (String url);
	public CurrencyModel Cryptocurrency_Details (String url);
	public List<CurrencyModel_EUR> CryptocurrencyEUR_Top_100 (String url);
	public CurrencyModel_EUR CryptocurrencyEUR_Details (String url);
	public List<CurrencyModel_CNY> CryptocurrencyCNY_Top_100 (String url);
	public CurrencyModel_CNY CryptocurrencyCNY_Details (String url);
	
}
