import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.ArrayList;

public class GameModel{
	///properties 
	ArrayList<String> projectiles = new ArrayList<String>();
	String[][] strMUInfo = new String[4][10]; // 10 is flex number we see later
	int[][] intMap = new int[360][360]; 

	///methods
	
	///constructor
	
	// Temporary hypothetical properties/methods of characters
	public class Character1{
		///properties
		int intID;
		int intX = 0; //temp
		int intY = 0; //temp
		int intHP;
		int intAttack;
		int intSpeedX = 0;
		int intSpeedY = 0;
		int intSizeX = 40;
		int intSizeY = 40;
		String strChar;
		ArrayList<Projectile1> projectiles = new ArrayList<Projectile1>();
		boolean blnShooting = false;
	
		///methods
		public void spawn(){
		}
		
		public void moveX(){
			this.intX += intSpeedX;
		}
		
		public void moveY(){
			this.intY += intSpeedY;
		}
		
		//speed calculations
		public void up(int intSpeedYIn){
			intSpeedY = -intSpeedYIn;
		}
		public void down(int intSpeedYIn){
			intSpeedY = intSpeedYIn;
		}
		public void right(int intSpeedXIn){
			intSpeedX = intSpeedXIn;
		}
		public void left(int intSpeedXIn){
			intSpeedX = -intSpeedXIn;
		}
		
		public void shoot(int intSpeedXn, int intSpeedYn, int intSize){
			projectiles.add(new Projectile1(intID, intX, intY, intX+200, intY+200, intSpeedXn, intSpeedYn, intSize, intAttack));
		}
		
		public void skill(){
		}
		
		public void collision(int intIDn, int intDamagen){
			if (intIDn != intID){
				intHP = intHP - intDamagen;
			}
		}

		public void shotAt(){
			
		}
		
		public void update(){
			for(int intCount = projectiles.size() -1; intCount > 0; intCount--){
				projectiles.get(intCount).move();
				if (projectiles.get(intCount).intMaxRangeX < intX){
					projectiles.remove((intCount));
				}else if (projectiles.get(intCount).intMaxRangeY < intY){
					projectiles.remove((intCount));
				}
			}
		}
		
		///constructor
		public Character1(int intID, int intX, int intY, int intHP, int intAttack, int intSpeedX, int intSpeedY, String strChar){
			this.intID = intID;
			this.intX = intX;
			this.intY = intY;
			this.intHP = intHP;
			this.intAttack = intAttack;
			this.intSpeedX = intSpeedX;
			this.intSpeedY = intSpeedY;
			this.strChar = strChar;
		}
	}	
	// Temporary hypothethical properties of terrain objects
	class Terrain1{
		/// properties
		int intX;
		int intY;
		int intHP;
		
		/// methods
		///constructor
	}
	
		// Temporary hypothethical properties of projectile objects
	class Projectile1{
		/// properties
		int intID;
		int intX;
		int intY;
		int intMaxRangeX;
		int intMaxRangeY;
		int intSpeedX;
		int intSpeedY;
		int intSize;
		int intDamage;
		
		/// methods
		
		public void collision(){
			
		}
		public void move(){
			intX += intSpeedX;
			intY += intSpeedY;
			System.out.println(1);
		}
		
		///constructor
		public Projectile1(int intID, int intX, int intY, int intMaxRangeX, int intMaxRangeY, int intSpeedX, int intSpeedY, int intSize, int intDamage){
			this.intID = intID;
			this.intX = intX;
			this.intY = intY;
			this.intMaxRangeX = intMaxRangeX;
			this.intMaxRangeY = intMaxRangeY;
			this.intSpeedX = intSpeedX;
			this.intSpeedY = intSpeedY;
			this.intSize = intSize;
			this.intDamage = intDamage;
			
			
		}
	}
	
}

