package Clarusway.Tasks;

import Clarusway.Utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task_28 extends TestBase {
    //Create 5 users by using XML parameter and
    //Data Provider on https://thinking-tester-contact-list.herokuapp.com/addUser

    @Test (dataProvider = "userData")
    @Parameters("Task_28")
    public void Task_28(@Optional("Jim")String firstName,
                        @Optional("Sun")String lastName,
                        @Optional("Jim@Sun.com")String email,
                        @Optional("jimsun123")String password) {

        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

    }

    @DataProvider(name = "userData")
    public Object[][] userData() {
        Faker faker = new Faker();
        return new Object[][] {
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.internet().password()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.internet().password()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.internet().password()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.internet().password()},
                {faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), faker.internet().password()}
        };
    }

}
