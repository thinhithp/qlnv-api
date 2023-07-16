package my.qlnvapi.qlnv.nhanvien;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.qlnvapi.qlnv.chucvu.ChucVuEntity;
import my.qlnvapi.qlnv.global.constant.Common;
import my.qlnvapi.qlnv.phongban.entity.PhongBanEntity;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chuc_vu_id", nullable = false)
    private ChucVuEntity chucVu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phong_ban_id", nullable = false)
    private PhongBanEntity phongBan;

    @Column(name = "NGAY_TAO")
    private Date ngayTao;

    @Column(name = "NGAY_SUA")
    private Date ngaySua;

    @Column(name = "NGUOI_TAO")
    private String nguoiTao;

    @Column(name = "NGUOI_SUA")
    private String nguoiSua;

    @Column(name = "IS_DELETED")
    private byte isDeleted;
}
