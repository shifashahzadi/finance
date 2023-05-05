package com.cwiztech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cwiztech.model.Journal;

public interface journalRepository extends JpaRepository<Journal, Long> {
	@Query(value = "select * from TBLJOURNAL where ISACTIVE='Y'", nativeQuery = true)
	public List<Journal> findActive();
	
	@Query(value = "select * from TBLJOURNAL "
			+ "where JOURNAL_ID in (:ids) "
			+ "", nativeQuery = true)
	public List<Journal> findByIDs(@Param("ids") List<Integer> ids);

	@Query(value = "select * from TBLJOURNAL "
			+ "where JOURNAL_ID not in (:ids) "
			+ "", nativeQuery = true)
	public List<Journal> findByNotInIDs(@Param("ids") List<Integer> ids);	

	@Query(value = "select * from TBLJOURNAL "
			+ "where (JOURNAL_DATE like ?1 or JOURNAL_DESCRIPTION like ?1 or JOURNAL_DEBITAMOUNT like ?1 or JOURNAL_CREDITAMOUNT like ?1) "
			+ "and ISACTIVE='Y'", nativeQuery = true)
	public List<Journal> findBySearch(String search);

	@Query(value = "select * from TBLJOURNAL "
			+ "where (JOURNAL_DATE like ?1 or JOURNAL_DESCRIPTION like ?1 or JOURNAL_DEBITAMOUNT like ?1 or JOURNAL_CREDITAMOUNT like ?1) "
			, nativeQuery = true)
	public List<Journal> findAllBySearch(String search);
	
	@Query(value = "select * from TBLJOURNAL " 
			+ "where TRANSACTION_ID LIKE CASE WHEN ?1 = 0 THEN TRANSACTION_ID ELSE ?1 END "
			+ "and ISACTIVE='Y'", nativeQuery = true)
	List<Journal> findByAdvancedSearch(Long transaction_ID);

	@Query(value = "select * from TBLJOURNAL " 
			+ "where TRANSACTION_ID LIKE CASE WHEN ?1 = 0 THEN TRANSACTION_ID ELSE ?1 END "
			, nativeQuery = true)
	List<Journal> findAllByAdvancedSearch(Long transaction_ID);
	

}
