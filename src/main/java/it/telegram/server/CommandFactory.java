package it.telegram.server;

import it.telegram.client.RequestHandler;
import it.telegram.response.json.Message;

/**
 * This interface represents the centralized Factory class that would serve to
 * create new {@link Command} instances when needed.
 * 
 * @see Command
 * @since 0.0.1
 * */
public interface CommandFactory {

	/**
	 * Method that creates a new Command instance.
	 * 
	 * @param message
	 *            Is the message polled from Telegram Bot API service which has
	 *            been already translated from JSON to POJO. It could be used
	 *            internally by the {@link Command} implementation.
	 * @param requestHandler
	 *            Is the component used for sending further HTTP requests to the
	 *            Telegram Bot API service.
	 * @return The new {@link Command} instance containing the Message and
	 *         RequestHandler reference inside.
	 * */
	public Command createCommand(Message message, RequestHandler requestHandler);
}
