package dungeonsanddragons;

//import java.util.ArrayList;

public class Trap extends Enemy {
	int visibilty_time;
	int invisibilty_time;
	int ticks_count=0;
	boolean visible=true;
	char cansee;

	public Trap(int _x, int _y,char rep, String _name ,int health, int _attack, int _defense, int _experience_value,int _visibilty_time,int _invisibilty_time) {
		super(_x, _y, _name,rep, health, _attack, _defense, _experience_value);
		visibilty_time=_visibilty_time;
		invisibilty_time=_invisibilty_time;
		cansee=rep;
		// TODO Auto-generated constructor stub
	}
	public void move() {
		
	}
	public void visibletrap() {
		if(visible)
			this.cansee=this.representaion;
		else
			this.cansee=' ';
	}
	public void attack(Player p) {

			if(this.range(p)<2.0 && p.live) {
				int attackplayer=(int) ((Math.random()*this.attack));
				int enemydefense=(int) ((Math.random()*p.defense));
				if(attackplayer>enemydefense) {
					p.setHealth(attackplayer-enemydefense);
				}
			}
		}
	
	public void enemyTurn() {
		if(ticks_count<visibilty_time)
			visible=true;
		if(ticks_count>visibilty_time && ticks_count<visibilty_time+invisibilty_time)
			visible=false;
		if(ticks_count==visibilty_time+invisibilty_time)
			ticks_count=0;
		else
			ticks_count++;
		//this.attack();
		
	}

}
