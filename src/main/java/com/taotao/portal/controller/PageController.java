package com.taotao.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面显示Controller
 * <p>
 * Title: PageController
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.taotao.com
 * </p>
 * 
 * @author fb
 * @date 2017年3月12日 下午9:07:46
 * @version 1.0
 */
@Controller
public class PageController {

	@RequestMapping("/index")
	public String showIndex() {
		return "index";
	}

}
