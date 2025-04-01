package StepDefinitions;

import Pages.registerAnimalServicePage;

public class PageInitializer {



   public static registerAnimalServicePage regPage;
    //public static ProductsPage productsPage;




    public static void initializePageObjects(){
        regPage = new registerAnimalServicePage();


    }

}
