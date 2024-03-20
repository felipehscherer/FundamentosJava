package br.com.felipehs;

public class ERPMainClass {
    public static void main(String[] args) {
        InterfaceOracleERP interfaceOracleERP = new CalculadorDeImposto();

        interfaceOracleERP.calculateTaxes("tbl_sell.exl");
    }
}
