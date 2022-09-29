CREATE DATABASE TEST_HOA_DON
USE TEST_HOA_DON
CREATE TABLE DanhMuc(
     id [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    tenDanhMuc VARCHAR(255),
)

CREATE TABLE SanPham(
    id [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    tenSanPham VARCHAR(255),
    soLuong INT,
    giaBan INT,
    trangThai INT,
    maDanhMuc INT,
    CONSTRAINT fk_danhmuc FOREIGN KEY (maDanhMuc) REFERENCES DanhMuc(id),
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

insert into DanhMuc VALUES ('Dien Thoai')
insert into DanhMuc VALUES ('Tivi')
insert into DanhMuc VALUES ('Tu Lanh')
SELECT * FROM DanhMuc
SELECT *, DanhMuc.tenDanhMuc FROM SanPham INNER JOIN DanhMuc on SanPham.maDanhMuc = DanhMuc.id
INSERT INTO SanPham VALUES('Dien thoai X', 100, 10000, 1, 1)
INSERT INTO SanPham VALUES('Dien thoai Y', 100, 10000, 1, 1)
INSERT INTO SanPham VALUES('Ti Vi X', 100, 10000, 1, 3)
INSERT INTO SanPham VALUES('Ti Vi LG', 100, 10000, 1, 3)
INSERT INTO SanPham VALUES('Tu Lanh A', 100, 10000, 1, 2)