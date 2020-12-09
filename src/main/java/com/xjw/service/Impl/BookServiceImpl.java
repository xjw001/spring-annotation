package com.xjw.service.Impl;

import com.xjw.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl {

    @Autowired
    private BookDao bookDao;

   public void print(){
       System.out.println(bookDao);
   }
}
