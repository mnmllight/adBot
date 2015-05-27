package com.light.pack;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class WebClientClass {

	/** Setting web client **/
	public WebClient setWebClient(BrowserVersion browser) throws Exception {
		{

			WebClient mWebClient = new WebClient(browser);
			return mWebClient;
		}
	} // End of method setWebClient

} // End of class WebClientClass
