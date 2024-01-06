package Java.class22;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver t:arr){
            t.openBrowser();
            t.closeBrowser();
            t.maximizewindow();
        }
    }
}
