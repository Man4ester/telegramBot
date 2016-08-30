package it.telegram.client;

import it.telegram.exception.JsonParsingException;
import it.telegram.exception.TelegramServerException;
import it.telegram.request.TelegramRequest;
import it.telegram.response.json.TelegramResponse;

/**
*
* This class manages the requests to the Telegram Bot Api
*
* @since 0.0.1
*/
public interface RequestHandler {

	
	/**
	 * <p>sendRequest.</p>
	 *
	 * @param telegramRequest a {@link io.github.nixtabyte.telegram.jtelebot.request.TelegramRequest} object.
	 * @return a {@link io.github.nixtabyte.telegram.jtelebot.response.json.TelegramResponse} object.
	 * @throws JsonParsingException 
	 * @throws TelegramServerException 
	 */
	public TelegramResponse<?> sendRequest(final TelegramRequest telegramRequest) throws JsonParsingException, TelegramServerException;
	


}

