package com.light.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;



/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class ParserJson {

	private static String url = "https://graph.facebook.com/111724015524891";

	/** Reading all symbols from string that getting from JSON **/
	private static String readAllBytes(Reader rd) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			stringBuilder.append((char) cp);
		}
		return stringBuilder.toString();
	}

	/** Read JSON object from url **/
	public JSONObject readJsonFromUrl() throws IOException, JSONException {
		InputStream inputStream = new URL(url).openStream();
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(inputStream, Charset.forName("UTF-8")));
			String jsonText = readAllBytes(bufferedReader);
			JSONObject jsonObject = new JSONObject(jsonText);
			return jsonObject;
		} finally {
			inputStream.close();
		}

	}
}
