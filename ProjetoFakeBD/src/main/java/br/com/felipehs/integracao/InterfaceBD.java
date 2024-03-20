package br.com.felipehs.integracao;

public interface InterfaceBD {
    public void conectar(String usuario, String senha);
    public void executar(String comando);
    public void desconectar();
}
