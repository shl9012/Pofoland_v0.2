/*
 * @(#) AbstractController.java
 *
 * v1.0.0 / 2017. 12. 25.
 *
 * Copyright ((c) 2017 by HST, Inc. All Rights Reserved.
 */
package com.hst.pofoland.common.layer.web;

/**
 * 
 * 시스템명 : 포트폴리오 관리 시스템
 * $com.hst.pofoland.common.layer.web.AbstractController.java
 *
 * @author 이현규
 * @since 2017. 12. 26.
 * @version 1.0.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일			수정자			수정내용
 * -------------------------------------------------
 * 2017. 12. 26.	이현규			최초생성
 * </pre>
 */
public abstract class AbstractController {
    
    public static final String REDIRECT_PREFIX = "redirect:";
    public static final String FORWARD_PREFIX = "forward:";
    public static final String ROOT = "/";
    
    protected String redirect(String targetUrl) {
        return REDIRECT_PREFIX + targetUrl;
    }
    
    protected String forward(String targetUrl) {
        return FORWARD_PREFIX + targetUrl;
    }
    
}
