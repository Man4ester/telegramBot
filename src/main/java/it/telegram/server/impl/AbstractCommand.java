package it.telegram.server.impl;

import it.telegram.client.RequestHandler;
import it.telegram.response.json.Message;
import it.telegram.server.Command;

/**
 * Abstract implementation of {@link Command} in order to contain a
 * {@link Message} and {@link RequestHandler} for further manipulation of the
 * Bot.
 * 
 * @see Command
 * @see Message
 * @see RequestHandler
 * @since 0.0.1
 * */
public abstract class AbstractCommand implements Command {

	protected Message message;
	protected RequestHandler requestHandler;

	public AbstractCommand(final Message message,
			final RequestHandler requestHandler) {
		this.message = message;
		this.requestHandler = requestHandler;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public RequestHandler getRequestHandler() {
		return requestHandler;
	}

	public void setRequestHandler(RequestHandler requestHandler) {
		this.requestHandler = requestHandler;
	}

	@Override
	public abstract void execute();

}
