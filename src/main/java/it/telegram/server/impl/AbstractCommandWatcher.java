package it.telegram.server.impl;

import org.apache.log4j.Logger;

import it.telegram.server.CommandWatcher;
import it.telegram.server.Service;

/**
 * Abstract polling implementation of {@link CommandWatcher}, {@link Service}
 * and {@link Runnable} which uses a runnable thread with a service pattern
 * behavior (start|stop) in order to retrieve commands periodically from the
 * Telegram service (Those commands are supposed to be originated by a User).
 * 
 * @see Command
 * @see CommandWatcher
 * @see Service
 * @see Runnable
 * @since 0.0.1
 * */
public abstract class AbstractCommandWatcher implements CommandWatcher,
		Service, Runnable {

	private static final Logger LOG = Logger
			.getLogger(AbstractCommandWatcher.class);

	protected boolean alive;
	protected long delay;

	private Thread thread;

	public AbstractCommandWatcher() {
		this(0);
	}

	public AbstractCommandWatcher(final long delayInMillis) {
		this.delay = delayInMillis;
	}

	@Override
	public void startUp() {
		LOG.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		LOG.info(">> Starting up command watcher...");
		LOG.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		alive = true;

		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void shutdown() {
		LOG.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		LOG.info("<< Shutting down command watcher...");
		LOG.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		alive = false;
	}

	@Override
	public boolean isAlive() {
		LOG.debug("Command watcher " + (alive ? "is" : "is not") + " alive...");
		return alive;
	}

	@Override
	public void run() {
		while (alive) {
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				LOG.error(e);
			}
			retrieveCommands();
		}

		thread = null;
	}

	@Override
	public abstract void retrieveCommands();

}
