package CreatePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasicWrap;

public class createProjectBuilder extends BasicWrap{
	//localizadores de logueo hasta llegar a crear un proyecto 
	By locator_enterButton = By.linkText("INGRESAR");
	By locator_user = By.cssSelector("input[formcontrolname=\"username\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_logIn = By.xpath("/html/body/app-root/div/app-login/div/lib-cc-login/div/div/div[3]/form/button/span");
	By locator_menu = By.cssSelector("div[class=\"circle-name\"]");
	
	String user = "qa.constructorahogar21@yopmail.com";//usuario constructora
	String password = "LeonO1O1*"; // contraseña
	

	public createProjectBuilder(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void logIn() {
		try {
			
		}catch(){
			
		}
	}

}
