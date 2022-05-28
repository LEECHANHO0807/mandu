<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<%-- 사용자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/user/common/userCommon.jsp" %>


<!DOCTYPE html>


<html lang="ko">


<head>

	<!-- META -->
	<meta charset="UTF-8">
	<meta name="Author" content="이름">
	<meta name="Keywords" content="키워드">
	<meta name="Description" content="설명">
	<meta property="og:title" content="이름">
	<meta property="og:description" content="설명">
	<meta property="og:image" content="${baseImagePath}/common/head_logo.png">
	<meta property="og:url" content="url">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
	<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/webfont/1.4.10/webfont.js"></script>
	<script>
		WebFont.load({
			// For google fonts
			google: {
			    families: ['Open Sans']
			},
			// For early access or custom font
			custom: {
				families: ['Noto Sans KR', 'NanumSquare'],
				urls: ['${baseCssPath}/notosans.css', '${baseCssPath}/nanumsquare.css']
			}
		});
	</script>
	<link rel="shortcut icon" type="image/x-icon" href="${baseImagePath}/common/favicon.ico" >
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/reset.css">
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/board.css">
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/common.css">
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/comm_respond.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bxslider/4.2.12/jquery.bxslider.min.css">
	<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/sub.css">
	<link rel="stylesheet" type="text/css" href="${baseCssPath}/sub_respond.css">
	
	<script type="text/javascript" src="${baseJsPath}/jquery/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${baseJsPath}/jquery/jquery-migrate-1.4.1.min.js"></script>
	<script type="text/javascript" src="${baseJsPath}/jquery.easing.1.3.js"></script>
	<script type="text/javascript" src="${baseJsPath}/common.js"></script>
	<script type="text/javascript" src="${baseJsPath}/snsShare.js"></script>
	<script type="text/javascript" src="${baseJsPath}/sub.js"></script>
	
	<!--[if lt IE 10]>
		<script src="${baseJsPath}/placeholders.min.js" type="text/javascript"></script>
	<![endif]-->
	<!--[if lt IE 9]>
		<script src="${baseJsPath}/html5shiv.js" type="text/javascript"></script>
		<script src="${baseJsPath}/respond.min.js" type="text/javascript"></script>
	<![endif]-->

	<!-- TITLE -->
	<title>${mainPopupRead.title}</title>
	
</head>


<body>

	<!-- wrapper -->
	<div class="wrapper">
		
		<div id="popup_layer_${mainPopupRead.popupNo}">
				
			<div>
				${mainPopupRead.content}
			</div>
		
			<!-- 닫기 레이어-->
			<div class="popup_form_wrap">
				<form name="popupform" class="popup_form">
				    <input type="checkbox" id="popupClose_${mainPopupRead.popupNo}" name="popupclose" value="Y">
				    <label for="popupClose_${mainPopupRead.popupNo}">1일 동안 이 창 열지 않기</label>
					<a href="#" class="popup_close" onclick="popupClose('${mainPopupRead.popupNo}'); return false;">닫기</a>
				</form>
			</div>
		</div>
		
		<script>
		//<![CDATA[
		
		function getCookie(name) {
		    var nameOfCookie = name + '=';
		    var x = 0;
		
		    while (x <= document.cookie.length) {
		        var y = (x + nameOfCookie.length);
		
		        if (document.cookie.substring(x, y) == nameOfCookie) {
		
		            if ((endOfCookie=document.cookie.indexOf(';', y)) == -1) {
		                endOfCookie = document.cookie.length;
		            }
		
		            return unescape(document.cookie.substring(y, endOfCookie));
		        }
		
		        x = document.cookie.indexOf(' ', x) + 1;
		
		        if (x == 0) {
		        	break;
		        }
		    }
		
		    return '';
		}
		
		
		function setCookies(name, value, expiredays) {
			var todayDate = new Date();
		    todayDate.setDate( todayDate.getDate() + expiredays );
		    document.cookie = name + '=' + escape(value) + '; path=/; expires=' + todayDate.toGMTString() + ';';
		}
		
		
		function popupClose(popupNo) {
			if ($('#popupClose_' + popupNo).prop('checked')) {
				setCookies('CMS_POPUP_LAYER_' + popupNo, 'done', 1);
			}
		
			self.close();
		}
		
		//]]>
		</script>
		
		
	</div>
	<!-- // wrapper -->

</body>


</html>

