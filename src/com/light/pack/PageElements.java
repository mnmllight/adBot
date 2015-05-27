package com.light.pack;

import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlCheckBoxInput;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlHiddenInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlRadioButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class PageElements {

	/**
	 * Getting elements from page
	 * 
	 * @return
	 **/

	// -----------------------------------------------GETTERS-----------------------------------------------//

	/** Getting HtmlDivision (div) by id **/
	public HtmlDivision getDivisionById(String id, HtmlPage page) {

		HtmlDivision div = (HtmlDivision) page.getElementById(id);
		return div;

	}

	/** Getting HtmlDivision (div) by id **/
	public HtmlDivision getDivisionByName(String name, HtmlPage page) {

		HtmlDivision div = (HtmlDivision) page.getElementById(name);
		return div;

	}

	/** Getting anchor from page by href **/
	public HtmlAnchor getAnchorByHref(String href, HtmlPage page) {

		HtmlAnchor anchor = page.getAnchorByHref(href);
		return anchor;

	}

	/** Getting anchor from page by name **/
	public HtmlAnchor getAnchorByName(String name, HtmlPage page) {

		HtmlAnchor anchor = page.getAnchorByHref(name);
		return anchor;

	}

	/** Getting anchor from page by name **/
	public HtmlAnchor getAnchorByText(String text, HtmlPage page) {

		HtmlAnchor anchor = page.getAnchorByText(text);
		return anchor;

	}

	/** Getting DOM-element by id from page **/
	public DomElement getDomElementbyId(String id, HtmlPage page) {

		DomElement element = (DomElement) page.getElementById(id);
		return element;

	}

	/** Getting DOM-element by name from page **/
	public DomElement getDomElementbyName(String name, HtmlPage page) {

		DomElement element = (DomElement) page.getElementById(name);
		return element;

	}

	/** Getting DOM-elements by tag-name from page **/
	public DomNodeList<DomElement> getDomElementByTagName(String tagName,
			HtmlPage page) {

		DomNodeList<DomElement> elements = (DomNodeList<DomElement>) page
				.getElementsByTagName(tagName);
		return elements;

	}

	/** Getting Html-select by name from page **/
	public HtmlSelect getSelectByName(String name, HtmlPage page) {

		HtmlSelect selector = page.getElementByName(name);
		return selector;

	}

	/** Getting HtmlButton by name **/
	public HtmlButton getButtonByName(String name, HtmlPage page) {

		HtmlButton button = (HtmlButton) page.getElementById(name);
		return button;

	}

	/** Getting HtmlButton by id **/
	public HtmlButton getButtonById(String id, HtmlPage page) {

		HtmlButton button = (HtmlButton) page.getElementById(id);
		return button;

	}

	/** Getting hidden input by id **/
	public HtmlHiddenInput getHiddenInputById(String id, HtmlPage page) {

		HtmlHiddenInput hiddenInput = (HtmlHiddenInput) page.getElementById(id);
		return hiddenInput;

	}

	/** Getting hidden input by name **/
	public HtmlHiddenInput getHiddenInputByName(String name, HtmlPage page) {

		HtmlHiddenInput hiddenInput = (HtmlHiddenInput) page
				.getElementByName(name);
		return hiddenInput;

	}

	/** Getting all hidden inputs by tag name **/
	public HtmlHiddenInput getHiddenInputByTagName(String tagName, HtmlPage page) {

		HtmlHiddenInput hiddenInput = (HtmlHiddenInput) page
				.getElementsByTagName(tagName);
		return hiddenInput;

	}

	/** Getting HtmlTextInput input by id **/
	public HtmlTextInput getTextInputById(String id, HtmlPage page) {

		HtmlTextInput textInput = (HtmlTextInput) page.getElementById(id);
		return textInput;

	}

	/** Getting HtmlTextInput input by name **/
	public HtmlTextInput getTextInputByName(String name, HtmlPage page) {

		HtmlTextInput textInput = (HtmlTextInput) page.getElementByName(name);
		return textInput;

	}

	/** Getting all HtmlTextInput inputs by tag name **/
	public HtmlTextInput getTextInputByTagName(String tagName, HtmlPage page) {

		HtmlTextInput textInput = (HtmlTextInput) page
				.getElementsByTagName(tagName);
		return textInput;

	}

	/** Getting HtmlPasswordInput input by id **/
	public HtmlPasswordInput getPasswordInputById(String id, HtmlPage page) {

		HtmlPasswordInput passwordInput = (HtmlPasswordInput) page
				.getElementById(id);
		return passwordInput;

	}

	/** Getting HtmlPasswordInput input by name **/
	public HtmlPasswordInput getPasswordInputByName(String name, HtmlPage page) {

		HtmlPasswordInput passwordInput = (HtmlPasswordInput) page
				.getElementByName(name);
		return passwordInput;

	}

	/** Getting all HtmlPasswordInput inputs by tag name **/
	public HtmlPasswordInput getPasswordInputByTagName(String tagName,
			HtmlPage page) {

		HtmlPasswordInput passwordInput = (HtmlPasswordInput) page
				.getElementsByTagName(tagName);
		return passwordInput;

	}

	/** Getting checkbox by id **/
	public HtmlCheckBoxInput getCheckBoxById(String id, HtmlPage page) {

		HtmlCheckBoxInput checkBox = (HtmlCheckBoxInput) page
				.getElementById(id);
		return checkBox;

	}

	/** Getting checkbox by name **/
	public HtmlCheckBoxInput getCheckBoxByName(String name, HtmlPage page) {

		HtmlCheckBoxInput checkBox = (HtmlCheckBoxInput) page
				.getElementById(name);
		return checkBox;

	}

	/** Getting radio button by name **/
	public HtmlRadioButtonInput getRadioByName(String name, HtmlPage page) {

		HtmlRadioButtonInput radio = page.getElementByName(name);
		return radio;

	}

	/** Getting radio button by id **/
	public HtmlRadioButtonInput getRadioById(String id, HtmlPage page) {

		HtmlRadioButtonInput radio = page.getElementByName(id);
		return radio;

	}

	/** Getting submit input by id **/
	public HtmlSubmitInput getSubmitInputById(String id, HtmlPage page) {

		HtmlSubmitInput submitBtn = (HtmlSubmitInput) page.getElementById(id);
		return submitBtn;

	}

	/** Getting submit input by name **/
	public HtmlSubmitInput getSubmitInputByName(String name, HtmlPage page) {

		HtmlSubmitInput submitBtn = (HtmlSubmitInput) page
				.getElementByName(name);
		return submitBtn;

	}

	/** Xpath **/

	/** Getting HtmlButton by XPath **/
	public HtmlButton getButtonByXPath(HtmlPage page, int buttonIndex) {

		HtmlButton button = (HtmlButton) page.getByXPath("//button").get(
				buttonIndex);
		return button;

	}

	/** Getting HtmlDivision by XPath **/
	public HtmlDivision getDivByXPath(HtmlPage page, int divIndex) {

		HtmlDivision div = (HtmlDivision) page.getByXPath("//div")
				.get(divIndex);
		return div;

	}

	// -----------------------------------------------SETTERS-----------------------------------------------//

	/** Setting some value to DOM-element after getting it by id **/
	public DomElement setValueToElementById(DomElement element, HtmlPage page,
			String id, String value) {

		element = getDomElementbyId(id, page);
		element.setNodeValue(value);
		return element;

	}

	/** Setting some value to DOM-element after getting it by name **/
	public DomElement setValueToElementByName(DomElement element,
			HtmlPage page, String name, String value) {

		element = getDomElementbyId(name, page);
		element.setNodeValue(value);
		return element;

	}

	/** Setting some value to DOM-element after getting it by tag-name **/
	public DomElement setValueToElementByTagName(
			DomNodeList<DomElement> element, HtmlPage page, String tagName,
			String value) {

		element = getDomElementByTagName(tagName, page);
		((DomNode) element).setNodeValue(value);
		return (DomElement) element;

	}

	/** Setting some value to selector after getting it by name **/
	public HtmlSelect setValueToSelectByName(String name,
			String selectedOption, boolean isSelected, HtmlPage page,
			HtmlSelect selector) {

		selector = getSelectByName(name, page);
		selector.setSelectedAttribute(selectedOption, false);
		return selector;

	}

	/** Setting some value to button after getting it by id **/
	public HtmlButton setValuetoButtonById(String id, String value,
			HtmlPage page, HtmlButton button) {

		button = getButtonById(id, page);
		button.setDefaultValue(value);
		return button;

	}

	/** Setting some value to button after getting it by name **/
	public HtmlButton setValuetoButtonByName(String name, String value,
			HtmlPage page, HtmlButton button) {

		button = getButtonById(name, page);
		button.setDefaultValue(value);
		return button;

	}

	/** Setting some value to HtmlHiddenInput after getting it by id **/
	public HtmlHiddenInput setTextToHtmlHiddenInputById(String id,
			HtmlPage page, HtmlHiddenInput hiddenInput, String value) {

		hiddenInput = getHiddenInputById(id, page);
		hiddenInput.setValueAttribute(value);
		return hiddenInput;

	}

	/** Setting some value to HtmlHiddenInput after getting it by name **/
	public HtmlHiddenInput setTextToHtmlHiddenInputByName(String name,
			HtmlPage page, HtmlHiddenInput hiddenInput, String value) {

		hiddenInput = getHiddenInputByName(name, page);
		hiddenInput.setValueAttribute(value);
		return hiddenInput;
	}

	/** Setting some value to HtmlTextInput after getting it by id **/
	public HtmlTextInput setTextToHtmlInputById(String id, HtmlPage page,
			HtmlTextInput textInput, String value) {

		textInput = getTextInputById(id, page);
		textInput.setText(value);
		return textInput;

	}

	/** Setting some value to HtmlTextInput after getting it by name **/
	public HtmlTextInput setTextToHtmlInputByName(String name, HtmlPage page,
			HtmlTextInput textInput, String value) {

		textInput = getTextInputByName(name, page);
		textInput.setText(value);
		return textInput;

	}

	/** Setting some value to HtmlPasswordInput after getting it by id **/
	public HtmlPasswordInput setTextToHtmlPasswordInputById(String id,
			HtmlPage page, HtmlPasswordInput passwordInput, String value) {

		passwordInput = getPasswordInputById(id, page);
		passwordInput.setText(value);
		return passwordInput;

	}

	/** Setting some value to HtmlPasswordInput after getting it by name **/
	public HtmlPasswordInput setTextToHtmlPasswordInputByName(String name,
			HtmlPage page, HtmlPasswordInput passwordInput, String value) {

		passwordInput = getPasswordInputByName(name, page);
		passwordInput.setText(value);
		return passwordInput;
	}

	/** Setting some value to HtmlCheckBoxInput after getting it by id **/
	public HtmlCheckBoxInput setValuetoHtmlCheckBoxInputById(String id,
			String value, HtmlPage page, HtmlCheckBoxInput checkBox) {

		checkBox = getCheckBoxById(id, page);
		checkBox.setValueAttribute(value);
		return checkBox;

	}

	/** Setting some value to HtmlCheckBoxInput after getting it by name **/
	public HtmlCheckBoxInput setValuetoHtmlCheckBoxInputByName(String name,
			String value, HtmlPage page, HtmlCheckBoxInput checkBox) {

		checkBox = getCheckBoxById(name, page);
		checkBox.setValueAttribute(value);
		return checkBox;

	}

	/** Setting some value to HtmlRadioButtonInput after getting it by id **/
	public HtmlRadioButtonInput setValueHtmlRadioButtonById(String id,
			String value, HtmlPage page, HtmlRadioButtonInput radio) {

		radio = getRadioById(id, page);
		radio.setValueAttribute(value);
		return radio;

	}

	/** Setting some value to HtmlRadioButtonInput after getting it by name **/
	public HtmlRadioButtonInput setValueHtmlRadioButtonByName(String name,
			String value, HtmlPage page, HtmlRadioButtonInput radio) {

		radio = getRadioById(name, page);
		radio.setValueAttribute(value);
		return radio;

	}

	/**
	 * Setting some BOOLEAN value to HtmlRadioButtonInput after getting it by
	 * name
	 **/
	public HtmlRadioButtonInput setBoolValueHtmlRadioButtonByName(String name,
			boolean isChecked, HtmlPage page, HtmlRadioButtonInput radio) {

		radio = getRadioById(name, page);
		radio.setChecked(isChecked);
		return radio;

	}

	/**
	 * Setting some BOOLEAN value to HtmlRadioButtonInput after getting it by id
	 **/
	public HtmlRadioButtonInput setBoolValueHtmlRadioButtonById(String id,
			boolean isChecked, HtmlPage page, HtmlRadioButtonInput radio) {

		radio = getRadioById(id, page);
		radio.setChecked(isChecked);
		return radio;

	}

} // End of class PageElements
