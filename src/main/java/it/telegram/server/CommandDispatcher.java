package it.telegram.server;


/**
 * This interface represents a listener component that shall be able to execute
 * or dispatch {@link Command} instances stored in an internal queue. These
 * commands are the instructions given by the Telegram User to the corresponding
 * Bot implementation.
 * 
 * @see Command
 * @since 0.0.1
 * */
public interface CommandDispatcher {

	/**
	 * Method to allow adding a {@link Command} object to the internal queue.
	 * 
	 * @param command
	 *            Is the {@link Command} instance to be enqueued.
	 * 
	 * */
	public void enqueueCommand(Command command);

	/**
	 * Method used to indicate this CommandDispatcher to execute every
	 * {@link Command} stored in the internal queue.
	 * */
	public void dispatchCommands();
}

