package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.entity.Student;

@Repository
public interface Stud_Repository extends JpaRepository<Student, Integer> {

	@Modifying
	@Query("UPDATE Student s SET s.name = :newName WHERE s.name = :oldName")
    int updateName(@Param("oldName") String oldName, @Param("newName") String newName);
}
 