/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.shop.repository;

import com.poly.shop.entity.HoaDon;
import com.poly.shop.entity.SanPham;
import com.poly.shop.hibernateConfig.HibernateConfig;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class HoaDonRepository {

    Session session = HibernateConfig.getFACTORY().openSession();

    public List<HoaDon> getList() {
        Query q = session.createQuery("From HoaDon");// truy vấn trên entity(HQL)
        List<HoaDon> list = q.getResultList();
        return list;
    }

    public static void main(String[] args) {
        HoaDon hoaDonNew = new HoaDon();
        hoaDonNew.setTenKhachHang("ZZ");
        hoaDonNew.setDiaChi("aa");
        hoaDonNew.setTongTien(0);
        HoaDon hoaDon1 = new HoaDonRepository().save(hoaDonNew);
        List<HoaDon> list = new HoaDonRepository().getList();
        for (HoaDon hoaDon : list) {
            System.out.println(hoaDon);
        }
    }
    
    public HoaDon save(HoaDon hoaDon) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            int id = (int) session.save(hoaDon);
            transaction.commit();
            System.out.println("ma hoa don"+id);
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
