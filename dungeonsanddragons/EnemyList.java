package dungeonsanddragons;

import java.util.ArrayList;

public class EnemyList { 
	
	private final ArrayList<Enemy> enemyList= new ArrayList<>();
	
	public void add(Enemy enemy) {
		enemyList.add(enemy);
	}
	public void remove(Enemy enemy) {
		enemyList.remove(enemy);
	}
	public Enemy get(int i) {
		return enemyList.get(i);
	}
	public int size() {
		return enemyList.size();
	}
	public boolean enemiesDead(ArrayList<Enemy> enemyList){
		int countdead=0;
		for(int i=0;i<enemyList.size();i++) {
			if(!enemyList.get(i).live)
				countdead++;
		}
		if(countdead+1==enemyList.size())
			return true;
		else
		return false;
	}
}
