package com.arek00.englishgame.dictionary;

import javax.persistence.ManyToMany;
import java.util.List;

/**
 * @author arek00 (arek00.com)
 */

public class PolishWord extends Word {

	public PolishWord(final String word, final String description, final List<Word> translations) {
		super(word, description);
		this.translations = translations;
	}

	@ManyToMany
	private final List<Word> translations;
}
