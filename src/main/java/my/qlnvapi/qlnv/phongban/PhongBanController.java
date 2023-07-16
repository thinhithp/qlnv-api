package my.qlnvapi.qlnv.phongban;

import lombok.RequiredArgsConstructor;
import my.qlnvapi.qlnv.global.constant.ApiConstants;
import my.qlnvapi.qlnv.phongban.dto.PhongBanCreationDto;
import my.qlnvapi.qlnv.phongban.entity.PhongBanEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
@RequiredArgsConstructor
public class PhongBanController {
    @Autowired
    private final iPhongBanService iPhongBanService;

    @GetMapping(ApiConstants.PhongBan.SEARCH)
    public List<PhongBanEntity> get(){
        return iPhongBanService.get();
    }

    @PostMapping(ApiConstants.PhongBan.CREATE)
    public PhongBanEntity create(@RequestBody PhongBanCreationDto creationDto){
        return iPhongBanService.create(creationDto);
    }

    @GetMapping(ApiConstants.PhongBan.SEARCH_BY_ID)
    public PhongBanEntity findById(@PathVariable Long id){
        return iPhongBanService.findById(id);
    }

    @DeleteMapping(ApiConstants.PhongBan.DELETE)
    public boolean delete(@PathVariable Long id){
        return iPhongBanService.delete(id);
    }

}
