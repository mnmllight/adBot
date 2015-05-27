package com.light.pack;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.DefaultCredentialsProvider;
import com.gargoylesoftware.htmlunit.WebClient;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class ProxyServerClass {

	/**
	 * Creation proxy connection to internet via static NAT or PAT or external
	 * IP-address. Using proxy server's IP address, username and password. That
	 * class is a alternative to class WebClienClass().
	 **/

	public WebClient ProxyWebClient(BrowserVersion browser, String proxyIp,
			int proxyPort, String login, String password) {

		final WebClient webClient = new WebClient(browser, proxyIp, proxyPort);

		final DefaultCredentialsProvider credentialsProvider = (DefaultCredentialsProvider) webClient
				.getCredentialsProvider();
		credentialsProvider.addCredentials(login, password);
		return null;

	} // End ProxyWebClient()
}
