package kz.halykacademy.implementation;

import kz.halykacademy.dto.AuthorDTO;
import kz.halykacademy.provider.AuthorProvider;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AuthorProviderImpl implements AuthorProvider {

    ArrayList<AuthorDTO> authorList = new ArrayList<>(){
        {
            add(new AuthorDTO(1L, "Surname1", "name1", "patronymic1", LocalDate.now(), new ArrayList<String>()));
            add(new AuthorDTO(2L, "Surname2", "name2", "patronymic2", LocalDate.now(), new ArrayList<String>()));
            add(new AuthorDTO(3L, "Surname3", "name3", "patronymic3", LocalDate.now(), new ArrayList<String>()));
        }
    };

    @Override
    public List<AuthorDTO> getAll() {
        return authorList;
    }
}
