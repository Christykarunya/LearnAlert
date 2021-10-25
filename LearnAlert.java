package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println("Simple Alert Text :" +text);
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		String text2 = alert.getText();
		System.out.println("Confirmation Alert Text :"+text2);
		Thread.sleep(2000);
		alert.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		String text3 = alert.getText();
		System.out.println("Prompt Alert Text :" +text3);
		alert.sendKeys("Education");
		Thread.sleep(2000);
		alert.accept();
	}

}
