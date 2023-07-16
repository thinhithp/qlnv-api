package my.qlnvapi.qlnv.chucvu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.qlnvapi.qlnv.nhanvien.NhanVienEntitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CHUC_VU")
public class ChucVuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHUC_VU_ID")
    private Long chucVuId;

    private String chucVuTen;

    @OneToMany(mappedBy = "chucVu", cascade = CascadeType.ALL)
    private List<NhanVienEntitys> nhanViens = new ArrayList<>();

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
