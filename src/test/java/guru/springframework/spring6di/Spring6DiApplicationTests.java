package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    private ApplicationContext applicationContextcontext;

    @Autowired
    private MyController myController;

    @Test
    public void testAutowiredOfController() {
        System.out.println(myController.sayHello());
    }

    @Test
    public void testGetControllerFromCtx() {
        MyController controller = applicationContextcontext.getBean(MyController.class);
        System.out.println(controller.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
