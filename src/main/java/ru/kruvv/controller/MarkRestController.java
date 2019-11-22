package ru.kruvv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.kruvv.domain.Mark;
import ru.kruvv.repo.MarkRepo;

/**
 * @author Viktor Krupkin
 **/

@RestController
@RequestMapping("/api/mark")
public class MarkRestController extends AbstractRestController<Mark, MarkRepo> {

	public MarkRestController(MarkRepo repo) {
		super(repo);
	}

}
