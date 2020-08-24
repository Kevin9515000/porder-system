package FACT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Model.member;
import Model.message;
import Model.porder;

//spring 第2種方法
@Configuration
public class modelDi {
	
	@Bean(name="m")
	public member getMember() {
		member m=new member();
		m.setName("KKK");
		return m;
	}
	
	@Bean(name="p")
	public porder getPorder() {
		return new porder();
	}
	
	@Bean(name="ms")
	public message getMessage() {
		return new message();
	}
	
	@Bean(name="factModel")
	public factModel getfactModel() {
		factModel f=new factModel();
		f.setM(getMember());
		f.setP(getPorder());
		f.setMs(getMessage());
		return f;
	}
}
