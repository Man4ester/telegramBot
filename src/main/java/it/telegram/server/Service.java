package it.telegram.server;

/**
 * This interface represents a class that will act as a server, allowing it to
 * be started or shut down.
 * 
 * @since 0.0.1
 */
public interface Service {

	/**
	 * This method starts up the service
	 */
	public void startUp();

	/**
	 * This method shuts down the service
	 */
	public void shutdown();

	/**
	 * This method indicates whether the service is up and running or down.
	 * 
	 * @return boolean <b>true</b> if service is stil running. <b>false</b> if
	 *         service is halted.
	 */
	public boolean isAlive();
}
