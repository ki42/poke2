package com.domgee.poke.models.data;

import com.domgee.poke.models.Poke;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface PokeDao extends CrudRepository<Poke, Integer> {
}
