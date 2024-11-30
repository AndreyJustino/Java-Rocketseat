package POO.encapsulamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario {
    private String name;
    private int age;
    private LocalDate birth;

    public Usuario(String name, int age, LocalDate birth){
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return age;
    }

    public void setIdade(int age) {
        this.age = age;
    }

    public String getNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return formatter.format(birth);
    }

    public void setNascimento(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}
