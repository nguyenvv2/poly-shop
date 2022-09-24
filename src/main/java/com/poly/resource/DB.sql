CREATE DATABASE TEST_HOA_DON

CREATE TABLE SanPham(
    id [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    tenSanPham VARCHAR(255),
    soLuong INT,
    giaBan INT,
    trangThai INT
)

CREATE TABLE HoaDon(
    maHoaDon [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    tenKhachHang VARCHAR(255),
    tongTien INT,
    diaChi VARCHAR(255)
)

CREATE TABLE ChiTietHoaDon(
    id [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    maHoaDon INT,
    maSanPham INT,
    soLuong INT,
    giaBan INT
    CONSTRAINT fk_sanPham FOREIGN KEY (maSanPham) REFERENCES SanPham(id),
    CONSTRAINT fk_hoaDon FOREIGN KEY (maHoaDon) REFERENCES HoaDon(maHoaDon)
)