
CREATE TABLE nhan_vien (
                           id NUMBER PRIMARY KEY,
                           ho_ten VARCHAR2(100) NOT NULL,
                           ngay_sinh DATE NOT NULL,
                           gioi_tinh VARCHAR2(10) NOT NULL,
                           dia_chi VARCHAR2(200) NOT NULL,
                           email VARCHAR2(100) NOT NULL,
                           so_dien_thoai VARCHAR2(20) NOT NULL,
                           chuc_vu NUMBER(10),
                           phong_ban_id NUMBER(10)
);
/
COMMENT ON COLUMN nhan_vien.id IS 'ID duy nhất của nhân viên';
COMMENT ON COLUMN nhan_vien.ho_ten IS 'Họ tên đầy đủ của nhân viên';
COMMENT ON COLUMN nhan_vien.ngay_sinh IS 'Ngày sinh của nhân viên';
COMMENT ON COLUMN nhan_vien.gioi_tinh IS 'Giới tính của nhân viên';
COMMENT ON COLUMN nhan_vien.dia_chi IS 'Địa chỉ của nhân viên';
COMMENT ON COLUMN nhan_vien.email IS 'Địa chỉ email của nhân viên';
COMMENT ON COLUMN nhan_vien.so_dien_thoai IS 'Số điện thoại của nhân viên';
COMMENT ON COLUMN nhan_vien.chuc_vu IS 'ID của chức vụ mà nhân viên giữ';
COMMENT ON COLUMN nhan_vien.phong_ban_id IS 'ID của phòng ban mà nhân viên thuộc về';
