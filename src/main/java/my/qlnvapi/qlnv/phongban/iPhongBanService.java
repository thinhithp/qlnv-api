package my.qlnvapi.qlnv.phongban;

import my.qlnvapi.qlnv.phongban.dto.PhongBanCreationDto;
import my.qlnvapi.qlnv.phongban.dto.PhongBanUpdateDto;
import my.qlnvapi.qlnv.phongban.entity.PhongBanEntity;

import java.util.List;

public interface iPhongBanService {

    List<PhongBanEntity> get();
    PhongBanEntity create(PhongBanCreationDto creationDto);

    PhongBanEntity update(PhongBanUpdateDto creationDto);

    boolean delete(Long id);

    PhongBanEntity findById(Long id);
}
