package br.com.felipehs.sistema;

import br.com.felipehs.fabricantes.MySql;
import br.com.felipehs.fabricantes.PostgreSQL;
import br.com.felipehs.integracao.InterfaceBD;

public class Sistema {
    public static void main(String[] args) {
        InterfaceBD interfaceBD;

        interfaceBD = new PostgreSQL();

        interfaceBD.conectar("Felipe", "1234");
        interfaceBD.executar("SELECT * FROM tbl_clientes");
        interfaceBD.desconectar();
    }
}
