/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.shop.repository;

import com.poly.shop.entity.DanhMuc;
import com.poly.shop.entity.SanPham;
import com.poly.shop.hibernateConfig.HibernateConfig;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class SanPhamRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public List<SanPham> getList() {
        Query q = session.createQuery("From SanPham");// truy vấn trên entity(HQL)
        List<SanPham> list = q.getResultList();
        return list;
    }
}
