package it.bismark;

import it.telegram.server.impl.DefaultCommandDispatcher;
import it.telegram.server.impl.DefaultCommandQueue;
import it.telegram.server.impl.DefaultCommandWatcher;

public class Main {

	public static void main(String[] args) {
		DefaultCommandDispatcher commandDispatcher = new DefaultCommandDispatcher(10, 100, new DefaultCommandQueue());
		commandDispatcher.startUp();

		DefaultCommandWatcher commandWatcher = new DefaultCommandWatcher(2000, 100,
				"213861884:AAECGoUnGN5aLOBIS6iDbLb0KU-J5-CEu6I", commandDispatcher, new HelloWorldCommandFactory());
		commandWatcher.startUp();
	}
}
