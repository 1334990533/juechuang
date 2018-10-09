package cn.funwx.mall.controller.base;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.funwx.mall.exception.UnauthorizedException;

/** 
 * @description 
 * @author  chj 
 * @date 创建时间：2018-4-8 上午11:00:46 
 * @version 1.0 
 * @since  
 */
@ControllerAdvice
@SuppressWarnings("all")
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UnauthorizedException.class)
	@ResponseBody
	public Map<String, Object> handlerUnauthorEx() {
		Map map = new HashMap();
		map.put("code", 403);
		map.put("msg", "unauthorized request!");
		return map;
	}
}
