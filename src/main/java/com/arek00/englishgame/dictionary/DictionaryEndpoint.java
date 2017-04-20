package com.arek00.englishgame.dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author arek00 (arek00.com)
 */
@RestController
@RequestMapping("/dictionary")
public class DictionaryEndpoint {
	private final DictionaryService dictionaryService;

	@Autowired
	public DictionaryEndpoint(final DictionaryService dictionaryService) {
		this.dictionaryService = dictionaryService;
	}

	@RequestMapping(value = "/{word}")
	public List<WordResponse> getWord(@PathVariable final String word) {
		return dictionaryService.findWord(word);
	}

}
