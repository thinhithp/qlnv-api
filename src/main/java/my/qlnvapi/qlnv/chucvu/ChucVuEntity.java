package my.qlnvapi.qlnv.chucvu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.qlnvapi.qlnv.nhanvien.NhanVienEntitys;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CHUC_VU")
public class ChucVuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phongBanId;

    @Column(name = "CHUC_VU_TEN", nullable = false, length = 100)
    private String phongBanName;

    @OneToMany(mappedBy = "chucVu")
    private List<NhanVienEntitys> nhanViens;

}
