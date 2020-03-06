import java.util.ArrayList;


public class Automate {
	private String name;
	private ArrayList<char[]> alphabet = new ArrayList<char[]>();
	private ArrayList<Etat> listeEtats =new ArrayList<Etat>();
	private Etat initial;
	private ArrayList<Etat> finaux = new ArrayList<Etat>();
	private ArrayList<Instruction> instructions = new 	ArrayList<Instruction>();
	
	public void ConstruireAutomate(String name, ArrayList<char[]> alphabet, ArrayList<Etat> listeEtats, Etat initial, ArrayList<Etat> finaux, ArrayList<Instruction> instructions) {
		this.name=name;
		this.alphabet=alphabet;
		this.listeEtats=listeEtats;
		this.initial=initial;
		this.finaux=finaux;
		this.instructions=instructions;
	}
}
