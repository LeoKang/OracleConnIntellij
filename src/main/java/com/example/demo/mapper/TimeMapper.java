package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeMapper {

    @Select("select sysdate from dual")
    public String getTime();

    @Select("select count(*) from tbl_board")
    public String getTblBoard();
}
