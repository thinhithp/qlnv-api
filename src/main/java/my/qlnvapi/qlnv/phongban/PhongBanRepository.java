package my.qlnvapi.qlnv.phongban;

import my.qlnvapi.qlnv.global.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends BaseRepository<PhongBanEntity, Long> {

}
