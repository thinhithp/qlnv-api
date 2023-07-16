package my.qlnvapi.qlnv.phongban;

import my.qlnvapi.qlnv.phongban.dto.PhongBanCreationDto;
import my.qlnvapi.qlnv.phongban.entity.PhongBanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBanEntity, Long> {
PhongBanEntity save(PhongBanEntity phongBanEntity);


}
