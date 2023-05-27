package com.digital.ui.element_helper;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;


public class ElementActions {

    private static Logger logger = LogManager.getLogger(ElementActions.class);


    public ElementActions press(SelenideElement element) {
        logger.warn("I'm trying to click " + " " + element);
        element.click();
        logger.info("Succesfully clicked");
        return this;
    }

    public ElementActions input(SelenideElement element, String txt) {
        logger.warn("I'm trying to write" + " " + txt);
        element.setValue(txt);
        logger.info("Succesfully written");
        return this;
    }


    public ElementActions pressDownAndEnter(SelenideElement element){
        element.sendKeys(Keys.DOWN,Keys.ENTER);
        return this;
    }

    public ElementActions pressUpAndEnter(SelenideElement element){
        element.sendKeys(Keys.UP,Keys.ENTER);
        return this;
    }


    public static void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }catch (InterruptedException e){
            System.out.println("error seconds");
        }
    }

}












