package com.light.pack;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlCheckBoxInput;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlRadioButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class Clicker {

	/**
	 * Class for clicking on element. Include all methods for requesting
	 * elements via (form, page, DOM and other)
	 * 
	 * @return
	 **/

	// CLICKERS FOR ELEMETNTS THAT GETTING FROM HTML PAGE

	/** Clickers for Html DIV'S that getting by id and name **/
	public void HtmlDivisionClickerById(HtmlDivision div, HtmlPage page,
			String id) {

		div = new PageElements().getDivisionById(id, page);
		try {
			div.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlDivisionClickerId()

	public void HtmlDivisionClickerByName(HtmlDivision div, HtmlPage page,
			String name) {

		div = new PageElements().getDivisionByName(name, page);
		try {
			div.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlDivisionClickerName()

	/** Cklickers for Html SELECTS that getting by name **/
	public void HtmlSelectClickerByName(HtmlSelect selector, HtmlPage page,
			String name) {

		selector = new PageElements().getSelectByName(name, page);
		try {
			selector.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlSelectClickerByName()

	/** Clickers for Html BUTTONS that getting by id and name **/
	public void HtmlButtonClickerByName(HtmlButton button, HtmlPage page,
			String name) {

		button = new PageElements().getButtonByName(name, page);
		try {
			button.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlButtonClickerByName()

	public void HtmlButtonClickerById(HtmlButton button, HtmlPage page,
			String id) {

		button = new PageElements().getButtonById(id, page);
		try {
			button.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlButtonClickerById()

	/** Clickers for Html TEXT INPUTS that getting by id, tag-name and name **/
	public void HtmlTextInputClickerById(HtmlTextInput textInput,
			HtmlPage page, String id) {

		textInput = new PageElements().getTextInputById(id, page);
		try {
			textInput.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlTextInputClickerById()

	public void HtmlTextInputClickerByName(HtmlTextInput textInput,
			HtmlPage page, String name) {

		textInput = new PageElements().getTextInputByName(name, page);
		try {
			textInput.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlTextInputClickerByName()

	public void HtmlTextInputClickerByTagName(HtmlTextInput textInput,
			HtmlPage page, String tagName) {

		textInput = new PageElements().getTextInputByTagName(tagName, page);
		try {
			textInput.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlTextInputClickerByTagName()

	/** Clickers for Html CHECKBOX that getting by id and name **/
	public void HtmlCheckBoxClickerById(HtmlCheckBoxInput checkbox,
			HtmlPage page, String id) {

		checkbox = new PageElements().getCheckBoxById(id, page);
		try {
			checkbox.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlCheckBoxClickerById()

	public void HtmlCheckBoxClickerByName(HtmlCheckBoxInput checkbox,
			HtmlPage page, String name) {

		checkbox = new PageElements().getCheckBoxByName(name, page);
		try {
			checkbox.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlCheckBoxClickerById()

	/** Clickers for Html RADIO BUTTONS that getting by id and name **/
	public void HtmlRadioClickerByName(HtmlRadioButtonInput radio,
			HtmlPage page, String name) {

		radio = new PageElements().getRadioByName(name, page);
		try {
			radio.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlRadioClickerByName()

	public void HtmlRadioClickerById(HtmlRadioButtonInput radio, HtmlPage page,
			String id) {

		radio = new PageElements().getRadioById(id, page);
		try {
			radio.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlRadioClickerById()

	public void HtmlSubmitInputClickerById(HtmlSubmitInput submitBtn,
			HtmlPage page, String id) {
		try {
			submitBtn.click();
		} catch (IOException e) {

			e.printStackTrace();
		}
	} // End of HtmlSubmitInputClickerById()

	public void HtmlSubmitInputClickerByName(HtmlSubmitInput submitBtn,
			HtmlPage page, String name) {

		submitBtn = new PageElements().getSubmitInputByName(name, page);
		try {
			submitBtn.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of HtmlSubmitInputClickerByName()

	// CLICKERS FOR ELEMETNTS THAT GETTING FROM HTML PAGE

	/** Clicker for Html FORM TEXT INPUT that getting by name and value **/
	public void FormTextInputClickerByName(HtmlForm form, String name,
			HtmlTextInput input) {

		input = new FormElements().getInputByName(name, form);
		try {
			input.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of FormTextInputClickerByName()

	public void FormTextInputClickerByValue(HtmlForm form, String value,
			HtmlTextInput input) {

		input = new FormElements().getInputByName(value, form);
		try {
			input.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of FormTextInputClickerByValue()

	/** Clicker for Html FORM BUTTON that getting by name **/

	public void FormButtonClickerByName(HtmlForm form, String name,
			HtmlButton button) {

		button = new FormElements().getButtonByName(name, form);
		try {
			button.click();
		} catch (IOException e) {

			e.printStackTrace();
		}

	} // End of FormTextInputClickerByValue()

}
