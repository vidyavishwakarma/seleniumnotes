package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		SkillraryLoginPage s3=new SkillraryLoginPage(driver);
		s3.searchtextbox(pdata.getData("search"));
		s3.searchbutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavacourse();
		
		WishlistPage w=new WishlistPage(driver);
		w.cancelbutton();
		driverutilities.switchFrame(driver);
		Thread.sleep(2000);
		w.playbutton();
		Thread.sleep(5000);
		w.pausebutton();
		driverutilities.switchBack(driver);
		w.addtowishlistbtn();
	}

}
