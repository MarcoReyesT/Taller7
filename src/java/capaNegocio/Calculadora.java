package capaNegocio;

public class Calculadora {

	private int numero1;
	private int numero2;

	public int getNumero1() {
		return this.numero1;
	}

	/**
	 * 
	 * @param numero1
	 */
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return this.numero2;
	}

	/**
	 * 
	 * @param numero2
	 */
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	/**
	 * 
	 * @param calculadora
	 */
	public String sumar(Calculadora calculadora) {
		return "La suma de " + calculadora.getNumero1() + " + " + calculadora.getNumero2()
                        + " es: " + add(calculadora.getNumero1(), calculadora.getNumero2());
	}

	/**
	 * 
	 * @param calculadora
	 */
	public String restar(Calculadora calculadora) {
		return "La resta de " + calculadora.getNumero1() + " - " + calculadora.getNumero2()
                        + " es: " + subtract(calculadora.getNumero1(), calculadora.getNumero2());
	}

	/**
	 * 
	 * @param calculadora
	 */
	public String multiplicar(Calculadora calculadora) {
		return "La multiplicacion de " + calculadora.getNumero1() + " * " + calculadora.getNumero2()
                        + " es: " + multiply(calculadora.getNumero1(), calculadora.getNumero2());
	}

	/**
	 * 
	 * @param calculadora
	 */
	public String dividir(Calculadora calculadora) {
		return "La dicision de " + calculadora.getNumero1() + " / " + calculadora.getNumero2()
                        + " es: " + divide(calculadora.getNumero1(), calculadora.getNumero2());
	}

    private static int add(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.add(intA, intB);
    }

    private static int divide(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.divide(intA, intB);
    }

    private static int subtract(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.subtract(intA, intB);
    }

    private static int multiply(int intA, int intB) {
        org.tempuri.Calculator service = new org.tempuri.Calculator();
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.multiply(intA, intB);
    }

}