package my.qlnvapi.qlnv.phongban.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.qlnvapi.qlnv.nhanvien.NhanVienEntitys;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "PHONG_BAN")
public class PhongBanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PHONG_BAN_ID")
    private Long phongBanId;

    @Column(name = "PHONG_BAN_NAME", nullable = false, length = 100)
    private String phongBanName;

    @OneToMany(mappedBy = "phongBan",cascade = CascadeType.ALL)
    private List<NhanVienEntitys> nhanViens;

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
