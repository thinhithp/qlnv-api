package my.qlnvapi.qlnv.phongban;

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
@Table(name = "PHONG_BAN")
public class PhongBanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long phongBanId;

    @Column(name = "PHONG_BAN_NAME", nullable = false, length = 100)
    private String phongBanName;

    @OneToMany(mappedBy = "phongBan")
    private List<NhanVienEntitys> nhanViens;
}
