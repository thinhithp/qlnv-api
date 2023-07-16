package my.qlnvapi.qlnv.global.constant;

public class ApiConstants {

    public static class PhongBan {
        private PhongBan() {
        }
        /*Endpoint*/
        public static final String BASE = "/phong-ban";
        public static final String CREATE = "/create";
        public static final String UPDATE = "/update";
        public static final String SEARCH = "/search";
        public static final String DELETE = "/delete/{id}";
        public static final String SEARCH_BY_ID = "/get/{id}";

        /*Description*/
        public static final String OPERATION_SEARCH_PHONG_BAN = "Tìm kiếm phòng ban";
        public static final String OPERATION_CREATE_PHONG_BAN = "Tạo mới phòng ban";
        public static final String OPERATION_UPDATE_PHONG_BAN = "Cập nhật phòng ban";
        public static final String OPERATION_DELETE_PHONG_BAN = "Xoá phòng ban";
        public static final String OPERATION_GET_PHONG_BAN = "Chi tiết phòng ban";
    }
}
