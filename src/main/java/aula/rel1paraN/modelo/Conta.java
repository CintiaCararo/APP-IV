package aula.rel1paraN.modelo;

public class Conta {
    int numero;
    Cliente c;

    Conta(Cliente c) {
        this.c = c;
    }

    public void setCliente(Cliente c) {
        this.c = c;
    }
}
