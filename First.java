import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// import io.netty.handler.codec.socks.SocksMessage;
import java.time.Duration;
// import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;




public class First{
    WebDriver driver = new ChromeDriver();

    @Before
    public void setup () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        assertEquals("DEMOQA", title);
    }




    @Test 
    public void form (){

        /* Пишем Имя */
        WebElement nameElement = driver.findElement(By.cssSelector("input[id='firstName']"));
        nameElement.sendKeys("xxxx");

        /* Пишем Фамилия */
        WebElement lastElement = driver.findElement(By.id("lastName"));
        lastElement.sendKeys("xxxx");


        /* Указываем Email */
        WebElement emailElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[2]/input"));
        emailElement.sendKeys("name@example.com");
        
        /* Выбираем Пол */
        WebElement genderElement = driver.findElement(By.xpath("//label[text()='Male']"));
        genderElement.click();


        /* Вводим Номер телефона */
        WebElement numElement = driver.findElement(By.id("userNumber"));
        numElement.sendKeys("7999999999");


        /* День рождение выбор даты */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement dateElement = driver.findElement(By.id("dateOfBirthInput"));
        dateElement.click();

        WebElement monthElement = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        monthElement.click();
        Select drop = new Select(monthElement);
        drop.selectByVisibleText("October");

        WebElement yerElement = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        yerElement.click();
        Select smot = new Select(yerElement);
        smot.selectByVisibleText("1999");
        yerElement.click();

        WebElement dayElement = driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, October 9th, 1999']"));
        dayElement.click();



        /* Чек бокс Хоби выбор */
        WebElement hobElement = driver.findElement(By.xpath("//label[text()='Sports']"));
        hobElement.click();


        /*Загрузка картинки */
        By fileInput = By.cssSelector("input[type=file]");
        String filePath = "C:\\Users\\brobr\\Desktop\\SDET\\TestFirst\\src\\selenium1.png";
        driver.findElement(fileInput).sendKeys(filePath);  



        /*Current address */
        WebElement adresElement =driver.findElement(By.id("currentAddress"));
        adresElement.sendKeys("More more more");

        

        /* Тематика */
        WebElement subElement = driver.findElement(By.id("subjectsInput"));
        subElement.sendKeys("English");
        subElement.sendKeys(Keys.TAB);


        /* Выбор города */
        // WebElement cityElement = driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
        // cityElement.click();
        // Select cit = new Select (cityElement);
        // cityElement.selectByVisibleText("NCR");
        // cityElement.sendKeys("NCR");
        // cityElement.sendKeys(Keys.TAB); 



        /* Кнопка  */
        WebElement subButtonElement = driver.findElement(By.id("submit"));
        subButtonElement.submit();



    // @After public void tearDown() {
    //       driver.quit();
    }

}