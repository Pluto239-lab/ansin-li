package com.example.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BeeworkDTO;
import com.example.demo.service.BeeworkService;
import com.example.demo.vo.BeeworkVO;

@RestController  //控制器,自动将方法返回值作为 HTTP 响应体
@RequestMapping("/beeworks")  //表示该类中的所有方法都以此路径为前缀。
public class BeeworkController {
    private final BeeworkService beeworkService;

    public BeeworkController(BeeworkService beeworkService) {
        this.beeworkService = beeworkService;
    }

    @PostMapping("/test")
    public void test(@RequestBody @Validated BeeworkDTO dto) {
    }

    @GetMapping("/{userID}")
    public BeeworkVO getUserById(@PathVariable Long userID) { return beeworkService.getBeework(userID); }

}
