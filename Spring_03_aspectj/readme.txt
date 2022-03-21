Spring_03_aspectj:使用aspectj框架的注解，实现前置通知
实现步骤：
1.新建maven项目
2.修改pom.xml加入依赖
  spring-context依赖；  spring-aspects依赖
  junit
3.创建接口和实现类

4.创建一个切面类，是一个普通类
  1）在类的上面加入@Aspectj
  2）在类中定义方法，方法表示切面的功能
     在方法的上面加入Aspectj框架中的通知注解，例如@Before(value="切入点表达式")

5.创建spring配置文件
 1）声明目标对象
 2）声明切面类对象
 3）声明自动代理生成器

6.创建测试类，测试目标方法执行时，增加切面的功能
