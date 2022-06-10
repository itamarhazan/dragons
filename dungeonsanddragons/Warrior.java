package dungeonsanddragons;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Warrior extends Player {
	
	int ability_cooldown;
	int remaining_cooldown=0; 

	public Warrior(int _x, int _y, String _name,  int health, int _attack, int _defense,int ability) {
		super(_x, _y, _name, health, _attack, _defense);
		ability_cooldown=ability;
		// TODO Auto-generated constructor stub
	}
	public void levelUp() {
		super.levelUp();
		remaining_cooldown=0;
		health_pool+=(player_level*5);
		attack+=(player_level*2);
		defense+=(player_level*1);
	}
	public void playerTurn() {
		remaining_cooldown--;
	}
	public void specialAbility(ArrayList<Enemy> enemyList) {
		if(this.remaining_cooldown>0) {
			JOptionPane.showMessageDialog(null,"you can not use in special ability");}
		else{
		ArrayList<Enemy> closeEnemyList= new ArrayList<>();
		for(int i=0;i<enemyList.size();i++) {
			if(this.range(enemyList.get(i))<=3.0 && enemyList.get(i).live) {
				closeEnemyList.add(enemyList.get(i));
			}
		}
		int f= (int) ((Math.random()*closeEnemyList.size()-1)); 
		closeEnemyList.get(f).setHealth(this.health_pool/10);
		checkLive(enemyList.get(f));
		this.remaining_cooldown=this.ability_cooldown;
		this.health_amount=Math.min(this.health_amount+(10*this.defense), this.health_pool);
	}
	}
	public String describe() {
		String str = super.describe()
					+"remaining_cooldown="+this.remaining_cooldown;

	return str;
}

}


