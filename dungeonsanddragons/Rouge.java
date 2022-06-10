package dungeonsanddragons;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Rouge extends Player{
	
	int cost;
	int currnet_energy=100;
	

	public Rouge(int _x, int _y, String _name, int health, int _attack, int _defense,int _cost) {
		super(_x, _y, _name, health, _attack, _defense);
		cost=_cost;
		
		// TODO Auto-generated constructor stub
	}
	public void levelUp() {
		super.levelUp();
		currnet_energy=100;
		attack+=(3*player_level);
		
	}
	public void playerTurn() {
		currnet_energy=Math.min(currnet_energy+10, 100);
		
	}
	public void specialAbility(ArrayList<Enemy> enemyList) {
		
		if(this.currnet_energy<cost) {
			JOptionPane.showMessageDialog(null,"you can not use in special ability");
			}
		else{
		ArrayList<Enemy> closeEnemyList= new ArrayList<>();
		for(int i=0;i<enemyList.size();i++) {
			if(this.range(enemyList.get(i))<=2.0 && enemyList.get(i).live) {
				closeEnemyList.add(enemyList.get(i));
			}
		}
		for(int i=0;i<closeEnemyList.size();i++) {
			int enemydefense=(int) ((Math.random()*closeEnemyList.get(i).defense));
			if(this.attack>enemydefense) {
				closeEnemyList.get(i).setHealth(this.attack-enemydefense);
				checkLive(enemyList.get(i));
				if(!enemyList.get(i).live)
					enemyList.remove(enemyList.get(i));
			}
		}
		
		}
	}
	public String describe() {
		String str = super.describe()
					+"currnet_energy="+this.currnet_energy+"\r\n"
					+"cost="+this.cost;
	return str;
}
}
