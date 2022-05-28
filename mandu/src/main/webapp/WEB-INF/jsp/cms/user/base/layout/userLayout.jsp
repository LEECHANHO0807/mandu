<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<%-- 사용자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/user/common/userCommon.jsp" %>

<!DOCTYPE html>
<html lang="ko">
<head>
	<!-- META -->
	<meta charset="UTF-8">
	<meta name="Title" content="${metaInformation.metaTitle}">
	<meta name="Author" content="${metaInformation.metaAuthor}">
	<meta name="Keywords" content="${metaInformation.metaKeywords}">
	<meta name="Description" content="${metaInformation.metaDescription}">
	<meta property="og:title" content="${metaInformation.metaTitle}">
	<meta property="og:description" content="${metaInformation.metaDescription}">
	<meta property="og:image" content="/template/resources/images/global/header-logo.png">
	<meta property="og:url" content="${metaInformation.metaUrl}">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name='viewport' content='initial-scale=1, viewport-fit=cover'>
	<meta name="author" content="nitroeye-jyj">

	<!-- TITLE -->
	<title><tiles:getAsString name="title"/></title>
	
	<!-- Favicon -->
	<link rel="shortcut icon" type="image/x-icon" href="${baseImagePath}/common/favicon.ico" >
	
	<!--  Stylesheet -->
	<link href="/template/resources/styles/style.css" rel="stylesheet" type="text/css" /><!-- 직접수정금지 -->
	<link href="/template/resources/styles/old/common.css" rel="stylesheet" type="text/css" />
	<link href="/template/resources/styles/old/style.css" rel="stylesheet" type="text/css" />
	<link href="/template/resources/styles/old/sub.css" rel="stylesheet" type="text/css" />
	<link href="/template/resources/styles/old/ionicons.min.css" rel="stylesheet" type="text/css" />
	
	<!--  Stylesheet(Base) -->
	<!-- link rel="stylesheet" type="text/css" href="${baseCssPath}/reset.css"-->
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/board.css">
	<!-- link rel="stylesheet" type="text/css" href="${baseCssPath}/common.css"
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/comm_respond.css">-->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bxslider/4.2.12/jquery.bxslider.min.css">
	<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css"> <!-- 유효성 주석처리할 부분 -->
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/jquery.bxslider.css">
	<!-- link rel="stylesheet" type="text/css" href="${baseCssPath}/main.css"-->
	<!-- link rel="stylesheet" type="text/css" href="${baseCssPath}/main_respond.css"-->
	
	<!--  Script -->
	<script src="/template/resources/scripts/jquery-3.2.1.min.js"></script>
	<script src="/template/resources/scripts/jquery.easing.1.3.js"></script>
	<script src="/template/resources/scripts/jquery.fitvids.js"></script>
	<script src="/template/resources/scripts/jquery.bxslider.min.js"></script>
	<script src="/template/resources/scripts/slick.js"></script>
	<script src="/template/resources/scripts/jquery.scrollbar.js"></script>
	<script src="/template/resources/scripts/jquery.balance.js"></script>
	
	<script src="${baseJsPath}/snsShare.js"></script>
	<script src="${baseJsPath}/common.js"></script>
	<script src="/template/resources/scripts/site.js"></script>
	
	<!--[if lt IE 9]>
		<script src="/template/resources/scripts/html5shiv.min.js"></script>
		<script src="/template/resources/scripts/selectivizr.js"></script>
		<script src="/template/resources/scripts/ie9.js"></script>
	<![endif]-->
	<!--[if lte IE 9]>
		<link href="/template/resources/styles/old/chosen.css" rel="stylesheet" type="text/css" />
		<script src="/template/resources/scripts/chosen.jquery.js"></script>
		<script>$(function(){$("select").chosen({disable_search_threshold: 100});});</script>
    <![endif]-->
	
	<%--
	<script src="/template/resources/scripts/jquery.js"></script>
	<script src="${baseJsPath}/jquery/jquery-migrate-1.4.1.min.js"></script>
	<script src="/template/resources/scripts/jquery.cookie.js"></script>
	<script src="${baseJsPath}/jquery.easing.1.3.js"></script>
	<script src="/template/resources/scripts/jquery.cycle.2.js"></script>
	<script src="/template/resources/scripts/jquery.cycle.2.carousel.js"></script>
	<script src="/template/resources/scripts/jquery.cycle.2.swipe.js"></script>
	<script src="/template/resources/scripts/slick.min.js"></script>
	<script src="/template/resources/scripts/aos.js"></script><!-- 유효성 주석처리할 부분 -->
	<script src="/template/resources/scripts/jquery.lazy.js"></script>
	<script src="/template/resources/scripts/jquery.lazy.plugins.js"></script>
	
	<!-- 
	<script src="${baseJsPath}/jquery/jquery-1.11.1.min.js"></script>
	<script src="${baseJsPath}/jquery/jquery-migrate-1.4.1.min.js"></script>
	<script src="${baseJsPath}/jquery.easing.1.3.js"></script>
	<script src="${baseJsPath}/common.js"></script>
	<script src="${baseJsPath}/snsShare.js"></script>
	<script src="${baseJsPath}/main.js"></script>
	-->
	
	<!--[if lt IE 10]>
		<script src="${baseJsPath}/placeholders.min.js"></script>
	<![endif]-->
	<!--[if lt IE 9]>
		<script src="${baseJsPath}/html5shiv.js"></script>
		<script src="${baseJsPath}/respond.min.js"></script>
	<![endif]-->
	--%>
</head>


<body>
	<aside class="skiptoContent">
		<h2 class="hidden_word">바로가기 메뉴</h2>
		<div>
			<strong>바로가기 메뉴</strong>
			<span class="skip_item01"><a href="#main" onclick="document.getElementById('main').tabIndex = -1;document.getElementById('main').focus();jQuery('#main').addClass('selected');return false;">본문내용 바로가기</a></span>
			<span class="skip_item02"><a href="#dropdown" onclick="document.getElementById('dropdown').tabIndex = -1;document.getElementById('dropdown').focus();return false;">메인메뉴 바로가기</a></span>
		</div>
	</aside>
	<div class="scrollbar">
		<%-- userHeader --%>
		<tiles:insertAttribute name="userHeader" />
		<%-- // userHeader --%>
		
		<!-- contents -->
		<main id="main">
			<div class="subpage">
				<%-- userLeftMenu --%>
				<%-- 클라이언트 요청으로 인한 미사용 처리
				<c:import url="${contextPath}/${siteCode}/left/view">
					<c:param name="menuLevel" value="${param.menuLevel}" />
					<c:param name="menuNo" value="${param.menuNo}" />
				</c:import>
				--%>
				<%-- // userLeftMenu --%>
	
				<div class="container">
					<!-- sub_con -->
					<section id="content">
						<%-- subtitle --%>
						<c:import url="${contextPath}/${siteCode}/top/view">
							<c:param name="menuLevel" value="${param.menuLevel}" />
							<c:param name="menuNo" value="${param.menuNo}" />
						</c:import>
						<%-- // subtitle --%>
					
						<%-- userContent --%>
						<!-- ====================== 컨텐츠 시작 ====================== -->
						
						<tiles:insertAttribute name="userContent" />
						
						<!-- ====================== //컨텐츠 끝 ====================== -->
						<%-- userContent --%>
					</section>
					<!-- // sub_con -->
				</div>
			</div>
		</main>
		<!-- // contents -->
	
		<%-- userFooter --%>
		<tiles:insertAttribute name="userFooter" />
		<%-- userFooter --%>
	</div>


	<!-- alert_layer_box -->
	<div id="alertLayer" class="alert_layer_box" tabindex="0">
		<p class="txt"></p>
		
		<div class="btn_wrap ta_c">
			<a href="#" class="common_btn" onclick="alert_layer_close(true); return false;">확인</a>
		</div>
	</div>
	<!-- // alert_layer_box -->	
	
	<!-- confirm_layer_box -->
	<div id="confirmLayer" class="confirm_layer_box" tabindex="0">
		<p class="txt"></p>
		
		<div class="btn_wrap ta_c">
			<a href="#" class="common_btn regist" onclick="confirm_layer_close(true); return false;">예</a>
			<a href="#" class="common_btn" onclick="confirm_layer_close(false); return false;">아니오</a>
		</div>
	</div>
	<!-- // confirm_layer_box -->

	<script>	
		var alertLayerResult = null;
		var layerFocus = null;
		
		function alert_layer_open(message, callback, returnTarget) {
			$(".alert_layer_box").stop(true,true).fadeIn();
			$('.alert_layer_box > .txt').empty().text(message);
			
			layerFocus = returnTarget;
			
			$('#alertLayer').focus();
			
			alertLayerResult = callback;
		}
		
		function alert_layer_close(result) {
			//$(".alert_layer_box").stop(true,true).fadeOut();
			$(".alert_layer_box").hide();
			$('.alert_layer_box > .txt').empty();
			
			if (result) {
				if (alertLayerResult != null) {
					alertLayerResult();
				}
			}
			
			alertLayerResult = null;
			
			$('[data-layer-focus="' + layerFocus + '"]').focus();
		}		
		

		var confirmLayerResult = null;
		
		function confirm_layer_open(message, callback, returnTarget) {
			$(".confirm_layer_box").stop(true,true).fadeIn();
			$('.confirm_layer_box > .txt').empty().text(message);
			
			layerFocus = returnTarget;
			
			$('#confirmLayer').focus();
			
			confirmLayerResult = callback;
		}
		
		function confirm_layer_close(result) {
			$(".confirm_layer_box").hide();
			$('.confirm_layer_box > .txt').empty();
			
			if (result) {
				if (confirmLayerResult != null) {
					confirmLayerResult();
				}
			}
			
			confirmLayerResult = null;
			
			$('[data-layer-focus="' + layerFocus + '"]').focus();
		}
	</script>
	
	<script>
		var subTitle = "";
		$(".breadcrumb").find("li").each(function(index, item){
			if(index == 0)
				return true;
			
			if(subTitle == "")
				subTitle = $(this).find("a").text();
			
			else
				subTitle = $(this).find("a").text() + " > " + subTitle;
		});
		
		document.title = subTitle + " | " + $("h1 a img").attr("alt");
		$("title").text(subTitle + " | " + $("h1 a img").attr("alt"));
		
	</script>
	
</body>


</html>