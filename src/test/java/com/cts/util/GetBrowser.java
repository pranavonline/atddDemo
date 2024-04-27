package com.cts.util;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.slf4j.LoggerFactory;
import com.cts.util.ConfigData;
import java.util.*;

public class GetBrowser extends Logging {
	protected WebDriver driver = null;
	protected DesiredCapabilities dc = new DesiredCapabilities();
	public ConfigData config = new ConfigData();

	public GetBrowser() {
		this.logger = LoggerFactory.getLogger(GetBrowser.class);
		
	}
	
	public WebDriver openBrowser()  {
		
//		WebDriverManager.chromedriver().setup();
		ChromeOptions opts = new ChromeOptions();
 		    opts.addArguments("--no-sandbox");
 		    opts.addArguments("--disable-dev-shm-usage");		  
// 		    opts.addArguments("--headless");
 		    
//    		    opts.addArguments("--disable-extensions"); // disabling extensions
    		    //opts.addArguments("--remote-debugging-port=9222");
 		opts.addArguments("--disable-setuid-sandbox"); // applicable to windows os only
		
		//opts.setBinary("\\$HOME/.apt/opt/google/$BIN");
		//--headless, --disable-gpu, --no-sandbox, and --remote-debugging-port=9222
		
		
		Map<String, Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_settings.popups", 1);
            opts.setExperimentalOption("prefs", prefs);
		System.out.println("********************Initialting Browser *****************");
		WebDriver driver = new ChromeDriver(opts);
		System.out.println("********************Initiated Browser *****************");
		return driver;
// 		WebDriver driver = new HtmlUnitDriver();
// 		return driver;
	}
	
// 	public WebDriver openBrowser(String strName)  {
//		
// 			String[] browserData = strName.split("_");
// 			WebDriver wDriver = null;
// 				// Parse the data value - it is delimited by Underscores
//				
// 				for(int i = 0; i < browserData.length; i++) {
// 					if(browserData[i].length() > 0) {
// 						switch(i) {
// 						case 0: // Browser
// 							dc.setBrowserName(browserData[i]);
// 							logger.debug("Browser Name loaded from data:\"" + browserData[i] + "\"");
// 							break;
// 						case 1: // Version
// 							dc.setVersion(browserData[i]);
// 							logger.debug("Browser Version loaded from data:\"" + browserData[i] + "\"");
// 							break;
// 						case 2: // Platform
// 							dc.setCapability("platform", browserData[i]);
// 							logger.debug("Browser Platform loaded from data:\"" + browserData[i] + "\"");
// 							break;
// 						case 3: // Platform
// 							dc.setCapability("deviceName", browserData[i]);
// 							logger.debug("device name loaded from data:\"" + browserData[i] + "\"");
// 							break;
// 						case 4: // Platform
// 							dc.setCapability("deviceOrientation", browserData[i]);
// 							logger.debug("device orientation loaded from data:\"" + browserData[i] + "\"");
// 							break;
//							
// 						default: // unknown token
// 							logger.error("Unknown token in data value. Index: " + i + " Value: " + browserData[i]);
// 							break;
// 						}
// 					}
// 				}
// 			}
			
		
			
// 			// If the browser is set in the desired capabilities, 
// 			// set default browser to IE 8 in Windows 7
// 			if(dc.getBrowserName() == null) {
// 				dc.setBrowserName("internet explorer");
// 				dc.setVersion("8");
// 				dc.setCapability("platform","VISTA");
// 			}
			
// 			/////// MODIFY THE DC OBJECT to have CHROME OPTIONS IF BROWSER IS CHROME //////////
// 			// Adding capability to chrome to avoid extension loading ans supressing warning for certificate
// 			if("chrome".equals(dc.getBrowserName())) {
// 				ChromeOptions options = new ChromeOptions();
// 			    options.addArguments("test-type");
// 			    options.addArguments("--disable-extensions");
// 			    dc.setCapability(ChromeOptions.CAPABILITY, options);
// 			}
			
			
// 			/////////// ADDING A PROFILE FOR CAPITALONE USERS TO FIREFOX /////////
// 			//Adding support for Firefox profile- Applicable for Native and Grid .
// 			if("firefox".equals(dc.getBrowserName())) {
// 				FirefoxProfile firefoxProfile = new FirefoxProfile();
// 				firefoxProfile.setAcceptUntrustedCertificates(true);
// 				firefoxProfile.setPreference("pdfjs.disabled", true);
// 				firefoxProfile.setPreference("pdfjs.firstRun", false);
// 				firefoxProfile.setPreference("plugin.scan.plid.all", false);
// 				firefoxProfile.setPreference("plugins.click_to_play", false);
// 				firefoxProfile.setPreference("plugin.default.state", 2);
// 				firefoxProfile.setPreference("plugin.state.java", 2);
// 				firefoxProfile.setPreference("security.enable_java", true ); 
// 				firefoxProfile.setPreference("plugin.scan.Acrobat", "9.0");
// 				firefoxProfile.setPreference("network.automatic-ntlm-auth.allow-proxies", true);
//             	firefoxProfile.setPreference("network.proxy.autoconfig_url", "http://proxy.kdc.capitalone.com:3133/proxy.pac");
//             	firefoxProfile.setPreference("network.proxy.no_proxies_on", "localhost, 127.0.0.1");
//             	dc.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
//             }
			
// 			//////////// CREATE THE WEB DRIVER /////////////////
// 			try {
			
// 				// GRID CASE
// 				if(config.ConfigMap.get("executionType").equals("grid") ||
// 						config.ConfigMap.get("executionType").equals("saucelabs")) {
					
// 					// Configure Sauce Labs specific DesiredCapabilities parameters
// 					if(config.ConfigMap.get("executionType").equals("saucelabs")) {
// 						String sauceConnectTunnel = config.ConfigMap.get("sauceConnectTunnel");
// 						if( !(sauceConnectTunnel == null || sauceConnectTunnel.isEmpty()) ) {
// 							dc.setCapability("parent-tunnel", sauceConnectTunnel);
// 							logger.info("Sauce Connect Tunnel provided");
// 						}
// 						dc.setCapability("name", config.ConfigMap.get("username"));
// 						// Set Sauce Labs Timeouts
// 						// Max duration is how long this Web Driver can exist
// 						dc.setCapability("max-duration", 2700); // 45 minutes [overriding default of 1800]
// 						// Command Timeout is a limit to how long one single Selenium command can run
// 						dc.setCapability("command-timeout", 600); // set to 10 minutes [overriding the default of 300]
// 						// Idle timeout is the length of time sauce will wait in between commands before assuming the client is no longer active
// 						//dc.setCapability("idle-timeout", 600); // set to 10 minutes [Overriding the default of 90]
// 					}
					
// 					logger.debug("Browser Capabilities Set:" + dc);
					
// 					URL hubURL = new URL(config.ConfigMap.get("hubURL"));
// 					logger.debug("Remote Web Driver will be created on server at " + hubURL);
// 					logger.debug("Attempting to retrieve new Web Driver from " + hubURL + " with " + dc + "...");
// 					wDriver = new RemoteWebDriver(hubURL, dc); // Setting the Required Capabilities
					
// 				}
// 				// NATIVE CASES
// 				else {
// 					switch(dc.getBrowserName()) {
// 					case "internet explorer":
// 						// Start up Native IE driver
// 						wDriver = new InternetExplorerDriver();
// 						logger.info("New IE WebDriver instantiated");
// 						break;
// 					case "chrome":
// 				    	// Start up Native Chrome driver
// 						wDriver = new ChromeDriver(dc);
// 						logger.info("New Chrome WebDriver instantiated");
// 						break;
// 					case "firefox":
// 						// Start up Native Firefox driver
// 						wDriver = new FirefoxDriver(dc);
// 						logger.info("New Firefox WebDriver instantiated");
// 						break;
				
// 					default:
// 						logger.error("Unable to open a browser type:'" + dc.getBrowserName() + "'");
// 						break;
// 					}
// 				}
				
// 				// Setup Web Driver and the global timeouts
// 				this.driver = wDriver;
// 				wDriver.manage().timeouts().implicitlyWait(Long.parseLong(config.ConfigMap.get("globalObjectTimeout")), TimeUnit.SECONDS);
// 				if(!config.ConfigMap.get("executionType").equals("saucelabs")) {
// 					wDriver.manage().timeouts().pageLoadTimeout(Long.parseLong(config.ConfigMap.get("globalPageLoadTimeout")), TimeUnit.SECONDS);
// 				}
// 				// Wait a second to buffer ie driver 
// 				if("internet explorer".equals(dc.getBrowserName())) {
// 					Thread.sleep(1000);
// 				}	
// 				logger.info("Browser \"" + dc.getBrowserName() + "\" successfully opened with capabilities"); 
// 	        } catch (Exception e) {
// 	        	logger.error("Unable to open browser " + dc.getBrowserName() + " ", e); // Keyword Failed
// 	        }
// 			return wDriver;
// 		}

	public void closeBrowser()  {
		this.driver.quit();
	}


}
