package com.hst.pofoland.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AuthInspectionInterceptor extends HandlerInterceptorAdapter{
	
	/**
	 * 시스템명 : 포트폴리오 관리 시스템
	 * $com.hst.pofoland.common.interceptor.AuthInspectionInterceptor.java
	 * 클래스 설명 : User 로그인과 인증여부 검사 인터셉터
	 *
	 * @author 김영훈
	 * @since 2017. 12. 26.
	 * @version 1.0.0
	 * @see
	 *
	 * <pre>
	 * << 개정이력(Modification Information) >>
	 *
	 * 수정일			수정자			수정내용
	 * -------------------------------------------------
	 * 2017. 12. 26.	김영훈			최초생성
	 * </pre>
	*/
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("pre");
		return true;
	}
}
