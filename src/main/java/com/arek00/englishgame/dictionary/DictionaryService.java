package com.arek00.englishgame.dictionary;

import com.arek00.englishgame.dictionary.factory.WordResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author arek00 (arek00.com)
 */
@Service
public class DictionaryService {

	private final WordRepository wordRepository;

	@Autowired
	public DictionaryService(final WordRepository wordRepository) {
		this.wordRepository = wordRepository;
	}

	public List<WordResponse> findWordLike(final String pattern, final Pageable pageable) {
		final Page<Word> namesLike = wordRepository.findByNameLike(pattern, pageable);

		return WordResponseFactory.fromWords(namesLike.getContent());
	}

	public List<WordResponse> findWord(final String word) {
		return WordResponseFactory.fromWords(wordRepository.findByName(word));
	}


}
