package com.light.pack;

import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class GetFormClass {
	
	/** Getting form by "name" 
	 * @return **/
	
	public HtmlForm getFormByName(HtmlPage formPage, String formName) {
		
		final HtmlForm form = formPage.getFormByName(formName);
		return form;
	}
	
}
