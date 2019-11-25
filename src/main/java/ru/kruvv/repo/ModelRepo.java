package ru.kruvv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kruvv.domain.Model;

/**
 * @author Viktor Krupkin
 **/

public interface ModelRepo extends JpaRepository<Model, Long> {

}
