package it.telegram.server.impl;

import org.apache.log4j.Logger;

import it.telegram.server.Command;

public class DefaultCommandTask extends AbstractCommandTask {

	private static final Logger LOG = Logger.getLogger(DefaultCommandTask.class);

	public DefaultCommandTask(final Command command) {
		super(command);
	}

	public DefaultCommandTask(final Command command, final long delayInMillis) {
		super(command, delayInMillis);
	}

	@Override
	public void processCommand() {
		try {
			LOG.trace("\tSTART processing command {" + command + "}");
			Thread.sleep(delay);
			command.execute();
			LOG.trace("\tEND processing command {" + command + "}");
		} catch (InterruptedException e) {
			LOG.error(e);
		}
	}

	@Override
	public void notifyObserver() {
		setChanged();
		notifyObservers();
	}

}
