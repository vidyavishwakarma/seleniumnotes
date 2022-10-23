package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1() throws InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseOver(driver, sd.getCoursetab());
		sd.selenium();
	
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutilities.doubleClick(driver, ad.getAddbtn());
		ad.addtocartbutton();
		driverutilities.alertPopup(driver);
	}
	

}
