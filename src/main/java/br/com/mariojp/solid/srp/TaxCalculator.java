package br.com.mariojp.solid.srp;

public class TaxCalculator {
    
    private final double taxRate;

    public TaxCalculator() {
        // lê do System properties ou usa default 0.10
        String rate = System.getProperty("tax.rate", "0.10");
        this.taxRate = Double.parseDouble(rate);
    }

    public double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
