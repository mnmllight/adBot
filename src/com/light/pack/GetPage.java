package com.light.pack;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class GetPage {

	/* Area of class methods */

	/** Get page by string URL */
	public HtmlPage getPageByStringURL(String url, BrowserVersion browser) {

		HtmlPage htmlPage = null;
		try {

			try {
				htmlPage = new WebClientClass().setWebClient(browser).getPage(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FailingHttpStatusCodeException e) {

			e.printStackTrace();
		}
		return htmlPage;

	} // End of method getPageByStringURL
	
	
} // End of class GetPage
