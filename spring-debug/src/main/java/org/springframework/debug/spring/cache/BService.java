package org.springframework.debug.spring.cache;

/**
 * @Author: zhoudong
 * @Description:
 * @Date: 2022/7/20 19:09
 * @Version:
 **/
//@Component
public class BService {

	private AService aService;

	public AService getaService() {
		return aService;
	}

	public void setaService(AService aService) {
		this.aService = aService;
		System.out.println("B 里面设置了 A");
	}

	public BService(){
		System.out.println("---B created success");
	}
}