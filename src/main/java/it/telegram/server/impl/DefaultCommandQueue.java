package it.telegram.server.impl;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.log4j.Logger;

import it.telegram.server.Command;
import it.telegram.server.CommandQueue;

public class DefaultCommandQueue implements CommandQueue {

	private static final Logger LOG = Logger.getLogger(DefaultCommandQueue.class);

	private Queue<Command> commandQueue;

	public DefaultCommandQueue() {
		commandQueue = new ConcurrentLinkedQueue<Command>();
	}

	@Override
	public void add(Command command) {
		commandQueue.add(command);
	}

	@Override
	public Command poll() {
		return commandQueue.poll();
	}

	@Override
	public boolean isEmpty() {
		return commandQueue.isEmpty();
	}

	@Override
	public int size() {
		return commandQueue.size();
	}

	@Override
	public boolean contains(Command command) {
		return commandQueue.contains(command);
	}

	@Override
	public String toString() {
		return commandQueue.toString();
	}

}
