package com.esliceu.orm.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlosaRepository extends CrudRepository<Glosa, Integer> {
}