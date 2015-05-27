package com.light.pack;

import org.json.JSONObject;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class MainClass {

	/**
	 * Params for browser version: Chrome, FF24, IE11.
	 **/
	public static String urlFromJSON = "";
	public static String browserVersionFromJSON = "Chrome";
	public static final BrowserVersion browserCHROME = BrowserVersion.CHROME;
	public static final BrowserVersion browserFIREFOX_24 = BrowserVersion.FIREFOX_24;
	public static final BrowserVersion browserIE_11 = BrowserVersion.INTERNET_EXPLORER_11;
	public static HtmlPage firstPage = null;

	/** Calling methods that connected with scenario */
	public static void main(String[] args) throws Exception {

		/** Block to creating objects of classes for work with Parser **/
		// GetPage getPage = new GetPage();
		// FormElements getElements = new FormElements();
		// PageElements pageElements = new PageElements();
		// Clicker clicker = new Clicker();
		// ClickerTests clickerTests = new ClickerTests();
		// GetFormClass getForm = new GetFormClass();
		ParserJson jsParser = new ParserJson();

		/** Getting JSON from web URL **/
		JSONObject json = jsParser.readJsonFromUrl();
		json.toString();
		System.out.println(json.get("description"));

		/** Getting page and set browser version **/

		if (browserCHROME.toString().equals(browserVersionFromJSON)) {
			// System.out.println(browserCHROME.toString());
			// firstPage = getPage.getPageByStringURL(urlFromJSON,
			// browserCHROME);
			// System.out.println(firstPage.asXml());

		} else if (browserFIREFOX_24.toString().equals(browserVersionFromJSON)) {
			// System.out.println(browserFIREFOX_24.toString());
			// firstPage = getPage.getPageByStringURL(urlFromJSON,
			// browserFIREFOX_24);
			// System.out.println(firstPage.asXml());

		} else if (browserIE_11.toString().equals(browserVersionFromJSON)) {
			// System.out.println(browserIE_11.toString());
			// firstPage = getPage.getPageByStringURL(urlFromJSON,
			// browserIE_11);
			// System.out.println(firstPage.asXml());

		}

	}

}
