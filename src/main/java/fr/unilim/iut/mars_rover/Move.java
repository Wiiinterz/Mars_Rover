package fr.unilim.iut.mars_rover;

public class Move {
	private Rover rover;
	
	public Move(Rover rover) {
		this.rover=rover;
	}
	
	public void moveInADirection (Rover rover) {
		if (rover.getDirection()==Direction.N) {
			rover.setY(rover.getY()+1);
		}
		else if (rover.getDirection()==Direction.S) {
			rover.setY(rover.getY()-1);
		}
		else if (rover.getDirection()==Direction.W) {
			rover.setX(rover.getX()-1);
		}
		else {
			rover.setX(rover.getX()+1);
		}
	}
}
