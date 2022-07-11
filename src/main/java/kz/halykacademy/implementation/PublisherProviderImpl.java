package kz.halykacademy.implementation;

import kz.halykacademy.dto.PublisherDTO;
import kz.halykacademy.provider.PublisherProvider;

import java.util.ArrayList;
import java.util.List;

public class PublisherProviderImpl implements PublisherProvider {

    ArrayList<PublisherDTO> publisherList = new ArrayList<>(){
        {
            add(new PublisherDTO(1L, "publisherName1", new ArrayList<String>()));
            add(new PublisherDTO(2L, "publisherName2", new ArrayList<String>()));
            add(new PublisherDTO(3L, "publisherName3", new ArrayList<String>()));
        }
    };

    @Override
    public List<PublisherDTO> getAll() {
        return publisherList;
    }
}
