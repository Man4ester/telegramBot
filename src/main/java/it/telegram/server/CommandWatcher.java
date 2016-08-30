package it.telegram.server;


/**
 * This interface represents a listener component that sends polling requests to
 * the Telegram Bot API service in order to fetch new {@link Updates} for the
 * corresponding Bot. Every {@link Update} object contains a {@link Message}
 * instance that is encapsulated into a {@link Command} object. </br></br> For
 * this reason the CommandWatcher is responsible for retrieving all available
 * Telegram User commands to manipulate the corresponding Bot.
 * 
 * */

/**
 * This interface represents a listener component that sends polling requests to
 * the Telegram Bot API service in order to fetch new {@link Updates} for the
 * corresponding Bot. Every {@link Update} object contains a {@link Message}
 * instance that is encapsulated into a {@link Command} object. </br></br> For
 * this reason the CommandWatcher is responsible for retrieving all available
 * Telegram User commands to manipulate the corresponding Bot.
 * 
 * */
public interface CommandWatcher {

	/**
	 * This method is used to perform the Telegram polling service in order to
	 * retrieve all available commands for the Bot manipulation.
	 * */
	public void retrieveCommands();

}

