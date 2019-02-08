package org.autom.testJacocoJpetstore;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJacoco {

	WebDriver driver = new ChromeDriver();

	@Test 
	public void monTestSelenium() throws InterruptedException {	
		// TODO Auto-generated method stub
		System.setProperty("driver.gecko.driver", "C:\\Users\\formation\\Desktop\\SUT\\chromedriver.exe");
		driver.get("http://localhost:8180/jpetstore");
		WebElement enterTheStore = driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
		enterTheStore.click();		
		WebElement chooseCat = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[3]/img"));
		chooseCat.click();
		WebElement buyPersianCat = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
		buyPersianCat.click();
		WebElement addFemaleToChart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		addFemaleToChart.click();
		WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"Cart\"]/a"));
		proceedToCheckout.click();
		WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		userName.sendKeys("ACID");
		passWord.sendKeys("ACID");
		WebElement chooseDog = driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img"));
		chooseDog.click();
		WebElement addGoldenRetriever = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a"));
		addGoldenRetriever.click();
		addFemaleToChart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		addFemaleToChart.click();
		WebElement returnToMenu = driver.findElement(By.xpath("//*[@id=\"BackLink\"]/a"));
		returnToMenu.click();
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]"));
		myAccount.click();
	}

	@After
	public void quitterNavigateur() {
		driver.close();
	}

}
