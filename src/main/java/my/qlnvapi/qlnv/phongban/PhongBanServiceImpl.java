package my.qlnvapi.qlnv.phongban;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.qlnvapi.qlnv.phongban.dto.PhongBanCreationDto;
import my.qlnvapi.qlnv.phongban.dto.PhongBanUpdateDto;
import my.qlnvapi.qlnv.phongban.entity.PhongBanEntity;
import my.qlnvapi.qlnv.phongban.mapper.PhongBanMapper;
import org.springframework.stereotype.Service;

import javax.swing.text.BadLocationException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PhongBanServiceImpl implements iPhongBanService {
    private final PhongBanRepository phongBanRepository;
    private final PhongBanMapper phongBanMapper;

    @Override
    public List<PhongBanEntity> get() {
        return this.phongBanRepository.findAll();
    }

    @Override
    public PhongBanEntity create(PhongBanCreationDto creationDto) {
        PhongBanEntity phongBanEntity = phongBanMapper.toPhongBanCreateDto(creationDto);
        return phongBanRepository.save(phongBanEntity);
    }

    @Override
    public PhongBanEntity update(PhongBanUpdateDto creationDto) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
      PhongBanEntity phongBanEntity =  this.findById(id);
        if (phongBanEntity == null){
          return false;
        }else {
            phongBanEntity.setIsDeleted((byte) 1);
            phongBanEntity.setNgaySua(new Date());
            phongBanEntity.setNguoiSua("THinh");
            this.phongBanRepository.save(phongBanEntity);

        }
        return true;
    }

    @Override
    public PhongBanEntity findById(Long id) {
        Optional<PhongBanEntity> optionalPhongBan = this.phongBanRepository.findById(id);
        return optionalPhongBan.orElse(null);
    }


}
