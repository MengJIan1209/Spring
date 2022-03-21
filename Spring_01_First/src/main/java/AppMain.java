import com.meng.spring.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {

//        SomeService service = new SomeServiceImpl();
//        service.doSome();

        //1.指定spring配置文件：从类路径(classPath)之下开始的路径
        String config = "ba01/applicationContext.xml";
        //2.创建容器对象：ApplicationContext 表示spring容器对象。通过context获取某个java对象
        ApplicationContext context =new  ClassPathXmlApplicationContext(config);
        //从容器中获取指定的名称，使用getBean("id")；
        SomeService service = (SomeService) context.getBean("someService");
        //4.调用对象的方法，接口中的方法
        service.doSome();

    }

}
