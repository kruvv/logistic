package ru.kruvv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.kruvv.domain.Model;
import ru.kruvv.repo.ModelRepo;

/**
 * @author Viktor Krupkin
 **/

@RestController
@RequestMapping("/api/model")
public class ModelController extends AbstractRestController<Model, ModelRepo> {

	public ModelController(ModelRepo repo) {
		super(repo);
	}

}
