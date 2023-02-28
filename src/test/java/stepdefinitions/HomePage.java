package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Allpages;
import utils.ConfigReader;
import utils.Driver;

public class HomePage {
     Allpages allpages=new Allpages();


     @Given("Alltricks anasayfasina git")
     public void alltricks_anasayfasina_git() {
          Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));
          allpages.cookie.click();
          allpages.singIn.click();
     }

     @Given("Profil sekmesine geç")
     public void profil_sekmesine_gec() {

     }

     @Then("Adresim kismina emaili gir")
     public void adresim_kismina_emaili_gir() {


     }







}
