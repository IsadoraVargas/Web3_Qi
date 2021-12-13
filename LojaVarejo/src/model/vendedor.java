
package model;
import java.time.LocalDate;

public class vendedor {
    private int id;
    private String nome;
    private LocalDate nascimento;
    private long cpf;
    private double salario;
    private String endereco;

    public vendedor (String nome, LocalDate nascimento, long cpf, double salario, String endereco) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.salario = salario;
        this.endereco = endereco;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
