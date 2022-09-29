/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.shop.service.impl;

import com.poly.shop.entity.HoaDon;
import com.poly.shop.repository.HoaDonRepository;
import com.poly.shop.service.HoaDonService;

/**
 *
 * @author nguyenvv
 */
public class HoaDonServiceImpl implements  HoaDonService{
    
    private HoaDonRepository hoaDonRepository = new HoaDonRepository();

    @Override
    public HoaDon saveHoaDon(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }
    
}
