package com.ad;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ad.entities.CurrencyModel;
import com.ad.model.IService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CryptocCurrencyApplicationTests {

	/*@Test
	public void contextLoads() {
	}*/
	
	@Autowired
	private IService iser;
	
	@Test
	public void TOP_100Test() {
		
		List<CurrencyModel> li=iser.Cryptocurrency_Top_100("https://api.coinmarketcap.com/v1/ticker/?limit=100");
		System.out.println("It should print 100  = "+li.size());
			
							}
	
	@Test
	public void DetailTest() {
		CurrencyModel cr= iser.Cryptocurrency_Details("https://api.coinmarketcap.com/v1/ticker/bitcoin/");
		System.out.println("It should print bitcoin  "+cr.getId());
		
	}

}
