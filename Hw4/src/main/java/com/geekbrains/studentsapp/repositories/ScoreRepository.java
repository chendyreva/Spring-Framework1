package com.geekbrains.studentsapp.repositories;

import com.geekbrains.studentsapp.entities.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Long> {
	Score findOneByName(String theRoleName);
}
