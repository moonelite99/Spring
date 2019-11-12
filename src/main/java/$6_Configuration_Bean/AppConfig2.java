//package $6_Configuration_Bean;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AppConfig2 {
//
//    @Bean
//    SimpleBean simpleBeanConfigure(){
//        // Khởi tạo một instance của SimpleBean và trả ra ngoài
//        return new SimpleBean("Moon");
//    }
//
//    @Bean("mysqlConnector")
//    DatabaseConnector mysqlConfigure(SimpleBean simpleBean) { // SimpleBean được tự động inject vào.
//        DatabaseConnector mySqlConnector = new MySqlConnector();
//        mySqlConnector.setUrl("jdbc:mysql://host1:33060/" + simpleBean.getUsername());
//        // Set username, password, format, v.v...
//        return mySqlConnector;
//    }
//}