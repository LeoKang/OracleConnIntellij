package com.example.demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TimeMapperTest {

    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void testGetTime() {
        System.out.println(timeMapper.getClass().getName());
        System.out.println(timeMapper.getTime());
    }

    @Test
    public void testGetTblBoard() {
        String tag = "** testGetTblBoard ** ";
        System.out.println(tag + timeMapper.getClass().getName());
        System.out.println(tag + timeMapper.getTblBoard());
    }
}
