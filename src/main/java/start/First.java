package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class First {
    WebDriver driver; // Тут просто объявляем

    @Test
    public void firstTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        pause(2000);
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        //driver.navigate().to("https://telranedu.web.app/home");
        // driver.get("https://telranedu.web.app/about");
        pause(2000);
        driver.navigate().back();
        pause(3000);
        WebElement btnLogin = driver.findElement(By.cssSelector("a[href='/login']"));
        btnLogin.click();
        pause(3000);
        //driver.navigate().forward();
        WebElement btnHome = driver.findElement(By.cssSelector("*[href='/home']"));
        btnHome.click();
        pause(3000);
        driver.navigate().refresh();
        pause(3000);
        WebElement divRoot = driver.findElement(By.cssSelector("div[id='root']"));
        // #root
        // [id='root']
        pause(3000);
        System.out.println(divRoot.getTagName());
        System.out.println(divRoot.getAttribute("class"));

        WebElement divRoot1 = driver.findElement(By.id("root"));
        System.out.println(divRoot.getTagName());

        WebElement divRoot2 = driver.findElement(By.className("container"));
        System.out.println(divRoot2.getAttribute("id"));

        pause(3000);
       // driver.close();
       // pause(3000);
        driver.quit();
        pause(3000);

    }

    @Test
    public void iCCarroTest() {
        // 1. Сначала запускаем сам браузер Chrome
        driver = new ChromeDriver();

        // 2. Открываем нужный сайт
        driver.get("https://ilcarro.web.app/search");

        // 3. Разворачиваем окно на весь экран
        driver.manage().window().maximize();

        // 4. Ждем 2 секунды, чтобы сайт успел прогрузиться
        pause(2000);

        // 5. Ищем элемент по его CSS-классу
        WebElement linkSearch = driver.findElement(By.cssSelector(".navigation-link"));

        // 6. Ждем еще 2 секунды перед завершением теста
        pause(2000);
        linkSearch.click();
        pause(2000);
        WebElement linkTerms = driver.findElement(By
                .cssSelector("a.navigation-link[href='/terms-of-use']"));
        //[href='/terms-of-use']
//a[href*='of-use'] включает в себя
//a[href^='/terms'] начинается
//a[href$='-use'] заканчивается
        pause(2000);
        linkTerms.click();
        pause(2000);

        // Поиск кнопки Регистрации (SignUp) по порядковому номеру
        WebElement linkSignUp = driver.findElement(
                By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        linkSignUp.click();
        pause(2000);

        // Поиск кнопки Логина (Login) — теперь без лишних символов '] в конце
        WebElement linkLogin = driver.findElement(
                By.cssSelector("div.header a.navigation-link:last-child"));
        linkLogin.click();
        pause(2000);


        WebElement logo = driver.findElement(
                By.cssSelector("div.header a:first-child"));
        logo.click();
        pause(2000);

        WebElement linkLetTheCar = driver.findElement(
                By.partialLinkText("Let the car work"));
        linkLetTheCar.click();
        pause(2000);
        driver.navigate().back();
        pause(2000);

        driver.quit();





        // // a[class='navigation-link']
        // // a.navigation-link
    }


//    public void iCcarroTest(){
//        driver.get("https://ilcarro.web.app/search");
//        driver.manage().window().maximize();
//        pause(2000);
//        WebElement linkSearch = driver.findElement
//                (By.cssSelector(".navigation-link"));
//        pause(2000);
       // a[class='navigation-link']
        // a.navigation-link








    public void pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

