package Clarusway.Utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider
    public Object[][] NameLastname() {
        return new String[][]{{"John", "Doe"}, {"Jim", "Sun"}, {"Zoey", "Bread"}, {"Cedric", "Known"}};
    }

    @DataProvider
    public Object[][] FakeDataProvider() {
        Faker faker = new Faker();
        return new String[][] {
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph()}};
    }

    @DataProvider
    public Object[][] ExelData() {

        ExcelUtils excelUtils = new ExcelUtils("Resources/username_password.xlsx","Sheet1");

        return excelUtils.getDataArrayWithoutFirstRow();
    }

}
