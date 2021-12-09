import org.openqa.selenium.chrome.ChromeDriver;

public class SampleGIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SumalathaNallavelli\\OneDrive - Webjet Limited\\Desktop\\Eclipse\\eclipse\\chromedriver.exe");
			
			//Create driver object
			ChromeDriver driver1=new ChromeDriver();

			driver1.get("https://www.google.com/"); 
			//driver1.get("http://release.staging.airportrentals.com/");
			
	}

}
