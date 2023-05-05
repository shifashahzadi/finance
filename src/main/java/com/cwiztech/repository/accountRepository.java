package com.cwiztech.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cwiztech.model.Account;


public interface accountRepository extends JpaRepository<Account, Long> {

	@Query(value = "select * from TBLACCOUNT where ISACTIVE='Y'", nativeQuery = true)
	public List<Account> findActive();
	
	@Query(value = "select * from TBLACCOUNT "
			+ "where ACCOUNT_ID in (:ids) "
			+ "", nativeQuery = true)
	public List<Account> findByIDs(@Param("ids") List<Integer> ids);

	@Query(value = "select * from TBLACCOUNT "
			+ "where ACCOUNT_ID not in (:ids) "
			+ "", nativeQuery = true)
	public List<Account> findByNotInIDs(@Param("ids") List<Integer> ids);	

	@Query(value = "select * from TBLACCOUNT "
			+ "where (ACCOUNT_NAME like ?1 ) "
			+ "and ISACTIVE='Y'", nativeQuery = true)
	public List<Account> findBySearch(String search);

	@Query(value = "select * from TBLACCOUNT "
			+ "where (ACCOUNT_NAME like ?1) "
			, nativeQuery = true)
	public List<Account> findAllBySearch(String search);

	@Query(value = "select * from TBLACCOUNT " 
			+ "where ACCOUNTTYPE_ID LIKE CASE WHEN ?1 = 0 THEN ACCOUNTTYPE_ID ELSE ?1 END "
						+ "and ISACTIVE='Y'", nativeQuery = true)
	List<Account> findByAdvancedSearch(Long accounttypeID);

	@Query(value = "select * from TBLACCOUNT " 
			+ "where ACCOUNTTYPE_ID LIKE CASE WHEN ?1 = 0 THEN ACCOUNTTYPE_ID ELSE ?1 END "
			+ "", nativeQuery = true)
	List<Account> findAllByAdvancedSearch(Long accounttypeID);
	
}
