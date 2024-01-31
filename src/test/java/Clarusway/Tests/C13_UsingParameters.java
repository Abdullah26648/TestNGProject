package Clarusway.Tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C13_UsingParameters {
    @Test
    @Parameters("Param1") // The parameter specified in the XML file is used in the test class.
    public void ParameterizedTest(@Optional("John") String name) { // The @Optional annotation's value will be used if there is no value assigned for the parameter.
        System.out.println("name = " + name);
    }

    @Test
    @Parameters({"name","lastname","age"})
    void threeParamterizedTest(@Optional("Jim")String name, @Optional("Sun")String lastname, @Optional("19")String age){

        System.out.println("name = " + name);
        System.out.println("lastname = " + lastname);
        System.out.println("age = " + age);

    }

}
