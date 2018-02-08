package com.ad.model;


import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ad.entities.CurrencyModel;
import com.ad.entities.CurrencyModel_CNY;
import com.ad.entities.CurrencyModel_EUR;


@Service
public class ServiceImplementation implements IService {

	
	
	
	@Override
	public List<CurrencyModel> Cryptocurrency_Top_100(String url) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<CurrencyModel>> res=restTemplate.exchange(url,HttpMethod.GET, null,new ParameterizedTypeReference<List<CurrencyModel>>() {});
		List<CurrencyModel> CurrencyModelList = res.getBody();
		
		return CurrencyModelList;
	}

	@Override
	public CurrencyModel Cryptocurrency_Details(String url) {
		// TODO Auto-generated method stub
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CurrencyModel[]> res=restTemplate.exchange(url,HttpMethod.GET, null,CurrencyModel[].class);
		
		
		return res.getBody()[0];
	}





	@Override
	public List<CurrencyModel_EUR> CryptocurrencyEUR_Top_100(String url) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<CurrencyModel_EUR>> res=restTemplate.exchange(url,HttpMethod.GET, null,new ParameterizedTypeReference<List<CurrencyModel_EUR>>() {});
		List<CurrencyModel_EUR> CurrencyModelList = res.getBody();
		
		return CurrencyModelList;
	}

	@Override
	public CurrencyModel_EUR CryptocurrencyEUR_Details(String url) {
		// TODO Auto-generated method stub


		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CurrencyModel_EUR[]> res=restTemplate.exchange(url,HttpMethod.GET, null,CurrencyModel_EUR[].class);
		
		
		return res.getBody()[0];
	}

	@Override
	public List<CurrencyModel_CNY> CryptocurrencyCNY_Top_100(String url) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<CurrencyModel_CNY>> res=restTemplate.exchange(url,HttpMethod.GET, null,new ParameterizedTypeReference<List<CurrencyModel_CNY>>() {});
		List<CurrencyModel_CNY> CurrencyModelList = res.getBody();
		
		return CurrencyModelList;	}

	@Override
	public CurrencyModel_CNY CryptocurrencyCNY_Details(String url) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CurrencyModel_CNY[]> res=restTemplate.exchange(url,HttpMethod.GET, null,CurrencyModel_CNY[].class);
		
		
		return res.getBody()[0];
		// TODO Auto-generated method stub
		
	}

}
