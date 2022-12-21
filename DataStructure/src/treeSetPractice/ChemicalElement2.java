package treeSetPractice;

public class ChemicalElement2 implements Comparable <ChemicalElement2> {
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	public ChemicalElement2(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String toString() {
		return "ChemicalElement2 [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}

	@Override
	public int compareTo(ChemicalElement2 o) {
		System.out.println("Cmparing "+atomicNumber+" with "+o.atomicNumber);
		return 0;
	}
	

}
