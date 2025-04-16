package com.dyh.dataetler.controller;

import com.dyh.dataetler.entity.TradeOrderDay;
import com.dyh.dataetler.service.TradeOrderDayService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tradeOrderDay")
@Tag(name = "/tradeOrderDay")
public class TradeOrderDayController {

    @Autowired
    private TradeOrderDayService service;

    @GetMapping("/list")
    public List<TradeOrderDay> getAll(
            @RequestParam(defaultValue = "0") int page, // 默认第一页
            @RequestParam(defaultValue = "10") int size // 默认每页10条
    ) {
        return service.findAll(page, size);
    }
}
