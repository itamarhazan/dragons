package dungeonsanddragons;

public class Monster extends Enemy{
	int vision;

	public Monster(int _x, int _y, String _name, char rep, int health, int _attack, int _defense,int _experience_value,int _vision) {
		super(_x, _y, _name, rep, health, _attack, _defense, _experience_value);
		vision=_vision;
		// TODO Auto-generated constructor stub
	}

}
