package it.telegram.server;

/**
 * This interface represents an isolated task action that shall be able to
 * handle the execution of an individual {@link Command} object. Its
 * implementation could be done by means of a single Thread that could be part
 * of a ThreadPool or ThreadExecutor.
 * 
 * @see Command
 * @since 0.0.1
 */
public interface CommandTask {

	/**
	 * Method used to perform the individual {@link Command} execution.
	 */
	public void processCommand();

}
