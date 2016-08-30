package it.bismark;

import it.telegram.client.RequestHandler;
import it.telegram.exception.JsonParsingException;
import it.telegram.exception.TelegramServerException;
import it.telegram.request.TelegramRequest;
import it.telegram.request.factory.TelegramRequestFactory;
import it.telegram.response.json.Message;
import it.telegram.server.impl.AbstractCommand;

public class HelloWorldCommand extends AbstractCommand {

	public HelloWorldCommand(Message message, RequestHandler requestHandler) {
		super(message, requestHandler);
	}

	@Override
	public void execute() {
		try {
			TelegramRequest telegramRequest = TelegramRequestFactory.createSendMessageRequest(message.getChat().getId(),
					"Hello World Andrew! ", true, message.getId(), null);
			requestHandler.sendRequest(telegramRequest);
		} catch (JsonParsingException | TelegramServerException e) {
			e.printStackTrace();
		}
	}
}