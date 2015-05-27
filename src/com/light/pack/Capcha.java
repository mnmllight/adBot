package com.light.pack;

import j.antigate.CapchaBypass;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class Capcha {

	/** Getting capcha, sent it to server and getting response in "STRING" **/

	String capchaAnswer;

	public String workWithCapcha(String url, String idCapcha) {

		try {

			URL antiGate = new URL(url);
			URLConnection connection = antiGate.openConnection();
			InputStream is = connection.getInputStream();

			/**
			 * Use CapchaAnswer() method to get the capcha text, returns error
			 * message if any
			 **/
			capchaAnswer = CapchaBypass.CapchaAnswer(is, idCapcha, null, null,
					null);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();

		}

		return capchaAnswer;

	} // End of workWithCapcha()

} // End of class Capcha
