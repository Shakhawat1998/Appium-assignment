import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;








public class CalcScreen {



    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnPlus;

    @FindBy(id="com.google.android.calculator:id/op_sub")
    WebElement btnMinus;

    @FindBy(id="com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id="com.google.android.calculator:id/op_mul")
    WebElement btnMul;



    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id = "com.google.android.calculator:id/const_pi")
    WebElement btnPI;

    @FindBy(id = "com.google.android.calculator:id/op_pow")
    WebElement btnPow;



    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;

    @FindBy(id="com.google.android.calculator:id/clr")
    WebElement btnClr;



    AndroidDriver driver;


    public  CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    public String calcuateSeries(String series){
        char[] digits_op = series.toCharArray();
        for(char c: digits_op){
            if(Character.isDigit(c)){
                driver.findElement(By.id("com.google.android.calculator:id/digit_"+c)).click();
            }
            else if(c == '+'){
                btnPlus.click();
            }
            else if(c == '-'){
                btnMinus.click();
            }
            else if(c == '*'){
                btnMul.click();
            }
            else if (c == '/'){
                btnDiv.click();
            }
        }
        btnEqual.click();
        String result1 = txtResult.getText();
        return result1;
    }



    public String CalculateCSVSeries(String CSVseries){
        for (int i = 0; i < CSVseries.length(); i++){
            if (Character.isDigit(CSVseries.charAt(i))){
                driver.findElement(By.id("com.google.android.calculator:id/digit_"+CSVseries.charAt(i))).click();
            }
            else if (CSVseries.charAt(i) == '/') {
                btnDiv.click();
            }
            else if (CSVseries.charAt(i) == '-') {
                btnMinus.click();
            }
            else if (CSVseries.charAt(i) == '+') {
                btnPlus.click();
            }
            else if (CSVseries.charAt(i) == '^') {
                btnPow.click();
            }
            else if (CSVseries.charAt(i) == '*') {
                btnMul.click();
            }
            else if(CSVseries.charAt(i) == 'p' && CSVseries.charAt(i+1) == 'i'){
                btnPI.click();
            }

        }
        btnEqual.click();
        String result = txtResult.getText();

        // stores the result upto 2 decimal places
        if (result.indexOf(".") != -1 && result.length() > result.indexOf(".")+2) {
            result = result.substring(0, result.indexOf(".") + 3);
        }
        return result;
    }



}
