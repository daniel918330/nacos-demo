package com.dyh.dataetler.service.impl;

import com.dyh.dataetler.entity.TradeOrderDay;
import com.dyh.dataetler.repository.TradeOrderDayRepository;
import com.dyh.dataetler.service.TradeOrderDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeOrderDayServiceImpl implements TradeOrderDayService {

    @Autowired
    private TradeOrderDayRepository repository;

    @Override
    public List<TradeOrderDay> findAll(int page, int size) {
        Page<TradeOrderDay> result = repository.findAll(PageRequest.of(page, size));
        return result.getContent(); // 获取当前页的内容
    }
}
