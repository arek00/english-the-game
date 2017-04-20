package com.arek00.englishgame.dictionary;

import com.arek00.englishgame.dictionary.view.WordResponseView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author arek00 (arek00.com)
 */
@AllArgsConstructor
public class WordResponse {

	@JsonView(value = {WordResponseView.DefaultView.class, WordResponseView.SearchView.class})
	final String name;

	@JsonView(WordResponseView.DefaultView.class) final String description;

	@JsonView(value = {WordResponseView.DefaultView.class, WordResponseView.SearchView.class})
	final Language language;

	@JsonView(WordResponseView.DefaultView.class) final Map<Language, String> translation;
}
