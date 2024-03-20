package br.com.felipehs.fabricantes;

import br.com.felipehs.integracao.InterfaceBD;

public class PostgreSQL implements InterfaceBD {
    @Override
    public void conectar(String usuario, String senha) {
        System.out.println("Connection on data base with user: " + usuario + " and password: " + senha);
    }

    @Override
    public void executar(String comando) {
        System.out.println("psql> " + comando);
    }

    @Override
    public void desconectar() {
        System.out.println("Desconect!");
    }
}
