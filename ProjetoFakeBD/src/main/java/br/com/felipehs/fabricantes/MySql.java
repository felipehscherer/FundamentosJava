package br.com.felipehs.fabricantes;

import br.com.felipehs.integracao.InterfaceBD;

public class MySql implements InterfaceBD {
    @Override
    public void conectar(String usuario, String senha) {
        System.out.println("Conectando com o Usuario: " + usuario + " e senha: " + senha);
    }

    @Override
    public void executar(String comando) {
        System.out.println("mysql> " + comando);
    }

    @Override
    public void desconectar() {
        System.out.println("Desconetado!");
    }
}
