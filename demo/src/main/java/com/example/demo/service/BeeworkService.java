package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Beework;
import com.example.demo.mapper.BeeworkMapper;

@Service
public class BeeworkService {
    private final BeeworkMapper beeworkMapper;
    @Autowired
    public BeeworkService(BeeworkMapper beeworkMapper) {
        this.beeworkMapper = beeworkMapper;
    }

    public Beework getBeeworkById(Long userCd) { return beeworkMapper.getBeework(userCd); }

}
