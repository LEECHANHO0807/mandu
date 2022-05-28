<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<jsp:useBean id="date" class="java.util.Date" />
<fmt:formatDate var="nowDay" value="${date}" pattern="yyyy-MM-dd"/>
<fmt:formatDate var="nowTime" value="${date}" pattern="HH:mm:ss"/>

<% pageContext.setAttribute("crlf", "\r\n"); %>

<c:set var="rootPath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}"/>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<c:set var="contextPath" value="${rootPath}${path}"/>

<c:set var="uri" value="${requestScope['javax.servlet.forward.request_uri']}"/>

<c:set var="jspPath" value="/WEB-INF/jsp"/>

<c:set var="commonCssPath" value="${contextPath}/template/cms/common/css"/>
<c:set var="commonJsPath" value="${contextPath}/template/cms/common/js"/>
<c:set var="commonImagePath" value="${contextPath}/template/cms/common/image"/>

<c:set var="baseCssPath" value="${contextPath}/template/cms/user/base/css"/>
<c:set var="baseJsPath" value="${contextPath}/template/cms/user/base/js"/>
<c:set var="baseImagePath" value="${contextPath}/template/cms/user/base/image"/>

<c:set var="siteCssPath" value="${contextPath}/template/cms/user/site/css"/>
<c:set var="siteJsPath" value="${contextPath}/template/cms/user/site/js"/>
<c:set var="siteImagePath" value="${contextPath}/template/cms/user/site/image"/>

