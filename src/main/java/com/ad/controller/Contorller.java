package com.ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ad.entities.CurrencyModel;
import com.ad.entities.CurrencyModel_CNY;
import com.ad.entities.CurrencyModel_EUR;

import com.ad.model.IService;

@Controller
public class Contorller {
	
	@Autowired
	private IService iservice;
	
	
	private static String fiat="USD";
	
	@RequestMapping("/")
	public String index( Model model) {
		
	
			
		if(fiat.equals("USD")) {
		
		List<CurrencyModel> currencylist = iservice.Cryptocurrency_Top_100("https://api.coinmarketcap.com/v1/ticker/?limit=100");
		model.addAttribute("listcur", currencylist);
		
								}
		
		if(fiat.equals("EUR")) {
			
			List<CurrencyModel_EUR> currencylisteur = iservice.CryptocurrencyEUR_Top_100("https://api.coinmarketcap.com/v1/ticker/?limit=100&convert="+fiat);
			model.addAttribute("listcureur", currencylisteur);
			
								}
		
		if(fiat.equals("CNY")) {
			
			List<CurrencyModel_CNY> currencylistcny = iservice.CryptocurrencyCNY_Top_100("https://api.coinmarketcap.com/v1/ticker/?limit=100&convert="+fiat);
			model.addAttribute("listcurcny", currencylistcny);
			
								}
		
		
		
		
		
		return "monitor";
	}
	
	
	
	@RequestMapping("convert")
	public String Transfers(Model model, String par) {
		
		fiat = par;
		return index(model);
	}
	
	
	@RequestMapping("details")
	public String details (Model model, String par) {
		
		if(fiat.equals("USD")) {
			
			CurrencyModel currency = iservice.Cryptocurrency_Details("https://api.coinmarketcap.com/v1/ticker/"+par);
			model.addAttribute("curusd", currency);
			
								}
			
			if(fiat.equals("EUR")) {
				
				List<CurrencyModel_EUR> currency = iservice.CryptocurrencyEUR_Top_100("https://api.coinmarketcap.com/v1/ticker/?https://api.coinmarketcap.com/v1/ticker/"+par+"/?convert="+fiat);
				model.addAttribute("cureur", currency);
				
									}
			
			if(fiat.equals("CNY")) {
				
				List<CurrencyModel_CNY> currency = iservice.CryptocurrencyCNY_Top_100("https://api.coinmarketcap.com/v1/ticker/?https://api.coinmarketcap.com/v1/ticker/"+par+"/?convert="+fiat);
				model.addAttribute("curcny", currency);
				
									}
	
		
		return "details";
	}
	
	

}
