package hfd.cgv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {





	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\webtable\\gf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruit=driver.findElement(By.id("fruits"));
		
		Select t=new Select(fruit);
		boolean multiple=t.isMultiple();
		System.out.println(multiple);
		t.selectByIndex(0);
		t.selectByValue("apple");
		t.selectByVisibleText("Orange");
		
		Thread.sleep(3000);
		
		t.deselectByIndex(0);
		t.deselectByValue("apple");
		t.deselectByVisibleText("Orange");

	}

}
