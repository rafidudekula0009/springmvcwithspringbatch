package com.custom.springmvcwithbatch.batch.config;

import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.LineTokenizer;

import com.custom.springmvcwithbatch.entity.Customer;

public class CustomLineMapper extends DefaultLineMapper<Customer>{
	private LineTokenizer tokenizer;

	private FieldSetMapper<Customer> fieldSetMapper;
    @Override
	public Customer mapLine(String line, int lineNumber) throws Exception {
    	System.out.println(line+"*************************");
		return fieldSetMapper.mapFieldSet(tokenizer.tokenize(line));
	}

	public void setLineTokenizer(LineTokenizer tokenizer) {
		this.tokenizer = tokenizer;
	}

	public void setFieldSetMapper(FieldSetMapper<Customer> fieldSetMapper) {
		this.fieldSetMapper = fieldSetMapper;
	}
	
}