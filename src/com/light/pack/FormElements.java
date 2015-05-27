package com.light.pack;

import java.util.List;

import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlRadioButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlTextArea;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class FormElements {
	/**
	 * Getting elements from page
	 * 
	 * @return
	 **/

	/**
	 * Getting single button from the form. Returns the first HtmlButton element
	 * in this form that has the specified name.
	 **/

	// GETTERS
	public HtmlButton getButtonByName(String name, HtmlForm form) {

		HtmlButton formButton = form.getButtonByName(name);
		return formButton;
	}

	/**
	 * Getting list of buttons of the form. Returns all the HtmlButton elements
	 * in this form that have the specified name.
	 **/
	public List<HtmlButton> getButtonsByName(String name, HtmlForm form) {

		List<HtmlButton> formButtonsList = form.getButtonsByName(name);
		return formButtonsList;

	}

	/**
	 * Getting single input by name. Returns the first input element which is a
	 * member of this form and has the specified name.
	 **/
	public HtmlTextInput getInputByName(String name, HtmlForm form) {

		HtmlTextInput formInput = form.getInputByName(name);
		return formInput;
	}

	/**
	 * Getting single input by value. Returns the first input in this form with
	 * the specified value.
	 **/
	public HtmlTextInput getInputByValue(String value, HtmlForm form) {

		HtmlTextInput formInput = form.getInputByValue(value);
		return formInput;
	}

	/**
	 * Getting all inputs from form. Returns all input elements which are
	 * members of this form and have the specified name.
	 **/
	public List<HtmlInput> getInputsByName(String name, HtmlForm form) {

		List<HtmlInput> formInputsList = form.getInputsByName(name);
		return formInputsList;

	}

	/**
	 * Getting all inputs from form. Returns all the inputs in this form with
	 * the specified value
	 **/
	public List<HtmlInput> getInputsByValue(String value, HtmlForm form) {

		List<HtmlInput> formInputsList = form.getInputsByName(value);
		return formInputsList;

	}

	/**
	 * Getting select from form by name. Returns the first HtmlSelect element in
	 * this form that has the specified name.
	 **/
	public HtmlSelect getSelectByName(String name, HtmlForm form) {

		HtmlSelect formSelect = form.getSelectByName(name);
		return formSelect;
	}

	/**
	 * Getting all selects from form. Returns all the HtmlSelect elements in
	 * this form that have the specified name.
	 **/
	public List<HtmlSelect> getSelectsByName(String name, HtmlForm form) {

		List<HtmlSelect> formSelectsList = form.getSelectsByName(name);
		return formSelectsList;
	}

	/**
	 * Getting form text area. Returns the first HtmlTextArea element in this
	 * form that has the specified name.
	 **/
	public HtmlTextArea getTextAreaByName(String name, HtmlForm form) {

		HtmlTextArea formTextArea = form.getTextAreaByName(name);
		return formTextArea;
	}

	/**
	 * Getting text areas from form. Returns all the HtmlTextArea elements in
	 * this form that have the specified name.
	 **/
	public List<HtmlTextArea> getTextAreasByName(String name, HtmlForm form) {

		List<HtmlTextArea> formTextAreaList = form.getTextAreasByName(name);
		return formTextAreaList;
	}

	/** Getting all radio buttons from the form by the name **/
	public List<HtmlRadioButtonInput> getRadioButtonsByName(String name,
			HtmlForm form) {

		List<HtmlRadioButtonInput> radioForm = form.getRadioButtonsByName(name);
		return radioForm;

	}

	/** Getting submit input from form **/

	// SETTERS
	/* Settings parameter to the elements of form (names, values and other) */

	/** Setting new value to the button. **/
	public HtmlButton setButtonValue(String value, HtmlForm form, String name) {

		HtmlButton formButton = getButtonByName(name, form);
		formButton.setValueAttribute(value);
		return formButton;
	}

	/** Setting value to the form input text view **/
	public HtmlTextInput setInputValue(String name, String value,
			HtmlForm form, HtmlTextInput formInput) {

		formInput = getInputByName(name, form);
		formInput.setText(value);
		return formInput;
	}

	/** Setting value to the form select **/
	public HtmlSelect setSelectValue(String name, String value, HtmlForm form,
			HtmlSelect formSelect, boolean isSelected) {

		formSelect = getSelectByName(name, form);
		formSelect.setSelectedAttribute(value, isSelected);
		return formSelect;
	}

}
