import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentt {
	
	public static void main (String args[])
	{
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book",Keys.ENTER);
		
		List<WebElement> lists = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List <Integer> oc  = new ArrayList();
		
		int n =lists.size();
		
		System.out.println("size of the lists"+ n);
		
		for ( int i=0;i<lists.size();i++)
		{
		   String text = lists.get(i).getText();	
		   
		   System.out.println(text);
		   
		   String rep= text.replace(" " ,"");
		   
		   System.out.println(rep);
		   
		   
		  if (!rep.isEmpty()) {
			  
		   int Rs = Integer.parseInt(rep);
		   
		   oc.add(Rs);
		   
		  }
		   
		}
		Collections.sort(oc);
		
		System.out.println("This is Max"+Collections.max(oc));
		
	}

}
