import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsAppSender {

    public static void main(String[] args) throws InterruptedException {
        // Set path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open WhatsApp Web
        driver.get("https://web.whatsapp.com/");
        System.out.println("Please scan the QR code and then press Enter.");
        System.in.read(); // Wait for user to scan QR code

        // Find the contact to send message
        String recipientNumber = "+919384414243"; // Replace with recipient's WhatsApp number
        WebElement searchBox = driver.findElement(By.xpath("//div[contains(@class, '_2_1wd')]//input"));
        searchBox.sendKeys(recipientNumber);

        // Wait for search results to appear (adjust sleep time as needed)
        Thread.sleep(3000);

        // Click on the contact
        WebElement contact = driver.findElement(By.xpath("//span[@title='" + recipientNumber + "']"));
        contact.click();

        // Wait for chat to open (adjust sleep time as needed)
        Thread.sleep(2000);

        // Send message repeatedly (for demonstration, sending 3 messages)
        for (int i = 1; i <= 3; i++) {
            String messageText = "Hello, this is message " + i + " sent using Selenium WebDriver.";

            // Find message input box and send message
            WebElement messageBox = driver.findElement(By.xpath("//div[@contenteditable='true']"));
            messageBox.sendKeys(messageText);

            // Find send button and click
            WebElement sendButton = driver.findElement(By.xpath("//span[@data-icon='send']"));
            sendButton.click();

            // Optional: Add delay between messages (to avoid rate limits)
            Thread.sleep(2000); // Adjust delay as needed (in milliseconds)
        }

        // Close the browser
        driver.quit();
    }
}
