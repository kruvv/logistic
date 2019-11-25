package ru.kruvv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Viktor Krupkin
 **/

@Data
@AllArgsConstructor
public class ListItemDto {

	private Long id;
	private String value;

}
