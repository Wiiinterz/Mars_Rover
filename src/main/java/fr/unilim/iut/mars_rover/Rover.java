package fr.unilim.iut.mars_rover;

import fr.unilim.iut.mars_rover.handler.DirectionHandler;

public class Rover {
	private DirectionHandler handlerChain;
	private int x;
	private int y;
	private Direction direction;
	
	public Rover(int x, int y) {
		this.x=x;
		this.y=y;
		handlerChain = new ForwardHandler();
        DirectionHandler leftHandler = new LeftHandler();
        DirectionHandler backwardHandler = new BackwardHandler();
        DirectionHandler rightHandler = new RightHandler();

        handlerChain.setNext(leftHandler);
        leftHandler.setNext(backwardHandler);
        backwardHandler.setNext(rightHandler);
	}

	@Override
	public String toString() {
		return "The Rover is in "+ x + " , " + y + ".";
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
