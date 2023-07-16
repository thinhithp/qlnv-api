package my.qlnvapi.qlnv.phongban.mapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.qlnvapi.qlnv.phongban.dto.PhongBanCreationDto;
import my.qlnvapi.qlnv.phongban.dto.PhongBanUpdateDto;
import my.qlnvapi.qlnv.phongban.entity.PhongBanEntity;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
@Slf4j
public class PhongBanMapper {

    public PhongBanEntity toPhongBanCreateDto(PhongBanCreationDto entity){
        return PhongBanEntity.builder()
                .phongBanName(entity.getPhongBanName())
                .ngayTao(new Date())
                .nguoiTao(entity.getNguoiTao())
                .build();
    }

    public PhongBanEntity toPhongBanUpdateDto(PhongBanUpdateDto entity){
        return PhongBanEntity.builder()
                .phongBanId(entity.getId())
                .phongBanName(entity.getPhongBanName())
                .ngayTao(new Date())
                .nguoiTao(entity.getNguoiSua())
                .build();
    }
}
