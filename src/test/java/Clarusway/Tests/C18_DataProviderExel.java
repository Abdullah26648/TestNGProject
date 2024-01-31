package Clarusway.Tests;

import Clarusway.Utilities.DataProviderUtils;
import Clarusway.Utilities.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C18_DataProviderExel {

    @Test(dataProvider = "ExelData", dataProviderClass = DataProviderUtils.class)
    public void DataProviderExelTest(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("  ***   ");
    }

}
