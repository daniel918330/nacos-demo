package com.dyh.dataetler.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trade_order_day")
public class TradeOrderDay {

    @Id
    @Column(name = "legal_person")
    private String legalPerson;

    @Column(name = "legal_mobile_no")
    private String legalMobileNo;

    @Column(name = "shop_referee_user_id")
    private String shopRefereeUserId;

    @Column(name = "ref_path")
    private String refPath;

    @Column(name = "shop_province_name")
    private String shopProvinceName;

    @Column(name = "shop_city_name")
    private String shopCityName;

    @Column(name = "shop_area_name")
    private String shopAreaName;

    @Column(name = "shop_id")
    private String shopId;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "shop_integral_amount")
    private String shopIntegralAmount;

    @Column(name = "shop_address")
    private String shopAddress;

    @Column(name = "isent")
    private String isent;

    @Column(name = "pv")
    private String pv;

    @Column(name = "sharing_rate")
    private String sharingRate;

    @Column(name = "order_date")
    private String orderDate;

}
