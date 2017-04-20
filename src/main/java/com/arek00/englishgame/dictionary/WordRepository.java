package com.arek00.englishgame.dictionary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * @author arek00 (arek00.com)
 */
@Repository
public interface WordRepository extends PagingAndSortingRepository<Word, UUID> {

	List<Word> findByName(final String word);

	Page<Word> findByNameLike(final String word, Pageable pageable);
}
