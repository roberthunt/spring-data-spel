package com.example.springdataspel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends CrudRepository<Person, Short>
{
    @Query("FROM #{#entityName} e WHERE e.id = :id")
    Person findById(@Param("id") short id);

    @Query("FROM #{#entityName} e WHERE e.id = ?#{#id > 4 ? 1 : #id}")
    Person findByIdUnlessIdGreaterThanFour(@Param("id") short id);
}
