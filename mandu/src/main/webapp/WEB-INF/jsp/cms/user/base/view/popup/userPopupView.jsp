<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<%-- 사용자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/user/common/userCommon.jsp" %>

<!-- css는 메인페이지 부분으로 옮김 -->

<c:choose>
	<c:when test="${not empty mainPopupList}">

		<c:forEach var="item" items="${mainPopupList}">

			<c:choose>
			
				<c:when test="${item.type eq 'WINDOW'}">
					<script>
						window.open('/${siteCode}/popup/windowView?popupNo=${item.popupNo}','${item.title}','width=${item.sizeWidth}, height=${item.sizeHeight}, top=${item.locationTop}, left=${item.locationLeft}');
					</script>
				</c:when>			
			
				<c:when test="${item.type eq 'LAYER'}">
					<div id="popup_layer_${item.popupNo}" class="popup_box" style="top:${item.locationTop}px; left:${item.locationLeft}px; width:${item.sizeWidth}px; height:${item.sizeHeight}px;">
		
						<!-- 팝업 내용 레이어 -->
						<div>
							${item.content}
						</div>
		
						<!-- 닫기 레이어-->
						<div class="popup_form_wrap">
							<form name="popupform" class="popup_form">
							    <input type="checkbox" id="popupClose_${item.popupNo}" name="popupclose" value="Y">
							    <label for="popupClose_${item.popupNo}">1일 동안 이 창 열지 않기</label>
								<a href="#" class="popup_close" onclick="popupClose('${item.popupNo}'); return false;">닫기</a>
							</form>
						</div>
					</div>
				</c:when>
				
			</c:choose>
			
		</c:forEach>

	</c:when>

	<c:otherwise>
	</c:otherwise>
</c:choose>

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

	$('#popup_layer_' + popupNo).hide();
}

//]]>
</script>
