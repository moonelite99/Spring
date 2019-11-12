package $4_Component_Service_Repository;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public Girl getRandomGirl(){
        // Random 1 cái tên độ dài 10
        String name = randomGirlName(6);

        // Gọi xuông tầng repository để query lấy một cô gái tên là "name" trong database
        return girlRepository.getGirlByName(name);
    }

    public String randomGirlName(int length) {
        // Random một string có độ dài quy định
        // Sử dụng thư viện Apache Common Lang
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }
}