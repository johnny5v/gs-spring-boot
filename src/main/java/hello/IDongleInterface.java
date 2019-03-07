package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by i341924 on 2019/3/7.
 */
public interface IDongleInterface extends JpaRepository<Dongle,Integer>{
    Dongle findBySpace(String space);

}

