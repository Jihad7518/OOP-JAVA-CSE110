package Lab04;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public Fraction() {
		
	}
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}
	
	public void add(Fraction f) {
		int numerators = this.getNumerator() * f.getDenominator() + this.getDenominator() * f.getNumerator();
		int denominators = this.getDenominator() * f.getDenominator();
		
		this.setNumerator(numerators);
		this.setDenominator(denominators);
		
	}
	
	public void sub(Fraction f) {
		int numerators = this.getNumerator() * f.getDenominator() - this.getDenominator() * f.getNumerator();
		int denominators = this.getDenominator() * f.getDenominator();
		
		this.setNumerator(numerators);
		this.setDenominator(denominators);
		
	}
	
	public void multipication(Fraction f) {
		int numerators = this.getNumerator() * f.getNumerator();
		int denominators = this.getDenominator() * f.getDenominator();
		
		this.setNumerator(numerators);
		this.setDenominator(denominators);
		
	}
	
	public void divison(Fraction f) {
		int numerators = this.getNumerator() * f.getDenominator();
		int denominators = this.getDenominator() * f.getNumerator();
		
		this.setNumerator(numerators);
		this.setDenominator(denominators);
		
	}
	
	
	
	
	
}
