package ru.kruvv.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Viktor Krupkin
 **/

@Data
@Entity
public class Mark {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;

	private String name;

}
