<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%-- 사용자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/user/common/userCommon.jsp" %>


<script>
	var linkUrl = '${param.linkUrl}';
	var target = '${param.linkType}';
	
	if (target == 'SELF') {
		location.href = linkUrl;
		
	} else if (target == 'BLANK'){
		window.open(linkUrl);
		
	}		
</script>


<p style="text-align: center; margin-top: 100px;">
	${param.linkUrl}로 이동되었습니다.
</p>

