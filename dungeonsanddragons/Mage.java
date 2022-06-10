package dungeonsanddragons;

import java.util.ArrayList;


import javax.swing.JOptionPane;

public class Mage extends Player{
	
	int mana_pool;
	int mana_currnet;
	int mana_cost;
	int spell_power;
	int hits_count;
	int ability_range;

	public Mage(int _x, int _y, String _name, int health, int _attack, int _defense,int _mana_pool,int _mana_cost,int _spell_power,int _hits_count,int _ability_range) {
		super(_x, _y, _name, health, _attack, _defense);
		mana_pool=_mana_pool;
		mana_currnet=mana_pool/4;
		mana_cost=_mana_cost;
		spell_power=_spell_power;
		hits_count=_hits_count;
		ability_range=_ability_range;
		// TODO Auto-generated constructor stub
	}
	public void levelUp() {
		super.levelUp();
		mana_pool+=(25*player_level);
		mana_currnet+=Math.min((mana_currnet+(mana_pool/4)),mana_pool);
		spell_power+=(player_level*10);
		
	}
	public void playerTurn() {
		Math.min(mana_pool, mana_currnet+(1*player_level));
	}
	public void specialAbility(ArrayList<Enemy> enemyList) {
		if(this.mana_currnet<this.mana_cost)
			JOptionPane.showMessageDialog(null,"you can not use in special ability");
		else {
			ArrayList<Enemy> closeEnemyList= new ArrayList<>();
			for(int i=0;i<enemyList.size();i++) {
				if(this.range(enemyList.get(i))<=2.0&&enemyList.get(i).live) {
					closeEnemyList.add(enemyList.get(i));
				}
			}
			this.mana_currnet=-this.mana_cost;
			int hits=0;
			while(hits<this.hits_count) {
				int f= (int) ((Math.random()*closeEnemyList.size()-1)); 
				int enemydefense=(int) ((Math.random()*closeEnemyList.get(f).defense));
				if(this.spell_power>enemydefense) {
					closeEnemyList.get(f).setHealth(this.spell_power-enemydefense);
					checkLive(enemyList.get(f));
					if(!enemyList.get(f).live)
						enemyList.remove(enemyList.get(f));
				}
				hits++;
		}
			
		}
		
		
	}
	public String describe() {
		String str = super.describe()
					+"mana_currnet="+this.mana_currnet+"\r\n"
					+"mana_cost="+this.mana_cost+"\r\n"
					+"spell_power="+this.spell_power+"\r\n"
					+"ability_range;="+this.ability_range;
	return str;
}

	}
