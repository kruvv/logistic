package ru.kruvv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kruvv.domain.Car;

/**
 * @author Viktor Krupkin
 **/

public interface CarRepo extends JpaRepository<Car, Long> {

}
