package ru.kruvv.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import lombok.Data;

/**
 * @author Viktor Krupkin
 **/

@Entity
@Data
public class Car implements ComboListItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	@ManyToOne
	@JsonIdentityReference(alwaysAsId = true)
	private Model model;

}
