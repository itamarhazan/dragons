package dungeonsanddragons;

import java.util.ArrayList;

public abstract class Player extends Unit {
	int experience =0;
	int player_level=1;
	
	public Player(int _x, int _y, String _name, int health, int _attack, int _defense) {
		super(_x, _y, _name, '@', health, _attack, _defense);

	}
	public void setExperience(int num) {
		experience=+num;
	
	}
	public void levelUp() {
		player_level++;
		health_pool=health_pool+(player_level*10);
		health_amount=health_pool;
		attack+=(player_level*4);
		defense+=(player_level*1);
	}
	public void setHealth(int _y) {
		if(health_amount-y<0) {
			health_amount=0;
			live=false;
			this.representaion='X';
		}
		else
			health_amount-=_y;
		
		
	}
	public void checkLive(Enemy e) {
		if(!e.live) {
			int levelupnow=e.experience_value/50;
			this.experience+=e.experience_value;
			for(int i=0;i<levelupnow;i++)
				this.levelUp();
		}
		
	}
	public void attack(ArrayList<Enemy> enemyList) {
		for(int i=0;i<enemyList.size();i++) {
			if(this.range(enemyList.get(i))==0.0 && enemyList.get(i).live) {
				int attackplayer=(int) ((Math.random()*this.attack));
				int enemydefense=(int) ((Math.random()*enemyList.get(i).defense));
				if(attackplayer>enemydefense) {
					enemyList.get(i).setHealth(attackplayer-enemydefense);
					checkLive(enemyList.get(i));
				}
			}
		}
	}


	public void playerTurn() {

		
	}
	public void specialAbility() {
		
	}
	public String describe() {
			String str = super.describe()
						+"experience="+this.experience+"\r\n"
						+"level="+this.player_level;

		return str;
	}

}
