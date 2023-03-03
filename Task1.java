package Homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        //goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        //check if the check box    "click on this check box" is Selected
        //if no  Select the check box
        //check gain if the checkbox is Selected or not
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBoxAge=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isSelectedAge=checkBoxAge.isSelected();
        System.out.println("The checkbox age is selected "+isSelectedAge);
       if(!isSelectedAge){
           checkBoxAge.click();
       }
        isSelectedAge=checkBoxAge.isSelected();
        System.out.println("The checkbox age is selected " +isSelectedAge);
    }
}
