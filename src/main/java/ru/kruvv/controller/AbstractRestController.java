package ru.kruvv.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ru.kruvv.domain.ComboListItem;
import ru.kruvv.dto.ListItemDto;

/**
 * @author Viktor Krupkin
 **/

public abstract class AbstractRestController<T extends ComboListItem, R extends JpaRepository<T, ?>> {
	protected R repo;

	public AbstractRestController(R repo) {
		this.repo = repo;
	}

	@GetMapping
	public Page<T> list(@PageableDefault Pageable pageable) {
		// return all entity this type
		return repo.findAll(pageable);
	}

	@GetMapping("{id}")
	public T getOne(@PathVariable("id") T obj) {
		// return entity by he id
		return obj;
	}

	@PostMapping
	public T add(@RequestBody T obj) {
		// save entity in repository and return he for work frontend
		return repo.save(obj);
	}

	@PutMapping("{id}")
	public T update(@PathVariable("id") T dbObj, @RequestBody T obj) {
		// update entity
		BeanUtils.copyProperties(obj, dbObj, "id");
		return repo.save(dbObj);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") T obj) {
		// delete entity from DB
		repo.delete(obj);
	}

	@GetMapping("list")
	public List<ListItemDto> list() {
		return repo.findAll().stream().map(entity -> new ListItemDto(entity.getId(), entity.getName())).collect(Collectors.toList());
	}

}
