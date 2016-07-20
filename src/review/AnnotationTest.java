package review;

import java.lang.reflect.Method;

public class AnnotationTest {
	public static void main(String[] args) {
		Class<TestService> clazz = TestService.class;
		
//		Method[] method = clazz.getMethods();
		Method[] method = clazz.getDeclaredMethods();
	
		for(Method m : method){
			NeedTest nt = m.getAnnotation(NeedTest.class);
		
			if(nt.value()){
				System.out.println(m.getName() + " need test");
			}
			else{
				System.out.println(m.getName() + " do not need test");
			}
		
		}
	
	
	
	}
}
