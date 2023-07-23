package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockBuyPage extends LoginPage  {

	
	public StockBuyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//searchBox 
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement StockSearch_box;
	
	public void enterStockName(String Stock)
	{
		StockSearch_box.sendKeys(Stock);  //wipro
	}
	
	
	//select option by mouse moveToElement
		@FindBy(partialLinkText="WIPRO")
		private WebElement option;
		
		public void selectOption()
		{
			Actions act = new Actions(driver);
			act.moveToElement(option).click().build().perform();
		}
	//enter quantity
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement enter_qty;
	
	public void enterQuantity(String qty)
	{
		enter_qty.sendKeys(qty);
	}
	
	// click on stock buy button 
			@FindBy(xpath="//button[contains(text(),'Buy')]")
			private WebElement click_on_buy;
			
			public void clickOnBuyButton()
			{
				click_on_buy.click();
			}
			
			@FindBy(xpath="(//div[text()='Order Created successfully'])[1]")
			private WebElement status;
			
			public String getstatus()
			{
				String data= status.getText();
						return data; //when we write return data then it will show notification that
				// change method return type to string i.e. replace void to string
			}
}


