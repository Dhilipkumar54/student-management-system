package net.javaguides.sma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sma.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
