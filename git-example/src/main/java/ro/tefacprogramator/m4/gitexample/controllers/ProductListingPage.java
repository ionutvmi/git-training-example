package ro.tefacprogramator.m4.gitexample.controllers;

public class ProductListingPage {

    public HomepageController homepageController =new HomepageController();
    String newMessage = "HENLO";

    public void ModifyHomePageControllerOutput(HomepageController homepageController){
        homepageController.message = newMessage;
        homepageController.sayHello();
    }
    
    

}