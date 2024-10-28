import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.Set;


public class CalcTestRunner extends Setup {


    @Test(priority = 1, description = "calculate series")
    public void doSeries(){
        CalcScreen calcScreen = new CalcScreen(driver);

        String result = calcScreen.calcuateSeries("100/10*5-10+60");
        System.out.println(result);
        Assert.assertEquals(result,"100");

    }

    @Test(priority = 2, dataProvider ="SeriesCSVData", dataProviderClass = SeriesDataSet.class, description = "Calculate Series from CSV")
    public void CSVSeies(String expression, String expected_result){
        CalcScreen calcScreen = new CalcScreen(driver);
        String csvResult = calcScreen.CalculateCSVSeries(expression);
        System.out.println(csvResult);
        Assert.assertEquals(csvResult,expected_result);
    }

    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen= new CalcScreen(driver);
        calcScreen.btnClr.click();
    }


}
