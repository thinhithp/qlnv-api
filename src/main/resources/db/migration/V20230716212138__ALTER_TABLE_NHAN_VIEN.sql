ALTER TABLE NHAN_VIEN
    ADD IS_DELETED NUMBER(1) DEFAULT 0;
/
ALTER TABLE NHAN_VIEN
    ADD NGAY_TAO DATE DEFAULT CURRENT_DATE;
/
ALTER TABLE NHAN_VIEN
    ADD NGAY_SUA DATE;
/
ALTER TABLE NHAN_VIEN
    ADD NGUOI_SUA VARCHAR(4000);
/
ALTER TABLE NHAN_VIEN
    ADD NGUOI_TAO VARCHAR(4000);