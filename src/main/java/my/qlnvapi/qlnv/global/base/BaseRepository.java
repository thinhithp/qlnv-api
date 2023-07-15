package my.qlnvapi.qlnv.global.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T, E extends Serializable> extends JpaRepository<T, E> {

    //BaseRepository được định nghĩa như là một base class cho các Repository khác.
    // Bạn không muốn Spring Data tạo ra một implementation cho BaseRepository
    // vì nó không phản ánh một thực thể cụ thể nào trong cơ sở dữ liệu của bạn.
    // Thay vào đó, bạn muốn các interface khác kế thừa từ BaseRepository để tận dụng các phương thức mà nó cung cấp.


}
