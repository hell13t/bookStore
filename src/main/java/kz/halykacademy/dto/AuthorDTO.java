package kz.halykacademy.dto;

import java.time.LocalDate;
import java.util.ArrayList;

public class AuthorDTO {
    Long id;
    String surname;
    String name;
    String patronymic;
    LocalDate birthDate;
    ArrayList<String> writtenBooks; //TODO Generic type

    public AuthorDTO() {
    }

    public AuthorDTO(Long id, String surname, String name, String patronymic, LocalDate birthDate, ArrayList<String> writtenBooks) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.writtenBooks = writtenBooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<String> getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(ArrayList<String> writtenBooks) {
        this.writtenBooks = writtenBooks;
    }
}
