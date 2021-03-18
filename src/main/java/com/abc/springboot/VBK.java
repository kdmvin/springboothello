
package com.abc.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
*
*@author Vinayak Kadam
*
*/
@RestController
public class VBK {
	@RequestMapping("/")
	public String hello() {
		return "Hello Vinayak";
	}
}
