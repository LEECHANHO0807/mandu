<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<%-- 사용자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/user/common/userCommon.jsp" %>

	<!-- Global site tag (gtag.js) - Google Analytics -->
<!-- 	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-174971961-1"></script>
	<script>
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());
	
	  gtag('config', 'UA-174971961-1');
	</script> -->

	<header id="header">
		<div class="container">
			<h1><c:import url="${contextPath}/${siteCode}/header/view" /></h1>
			<nav>
				<c:import url="${contextPath}/${siteCode}/menu/view" >
					<c:param name="menuLevel" value="${param.menuLevel}" />
					<c:param name="menuNo" value="${param.menuNo}" />	
				</c:import>
				<ul class="links">
					<li><a href="https://www.nabis.go.kr/" title="사이트 바로가기" target="_blank"><img src="/template/resources/images/global/header-links-nabis.png" alt="NABIS" /></a></li>
					<li><a href="https://www.youtube.com/channel/UCdgLeMqCZ78ox1XDPNOVSEw" title="사이트 바로가기" target="_blank"><img width="38" src="/template/resources/images/icons/youtube.png" alt="유튜브" /></a></li>
					<li><a href="https://www.facebook.com/balance.go.kr" title="사이트 바로가기" target="_blank"><img width="38" src="/template/resources/images/icons/facebook.png" alt="페이스북" /></a></li>
					<li><a href="http://blog.naver.com/redis12" title="사이트 바로가기" target="_blank"><img width="38" src="/template/resources/images/icons/blog.png" alt="블로그" /></a></li>
				</ul>
				<ul class="icons">
					<li>
						<a class="gnb-open" href="#" title="메뉴 펼치기" target="_blank"><img src="/template/resources/images/icons/menu.png" alt="메뉴" /></a>
						<a class="gnb-close" href="#" title="메뉴 접기" target="_blank"><img src="/template/resources/images/icons/close.png" alt="닫기" /></a>
					</li>
					<li>
						<a class="search-open" href="#" title="검색 펼치기" target="_blank"><img src="/template/resources/images/icons/search.png" alt="검색" /></a>
						<a class="search-close" href="#" title="검색 접기" target="_blank"><img src="/template/resources/images/icons/close.png" alt="닫기" /></a>
					</li>
				</ul>
			</nav>
		</div>
	</header>
	<div id="gnb">
		<div class="gnb-inner">
			<div class="scrollbar">
				<c:import url="${contextPath}/${siteCode}/menu/view" >
					<c:param name="menuLevel" value="${param.menuLevel}" />
					<c:param name="menuNo" value="${param.menuNo}" />	
				</c:import>
			</div>
		</div>
	</div>
	<div id="search">
		<div class="form-outer">
			<form id="searchForm" name="searchForm" action="${contextPath}/${siteCode}/search/view" method="get">
				<label for="search-keyword" class="hide">통합검색</label>
				<input id="search-keyword" name="searchWord" type="text" title="통합검색" placeholder="검색어를 입력해주세요">
				<input type="hidden" name="menuLevel" id="search_menuLevel" value="2"/>
				<input type="hidden" name="menuNo" id="search_menuNo" value="50"/>
				<input type="hidden" name="searchType" id="searchType" value="TOTAL"/>
				<button type="submit" onclick="document.searchForm.submit(); return false;">검색</button>
			</form>
		</div>
	</div>
	