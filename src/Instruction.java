
public class Instruction {
	private Etat Si;    //�tat de d�but
	private char lettre;
	private Etat Sj;	//�tat apr�s transition
	
	
	public Etat getSi() {
		return Si;
	}
	public void setSi(Etat si) {
		Si = si;
	}
	public char getLettre() {
		return lettre;
	}
	public void setLettre(char lettre) {
		this.lettre = lettre;
	}
	public Etat getSj() {
		return Sj;
	}
	public void setSj(Etat sj) {
		Sj = sj;
	}
	
	
	
	
}
