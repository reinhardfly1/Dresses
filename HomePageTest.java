package reinhard2;

import org.testng.Assert;
import org.testng.annotations.Test;

import reinhard.BasePage;
import reinhard.HomePage;

public class HomePageTest {

	HomePage homePage;
	BasePage bp;

	public HomePageTest() {
		homePage = new HomePage();
		bp = new BasePage();
	}

	@Test(enabled = false)
	public void verifytabs() {
		Assert.assertTrue(bp.elementFound(homePage.getWomenmenu()), "Failed");
		Assert.assertTrue(bp.elementFound(homePage.getDressesmenu()));
		Assert.assertTrue(bp.elementFound(homePage.getTShirtmenu()));
	}
	
	@Test
	public void checkEmailSubscription() {
		homePage.getsubscription();
		Assert.assertTrue(homePage.getSubscriptionMessage().contains("successfully"));
	}
	
		
	}
	



