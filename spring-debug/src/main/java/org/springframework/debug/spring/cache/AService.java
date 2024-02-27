package org.springframework.debug.spring.cache;

import org.springframework.stereotype.Component;

/**
 * @Author: zhoudong
 * @Description:
 * @Date: 2022/7/20 19:09
 * @Version:
 **/
//@Component
public class AService {

	private BService bService;

	public BService getbService() {
		return bService;
	}

	public void setbService(BService bService) {
		this.bService = bService;
		System.out.println("A 里面设置了 B");
	}
}
