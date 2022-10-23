package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	public SkillraryDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	public void selenium() {
		seleniumtraining.click();
	}
	
	
	
}
