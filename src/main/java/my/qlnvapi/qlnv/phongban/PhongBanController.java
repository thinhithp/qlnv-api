package my.qlnvapi.qlnv.phongban;

import lombok.RequiredArgsConstructor;
import my.qlnvapi.qlnv.global.constant.ApiConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
@RequiredArgsConstructor
public class PhongBanController {
    private final iPhongBanService iPhongBanService;

    @GetMapping(ApiConstants.PhongBan.SEARCH)
    public List<PhongBanEntity> search(){
        return iPhongBanService.search();
    }

}
