package it.bismark;

import org.apache.log4j.Logger;

import it.telegram.client.RequestHandler;
import it.telegram.response.json.Message;
import it.telegram.server.Command;
import it.telegram.server.CommandFactory;

public class HelloWorldCommandFactory implements CommandFactory {

	private static final Logger LOG = Logger.getLogger(HelloWorldCommandFactory.class);

	@Override
	public Command createCommand(Message message, RequestHandler requestHandler) {
		LOG.info("MESSAGE: " + message.getText());
		return new HelloWorldCommand(message, requestHandler);
	}
}