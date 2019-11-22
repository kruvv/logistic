package ru.kruvv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kruvv.domain.Mark;

/**
 * @author Viktor Krupkin
 **/

public interface MarkRepo extends JpaRepository<Mark, Long> {

}
