package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.bean.Student;

public class main {

	public static void main(String[] args) {
		
		String Config_loc="/in/sp/resourses/applicationcontext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(Config_loc);
		
		Student std=(Student) context.getBean("stdId1");
		std.display();
		System.out.println("--------------------------");
		Student std1=(Student) context.getBean("stdId2");
		std1.display();
		System.out.println("----------------------------");
		Student std11=(Student) context.getBean("stdId2");
		std11.display();
	}

}
// spring-beans-xxx.jar
// spring-core-xxx.jar
// spring-contex.jar
// spring-logging.jar
// spring-expression-xxx.jar