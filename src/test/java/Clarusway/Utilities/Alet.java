package Clarusway.Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Alet {
    public class AlertHandler {

        // Method to accept the alert
        public static void acceptAlert(WebDriver driver) {
            try {
                Alert alert = driver.switchTo().alert();
                alert.accept();
            } catch (NoAlertPresentException e) {
                // Handle the case where no alert is present
                System.out.println("No alert present.");
            }
        }

        // Method to dismiss the alert
        public static void dismissAlert(WebDriver driver) {
            try {
                Alert alert = driver.switchTo().alert();
                alert.dismiss();
            } catch (NoAlertPresentException e) {
                // Handle the case where no alert is present
                System.out.println("No alert present.");
            }
        }

        // Method to get alert text
        public static String getAlertText(WebDriver driver) {
            try {
                Alert alert = driver.switchTo().alert();
                return alert.getText();
            } catch (NoAlertPresentException e) {
                // Handle the case where no alert is present
                System.out.println("No alert present.");
                return null;
            }
        }

        // Method to send text to the alert (if it's a prompt)
        public static void sendTextToAlert(WebDriver driver, String text) {
            try {
                Alert alert = driver.switchTo().alert();
                alert.sendKeys(text);
            } catch (NoAlertPresentException e) {
                // Handle the case where no alert is present
                System.out.println("No alert present.");
            }
        }
    }
}
