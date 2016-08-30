package it.telegram.client;


import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
/**
*
* An http client factory
*
* @since 0.0.1
*/
public final class HttpClientFactory {

	private HttpClientFactory() {
	}

	/**
	 * <p>createHttpClient.</p>
	 *
	 * @return a {@link org.apache.http.client.HttpClient} object.
	 */
	public static HttpClient createHttpClient() {
		return HttpClientBuilder.create().build();
	}

}
