CREATE TABLE nhan_vien (
                           id INT PRIMARY KEY,
                           ho_ten VARCHAR(100) NOT NULL,
                           ngay_sinh DATE NOT NULL,
                           gioi_tinh VARCHAR(10) NOT NULL,
                           dia_chi VARCHAR(200) NOT NULL,
                           email VARCHAR(100) NOT NULL,
                           so_dien_thoai VARCHAR(20) NOT NULL
);