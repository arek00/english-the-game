package com.arek00.englishgame.dictionary.factory;

import com.arek00.englishgame.dictionary.Language;
import com.arek00.englishgame.dictionary.Word;
import com.arek00.englishgame.dictionary.WordResponse;
import com.google.common.collect.Maps;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author arek00 (arek00.com)
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class WordResponseFactory {

	public static WordResponse fromWord(final Word word) {
		final Set<Word> translations = word.getTranslations();
		final Map<Language, String> mappedTranslations = Maps.newHashMap();

		translations.forEach(translation -> mappedTranslations.put(translation.getLanguage(),
				translation.getName()));

		return new WordResponse(word.getName(),
				word.getDescription(),
				word.getLanguage(),
				mappedTranslations);
	}

	public static List<WordResponse> fromWords(final List<Word> words) {
		return words.stream().map(WordResponseFactory::fromWord).collect(Collectors.toList());
	}
}
