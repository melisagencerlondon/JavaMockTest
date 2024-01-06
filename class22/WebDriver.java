package Java.class22;


public interface WebDriver {

    void openBrowser();

    void closeBrowser();
    void maximizewindow();


}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Browser in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Chrome");
    }

    @Override
    public void maximizewindow() {
        System.out.println("Maximize in Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Browser in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close browser in Firefox");
    }

    @Override
    public void maximizewindow() {
        System.out.println("Maximize in Firefox ");
    }
}