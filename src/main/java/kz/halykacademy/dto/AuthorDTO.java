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
}
