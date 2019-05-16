package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Menu_Testing {

	public static void main(String[] args) {
		
		//Chrome Driver Location
		
		System.setProperty("webdriver.chrome.driver","F:\\Final\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		//Hit the URL
		driver.get("http://www.dsinnovators.com");
	
		driver.manage().window().maximize();
		
		
		
	    //Menu Testing
		//Menu - Projects
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul/li[1]")).click();
		
		
		//Giving Delay by 7 sec
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Top Icon
		driver.findElement(By.xpath("//*[@id=\"return-to-top\"]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Menu - Clients
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul/li[2]")).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"return-to-top\"]")).click();
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Menu - Our People
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul/li[3]")).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"return-to-top\"]")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Menu - Join Us
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul/li[4]")).click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Going back to home page
		driver.navigate().back();
		
		

		
		
		

	}

}
