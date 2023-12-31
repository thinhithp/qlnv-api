package my.qlnvapi.qlnv.phongban.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhongBanCreationDto {

    private String phongBanName;

    private String nguoiTao;
}
