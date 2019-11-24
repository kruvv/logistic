package ru.kruvv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.kruvv.domain.Car;
import ru.kruvv.repo.CarRepo;

/**
 * @author Viktor Krupkin
 **/

@RestController
@RequestMapping("/api/car")
public class CarController extends AbstractRestController<Car, CarRepo> {

	public CarController(CarRepo repo) {
		super(repo);

	}

}
