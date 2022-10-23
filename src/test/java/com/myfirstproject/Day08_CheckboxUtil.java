package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Day08_CheckboxUtil extends TestBase {
    @Test
    public void checkboxTest(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));


        selectCheckBox(checkbox1, true); //make sure the checkbox1 is checked
        selectCheckBox(checkbox2, false);//make sure the checkbox1 is unchecked
    }
}
