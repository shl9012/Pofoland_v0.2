<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="application" />

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Insert title here</title>
	
    <!-- Web Fonts  -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,500,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,700,800,900" rel="stylesheet" type="text/css">

    <!-- Libs CSS -->
    <link href="${contextPath}/resources/vendor/css/bootstrap.min.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/style.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/font-awesome.min.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/streamline-icon.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/v-nav-menu.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/v-portfolio.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/v-blog.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/v-animation.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/v-bg-stylish.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/v-shortcodes.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/css/theme-responsive.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/plugins/owl-carousel/owl.theme.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/plugins/owl-carousel/owl.carousel.css" rel="stylesheet" />

    <!-- Current Page CSS -->
    <link href="${contextPath}/resources/vendor/plugins/rs-plugin/css/settings.css" rel="stylesheet" />
    <link href="${contextPath}/resources/vendor/plugins/rs-plugin/css/custom-captions.css" rel="stylesheet" />

    <!-- Custom CSS -->
    <link rel="stylesheet" href="${contextPath}/resources/vendor/css/custom.css">
	
	<script type="text/javascript" src="${contextPath}/resources/vendor/js/jquery.min.js"></script><!-- jQuery -->
    <script type="text/javascript" src="${contextPath}/resources/vendor/jquery-ui/jquery-ui.min.js"></script><!-- jQuery UI -->
    <script type="text/javascript" src="${contextPath}/resources/vendor/js/bootstrap.min.js"></script><!-- Bootstrap -->
    <script type="text/javascript" src="${contextPath}/resources/vendor/js/bootstrap-select.min.js"></script><!-- Bootstrap -->
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div id="container">
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>