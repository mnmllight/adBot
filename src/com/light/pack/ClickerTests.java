package com.light.pack;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class ClickerTests {

	public HtmlPage FormButtonClickerByNameWR(HtmlForm form, String name,
			HtmlButton button) {
		HtmlPage pageContinue = null;
		button = new FormElements().getButtonByName(name, form);
		try {
			pageContinue = button.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return pageContinue;

	} // End of FormButtonClickerByName() with return page (for test)

	/** Clickers for Html SUBMIT INPUT that getting by id and name **/
	public HtmlPage HtmlSubmitInputClickerByIdWR(HtmlSubmitInput submitBtn,
			HtmlPage page, String id) {
		HtmlPage pageContinue = null;
		submitBtn = new PageElements().getSubmitInputById(id, page);
		try {
			pageContinue = submitBtn.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return pageContinue;

	} // End of HtmlSubmitInputClickerById() for tests

	public HtmlPage HtmlSubmitInputClickerByNameWR(HtmlSubmitInput submitBtn,
			HtmlPage page, String name) {
		HtmlPage pageContinue = null;
		submitBtn = new PageElements().getSubmitInputById(name, page);
		try {
			pageContinue = submitBtn.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return pageContinue;

	} // End of HtmlSubmitInputClickerByNameWR() for tests

}
