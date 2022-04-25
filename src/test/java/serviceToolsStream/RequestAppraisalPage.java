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

public class RequestAppraisalPage extends BasicWrap {

	// Solicitud avaluo
	By locato_buttonAppraise = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[1]/div/div[2]/a");
	By locator_buttonColombia = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[1]/a");
	By locator_buttonExterior = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[2]/a");
	By locator_buttonCalculatePrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.name("ciudad");  
	By locator_confirm = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-check-coverage/div/div[2]/div[2]/button");
	By locator_continue = By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-coverage/div/div[3]/div/button");
	// Formato de solicitud
	By locator_typeProperty = By.cssSelector("div[class=\"mat-form-field-infix ng-tns-c121-6\"]");
	By locator_apartment = By.xpath("//*[@id=\"mat-option-6\"]/span");
	By locator_house = By.xpath("//*[@id=\"mat-option-7\"]/span");
	By locator_address = By.id("mat-input-2");
	By locator_addresAdd = By.id("mat-input-3"); 
	By locator_sale = By.id("mat-input-4"); 
	By locator_zone = By.id("mat-input-5");
	By locator_enrollment = By.id("mat-input-6");
	By locator_estateStatus = By.cssSelector("div[class=\"mat-select-arrow ng-tns-c165-15\"]");
	By locator_new = By.xpath("//*[@id=\"mat-option-2\"]/span");
	By locator_used = By.xpath("//*[@id=\"mat-option-3\"]/span");
	By locator_buildingUnderConstruction = By.xpath("//*[@id=\"mat-radio-2\"]/label/span[1]/span[1]");
	By locator_finishedProperty = By.xpath("//*[@id=\"mat-radio-3\"]/label/span[1]/span[1]");
	By locator_parking = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-appraisal-register/div/div[1]/form/div[2]/div[1]/div[1]/div/button[2]");
	By locator_parkingCommunal = By.xpath("//*[@id=\"mat-radio-5\"]");
	By locator_parkingPrivate = By.xpath("//*[@id=\"mat-radio-6\"]");
	By locator_parkingExclusive = By.xpath("//*[@id=\"mat-radio-7\"]");
	By locator_deposit = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-appraisal-register/div/div[1]/form/div[2]/div[2]/div[1]/div/button[2]");
	By locator_depositCommunal = By.xpath("//*[@id=\"mat-radio-9\"]/label/span[1]/span[2]");
	By locator_depositPrivate = By.xpath("//*[@id=\"mat-radio-10\"]/label/span[1]/span[2]");
	By locator_depositExclusive = By.xpath("//*[@id=\"mat-radio-11\"]");
	By locator_buttonContinue = ByAngular.buttonText("Continuar");
	//Formulario de facturación
	By locator_email = By.id("mat-input-9");
	By locator_typeDocument = By.cssSelector("div[class=\"mat-select-arrow ng-tns-c165-20\"]");
	By locator_cc = By.xpath("//*[@id=\"mat-option-32\"]/span");
	By locator_nit = By.xpath("//*[@id=\"mat-option-33\"]/span");
	By locator_extranjeria = By.xpath("//*[@id=\"mat-option-34\"]/span");
	By locator_pasaporte = By.xpath("//*[@id=\"mat-option-35\"]/span");
	By locator_identification = By.id("mat-input-10");
	By locator_name = By.id("mat-input-11");
	By locator_phone = By.id("mat-input-12");
	By locator_homeVisit = By.id("mat-slide-toggle-1");
	By locator_nameLastName = By.id("mat-input-21");
	By locator_phoneTwo = By.id("mat-input-22");
	By locator_emailTwo = By.id("mat-input-23");
	By locator_ownerName = By.id("mat-input-16");
	By locator_ownerPhone = By.id("mat-input-17");
	By locator_ownerEmail = By.id("mat-input-18");
	By locator_processingPersonalData = By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]");
	By locator_pay = By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-user-info/div/div/form/div[4]/button[2]");
	//Pago y descuento ciencuadras 
	By locator_bond = By.cssSelector("input[formcontrolname=\"discount\"]");
	By locator_aplic = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	By locator_buttonPayfinish = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//Datos de pago cliente
	By locator_cookies = ByAngular.buttonText("Aceptar");
	//datos tarjeta debito
	By locator_debitCard = By.xpath("//*[@id=\"mat-radio-3\"]/label/div[1]/div[1]");
	By locator_holderNameD = By.id("mat-input-11");
	By locator_cardNumberD = By.id("mat-input-13");
	By locator_monthCardD = By.id("mat-input-14");
	By locator_yearCardD = By.id("mat-input-15");
	By locator_cvvD = By.id("mat-input-16");
	By locator_paymentD = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	//datos tarjeta credito
	By locator_creditCard = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-description/div/div[1]/mat-radio-button/label/div[2]");
	By locator_holderNameC = By.id("mat-input-5");
	By locator_cardNumberC= By.id("mat-input-7");
	By locator_monthCardC = By.id("mat-input-8");
	By locator_yearCardC = By.id("mat-input-9");
	By locator_cvvC = By.id("mat-input-10");
	By locator_dues = ByAngularBinding.id("mat-select-3");
	By locator_five = ByAngularOptions.id("mat-option-6");
	By locator_paymentC = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	//datos PSE
	By locator_pse = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[1]/div[1]"); 
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

	//Avalúo
	String appraisalFrom = "Colombia";//Colombia
	String city = "Bogotá"; //Ingrese la ciudad que desea hacer el avaluo 
	//formato de solicitud 
	String typeProperty = "Casa";//Apartamento, Casa
	String address = "Calle 128 # 52-46";//Ingrese la dirección
	String addressAdd = "Primer Piso";//complemento de la dirección
	String sale = "120000000";//Valor estimado de venta 
	String zone = "2";// ingrese la zona
	String enrollment = "12345678"; // ingrese la matricula inmobiliaria
	String estateStatus = "Nueva"; // Nueva, Usada
	String stateOfTheProperty = "InmuebleEnObra";//InmuebleEnObra, InmuebleTerminado
	int parking = 1;//Ingrese el numero de parqueaderos
	int deposit = 1;// Ingrese el numero de depositos
	String typeParking = "Exclusivo"; // Comunal, Privado, Exclusivo
	String typeDeposit = "Exclusivo"; // Comunal, Privado, Exclusivo
	//Formulario de facturación
	String email = "pruebaciencuadras@yopmail.com"; // Ingrese email
	String typedocument = "CC";// CC, NIT, CCE, Pasaporte
	String document = "80427865 "; //Ingrese el numero de documento
	String name = "Juan Daniel Rodriguez Lopes";// Ingrese su nombre
	String phone = "201569874"; // Ingrese el numero de celular sin el 3
	String homeVisit = "Si"; // Si, No
	String nameTwo = "Pedro alejandro Muños";// Ingrese nombre de la persona que recibira la visita
	String phoneTwo = "201256487";// Ingrese numero de la persona que recivira la visita 
	String emailTwo = "pruebacorreovisita@yopmail.com";// Ingrese el correo de la persona que recivira la visita
	String ownerName = "Luis Alejandro Rodriguez Lopez"; // Ingrese el nombre de propietario
	String ownerPhone = "204436343"; // Ingrese el numero del propietario sin el 3
	String ownerEmail = "pruebacorreopropietario@yopmail.com";// Ingrese el correo del propietario 
	String processingPersonalData = "No";//Ingrese SI o No si acepta el tratamiento de datos personales
	//Pago y descuento ciencuadras
	String discountCode = "";// ingrese codigo de descuento
	//Dastos cliente pago
	String paymentType = "Debito";// Debito, Credito, PSE, Davipuntos, Daviplata
	String typeDocument = "CC";// CC, CE, CP, NIT, TI, SSE
	String typePerson = "PN";//PN, PJ
	String typeBank = "ITAU";//ITAU, BANCO CAJA SOCIAL
	String holderName = "Juan Daniel Rodriguez Lopes"; // ingrese el numero del titular de la tarjeta
	String cardNumber = "4575623182290326"; // Ingrese el numero de la tarjeta 
	String monthCard = "12";// Ingrese el mes de la tarjeta 
	String yearCard = "25";// Ingrese el año de la tarjeta 
	String cvv = "123";// Ingrese el codigo cvv de la tarjeta
	String dues = "5"; // Ingrese el numero de cuotas campo obligatorio si el tipo de tarjeta de credito
	String documentNumber = "1057595824";// Ingrese en numero de documento formulario daviplata
	String epayco = "edwinpulidonino@gmail.com";

	public RequestAppraisalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void appraise() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locato_buttonAppraise);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			if(appraisalFrom.equals("Colombia")) {
				Thread.sleep(8000);
				click(locator_buttonColombia);
				type(city, locator_city);
				Thread.sleep(8000);	
				WebElement ciu = driver.findElement(locator_city);
				ciu.sendKeys(Keys.DOWN);
				ciu.sendKeys(Keys.ENTER);
				Thread.sleep(8000);	
				click(locator_confirm);
				Thread.sleep(8000);	
				click(locator_continue);
			}
			if(appraisalFrom.equals("Exterior")) {
				click(locator_buttonExterior);
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void requestForm()  throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locator_typeProperty);
			if(typeProperty.equals("Apartamento")) {
				click(locator_apartment);
			}
			if(typeProperty.equals("Casa")) {
				click(locator_house);
			}
			type(address, locator_address);
			type(addressAdd,locator_addresAdd);
			type(sale, locator_sale);
			type(zone, locator_zone);
			type(enrollment, locator_enrollment);
			if(estateStatus.equals("Nueva")) {
				click(locator_estateStatus);
				click(locator_new);
			}
			if(estateStatus.equals("Usada")) {
				click(locator_estateStatus);
				click(locator_used);
			}
			if(stateOfTheProperty.equals("InmuebleEnObra")) {
				click(locator_buildingUnderConstruction);
			}
			if(stateOfTheProperty.equals("InmuebleTerminado")) {
				click(locator_finishedProperty);
			}
			if(parking != 0) {
				for(int i=0;i<parking;i++) {
					click(locator_parking);
				}
				if(typeParking.equals("Comunal")) {
					click(locator_parkingCommunal);
				}
				if(typeParking.equals("Privado")) {
					click(locator_parkingPrivate);
				}
				if(typeParking.equals("Exclusivo")) {
					click(locator_parkingExclusive);
				}
			}
			if(deposit != 0) {
				for(int i=0;i<deposit;i++) {
					click(locator_deposit);
				}
				Thread.sleep(8000);
				if(typeDeposit.equals("Comunal")) {
					click(locator_depositCommunal);
				}
				if(typeDeposit.equals("Privado")) {
					click(locator_depositPrivate);
				}
				if(typeDeposit.equals("Exclusivo")) {
					click(locator_depositExclusive);
				}
			}
			Thread.sleep(8000);
			click(locator_buttonContinue);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void billingForm() {
		try {
			Thread.sleep(8000);
			type(email,locator_email);
			click(locator_typeDocument);
			if(typedocument.equals("CC")) {
				click(locator_cc);
			}
			if(typedocument.equals("NIT")) {
				click(locator_nit);
			}
			if(typedocument.equals("CCE")) {
				click(locator_extranjeria);
			}
			if(typedocument.equals("Pasaporte")) {
				click(locator_pasaporte);
			}
			type(document, locator_identification);
			WebElement na = driver.findElement(locator_name);
			na.clear();
			type(name, locator_name);
			type(phone, locator_phone);
			if(homeVisit.equals("Si")) {
				click(locator_homeVisit);
			}else {
				type(nameTwo, locator_nameLastName);
				type(phoneTwo, locator_phoneTwo);
				type(emailTwo, locator_emailTwo);
			}
			type(ownerName, locator_ownerName);
			type(ownerPhone, locator_ownerPhone);
			type(ownerEmail, locator_ownerEmail);
			if(processingPersonalData.equals("Si")) {
				click(locator_processingPersonalData);
			}
			click(locator_pay);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payFinish() {
		try {
			Thread.sleep(15000);
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
		} catch (Exception e) {
			System.out.println("Error: "+e);
		} 
	}

}
