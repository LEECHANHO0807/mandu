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

	<!--  Popup -->
	<style>
	.popup_box {position: absolute; min-width:200px; padding: 10px 10px 35px; border: 1px solid #bbb; border-radius:5px; background-color: #fff; z-index: 100000; box-shadow: 2px 2px 7px #333; -webkit-box-shadow: 2px 2px 7px #333;}
	.popup_form_wrap {position:absolute; right:10px; bottom:10px;}
	.popup_form {text-align:right;}
	.popup_form > * {display:inline-block; height:17px; line-height:17px; font-size:13px; vertical-align:middle; font-family:'돋움','dotum', sans-serif;}
	.popup_close {width:36px; background-color:#aaa; border-radius:3px; color:#fff; text-align:center;}
	</style>

	<!--  Script -->
	<script src="/template/resources/scripts/jquery-3.2.1.min.js"></script>
	<script src="/template/resources/scripts/jquery.easing.1.3.js"></script>
	<script src="/template/resources/scripts/jquery.fitvids.js"></script>
	<script src="/template/resources/scripts/jquery.bxslider.min.js"></script>
	<script src="/template/resources/scripts/slick.js"></script>
	<script src="/template/resources/scripts/jquery.scrollbar.js"></script>
	<script src="/template/resources/scripts/jquery.balance.js"></script>
	<script src="/template/resources/scripts/jquery.ajax-cross-origin.min.js"></script>

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
			<span class="skip_item02"><a href="#header" onclick="document.getElementById('header').tabIndex = -1;document.getElementById('header').focus();return false;">메인메뉴 바로가기</a></span>
		</div>
	</aside>
	<div class="scrollbar">
		<!-- userHeader -->
		<tiles:insertAttribute name="userHeader" />
		<!-- // userHeader -->

		<!-- userContent -->
		<tiles:insertAttribute name="userContent" />
		<!-- // userContent -->

		<!-- userFooter -->
		<tiles:insertAttribute name="userFooter" />
		<!-- // userFooter -->
	</div>

	<!-- alert_layer_box -->
	<div class="alert_layer_box">
		<p class="txt"></p>

		<div class="btn_wrap ta_c">
			<a href="#" class="common_btn ok" onclick="alert_layer_close(true); return false;">확인</a>
		</div>
	</div>
	<!-- // alert_layer_box -->

	<!-- confirm_layer_box -->
	<div class="confirm_layer_box">
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

		$("#sns_youtube").click(function(){
			$("#sns_title").text("YOUTUBE");
		});

		$("#sns_fb").click(function(){
			$("#sns_title").text("FACEBOOK");
		});

		$("#sns_blog").click(function(){
			$("#sns_title").text("NAVER BLOG");
		});

		$.ajax({
		    dataType: 'json',
		    url : "https://graph.facebook.com/v9.0/246363932210328/feed?fields=message,full_picture,permalink_url,created_time&limit=6&access_token=EAAFZAVYRHzAEBAJyCstAb9Djm2GAcaRflewD5NcmS9x4gdDbJ1BllrSUmqXe3AS0p2QbqPuoTBabf24TW2S3JqGQsvrEaLJ10jZBEPbgTkB5jCniw4Bv2ugKag8uBubQz7RwOVMm7oHa8iil3wWIYFExX0LJ1mfxhSZAlyMoQZDZD",
		    async : false,
		    cache : false,
		    success : function(facebook, status, xhr) {
		    	var html = "";
		    	for (var i = 0; i < facebook.data.length; i++) {
		    		var data = facebook.data[i];
					var title = data.message != undefined ? data.message.substring(0, 60) : "";
					var link = data.permalink_url != undefined ? data.permalink_url : "#";
					var writeDate = data.created_time.substring(0,10).replace(/-/gi, ". ") + ".";
					var thumbnail = data.full_picture != undefined ? data.full_picture : "/template/resources/images/global/noimg.jpg"

					html += "<div><a href='"+link+"' title='페이지 새창으로 열기' target='_blank' rel='noopener'><div class='thumb'><div class='icons'><img src='/template/resources/images/main/section-sns-thumb-facebook.png' alt='페이스북' /></div><img src='"+ thumbnail +"'alt='' /></div><h3>" + title + "</h3><span>" + writeDate + "</span></a></div>";

				}
		    	$("#slider_sns_fb").html(html);
            }
		});

		$.ajax({
		    dataType: 'json',
		    url : "/base/main/naverBlog",
		    async : false,
		    cache : false,
		    success : function(blog, status, xhr) {
		    	var html = "";
		    	for (var i = 0; i < blog.length; i++) {
		    		var item = blog[i];
					var title = item.title != undefined ? item.title.substring(0, 60) : "";
					var link = item.link != undefined ? item.link : "#";
					var writeDate = item.writeDate != undefined ? item.writeDate : "2020. 01. 01.";

					html += "<div><a href='"+link+"' title='페이지 새창으로 열기' target='_blank' rel='noopener'><div class='thumb'><div class='icons'><img src='/template/resources/images/main/section-sns-thumb-blog.png' alt='블로그' /></div><img src='/template/resources/images/global/noimg.jpg' alt='' /></div><h3>" + title + "</h3><span>" + writeDate + "</span></a></div>";
				}
		    	$("#slider_sns_blog").html(html);
            }
		});

		$.ajax({
		    dataType: 'json',
		    url : "/base/main/nabisLocal",
		    async : false,
		    cache : false,
		    success : function(local, status, xhr) {
		    	var html = "";
		    	for (var i = 0; i < local.length; i++) {
		    		var item = local[i];
					var title = item.title != undefined ? item.title : "";
					var link = item.link != undefined ? item.link : "#";
					var contents = item.contents != undefined ? item.contents.substring(0, 50) : "";
					var writeDate = item.writeDate != undefined ? item.writeDate : "2020. 01. 01.";
					var thumbnail = item.thumbnail != undefined ? item.thumbnail : "/template/resources/images/global/noimg.jpg"
					var error = " onerror=\"this.src='/template/resources/images/global/noimg.jpg'\"";
					html += "<div><a href='"+link+"' title='게시글 보러가기' target='_blank' rel='noopener'><div class='thumb'><img src='" + thumbnail + "' " + error + " alt='' /></div><h4>" + title + "</h4><span class='text'>"+contents+"</span><span class='date'>"+writeDate+"</span></a></div>";
				}
		    	$("#slider_nabis01").html(html);
		    	//$("#slider_nabis01").slick(getSliderSettings("#slider_nabis01", "nabis"));
            }
		});

		$.ajax({
		    dataType: 'json',
		    url : "/base/main/nabisCurator",
		    async : false,
		    cache : false,
		    success : function(curator, status, xhr) {
		    	var html = "";
		    	for (var i = 0; i < curator.length; i++) {
		    		var item = curator[i];
					var title = item.title != undefined ? item.title : "";
					var link = item.link != undefined ? item.link : "#";
					var region = item.region != undefined ? item.region : "";
					var name = item.name != undefined ? item.name : "";
					var writeDate = item.writeDate != undefined ? item.writeDate : "2020. 01. 01.";
					var thumbnail = item.thumbnail != undefined ? item.thumbnail : "/template/resources/images/global/noimg.jpg"
					var error = " onerror=\"this.src='/template/resources/images/global/noimg.jpg'\"";
					html += "<div><a href='"+link+"' title='게시글 보러가기' target='_blank' rel='noopener'><div class='thumb'><img src='" + thumbnail + "' " + error + " alt='' /></div><h4>" + title + "</h4><span class='text'>"+ region +"("+ name +")</span><span class='date'>"+writeDate+"</span></a></div>";
		    	}
		    	$("#slider_nabis02").html(html);
            }
		});
	</script>

	<!-- 팝업 -->
	<jsp:include page="/WEB-INF/jsp/cms/user/base/view/popup/userPopupView.jsp" flush="false"/>

</body>
</html>
