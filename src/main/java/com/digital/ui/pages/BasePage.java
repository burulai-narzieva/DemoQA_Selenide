package com.digital.ui.pages;

import com.digital.ui.element_helper.ElementActions;
import com.github.javafaker.Faker;

public class BasePage {

    public ElementActions elementActions = new ElementActions();
    public static Faker faker = new Faker();

    public BasePage() {

    }
}
