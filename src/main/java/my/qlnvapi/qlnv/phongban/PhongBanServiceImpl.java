package my.qlnvapi.qlnv.phongban;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PhongBanServiceImpl implements iPhongBanService {
    private final PhongBanRepository phongBanRepository;

    public List<PhongBanEntity> search(){
        return phongBanRepository.findAll();
    }
}
