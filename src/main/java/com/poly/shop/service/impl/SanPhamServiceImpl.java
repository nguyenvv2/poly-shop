/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.shop.service.impl;

import com.poly.shop.entity.SanPham;
import com.poly.shop.repository.SanPhamRepository;
import com.poly.shop.service.SanPhamService;
import java.util.List;

/**
 *
 * @author nguyenvv
 */
public class SanPhamServiceImpl implements SanPhamService {

    private SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public List<SanPham> getListSanPham() {
        return sanPhamRepository.getList();
    }

}
