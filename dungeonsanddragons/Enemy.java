package dungeonsanddragons;

public abstract class Enemy extends Unit{
	
	int experience_value;

	public Enemy(int _x, int _y, String _name, char rep, int health, int _attack, int _defense,int _experience_value) {
		super(_x, _y, _name, rep, health, _attack, _defense);
		experience_value=_experience_value;
		// TODO Auto-generated constructor stub
	}

	public void setHealth(int _y) {
		if(health_amount-y<0) {
			health_amount=0;
			live=false;
		}
		else
			health_amount-=_y;
		
		
	}
	public void enemyTurn() {

		
	}


}
