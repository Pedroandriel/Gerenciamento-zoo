package model;

public class Animal {
    private String nome;
    private int idade;
    private String sexodoAnimal;
    private String especie;
    private String habitoAlimentar;


    public Animal(String nome, int idade, String sexodoAnimal, String habitoAlimentar, String especie) {

        this.nome = nome;
        this.idade = idade;
        this.sexodoAnimal = sexodoAnimal;
        this.especie = especie;
        this.habitoAlimentar = habitoAlimentar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexodoAnimal() {
        return sexodoAnimal;
    }

    public void setSexodoAnimal(String sexodoAnimal) {
        this.sexodoAnimal = sexodoAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitoAlimentar() {
        return habitoAlimentar;
    }

    public void setHabitoAlimentar(String habitoAlimentar) {
        this.habitoAlimentar = habitoAlimentar;
    }
}