
public class Adapter implements IUnit{

	private LegacyUnit l = new LegacyUnit();
	private String name;
	
	public Adapter(String name) {
		this.name = name;
	}
	
	@Override
	public void move() {
		l.walk();
	}

	@Override
	public int getX() {
		return l.getPositionX();
	}

	@Override
	public int getY() {
		return l.getPositionY();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return 99;
	}

	@Override
	public boolean dead() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
