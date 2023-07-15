package my.qlnvapi.qlnv.global.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Common {
    private Common() {
        throw new UnsupportedOperationException();
    }

    @Getter
    @AllArgsConstructor
    public enum GioiTinh {
        NAM("Nam"),
        NU("Nữ"),
        KHAC("Giới tính khác");

        private final String name;
    }
}
