package com.aakruth.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aakruth.model.Credit;

@Repository("creditRepository")
interface CreditRepository extends DataTablesRepository<Credit, Integer>,CrudRepository<Credit, Integer>{
	List<Credit> findBySta(char sta);
	List<Credit> findByStrdteBetween(Date start, Date end);
	
}
