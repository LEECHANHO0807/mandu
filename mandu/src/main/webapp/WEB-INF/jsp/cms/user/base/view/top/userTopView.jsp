<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<%-- 관리자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/admin/common/adminCommon.jsp" %>
	<c:set var="prevMenuUrl" value="#"/>
	<c:set var="nextMenuUrl" value="#"/>
	<c:if test="${prevMenu ne null}">
		<c:choose>
			<c:when test="${prevMenu.type eq 'BASE'}">
				<c:set var="prevMenuUrl" value="${contextPath}/${siteCode}/menu/baseView?menuLevel=${prevMenu.menuLevel}&amp;menuNo=${prevMenu.menuNo}"/>
			</c:when>
			<c:when test="${prevMenu.type eq 'BOARD'}">
				<c:set var="prevMenuUrl" value="${contextPath}/${siteCode}/board/list?boardManagementNo=${prevMenu.referenceNo}&amp;menuLevel=${prevMenu.menuLevel}&amp;menuNo=${prevMenu.menuNo}"/>
			</c:when>
			<c:when test="${prevMenu.type eq 'SCHEDULE'}">
				<c:set var="prevMenuUrl" value="${contextPath}/${siteCode}/schedule/list?scheduleManagementNo=${prevMenu.referenceNo}&amp;menuLevel=${prevMenu.menuLevel}&amp;menuNo=${prevMenu.menuNo}"/>
			</c:when>
			<c:when test="${prevMenu.type eq 'RENTAL'}">
				<c:set var="prevMenuUrl" value="${contextPath}/${siteCode}/rental/calendar?rentalManagementNo=${prevMenu.referenceNo}&amp;menuLevel=${prevMenu.menuLevel}&amp;menuNo=${prevMenu.menuNo}"/>
			</c:when>
			<c:when test="${prevMenu.type eq 'CONTENTS'}">
				<c:set var="prevMenuUrl" value="${contextPath}/${siteCode}/contents/view?contentsNo=${prevMenu.referenceNo}&amp;menuLevel=${prevMenu.menuLevel}&amp;menuNo=${prevMenu.menuNo}"/>
			</c:when>
			<c:when test="${prevMenu.type eq 'LINK'}">
				<c:choose>
					<c:when test="${not empty prevMenu.linkUrl}">
						<c:set var="prevMenuUrl" value="${prevMenu.linkUrl}"/>
						<%-- <c:choose>
							<c:when test="${prevMenu.linkType eq 'SELF'}">
								<a href="${prevMenu.linkUrl}" target="_self">${prevMenu.title}</a>
							</c:when>
							<c:when test="${prevMenu.linkType eq 'BLANK'}">
								<a href="${prevMenu.linkUrl}" target="_blank">${prevMenu.title}</a>
							</c:when>
							<c:otherwise>
								<a href="${prevMenu.linkUrl}">${prevMenu.title}</a>
							</c:otherwise>
						</c:choose> --%>
					</c:when>
					<c:otherwise>
						<c:set var="prevMenuUrl" value="#"/>		
					</c:otherwise>
				</c:choose>
			</c:when>
			<c:when test="${prevMenu.type eq 'CUSTOM'}">
				<c:choose>
					<c:when test="${not empty prevMenu.customUrl}">
						<c:set var="prevMenuUrl" value="${prevMenu.customUrl}?menuLevel=${prevMenu.menuLevel}&amp;menuNo=${prevMenu.menuNo}"/>
					</c:when>
					<c:otherwise>
						<c:set var="prevMenuUrl" value="#"/>	
					</c:otherwise>
				</c:choose>
			</c:when>
		</c:choose>
	</c:if>
	
	<c:if test="${nextMenu ne null}">
		<c:choose>
			<c:when test="${nextMenu.type eq 'BASE'}">
				<c:set var="nextMenuUrl" value="${contextPath}/${siteCode}/menu/baseView?menuLevel=${nextMenu.menuLevel}&amp;menuNo=${nextMenu.menuNo}"/>
			</c:when>
			<c:when test="${nextMenu.type eq 'BOARD'}">
				<c:set var="nextMenuUrl" value="${contextPath}/${siteCode}/board/list?boardManagementNo=${nextMenu.referenceNo}&amp;menuLevel=${nextMenu.menuLevel}&amp;menuNo=${nextMenu.menuNo}"/>
			</c:when>
			<c:when test="${nextMenu.type eq 'SCHEDULE'}">
				<c:set var="nextMenuUrl" value="${contextPath}/${siteCode}/schedule/list?scheduleManagementNo=${nextMenu.referenceNo}&amp;menuLevel=${nextMenu.menuLevel}&amp;menuNo=${nextMenu.menuNo}"/>
			</c:when>
			<c:when test="${nextMenu.type eq 'RENTAL'}">
				<c:set var="nextMenuUrl" value="${contextPath}/${siteCode}/rental/calendar?rentalManagementNo=${nextMenu.referenceNo}&amp;menuLevel=${nextMenu.menuLevel}&amp;menuNo=${nextMenu.menuNo}"/>
			</c:when>
			<c:when test="${nextMenu.type eq 'CONTENTS'}">
				<c:set var="nextMenuUrl" value="${contextPath}/${siteCode}/contents/view?contentsNo=${nextMenu.referenceNo}&amp;menuLevel=${nextMenu.menuLevel}&amp;menuNo=${nextMenu.menuNo}"/>
			</c:when>
			<c:when test="${nextMenu.type eq 'LINK'}">
				<c:choose>
					<c:when test="${not empty nextMenu.linkUrl}">
						<c:set var="nextMenuUrl" value="${nextMenu.linkUrl}"/>
						<%-- <c:choose>
							<c:when test="${nextMenu.linkType eq 'SELF'}">
								<a href="${nextMenu.linkUrl}" target="_self">${nextMenu.title}</a>
							</c:when>
							<c:when test="${nextMenu.linkType eq 'BLANK'}">
								<a href="${nextMenu.linkUrl}" target="_blank">${nextMenu.title}</a>
							</c:when>
							<c:otherwise>
								<a href="${nextMenu.linkUrl}">${nextMenu.title}</a>
							</c:otherwise>
						</c:choose> --%>
					</c:when>
					<c:otherwise>
						<c:set var="nextMenuUrl" value="#"/>		
					</c:otherwise>
				</c:choose>
			</c:when>
			<c:when test="${nextMenu.type eq 'CUSTOM'}">
				<c:choose>
					<c:when test="${not empty nextMenu.customUrl}">
						<c:set var="nextMenuUrl" value="${nextMenu.customUrl}?menuLevel=${nextMenu.menuLevel}&amp;menuNo=${nextMenu.menuNo}"/>
					</c:when>
					<c:otherwise>
						<c:set var="nextMenuUrl" value="#"/>	
					</c:otherwise>
				</c:choose>
			</c:when>
		</c:choose>
	</c:if>
				
				<!-- 컨텐츠 제목, 로케이션 -->
				<div class="subtitle">
					<c:choose>
						<c:when test="${topInformation.title eq '영상' or topInformation.title eq '사진 ' or topInformation.title eq '문서'}">
							<h2>자료실</h2>					
						</c:when>
						<c:otherwise>
							<h2>${topInformation.title}</h2>
						</c:otherwise>
					</c:choose>
					<nav class="breadcrumb" aria-label="breadcrumb">
						<h2 class="hide">사이트 이동 경로(Breadcrumb Navigation)</h2>
						<ul>
							<li><a href="/" title="홈으로 이동"><!--i class="icon-breadcrumb-home">홈</i--> Home</a></li>
							<c:choose>
								<c:when test="${not empty topInformation}">	
									<c:if test="${not empty topInformation.firstTitle}">							
										<li><a href="#aydf" title="${topInformation.firstTitle} 메뉴로 이동" <c:if test="${empty topInformation.secondTitle}">aria-current="page"</c:if>>${topInformation.firstTitle}</a></li>							
									</c:if>
									<c:if test="${not empty topInformation.secondTitle}">
										<li><a href="#aydf" title="${topInformation.secondTitle} 메뉴로 이동" <c:if test="${empty topInformation.thirdTitle}">aria-current="page"</c:if>>${topInformation.secondTitle}</a></li>							
									</c:if>
									<c:if test="${not empty topInformation.thirdTitle}">
										<li><a href="#aydf" title="${topInformation.thirdTitle} 메뉴로 이동" <c:if test="${empty topInformation.fourthTitle}">aria-current="page"</c:if>>${topInformation.thirdTitle}</a></li>							
									</c:if>				
									<c:if test="${not empty topInformation.fourthTitle}">
										<li><a href="#aydf" title="${topInformation.fourthTitle} 메뉴로 이동" aria-current="page">${topInformation.fourthTitle}</a></li>							
									</c:if>	
								</c:when>
							</c:choose>
						</ul>
					</nav>
					<c:if test="${prevMenu ne null}">
						<a class="subtitle-prev" href="${prevMenuUrl}" title="이전메뉴 바로가기"><img src="/template/resources/images/global/subtitle-prev.png" alt="이전" /><span>${prevMenu.title}</span></a>
					</c:if>
					<c:if test="${nextMenu ne null}">
						<a class="subtitle-next" href="${nextMenuUrl}" title="다음메뉴 바로가기"><img src="/template/resources/images/global/subtitle-next.png" alt="다음" /><span>${nextMenu.title}</span></a>
					</c:if>
				</div>
				<!-- 컨텐츠 제목, 로케이션 -->
<%--

<!-- sub_top -->
<div class="sub_top">
	<!-- bread_box -->
	<div class="bread_box">
	
		<ul class="breadcrumb">	
			<li>HOME</li>
			<c:choose>
				<c:when test="${not empty topInformation}">								
					<c:if test="${not empty topInformation.firstTitle}">
						<li>${topInformation.firstTitle}</li>
					</c:if>
					<c:if test="${not empty topInformation.secondTitle}">
						<li>${topInformation.secondTitle}</li>
					</c:if>
					<c:if test="${not empty topInformation.thirdTitle}">
						<li>${topInformation.thirdTitle}</li>
					</c:if>				
					<c:if test="${not empty topInformation.fourthTitle}">
						<li>${topInformation.fourthTitle}</li>
					</c:if>				
				</c:when>
			</c:choose>
		</ul>
			
		<ul class="sub_share_box">
			<li class="facebook"><a href="#" onclick="SnsShare.fbShare(document.location.href); return false;"><i class="xi-facebook"></i><span class="hide">페이스북으로 공유</span></a></li>
			<li class="twitter"><a href="#" onclick="SnsShare.twShare(document.title, document.location.href); return false;"><i class="xi-twitter"></i><span class="hide">트위터로 공유</span></a></li>
			<li class="kakaostory"><a href="#" onclick="SnsShare.storyShare(document.location.href); return false;"><i class="xi-kakaostory"></i><span class="hide">카카오스토리로 공유</span></a></li>
			<li class="googleplus"><a href="#" onclick="SnsShare.ggShare(document.location.href); return false;"><i class="xi-google-plus"></i><span class="hide">구글플러스로 공유</span></a></li>
			<!-- <li class="blog"><a href="#" onclick="SnsShare.blogShare(document.title, document.location.href); return false;"><i class="xi-naver-square"></i><span class="hide">네이버블로그로 공유</span></a></li> -->
		</ul>
	</div>
	<!-- // bread_box -->

	<h3 class="sub_top_tit">${topInformation.title}</h3>
</div>
<!-- // sub_top -->
 --%>