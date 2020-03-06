package util;

public class Student {

    private static int counter=0;
    private int id;
    private int matricula;
    private String nome;

    public Student (int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.id = counter;
        counter++;
    }

    private static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //    @Override
//    public void add() {
//
//    }
//
//    @Override
//    public String load(int id) {
//        return null;
//    }
//
//    @Override
//    public void update(int id, String update) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
}
