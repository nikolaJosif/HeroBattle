package heroBattle;
import java.util.Random;

public class Heroj {

	private String ime;
	private VrstaMoci moc;
	private int hp = 800;
	private int lvl = 1;
	double damage;
	
	public Heroj (VrstaMoci moc, int hp, double damage, int lvl) {
		this.moc = moc;
		this.hp = hp;
		this.damage = damage;
		this.lvl = lvl;
		
	}
	
	public int getLvl() {
		return lvl;
	}
	
	public String getIme() {
		return ime;
	}
	public VrstaMoci getVrstaMoci() {
		return moc;
	}
	
	public int getHp() {
		return hp;
	}
	public double getDamage() {
		return damage;
	}
	
	
	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setMoc(VrstaMoci moc) {
		this.moc = moc;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public int getMaxHp() {
		return hp;
	}
	
	
	public void battle(Heroj h, Neprijatelj n) {
	    while (h.getHp() > 0 && n.getNhp() > 0) {
	        n.setNhp((int) (n.getNhp() - h.getDamage()));
	        h.setHp((int) (h.getHp() - n.getNdamage()));

	        
	        if (h.getHp() <= 0) {
	            System.out.println("Game Over!");
	            break;
	        }

	        if (n.getNhp() <= 0) {
	            h.setLvl(h.getLvl() + 1);
	            double novaSteta = h.getDamage() * 0.15;
	            h.setDamage(h.getDamage() + novaSteta);
	            int novoZdravlje = (int) (h.getHp() * 0.15);
	            h.setHp(h.getHp() + novoZdravlje);

	            
	            if (h.getHp() <= h.getHp() * 0.3) {
	                System.out.println("You've reached 30% of your health! Spin the wheel of fortune?");
	                h.spinWheelOfFortune();
	            }
	            break;
	        }
	    }
	}

	 public void spinWheelOfFortune() {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100);

	        if (randomNumber < 30) {
	            setHp(getMaxHp());
	            System.out.println("You've won! Your health has been fully restored!");
	        } else if (randomNumber < 60) {
	            int restoredHealth = getMaxHp() / 2;
	            setHp(getHp() + restoredHealth);
	            System.out.println("You've won! Your health has been partially restored!");
	        } else {
	            
	            System.out.println("You've won! You've received a shield!");
	        }
	    }
	

	@Override
	public String toString() {
		return "\nHero: " + "\n" +  "Name: " + getIme() + "\n" 
	+ "Level: " + getLvl() + "\n" + "Health: " + getHp() + "\n" + "Damage " + getDamage()
	+ "\n-----------------------------------------------------------------------------------";
	}
	
}
