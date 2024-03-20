package br.com.felipehs;

public class CalculadorDeImposto implements InterfaceSAP, InterfaceOracleERP, MSInterface {
    public void calcularImposto(String documentoFiscal){
        System.out.println("Calculando imposto do documento: " + documentoFiscal);
    }

    @Override
    public void calculateTaxes(String doc) {
        this.calcularImposto(doc);
    }

    @Override
    public void calculateTaxesAndSummarizeBill(String doc) {
        this.calcularImposto(doc);
    }

    @Override
    public void summarizeBill(String doc) {
        this.calcularImposto(doc);
    }
}
