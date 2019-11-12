package $4_Component_Service_Repository;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository {

    @Override
    public Girl getGirlByName(String name) {
        // Ở đây tôi ví dụ là database đã trả về
        // một cô gái với tên đúng như tham số

        // Còn thực tế phải query trong csdl nhé.
        return new Girl(name);
    }
}