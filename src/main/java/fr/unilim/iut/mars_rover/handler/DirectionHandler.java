package fr.unilim.iut.mars_rover.handler;

import fr.unilim.iut.mars_rover.Rover;

public abstract class DirectionHandler {
	private DirectionHandler nextHandler;
	private String command;
	
	public DirectionHandler(DirectionHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public void handle(command);
		
	}
