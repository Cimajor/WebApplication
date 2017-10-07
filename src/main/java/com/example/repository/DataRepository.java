package com.example.repository;
import com.example.initity.DomainObject;
import java.util.Set;

public interface DataRepository<V extends DomainObject> {

    void persist(V object);

    void delete(V object);

    Set<String> getRandomData();

}
