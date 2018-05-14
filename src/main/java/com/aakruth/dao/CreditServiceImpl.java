package com.aakruth.dao;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.aakruth.model.Credit;
import com.aakruth.model.Debit;
import com.aakruth.model.Transaction;

@Service("creditService")
public class CreditServiceImpl implements CreditService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CreditRepository creditRepository;

	@Autowired
	TransactionRepository transactionRepository;
	@Override
	public Credit findOne(Integer credId) {

		return creditRepository.findOne(credId);
	}

	@Override
	public DataTablesOutput<Credit> findAll(DataTablesInput input) {

		return creditRepository.findAll(input);
	}

	@Override
	public boolean save(Credit credit) {
		try {
			credit.setStrdte(new Date());
			credit.setEnddte(new Date("01/01/9999"));
			credit.setSta('L');
			creditRepository.save(credit);
		} catch (Exception ex) {
			logger.error("Error while saving :"+credit);
			return false;
		}
		return true;
	}

	@Override
	public boolean edit(Credit credit) {

		try {
			creditRepository.save(credit);
		} catch (Exception ex) {
			logger.error("Error while editing :"+credit);
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(Integer credId) {

		try {
			creditRepository.delete(credId);
		} catch (Exception ex) {
			
			logger.error("Error while  deleting:"+credId);
			return false;
		}
		return true;
	}

	@Override
	public List<Credit> findBySta(char sta) {

		return creditRepository.findBySta(sta);
	}

	@Override
	public List<Transaction> findByType(char type) {
		return transactionRepository.findByType(type);
	}

	@Override
	public List<Credit> findByStrdteBetween(Date start, Date end) {
		return creditRepository.findByStrdteBetween(start, end);
	}
}
