CREATE TABLE CHUC_VU (
                           CHUC_VU_ID INT PRIMARY KEY,
                           CHUC_VU_TEN VARCHAR(100) NOT NULL
);
/
COMMENT ON COLUMN CHUC_VU.CHUC_VU_ID IS 'ID duy nhất của chức vụ';
COMMENT ON COLUMN CHUC_VU.CHUC_VU_TEN IS 'Tên chức vụ';
