package model;

public class Alojamento {
    private int numero;
    String descricao;
    private boolean ocupado;


    // construtor //

    public Alojamento(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;

        this.ocupado = false;
    }
}







