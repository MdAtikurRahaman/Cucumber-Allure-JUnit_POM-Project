package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_of_Items {
	
	public static void main (String[] args) {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
		driver.get("https://www.keyfood.com");
		
		WebElement searchBox = driver.findElement(By.id("js-site-search-input"));
		searchBox.sendKeys("Tomato" + Keys.ENTER);
		
		List<WebElement> Tomatos = driver.findElements(By.xpath("//div[@class='product__listing product__list ']/div"));
		
		for (WebElement Tomato : Tomatos) {
			String tomatoName = Tomato.findElement(By.xpath(".//div[@class='product__list--name js-key-product-detail']")).getText();
			System.out.println(tomatoName);
		}
		
		/*
		driver.get("https://www.keyfood.com");
		
		WebElement block = driver.findElement(By.xPath("//div[@class='product__listing product__list ']"));
		
		List<WebElement> Tomatos = block.findElements(By.xpath("a"));
		System.err.println(tomatos.size());
		
		for (WebElement Tomato : Tomatos) {
			System.out.println(tomato.getAttribute("title");
		}
		
	}
		*/
		/*
		driver.get("https://www.amazon.com/");
	
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("camera" + Keys.ENTER);
	

		List<WebElement> cameras = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']/div"));
	
		for (WebElement camera : cameras) {
			String cameraName = camera.findElement(By.xpath(".//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
			System.out.println(cameraName);
		}
	}
	*/
		/*		
		driver.get("https://www.target.com/");
	
		WebElement searchBox = driver.findElement(By.id("search"));
		searchBox.sendKeys("laptop" + Keys.ENTER);
	
		List<WebElement> laptops = driver.findElements(By.xpath("//ul[@class='Row-sc-uds8za-0 dBcBfm h-padding-t-tight']/li"));
		System.out.println(laptops.size());
		
		for (WebElement laptop : laptops) {
			String laptopPrice = laptop.findElement(By.xpath(".//div[@data-test='current-price']")).getText();
			System.out.println(laptopPrice);
			}
		}
		*/
		/*
		driver.get("https://www.costco.com/");
	
		WebElement searchBox = driver.findElement(By.id("search-field"));
		searchBox.sendKeys("watch" + Keys.ENTER);


		List<WebElement> watches = driver.findElements(By.xpath("//div[@class='product-list grid']/div"));

		for (WebElement watch : watches) {
			String watchItemsDis = watch.findElement(By.xpath(".//span[@class='caption']")).getText();
			System.out.println(watchItemsDis);
		}
	}
*/
	}}
