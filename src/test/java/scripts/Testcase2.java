package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropDown(sd.getCoursedd(), pdata.getData("coursedd"));
		
		CoursePage cp=new CoursePage(driver);
		driverutilities.dragAndDrop(driver, cp.getSelenium(), cp.getCartarea());
		WebElement loc = cp.getLinkedin();
		Point l = loc.getLocation();
		int x = l.getX();
		int y = l.getY();
		
		driverutilities.scrollBar(driver, x, y);
		cp.getLinkedin();
		
	}

}
