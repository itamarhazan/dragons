package dungeonsanddragons;
public abstract class Unit {
	
	int x;
	int y;
	String name;
	char  representaion;
	int health_pool;
	int health_amount;
	int attack;
	int defense;
	boolean live=true;
	
	public Unit(int _x,int _y,String _name, char rep,int health,int _attack,int _defense ){
		x= _x;
		y=_y;
		name=_name;
		representaion=rep;
		health_pool=health;
		health_amount=health;
		attack=_attack;
		defense=_defense;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public void setX(int _x) {
		 x=_x;
	}
	public void setY(int _y) {
		 y=_y;
	}
	
	public double range(Unit b) {
	
		return Math.sqrt(Math.pow((this.getX()-b.getX()), 2)+Math.pow((this.getY()-b.getY()), 2));
		
	}
	public int moveLeft() {
			return x-1;
	}
	public int moveRight() {
		return x+1;
	}
	public int moveUp() {
		return y-1;
	}
	public int moveDown() {
		return y+1;
	}
	public void move() {
		
	}
	public void attack() {
		
	}
	public void setHealth(int _y) {
	}
		
	public String toString() {
		
		String str=(representaion+"");
		return str;
	} 
	public String getName() {
		String str=(name);
		return str;
	}
	public String describe() {
		String str ="health_pool="+this.health_pool+"\r\n"
				+"health_amount="+this.health_amount+"\r\n"
				+"attack="+this.attack+"\r\n"
				+"defense="+this.defense;
		return str;
	}

}
