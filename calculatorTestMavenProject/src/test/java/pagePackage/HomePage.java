package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import generics.BaseTest;
import generics.WebDriverCommLibFile;

public class HomePage extends BaseTest {
	
	//declaration
	@FindBy(xpath="(//span[contains(text(),'0')])[2]") private WebElement No_0;
	@FindBy(xpath="(//span[contains(text(),'1')])[3]") private WebElement No_1;
	@FindBy(xpath="//span[contains(text(),'2')]") private WebElement No_2;
	@FindBy(xpath="//span[contains(text(),'3')]") private WebElement No_3;
	@FindBy(xpath="//span[contains(text(),'4')]") private WebElement No_4;
	@FindBy(xpath="//span[contains(text(),'5')]") private WebElement No_5;
	@FindBy(xpath="//span[contains(text(),'6')]") private WebElement No_6;
	@FindBy(xpath="//span[contains(text(),'7')]") private WebElement No_7;
	@FindBy(xpath="//span[contains(text(),'8')]") private WebElement No_8;
	@FindBy(xpath="//span[contains(text(),'9')]") private WebElement No_9;
	@FindBy(xpath="//span[contains(text(),'×')]") private WebElement MultiplyBtn;
	@FindBy(xpath="(//span[contains(text(),'+')])[1]") private WebElement AdditionBtn;
	@FindBy(xpath="(//span[contains(text(),'/')])[2]") private WebElement DivisionBtn;
	@FindBy(xpath="//span[contains(text(),'–')]") private WebElement SubtractionBtn;
	@FindBy(xpath="//span[contains(text(),'=')]") private WebElement EqualsBtn;
	@FindBy(xpath="//div[@id='sciOutPut']") private WebElement ScrOutput;
		
	//initialization
	
	 public HomePage(WebDriver driver) 
	    {
			PageFactory.initElements(driver,this);
		}
			
	
	//utilization
	
	public WebElement getNo_0() {
		return No_0;
	}
	public WebElement getNo_1() {
		return No_1;
	}
	public WebElement getNo_2() {
		return No_2;
	}
	public WebElement getNo_3() {
		return No_3;
	}
	public WebElement getNo_4() {
		return No_4;
	}
	public WebElement getNo_5() {
		return No_5;
	}
	public WebElement getNo_6() {
		return No_6;
	}
	public WebElement getNo_7() {
		return No_7;
	}
	public WebElement getNo_8() {
		return No_8;
	}
	public WebElement getNo_9() {
		return No_9;
	}
	public WebElement getMultiplyBtn() {
		return MultiplyBtn;
	}
	public WebElement getAdditionBtn() {
		return AdditionBtn;
	}
	public WebElement getDivisionBtn() {
		return DivisionBtn;
	}
	public WebElement getSubtractionBtn() {
		return SubtractionBtn;
	}
	
	public void multiplication() throws InterruptedException
	{
		WebDriverCommLibFile wd=new WebDriverCommLibFile();
		wd.wait(3000);
		No_4.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		MultiplyBtn.click();
		wd.wait(2000);
		No_5.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_5.click();
		wd.wait(2000);
		EqualsBtn.click();
		wd.wait(1000);
		String output = ScrOutput.getText();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(output, "222075");
		System.out.println("Result after Multiplying the Number is: "+output);   	
	}
	
	public void subtraction() throws InterruptedException
	{
		WebDriverCommLibFile wd=new WebDriverCommLibFile();
		wd.wait(3000);
		No_2.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		No_4.click();
		wd.wait(2000);
		No_8.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		SubtractionBtn.click();
		wd.wait(2000);
		SubtractionBtn.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		No_0.click();
		wd.wait(2000);
		No_9.click();
		wd.wait(2000);
		No_4.click();
		wd.wait(2000);
		No_8.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		EqualsBtn.click();
		wd.wait(1000);
		String output = ScrOutput.getText();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(output, "23329646");
		System.out.println("Result after Subtracting the Numbers is: "+output);   	
	}

	public void addition() throws InterruptedException
	{
		WebDriverCommLibFile wd=new WebDriverCommLibFile();
		wd.wait(3000);
		SubtractionBtn.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		No_4.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		No_4.click();
		wd.wait(2000);
		AdditionBtn.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		No_4.click();
		wd.wait(2000);
		No_5.click();
		wd.wait(2000);
		No_3.click();
		wd.wait(2000);
		No_4.click();
		wd.wait(2000);
		No_5.click();
		wd.wait(2000);
		EqualsBtn.click();
		wd.wait(1000);
		String output = ScrOutput.getText();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(output, "111111");
		System.out.println("Result after Adding the Numbers is: "+output);   	
	}

	public void division() throws InterruptedException
	{
		WebDriverCommLibFile wd=new WebDriverCommLibFile();
		wd.wait(3000);
		No_4.click();
		wd.wait(2000);
		No_0.click();
		wd.wait(2000);
		No_0.click();
		wd.wait(2000);
		No_0.click();
		wd.wait(2000);
		DivisionBtn.click();
		wd.wait(2000);
		No_2.click();
		wd.wait(2000);
		No_0.click();
		wd.wait(2000);
		No_0.click();
		wd.wait(2000);
		EqualsBtn.click();
		wd.wait(1000);
		String output = ScrOutput.getText();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(output, "20");
		System.out.println("Result after Dividing the Numbers is: "+output);   	
	}
}
