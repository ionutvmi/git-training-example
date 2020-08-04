package ro.tefacprogramator.m4.gitexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ro.tefacprogramator.m4.gitexample.controllers.HomepageController;
import ro.tefacprogramator.m4.gitexample.controllers.ProductListingPage;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ProductListingPage productListingPage = new ProductListingPage();
		HomepageController homepageController = new HomepageController();


		productListingPage.ModifyHomePageControllerOutput(homepageController);
	}

}
