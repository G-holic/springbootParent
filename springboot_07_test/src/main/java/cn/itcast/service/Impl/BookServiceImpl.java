package cn.itcast.service.Impl;

import cn.itcast.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book is running....");
    }
}
