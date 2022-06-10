package dungeonsanddragons;

//import java.awt.Color;
import java.util.ArrayList;
//import java.util.List;

public class Level1 {
	 public static final int row= 19;
	 public static final int col=40;
	 public static final Object [][] boardlevel1 =new Object[row][col];
	 public static final Trap t1=new Trap(10, 1,'B',"bonus_trap", 1, 1, 1, 250,1,5);
	 public static final Trap t2=new Trap(10, 17,'B',"bonus_trap", 1, 1, 1, 250,1,5);
	 public static final Monster m1=new Monster(5, 1,"lannister_solider", 's', 80, 8, 3,25,3);
	 public static final Monster m2=new Monster(5, 17,"lannister_solider", 's', 80, 8, 3,25,3);
	 public static final Monster m3=new Monster(10, 8,"lannister_solider", 's', 80, 8, 3,25,3);
	 public static final Monster m4=new Monster(10, 10,"lannister_solider", 's', 80, 8, 3,25,3);
	 public static final Monster m5=new Monster(15, 6,"lannister_solider", 's', 80, 8, 3,25,3);
	 public static final Monster m6=new Monster(15, 12,"lannister_solider", 's', 80, 8, 3,25,3);
	 public static final Monster m7=new Monster(25, 6,"lannister_knight", 'k', 100, 14, 8,50,4);
	 public static final Monster m8=new Monster(25, 12,"lannister_knight", 'k', 100, 14, 8,50,4);
	 public static final Monster m9=new Monster(30, 8,"lannister_knight", 'k', 100, 14, 8,50,4);
	 public static final Monster m10=new Monster(30, 10,"lannister_knight", 'k', 100, 14, 8,50,4);
	 public static final Monster m11=new Monster(38, 9,"the_mountain", 'M', 1000, 60, 25,500,6);
	 
	 
	public static void buildboard(Player p) {
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<col-1;j++) {
				boardlevel1[i][j]=new Empty();
			}
		}
		for(int i=0;i<col;i++) {
				boardlevel1[0][i]=new Wall();
				boardlevel1[row-1][i]=new Wall();
			}
		for(int j=0;j<row;j++) {
			boardlevel1[j][0]=new Wall();
			boardlevel1[j][col-1]=new Wall();
		}
		boardlevel1[t1.y][t1.x]=t1;
		boardlevel1[t1.y][t1.x-1]=new Wall();
		boardlevel1[t1.y+1][t1.x-1]=new Wall();
		boardlevel1[t1.y][t1.x+1]=new Wall();
		boardlevel1[t1.y+1][t1.x+1]=new Wall();
		boardlevel1[t1.y+1][t1.x]=new Wall();
		boardlevel1[t2.y][t2.x]=t2;
		boardlevel1[t2.y][t2.x-1]=new Wall();
		boardlevel1[t2.y-1][t2.x+1]=new Wall();
		boardlevel1[t2.y-1][t2.x]=new Wall();
		boardlevel1[t2.y][t2.x+1]=new Wall();
		boardlevel1[t2.y-1][t2.x-1]=new Wall();
		boardlevel1[m1.y][m1.x]=m1;
		boardlevel1[m2.y][m2.x]=m2;
		boardlevel1[m3.y][m3.x]=m3;
		boardlevel1[m4.y][m4.x]=m4;
		boardlevel1[p.y][p.x]=p;
		for(int j=m3.y-2;j<m4.y+3;j++) {
			if(j==m3.y+1)
				boardlevel1[j][m4.x-1]=new Empty();
			else
				boardlevel1[j][m4.x-1]=new Wall();
		}
		boardlevel1[m5.y][m5.x]=m1;
		boardlevel1[m6.y][m6.x]=m6;
		for(int j=m5.y-2;j<m6.y+3;j++) {
			if(j<m6.y-1&&j>m5.y+1)
				boardlevel1[j][m6.x-1]=new Empty();
			else
				boardlevel1[j][m6.x-1]=new Wall();
		}
		boardlevel1[m7.y][m7.x]=m7;
		boardlevel1[m8.y][m8.x]=m8;
		for(int j=m7.y-2;j<m8.y+3;j++) {
			if(j<m8.y-1&&j>m7.y+1 )
				boardlevel1[j][m7.x-1]=new Empty();
			else
				boardlevel1[j][m7.x-1]=new Wall();
		}
		boardlevel1[m9.y][m9.x]=m9;
		boardlevel1[m10.y][m10.x]=m10;
		for(int j=m9.y-2;j<m10.y+3;j++) {
			if(j==m9.y+1)
				boardlevel1[j][m9.x-1]=new Empty();
			else
				boardlevel1[j][m9.x-1]=new Wall();
		}
		boardlevel1[m11.y][m11.x]=m11;
		
	}
	public ArrayList<Enemy> enemyList(){
		ArrayList<Enemy> e = new ArrayList<>();
		e.add(t1);
		e.add(t2);
		e.add(m1);
		e.add(m2);
		e.add(m3);
		e.add(m4);
		e.add(m5);
		e.add(m6);
		e.add(m7);
		e.add(m8);
		e.add(m9);
		e.add(m10);
		e.add(m11);
		return e;
	}
	public static void print() {
		for(int i=0;i<boardlevel1.length;i++) {
			for(int j=0;j<boardlevel1[i].length;j++) {
				System.out.print(boardlevel1[i][j].toString());;
			}
			System.out.println();
		}
	}
	 public static void main(String[] args) {
		 //buildboard();
		 print();
	    }
	
	}


