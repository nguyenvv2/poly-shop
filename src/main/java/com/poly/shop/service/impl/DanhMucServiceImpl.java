/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.shop.service.impl;

import com.poly.shop.entity.DanhMuc;
import com.poly.shop.repository.DanhMucRepository;
import com.poly.shop.service.DanhMucService;
import java.util.List;

/**
 *
 * @author nguyenvv
 */
public class DanhMucServiceImpl implements DanhMucService {

    private DanhMucRepository danhMucRepository = new DanhMucRepository();

    @Override
    public List<DanhMuc> getList() {
        return danhMucRepository.getList();
    }

}
