package com.capgemini.exchangevalue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.exchangevalue.entity.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	
	 ExchangeValue findByFromAndTo(String from, String to);
}
