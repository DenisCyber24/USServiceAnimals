        package StepDefinitions;

        import Utilities.CommonMethods;
        import Utilities.ConfigReader;
        import io.cucumber.java.Before;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.When;

        import java.io.IOException;
        import java.time.Duration;

        import static StepDefinitions.PageInitializer.regPage;
        import static Utilities.CommonMethods.driver;

        public class Steps {


            @Before
            public void setUp() throws IOException, IOException {
                // Set the path to the ChromeDriver executable
             //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\spano\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

                CommonMethods.openBrowserAndLaunchApplication();

            }

                @Given("I navigate to homepage of Register Animal Service Page")
                public void i_navigate_to_homepage_of_register_animal_service_page() {
                        // Write code here that turns the phrase above into concrete actions
                        //throw new io.cucumber.java.PendingException();
                        driver.get(ConfigReader.read("registerServiceurl"));
                }

                @When("I answer all the quesionare for Regsistering the animal")
                public void i_answer_all_the_quesionare_for_regsistering_the_animal() throws InterruptedException {
                        // Write code here that turns the phrase above into concrete actions
                       // throw new io.cucumber.java.PendingException();

                        regPage.clickdoYouHaveaDog();


                        Thread.sleep(3000);


                        regPage.clickAreYouAtleast18YearsOld();


                        CommonMethods.waitForVisibiltyOfElement(regPage.isThisYourFirstTimeRegisteringYourServiceDog,3000);

                        regPage.clickisThisYourFirstTimeRegisteringYourServiceDog();

                        regPage.clickExemptionFromPetRentAndPetDeposits();





                }
                @When("I click on Let us walk you through the process page")
                public void i_click_on_let_us_walk_you_through_the_process_page() throws InterruptedException {
                        // Write code here that turns the phrase above into concrete actions
                      //  throw new io.cucumber.java.PendingException();

                    CommonMethods.scrollDown(200);
                    Thread.sleep(3000);
                    regPage.clickNextBtn();
                }

            @When("I enter the details required")
            public void i_enter_the_details_required() {
                // Write code here that turns the phrase above into concrete actions
                // throw new io.cucumber.java.PendingException();

                CommonMethods.waitForVisibiltyOfElement(regPage.hasADisabilityThatQualifies,3000);

                regPage.clickHasADisabilityThatQualifies();

                regPage.setName(ConfigReader.read("name"));

                regPage.clickNextBtn();

                regPage.setCity(ConfigReader.read("city"));

                regPage.selectState(ConfigReader.read("State"));

                regPage.clickNextBtn();

                regPage.setEmail(ConfigReader.read("email"));

                regPage.clickNextBtn();

                regPage.setPhone(ConfigReader.read("phone"));

                regPage.clickNextBtn();



            }

            @When("I click next on We are Ready To Register Your Service Dog!")
            public void i_click_next_on_we_are_ready_to_register_your_service_dog() throws InterruptedException {
                // Write code here that turns the phrase above into concrete actions
               // throw new io.cucumber.java.PendingException();

                CommonMethods.scrollDown(400);
                Thread.sleep(3000);

                regPage.clickNextBtn();


            }
            @When("I enter all the details related to animals")
            public void i_enter_all_the_details_related_to_animals() {
                // Write code here that turns the phrase above into concrete actions
                //throw new io.cucumber.java.PendingException();

                regPage.selectNoOfDogs();

                regPage.setDogNames(ConfigReader.read("dogname1"),ConfigReader.read("dogname2"));

                regPage.clickNextBtn();

                regPage.selectDogBreeds(ConfigReader.read("dog1Breed"),ConfigReader.read("dog2Breed"));

                regPage.clickNextBtn();

                regPage.selectDog1Gender();

                regPage.selectDog2Gender();

                regPage.clickNextBtn();


                regPage.setDog1DOB(ConfigReader.read("dob1"));

                regPage.setDog2DOB(ConfigReader.read("dob2"));

                regPage.clickNextBtn();

                regPage.setDogWeights(ConfigReader.read("dog1Weight"),ConfigReader.read("dog2Weight"));

                regPage.clickNextBtn();

                regPage.clickServiceDogNeed();

                regPage.clickSelectService();


            }




//            @After
//                public void tearDown() {
//             // Close the browser after each scenario
//
//             CommonMethods.closeBrowser();
//
//         }

        }



