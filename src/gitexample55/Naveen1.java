package gitexample55;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naveen1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Karnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://google.com");

	}

}
