package serviceToolsStream;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;
import com.paulhammant.ngwebdriver.ByAngularOptions;

import Base.BasicWrap;

public class CalculaPricePage extends BasicWrap{
	//Formulario ubicación del inmueble
	By locator_ButtonCalculaPrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.id("mat-input-0");
	By locator_address = By.id("mat-input-1");
	By locator_addressAdd = By.id("mat-input-2");
	By locator_checkMap = By.id("mat-checkbox-1");
	By locator_button_continue = By.cssSelector("button[class=\"btn button rounded secondary\"]");
	//Información del inmueble
	By locator_typeProperty = By.id("mat-select-0");
	By locator_apartment = By.id("mat-option-0");
	By locator_house = By.id("mat-option-1");
	By locator_rent = By.id("mat-button-toggle-2-button");
	By locator_sale = By.id("mat-button-toggle-3-button");
	By locator_stratum1 = By.id("mat-button-toggle-4-button");
	By locator_stratum2 = By.id("mat-button-toggle-5-button");
	By locator_stratum3 = By.id("mat-button-toggle-6-button");
	By locator_stratum4 = By.id("mat-button-toggle-7-button");
	By locator_stratum5 = By.id("mat-button-toggle-8-button");
	By locator_stratum6 = By.id("mat-button-toggle-9-button");
	By locator_area = By.id("mat-input-3");
	By locator_antiquity = By.id("mat-input-4");
	By locator_parkingLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[1]");
	By locator_parkingMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[2]");
	By locator_toiletsLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[1]");
	By locator_toiletsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[2]");
	By locator_roomsLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[1]");
	By locator_roomsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[2]");
	By locator_balconiesMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[4]/div/button[2]");
	By locator_terraceMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[5]/div/button[2]");
	By locator_depositMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[6]/div/button[2]");
	By locator_elevatorsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[7]/div/button[2]");
	By locator_buttonContinue = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]");
	// Formulario paga el precio en linea
	By locator_names = By.id("mat-input-12");
	By locator_surnames = By.id("mat-input-13");
	By locator_identityDocument = By.id("mat-select-2");
	By locator_cc = By.id("mat-option-2");
	By locator_nit = By.id("mat-option-3");
	By locator_ce = By.id("mat-option-4");
	By locator_idNumber  = By.id("mat-input-14");
	By locator_email = By.id("mat-input-15");
	By locator_confirmEmail = By.id("mat-input-16");
	By locator_phone = By.id("mat-input-17");
	By locator_acceptTerms = By.id("mat-checkbox-2");
	By locator_dataTreatment = By.id("mat-checkbox-3");
	By locator_buttonContinueTwo = By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]");
	//Pago y descuento ciencuadras 
	By locator_bond = By.cssSelector("input[formcontrolname=\"discount\"]");
	By locator_aplic = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	By locator_buttonPayfinish = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//Datos de pago cliente
	By locator_cookies = ByAngular.buttonText("Aceptar");
	//datos tarjeta debito
	By locator_debitCard = By.id("mat-radio-3");
	By locator_holderNameD = By.id("mat-input-11");
	By locator_cardNumberD = By.id("mat-input-13");
	By locator_monthCardD = By.id("mat-input-14");
	By locator_yearCardD = By.id("mat-input-15");
	By locator_cvvD = By.id("mat-input-16");
	By locator_paymentD = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	//datos tarjeta credito
	By locator_creditCard = By.id("mat-radio-2");
	By locator_holderNameC = By.id("mat-input-5");
	By locator_cardNumberC= By.id("mat-input-7");
	By locator_monthCardC = By.id("mat-input-8");
	By locator_yearCardC = By.id("mat-input-9");
	By locator_cvvC = By.id("mat-input-10");
	By locator_dues = ByAngularBinding.id("mat-select-3");
	By locator_five = ByAngularOptions.id("mat-option-6");
	By locator_paymentC = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	//datos PSE
	By locator_pse = By.id("mat-radio-4"); 
	By locator_typedocumentP = By.name("documentType");
	By locator_CC = ByAngularOptions.id("mat-option-38");
	By locator_CE = ByAngularOptions.id("mat-option-39");
	By locator_CP = ByAngularOptions.id("mat-option-40");
	By locator_NIT = ByAngularOptions.id("mat-option-41");
	By locator_TI = ByAngularOptions.id("mat-option-42");
	By locator_TypePerson = By.name("personType");
	By locator_PN = ByAngularOptions.id("mat-option-0");
	By locator_PJ = ByAngularOptions.id("mat-option-1");
	By locator_bank = By.name("bank");
	By locator_itau = ByAngularOptions.id("mat-option-53");
	By locator_cajaSocial = ByAngularOptions.id("mat-option-46");
	By locator_paymentP = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
	//datos de pago PSE
	By locator_PSECheckPolicy = By.id("chkPolicy");
	By locator_PSECheckTerms = By.id("chkTerminos");
	By locator_follow = By.id("btnIngresar");
	//Davi puntos
	By locator_davipuntos = By.xpath("//*[@id=\"mat-radio-5\"]");
	By locator_paymentDavi = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[4]/div/div/div/app-pay-checkout-epayco/div/button");
	By locator_epayco = By.id("email-user");
	By locator_continueEpayco = By.xpath("/html/body/div/div[6]/div/div/div[1]/div[2]/div[2]/form/button");
	//Daviplata
	By locator_daviplata = By.xpath("//*[@id=\"mat-radio-6\"]");
	By locator_typeDocumentDaviplata = ByAngularBinding.id("mat-select-4");
	By locator_CCDaviplata = ByAngularOptions.id("mat-option-67");
	By locator_CEDaviplata = ByAngularOptions.id("mat-option-68");
	By locator_NITDaviplata = ByAngularOptions.id("mat-option-69");	
	By locator_TIDaviplata = ByAngularOptions.id("mat-option-70");
	By locator_CPDaviplata = ByAngularOptions.id("mat-option-71");
	By locator_SSEDaviplata = ByAngularOptions.id("mat-option-72");
	By locator_documentNumber = By.id("mat-input-17");
	By locator_paymentDaviplata = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[5]/div/div/div/app-pay-daviplata/div/div[2]/form/div[3]/button");
	//Listo descarga reporte
	By locator_report = By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-generate-report/div/div[2]/div[1]/button");
	
	//Formulario ubicación del inmueble
	String city = "Bogotá"; // Ingrese la ciudad
	String address = "Calle 184 # 20-51";// Ingrese la dirección 
	String addressAdd = "Segundo piso";//Ingrese el complemento de la dirección
	//Información del inmueble
	String typeProperty = "Apartamento";//Casa, Apartamento
	String transactionType = "Arriendo";//Arriendo, Venta
	String stratum = "3";// estrato: 1,2,3,4,5,6
	String area = "85.5";//Ingrese el area en metros cuadrados 
	String antiquity = "10";//Ingrese la antiguedad del inmueble en años
	int parkingLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de parqueaderos
	int parkingMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de parqueaderos 
	int toiletsLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de baños
	int toiletsMore = 0; //Ingrese el numero de clicks si desea aumentar la cantidad de baños 
	int roomsLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de habitaciones
	int roomsMore = 3;//Ingrese el numero de clicks si desea aunmentar la cantidad de habitaciones 
	int balconiesMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	int terraceMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	int depositMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de depositos
	int elevatorsMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de elevadores
	// Formulario paga el precio en linea
	String names = "Sebastian Andres";//Ingrese los nombres
	String surnames = "Rodiguez Cepeda";//ingrese los apellidos
	String identityDocument = "CC";//CC,NIT,CE
	String idNumber = "1057585412";//Ingrese el numero de identificación
	String email = "emaildepagoprueba@yopmail.com";// Ingrese el email 
	String confirmEmail = "emaildepagoprueba@yopmail.com";//Ingrese la confirmación del email
	String phone = "205814789";// Ingrese el numero de celular sin el numero 3
	String acceptTerms = "Si";//Si, No //Ingrese si o no si hacepta los terminos 
	String dataTreatment = "Si";// Si, No // Ingrese si o no si acepta el tratamiento de datos
	//Pago y descuento ciencuadras
	String discountCode = "";// ingrese codigo de descuento
	//Dastos cliente pago
	String paymentType = "Debito";// Debito, Credito, PSE, Davipuntos, Daviplata
	String typeDocument = "CC";// CC, CE, CP, NIT, TI, SSE
	String typePerson = "PN";//PN, PJ
	String typeBank = "ITAU";//ITAU, BANCO CAJA SOCIAL
	String holderName = "Sebastian Andres Rodiguez Cepeda"; // ingrese el numero del titular de la tarjeta
	String cardNumber = "4575623182290326"; // Ingrese el numero de la tarjeta 
	String monthCard = "12";// Ingrese el mes de la tarjeta 
	String yearCard = "25";// Ingrese el año de la tarjeta 
	String cvv = "123";// Ingrese el codigo cvv de la tarjeta
	String dues = "5"; // Ingrese el numero de cuotas campo obligatorio si el tipo de tarjeta de credito
	String documentNumber = "1057595824";// Ingrese en numero de documento formulario daviplata
	String epayco = "edwinpulidonino@gmail.com";
	
		
	public CalculaPricePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void propertyLocation() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locator_ButtonCalculaPrice);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			type(city, locator_city);
			Thread.sleep(5000);	
			WebElement ct = driver.findElement(locator_city);
			ct.sendKeys(Keys.DOWN);
			ct.sendKeys(Keys.ENTER);
			type(address, locator_address);
			Thread.sleep(5000);	
			type(addressAdd, locator_addressAdd);
			click(locator_checkMap);
			click(locator_button_continue);
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		
	}
	
	public void propertyInformation() {
		try {
			Thread.sleep(8000);	
			click(locator_typeProperty);
			Thread.sleep(8000);	
			if(typeProperty.equals("Casa")) {
				click(locator_house);
			}
			if(typeProperty.equals("Apartamento")) {
				click(locator_apartment);
			}
			if(transactionType.equals("Arriendo")) {
				click(locator_rent);
			}
			if(transactionType.equals("Venta")) {
				click(locator_sale);
			}
			if(stratum.equals("1")) {
				click(locator_stratum1);
			}
			if(stratum.equals("2")) {
				click(locator_stratum2);
			}
			if(stratum.equals("3")) {
				click(locator_stratum3);
			}
			if(stratum.equals("4")) {
				click(locator_stratum4);
			}
			if(stratum.equals("5")) {
				click(locator_stratum5);
			}
			if(stratum.equals("6")) {
				click(locator_stratum6);
			}
			Thread.sleep(5000);	
			WebElement ar = driver.findElement(locator_area);
			ar.clear(); 
			type(area, locator_area);
			Thread.sleep(5000);	
			WebElement an = driver.findElement(locator_antiquity);
			an.clear();
			type(antiquity, locator_antiquity);
			Thread.sleep(5000);			
			for(int i=0;i<parkingLess;i++) {
				click(locator_parkingLess);
			}
			for(int i=0;i<parkingMore;i++) {
				click(locator_parkingMore);
			}
			for(int i=0;i<toiletsLess;i++) {
				click(locator_toiletsLess);
			}
			for(int i=0;i<toiletsMore;i++) {
				click(locator_toiletsMore);
			}
			for(int i=0;i<roomsLess;i++) {
				click(locator_roomsLess);
			}
			for(int i=0;i<roomsMore;i++) {
				click(locator_roomsMore);
			}
			for(int i=0;i<balconiesMore;i++) {
				click(locator_balconiesMore);
			}
			for(int i=0;i<terraceMore;i++) {
				click(locator_terraceMore);
			}
			for(int i=0;i<depositMore;i++) {
				click(locator_depositMore);
			}
			for(int i=0;i<elevatorsMore;i++) {
				click(locator_elevatorsMore);
			}
			click(locator_buttonContinue);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payThePriceonline() {
		try {
			Thread.sleep(5000);	
			type(names, locator_names);
			type(surnames, locator_surnames);
			click(locator_identityDocument);
			if(identityDocument.equals("CC")) {
				click(locator_cc);
			}
			if(identityDocument.equals("NIT")) {
				click(locator_nit);
			}
			if(identityDocument.equals("CE")) {
				click(locator_ce);
			}
			type(idNumber, locator_idNumber);
			type(email, locator_email);
			type(confirmEmail, locator_confirmEmail);
			type(phone, locator_phone);
			if(acceptTerms.equals("No")) {
				click(locator_acceptTerms);
			}
			if(dataTreatment.equals("No")){
				click(locator_dataTreatment);
			}
			Thread.sleep(5000);	
			click(locator_buttonContinueTwo);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payFinish() {
		try {
			Thread.sleep(50000);
			if(discountCode != "") {
				type(discountCode, locator_bond);
				click(locator_aplic);
			}
			click(locator_buttonPayfinish);
			Thread.sleep(8000);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void purchaseDetail() {
		try {
			Thread.sleep(8000);
			click(locator_cookies);
			Thread.sleep(8000);
			if(paymentType.equals("Debito")) {
				click(locator_debitCard);
				Thread.sleep(3000);
				type(holderName, locator_holderNameD);
				type(cardNumber, locator_cardNumberD);
				type(monthCard, locator_monthCardD);
				type(yearCard, locator_yearCardD);
				type(cvv, locator_cvvD);
				Thread.sleep(8000);
				click(locator_paymentD);
			}
			if(paymentType.equals("Credito")) {
				click(locator_creditCard);
				Thread.sleep(3000);
				type(holderName, locator_holderNameC);
				type(cardNumber, locator_cardNumberC);
				type(monthCard, locator_monthCardC);
				type(yearCard, locator_yearCardC);
				type(cvv, locator_cvvC);
				Thread.sleep(8000);
				click(locator_dues);
				Thread.sleep(8000);
				click(locator_five);
				Thread.sleep(8000);
				click(locator_paymentC);
			}
			if(paymentType.equals("PSE")) {
				click(locator_pse);
				Thread.sleep(3000);
				click(locator_typedocumentP);
				Thread.sleep(8000);
				if(typeDocument.equals("CC")) {
					click(locator_CC);
				}
				if(typeDocument.equals("CE")) {
					click(locator_CE);
				}
				if(typeDocument.equals("CP")) {
					click(locator_CP);
				}
				if(typeDocument.equals("NIT")) {
					click(locator_NIT);
				}
				if(typeDocument.equals("TI")) {
					click(locator_TI);
				}
				click(locator_TypePerson);
				Thread.sleep(8000);
				if(typePerson.equals("PN")) {
					click(locator_PN);
				}
				if(typePerson.equals("PJ")) {
					click(locator_PJ);
				}
				click(locator_bank);
				Thread.sleep(8000);
				if(typeBank.equals("BANCO CAJA SOCIAL")) {
					click(locator_cajaSocial);
				}
				if(typeBank.equals("ITAU")) {
					click(locator_itau);
				}
				Thread.sleep(8000);
				click(locator_paymentP);
				Thread.sleep(10000);
				click(locator_PSECheckPolicy);
				click(locator_PSECheckTerms);
				click(locator_follow);
			}
			if(paymentType.equals("Davipuntos")) {
				click(locator_davipuntos);
				Thread.sleep(8000);
				click(locator_paymentDavi);
				Thread.sleep(8000);
				driver.switchTo().defaultContent();
				type(epayco,locator_epayco);
				click(locator_continueEpayco);
			}
			if(paymentType.equals("Daviplata")) {
				click(locator_daviplata);
				Thread.sleep(3000);
				click(locator_typeDocumentDaviplata);
				Thread.sleep(8000);
				if(typeDocument.equals("CC")) {
					click(locator_CCDaviplata);
				}
				if(typeDocument.equals("CE")) {
					click(locator_CEDaviplata);
				}
				if(typeDocument.equals("CP")) {
					click(locator_CPDaviplata);
				}
				if(typeDocument.equals("NIT")) {
					click(locator_NITDaviplata);
				}
				if(typeDocument.equals("TI")) {
					click(locator_TIDaviplata);
				}
				if(typeDocument.equals("SSE")) {
					click(locator_SSEDaviplata);
				}
				type(documentNumber,locator_documentNumber);
				Thread.sleep(8000);
				click(locator_paymentDaviplata);
			}
			Thread.sleep(5000);
			click(locator_report);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		} 
	}
}
