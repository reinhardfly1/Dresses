package reinhard;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
		
		@FindBy(xpath = "//div/ul/li[1]/a[text()='Women']")
		private static WebElement Womenmenu;
	
		@FindBy(xpath = "//div/ul/li[2]/a[text()='Dresses']")
		private WebElement Dressesmenu;
		
		@FindBy(xpath = "//div/ul/li[3]/a[text()='T-shirts']")
		private WebElement TShirtmenu;
		
		@FindBy(id = "newsletter-input")
		private WebElement mailid;
		
		@FindBy(name="submitNewsletter")
		private WebElement sendemail;
		
		@FindBy(xpath ="//*[@class='columns-container']//p[@class='alert alert-success']")
		private WebElement newsletter;
		

		//Project factory for @ declaration
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		public WebElement getWomenmenu1() {
			return Womenmenu;
		
		}
		
		public WebElement getDressesmenu() {
			Dressesmenu.click();
			return Dressesmenu;
			
		}
		
		public WebElement getTShirtmenu() {
			TShirtmenu.click();
			return TShirtmenu;
		}
		
public WebElement getWomenmenu() {
			Womenmenu.click();

			return Womenmenu;
		
		}

	
	public void getsubscription() {
		int random = new Random().nextInt(500000);
		System.out.println(random);
		setText(mailid, "Automation" + random +"@gmail.com");
		sendemail.click();		
	}
	
	
	public String getSubscriptionMessage() {
		return newsletter.getText();
	}
	
		
		}


