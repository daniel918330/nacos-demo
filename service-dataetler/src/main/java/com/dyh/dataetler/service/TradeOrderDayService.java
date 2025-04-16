package com.dyh.dataetler.service;

import com.dyh.dataetler.entity.TradeOrderDay;

import java.util.List;

public interface TradeOrderDayService {
    List<TradeOrderDay> findAll(int page, int size);
}
