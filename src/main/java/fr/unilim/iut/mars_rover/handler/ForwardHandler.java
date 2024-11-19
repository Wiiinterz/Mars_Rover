package fr.unilim.iut.mars_rover.handler;

import fr.unilim.iut.mars_rover.Move;
import fr.unilim.iut.mars_rover.Rover;

public class ForwardHandler extends DirectionHandler {
	
	public ForwardHandler(DirectionHandler nextHandler) {
		super(nextHandler);
	}
	
	@Override
	public void handle(String command) {
		char letter = command.charAt(0);
		Rover rover;
		Move move;
		
		if (letter='f') {
			rover.setState(N);
			move.moveInADirection(rover);
		}
	}

}
