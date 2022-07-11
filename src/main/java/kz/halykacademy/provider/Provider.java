package kz.halykacademy.provider;

import java.util.List;

public interface Provider<T> {
    List<T> getAll();
}
