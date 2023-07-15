package my.qlnvapi.qlnv.nhanvien;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.EnumNaming;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.qlnvapi.qlnv.chucvu.ChucVuEntity;
import my.qlnvapi.qlnv.global.constant.Common;
import my.qlnvapi.qlnv.phongban.PhongBanEntity;
import org.hibernate.annotations.Comment;

import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NHAN_VIEN")
public class NhanVienEntitys {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "HO_TEN", nullable = false)
    private String hoTen;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Column(name = "NGAY_SINH", nullable = false)
    private Date ngaySinh;

    @Column(name = "GIOI_TINH", nullable = false)
    @Enumerated(EnumType.STRING)
    private Common.GioiTinh gioiTinh;

    @Column(name = "DIA_CHI")
    private String diaChi;

    @Column(name = "EMAIL")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Địa chỉ email không hợp lệ")
    private String email;

    @Column(name = "SO_DIEN_THOAI")
    private String soDienThoai;

    @ManyToOne
    @JoinColumn(name = "chuc_vu_id", nullable = false)
    private ChucVuEntity chucVu;

    @ManyToOne
    @JoinColumn(name = "phong_ban_id", nullable = false)
    private PhongBanEntity phongBan;
}
