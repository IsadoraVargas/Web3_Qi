package br.com.isadoravargas.introspring.model;

public class User {
    private int registration;
    private String fullName;
    private int age;
    private Gerne genre;
    private int id;

    public int getRegistration() {
        return this.registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gerne getGenre() {
        return this.genre;
    }

    public void setGenre(Gerne genre) {
        this.genre = genre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}