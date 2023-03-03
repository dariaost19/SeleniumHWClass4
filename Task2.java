package Homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;


public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        //goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        //1. u need to write down the code that can select  1 check box out of 4 mentioned,
        //e.g option1 , option2 , option 3, option 4
        //Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
      WebElement allCheckBoxes= driver.findElement(By.xpath("//input[@class='cb1-element']"));
        boolean isSelected =allCheckBoxes.isSelected();
       System.out.println("Check boxes are selected "+isSelected);
        List<WebElement>checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
       for(WebElement checkBox:checkBoxes){
           String box=checkBox.getAttribute("value");
           System.out.println(box);
           if(box.equalsIgnoreCase("Option-1")){
               checkBox.click();
               Thread.sleep(1000);
       //    }else if(box.equalsIgnoreCase("Option-2")){
            //   checkBox.click();
           //    Thread.sleep(1000);
       //    } else if (box.equalsIgnoreCase("Option-3")) {
          //     checkBox.click();
           //    Thread.sleep(1000);
       //    } else if (box.equalsIgnoreCase("Option-4")) {
         //      checkBox.click();
           }

       }


    }
}
