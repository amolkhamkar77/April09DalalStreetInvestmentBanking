package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pageLayer.StockBuyPage;
import com.qa.testBase.TestBase;




public class StockBuyTest extends TestBase {
		
		@Test
		public void verifyStockBuyPage() throws InterruptedException
		{
			StockBuyPage stockbuy = new StockBuyPage();
			Thread.sleep(3000);
			
			stockbuy.enterStockName("wipro");
			Thread.sleep(3000);
			
			stockbuy.selectOption();
			stockbuy.enterQuantity("2");
			Thread.sleep(3000);
			
			stockbuy.clickOnBuyButton();
			Thread.sleep(4000);
			
			System.out.println(stockbuy.getstatus());
			Assert.assertEquals(stockbuy.getstatus(), "Order Created successfully");
		// assertion is used for validating the test 
		}
}
