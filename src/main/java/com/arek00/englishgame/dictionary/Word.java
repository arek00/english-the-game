package com.arek00.englishgame.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import java.util.UUID;

/**
 * @author arek00 (arek00.com)
 */

@Entity
@Inheritance
@Getter
@Setter
public class Word {

	public Word(final String word, final String description) {
		this.id = UUID.randomUUID().toString();
		this.word = word;
		this.description = description;
	}

	@Id final String id;
	final String word;
	final String description;
}
