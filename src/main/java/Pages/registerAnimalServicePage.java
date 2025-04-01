package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerAnimalServicePage extends CommonMethods {

    @FindBy(xpath="//label[@value='yes']")
    public WebElement doYouHaveaDog;

    @FindBy(xpath="//label[@value='yes']")
    public WebElement areYouAtleast18YearsOld;

    @FindBy(xpath="//h5[text()='Next']//parent::button")
    public WebElement nextBtn;

    @FindBy(xpath="//label[@name='notes.is-this-your-first-time-registering-your-service-dog' and @value='yes']")
    public WebElement isThisYourFirstTimeRegisteringYourServiceDog;

    @FindBy(xpath="//label[@name='notes.did-you-know-that-an-esa-could-save-you-up-to-850-per-year-by-being-exempt-from-pet-rent-and-pet-deposits' and @value='yes']")
    public WebElement exemptionFromPetRentAndPetDeposits;

    @FindBy(xpath="//label[@name='notes.has-a-disability-that-qualifies' and @value='yes']")
    public WebElement hasADisabilityThatQualifies;

    @FindBy(xpath="//input[@name='name']")
    public WebElement name;

    @FindBy(xpath="//input[@id='city']")
    WebElement city;

    @FindBy(xpath="//select[@id='state']")
    WebElement state;

    @FindBy(xpath="//input[@id='email']")
    WebElement email;

    @FindBy(xpath="//input[@id='phone']")
    WebElement phone;

    @FindBy(xpath="//input[@id='option1']/following-sibling::label")
    WebElement noofDogs;

    @FindBy(xpath="//input[@id=' animal-0']")
    WebElement dogName1;

    @FindBy(xpath="//input[@id=' animal-1']")
    WebElement dogName2;

    @FindBy(xpath="//select[@id='0.animal_type_id']")
    WebElement dog1Breed;

    @FindBy(xpath="//select[@id='1.animal_type_id']")
    WebElement dog2Breed;

    @FindBy(xpath="//input[@id='option0.0']/following::label[1]")
    WebElement dog1Gender;

    @FindBy(xpath="//input[@id='option0.1']/following::label[1]")
    WebElement dog2Gender;

    @FindBy(xpath="//input[@name='animals.0.dob']")
    WebElement dog1DOB;

    @FindBy(xpath="//input[@name='animals.1.dob']")
    WebElement dog2DOB;

    @FindBy(xpath="//input[@id='weight.0']")
    WebElement dog1Weight;

    @FindBy(xpath="//input[@id='weight.1']")
    WebElement dog2Weight;

    @FindBy(xpath="//h5[text()='Both']/parent::label")

    WebElement serviceDogNeed;

    @FindBy(xpath="//input[@name='notes.select-the-best-esa-option-for-you']/following::label[2]")
    WebElement selectService;



    public registerAnimalServicePage(){
        PageFactory.initElements(driver, this);
    }


    public void clickdoYouHaveaDog(){

        doYouHaveaDog.click();
    }

    public void clickAreYouAtleast18YearsOld(){

        CommonMethods.clickUsingJs(areYouAtleast18YearsOld);

    }

    public void clickNextBtn(){

        CommonMethods.clickUsingJs(nextBtn);


    }

    public void clickisThisYourFirstTimeRegisteringYourServiceDog(){

        isThisYourFirstTimeRegisteringYourServiceDog.click();


    }

    public void clickExemptionFromPetRentAndPetDeposits(){

        //exemptionFromPetRentAndPetDeposits.click();

        CommonMethods.clickUsingJs(exemptionFromPetRentAndPetDeposits);
    }


    public void clickHasADisabilityThatQualifies(){

        hasADisabilityThatQualifies.click();

    }

    public void setName(String n){

        name.sendKeys(n);


    }

    public void setCity(String c){

        city.sendKeys(c);

    }

    public void selectState(String st){

        Select s=new Select(state);

        s.selectByVisibleText(st);

    }

    public void setEmail(String e){

        email.sendKeys(e);

    }

    public void setPhone(String p){

        phone.sendKeys(p);

    }

    public void selectNoOfDogs(){

        noofDogs.click();
    }

    public void setDogNames(String name1,String name2){

        dogName1.sendKeys(name1);

        dogName2.sendKeys(name2);
    }

    public void selectDogBreeds(String breed1,String breed2){

        Select s1=new Select(dog1Breed);

        s1.selectByVisibleText(breed1);

        Select s2=new Select(dog2Breed);

        s2.selectByVisibleText(breed2);
    }

    public void selectDog1Gender(){

        dog1Gender.click();


    }

    public void selectDog2Gender(){

        dog2Gender.click();


    }
    public void setDog1DOB(String dob1){

        dog1DOB.sendKeys(dob1);
    }

    public void setDog2DOB(String dob2){

        dog2DOB.sendKeys(dob2);
    }

    public void setDogWeights(String w1,String w2){

        dog1Weight.sendKeys(w1);

        dog2Weight.sendKeys(w2);
    }

    public void clickServiceDogNeed(){

        serviceDogNeed.click();


    }

    public void clickSelectService(){

       // selectService.click();

        CommonMethods.clickUsingJs(selectService);
    }


}
