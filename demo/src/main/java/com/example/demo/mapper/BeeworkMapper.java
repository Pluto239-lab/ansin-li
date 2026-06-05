package com.example.demo.mapper;

import com.example.demo.entity.Beework;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;



@Mapper
public interface BeeworkMapper {
	
    List<Beework> getBeework(@Param("USER_CD") Long userCd);

}
