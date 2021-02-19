package io.fxtahe.shardingjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *     ShardingJdbcApplication
 * </p>
 * @author fxtahe
 * @since 2021/2/19
 */
@SpringBootApplication
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class,args);
    }
}
