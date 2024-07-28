package com.example.DemoBank;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Random;


@SpringBootTest
class DemoBankApplicationTests {
	private static final String Letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int Longitud = 8;

	public static String Cadena (String ) {
		Random random = new Random();
		StringBuilder creadorCadena = new StringBuilder(Longitud);
		for (int i = 0; i < Longitud; i++) {
			int contador = random.nextInt(Letras.length());
			creadorCadena.append(Letras.charAt(contador));
		}

	 	String randomString = creadorCadena.toString();
	//	System.out.println("Cadena Random: " + randomString);
        return randomString;
    }

	private WebDriver driver;

	@BeforeEach
	void getUp(){
		driver = new ChromeDriver();
	}

	@Test
	void testBank() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();

		//Ingresar datos para crear cuenta
		driver.findElement(By.id("customer.firstName")).sendKeys(C);
		driver.findElement(By.id("customer.lastName")).sendKeys();
		driver.findElement(By.id("customer.address.street")).sendKeys();
		driver.findElement(By.id("customer.address.city")).sendKeys();
		driver.findElement(By.id("customer.address.state")).sendKeys();
		driver.findElement(By.id("customer.address.zipCode")).sendKeys();
		driver.findElement(By.id("customer.phoneNumber")).sendKeys();
		driver.findElement(By.id("customer.ssn")).sendKeys();
		driver.findElement(By.id("customer.customer.username")).sendKeys();
		driver.findElement(By.id("customer.password")).sendKeys();
		driver.findElement(By.id("repeatedPassword")).sendKeys();

		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();

		if (driver.getPageSource().contains("Your account was created successfully. You are now logged in.")){
			driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();

			driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys();
			driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys();
			driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		}else{
			driver.close();
		}

	}
}
