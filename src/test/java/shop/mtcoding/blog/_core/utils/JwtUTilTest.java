package shop.mtcoding.blog._core.utils;

import org.junit.jupiter.api.Test;
import shop.mtcoding.blog.user.User;

public class JwtUTilTest {

    @Test
    public void create_test(){
        //given
        User user = User.builder()
                .id(1)
                .username("ssar")
                .build();

        //when
        String jwt = Jwtutill.create(user);
        System.out.println(jwt);

        //then

    }
}
