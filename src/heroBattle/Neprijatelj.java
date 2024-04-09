package heroBattle;

public class Neprijatelj {
	
	private vrstaNeprijatelja vrsta;
	private String nazivNeprijatelja;
	private int nHp;
	protected double nDamage;
	
	public Neprijatelj( String nazivNeprijatelja, int nHp, double nDamage) {
		this.nazivNeprijatelja = nazivNeprijatelja;
		this.nHp = nHp;
		this.nDamage = nDamage;
		
	}

	public vrstaNeprijatelja getVrsta() {
		return vrsta;
	}

	public String getNazivNep() {
		return nazivNeprijatelja;
	}

	public int getNhp() {
		return nHp;
	}


	public double getNdamage() {
		return nDamage;
	}
	
	
	
	public void setVrsta(vrstaNeprijatelja vrsta) {
		this.vrsta = vrsta;
	}

	public void setNazivNep(String nazivNep) {
		this.nazivNeprijatelja = nazivNep;
	}

	public void setNhp(int nhp) {
		nHp = nhp;
	}

	public void setNdamage(double ndamage) {
		nDamage = ndamage;
	}

	public  vrstaNeprijatelja vrsta () {
		if (getNhp() == 750 && getNdamage() == 75) {
			return vrstaNeprijatelja.COMMON;
			
		} else if (getNhp() == 850 && getNdamage() == 85) {
			return vrstaNeprijatelja.EPIC;
		}else if (getNhp() == 950 && getNdamage() == 95) {
			return vrstaNeprijatelja.LEGENDERY;
		}else {
			return null;
		}
		
	}
		

	@Override
	public String toString() {
		return "Neprijatelj " + getNazivNep() + " Vrsta " + vrsta();
	}
	
	
	}
	

	

