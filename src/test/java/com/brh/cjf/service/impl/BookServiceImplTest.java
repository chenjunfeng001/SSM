package com.brh.cjf.service.impl;

import static org.junit.Assert.fail;

import com.brh.cjf.dto.AppointExecution;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.brh.cjf.BaseTest;
import com.brh.cjf.service.BookService;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1001;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}

}
