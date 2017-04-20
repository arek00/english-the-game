package com.arek00.englishgame.dictionary;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

/**
 * @author arek00 (arek00.com)
 */

@Getter
@Setter
@Entity
@Table(name = "dictionary")
public class Word {

	public Word(final String name,
				final String description,
				final Language language,
				final Set<Word> translations) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.description = description;
		this.language = language;
		this.translations = translations;
	}

	@Id final String id;
	final String name;
	final String description;
	final Language language;

	@ManyToMany
	@JoinTable(name = "translation",
			joinColumns = @JoinColumn(name = "word_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "translation_id", referencedColumnName = "id"))
	final Set<Word> translations;

	public void addTranslation(final Word translation) {
		translations.add(translation);
	}
}
