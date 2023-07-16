package my.qlnvapi.qlnv.phongban.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhongBanUpdateDto {
    private Long id;
    private String phongBanName;
    private String nguoiSua;
}
