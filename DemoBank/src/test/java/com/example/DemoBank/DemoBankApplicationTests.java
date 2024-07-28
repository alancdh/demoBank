package com.example.DemoBank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoBankApplicationTests {

private WebDriver driver;

	String cadenaName = generaRandom.FirstNameRandom();
	String cadenaLast = generaRandom.LastNameRandom();
	String AdressRandom = generaRandom.LastNameRandom();
	String CityRandom = generaRandom.LastNameRandom();
	String StateRandom = generaRandom.LastNameRandom();
	String ZipCodeRandom = generaRandom.LastNameRandom();
	String PhoneRandom = generaRandom.LastNameRandom();
	String SnnRandom = generaRandom.LastNameRandom();
	String UsernameRandom = generaRandom.LastNameRandom();
	String PasswordRandom = generaRandom.LastNameRandom();

	@BeforeEach
	void getUp(){
		driver = new ChromeDriver();
	}

	@Test
	void testBank() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();

		//Ingresar datos para crear cuenta
		driver.findElement(By.id("customer.firstName")).sendKeys(cadenaName);
		driver.findElement(By.id("customer.lastName")).sendKeys(cadenaLast);
		driver.findElement(By.id("customer.address.street")).sendKeys(AdressRandom);
		driver.findElement(By.id("customer.address.city")).sendKeys(CityRandom);
		driver.findElement(By.id("customer.address.state")).sendKeys(StateRandom);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys(ZipCodeRandom);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys(PhoneRandom);
		driver.findElement(By.id("customer.ssn")).sendKeys(SnnRandom);
		String Usuario = UsernameRandom;
		driver.findElement(By.id("customer.username")).sendKeys(UsernameRandom);
		String Contrasenia = PasswordRandom;
		driver.findElement(By.id("customer.password")).sendKeys(PasswordRandom);
		driver.findElement(By.id("repeatedPassword")).sendKeys(PasswordRandom);
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();

		if (driver.getPageSource().contains("Your account was created successfully. You are now logged in.")){
			driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(Usuario);
			driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys(Contrasenia);
			driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		}else{
			driver.close();
			System.out.println("No se pudo completar el registro");
		}

	}
}
