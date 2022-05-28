<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%-- 사용자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/user/common/userCommon.jsp"%>


<main id="main">
<div class="container">
	<div class="main-section">
		<div class="main-lay-01">
			<section class="section-links">
				<!--
				<h2>지역이 강한 나라, 균형 잡힌 대한민국</h2>
				<p>대한민국 곳곳이 골고루 잘사는 나라를 만들기 위해 <br />균형발전의 새로운 전기를 마련했습니다.</p>
				-->
				<h2 class="blind">자주찾는 메뉴</h2>
				<img class="section-links-president" src="/template/resources/images/main/section-links-president.png" alt="지역의 성장판이 열려야 국가경제의 활력이 돌아옵니다. - 2019년 1월 10일 문재인 대통령 신년기자회견 中" />
				<ul>
					<li>
						<a href="/base/menu/baseView?menuLevel=1&menuNo=9" title="페이지 바로가기">
							<img src="/template/resources/images/main/section-links-01.png" alt="" />
							<span>위원회사람들</span>
						</a>
					</li>
					<li>
						<a href="/base/contents/view?contentsNo=27&menuLevel=2&menuNo=52" title="페이지 바로가기">
							<img src="/template/resources/images/main/section-links-02.png" alt="" />
							<span>비전과 전략</span>
						</a>
					</li>
					<li>
						<a href="/base/balance/performance/list?menuLevel=2&menuNo=38" title="페이지 바로가기">
							<img src="/template/resources/images/main/section-links-03.png" alt="" />
							<span>추진실적</span>
						</a>
					</li>
					<li>
						<a href="/base/menu/baseView?menuLevel=2&menuNo=43" title="페이지 바로가기">
							<img src="/template/resources/images/main/section-links-04.png" alt="" />
							<span>자료실</span>
						</a>
					</li>
				</ul>
			</section>
		</div>

		<div class="main-group-01">
			<div class="main-lay-02">
				<section>
					<div class="section-title">
						<h2><a href="/base/board/list?boardManagementNo=12&amp;menuLevel=2&amp;menuNo=42" title="게시판 바로가기">위원회 활동</a></h2>
						<div class="section-title__control">
							<ul class="section-title__control__arrows">
								<li class="section-title__control__arrows__prev"><a href="javascript:void(0);" title="이전으로">이전</a></li>
								<li class="section-title__control__arrows__pause"><a href="javascript:void(0);" title="일시정지">일시정지</a></li>
								<li class="section-title__control__arrows__start" style="display: none;"><a href="javascript:void(0);" title="재생하기">재생</a></li>
								<li class="section-title__control__arrows__next"><a href="javascript:void(0);" title="다음으로">다음</a></li>
							</ul>
						</div>
					</div>
					<c:choose>
						<c:when test="${not empty activityBoardList}">
							<div id="slider_committee" class="section-gallery section-gallery-white">
								<c:forEach var="item" items="${activityBoardList}" begin="0" end="5">
									<div>
										<a href="${contextPath}/base/board/read?boardManagementNo=${item.boardManagementNo}&amp;boardNo=${item.boardNo}&amp;menuLevel=2&menuNo=42">
											<div class="thumb">
												<c:choose>
													<%-- 
														<c:when test="${item.oldYn eq 'Y'}">
															<img src="${contextPath}/imageView/${item.storageCode}?storageNo=${item.storageNo}">
														</c:when>
														<c:otherwise>
															<c:choose>
																<c:when test="${not empty item.storageFileNewName}">
																	<img src="${contextPath}${item.storageFilePath}/${item.storageFileNewName}_THUMBNAIL_W285H214.jpg" alt="${item.storageFileDescription}">
																	<img src="${contextPath}${item.storageFilePath}/${item.storageFileNewName}.${item.storageFileExtension}" alt="${item.storageFileDescription}">
																	<img src="${contextPath}/imageView/${item.storageCode}?storageNo=${item.storageNo}">
																</c:when>
																<c:otherwise>
																	<img src="/template/resources/images/global/noimg.jpg" alt="NO IMAGE">
																</c:otherwise>
															</c:choose>
														</c:otherwise> 
														--%>
													<c:when test="${not empty item.storageNo}">
														<img src="${contextPath}/imageView/GALLERY_IMAGE?storageNo=${item.storageNo}" alt="${item.storageFileDescription}">
													</c:when>
													<c:otherwise>
														<img src="/template/resources/images/global/noimg.jpg" alt="NO IMAGE">
													</c:otherwise>
												</c:choose>
											</div>
											<h3>
												<c:out value="${item.title}" />
											</h3>
											<c:choose>
													<c:when test="${item.reservationYn eq 'Y'}">
														<fmt:parseDate var="writeDate" value="${item.startDate}" pattern="yyyy-MM-dd HH:mm:ss" />
													</c:when>
													<c:otherwise>
														<fmt:parseDate var="writeDate" value="${item.writeDate}" pattern="yyyy-MM-dd HH:mm:ss" />
													</c:otherwise>
											</c:choose>
											<span class="date">
												<fmt:formatDate value="${writeDate}" pattern="yyyy.MM.dd" />
											</span>
										</a>
									</div>
								</c:forEach>
							</div>
						</c:when>
						<c:otherwise>
						</c:otherwise>
					</c:choose>
				</section>
			</div>
			
			<div class="main-lay-03">
				<section>
					<div class="section-title blind">
						<h2>게시판 위젯</h2>
					</div>
					<div class="section-board">
						<ul class="section-board-list">
							<li class="active"><h3>
									<a href="#" onclick="goBoardList('/base/board/list?boardManagementNo=10&menuLevel=2&menuNo=40');">공지사항</a>
								</h3>
								<div class="section-board-list__cont">
									<c:choose>
										<c:when test="${not empty noticeBoardLimitList}">
											<ul>
												<c:forEach var="item" items="${noticeBoardLimitList}">
													<c:set var="contents" value="${item.content}"/>
													<li>
														<a href="${contextPath}/base/board/read?boardManagementNo=${item.boardManagementNo}&amp;boardNo=${item.boardNo}&amp;menuLevel=2&menuNo=40">
															<c:out value="${item.title}" />
														</a>
														<span class="text">
															<c:out value='${fn:substring(contents.replaceAll("\\\<.*?\\\>",""),0, 80)}'  escapeXml="false"/>
														</span>
														<c:choose>
																<c:when test="${item.reservationYn eq 'Y'}">
																	<fmt:parseDate var="writeDate" value="${item.startDate}" pattern="yyyy-MM-dd HH:mm:ss" />
																</c:when>
																<c:otherwise>
																	<fmt:parseDate var="writeDate" value="${item.writeDate}" pattern="yyyy-MM-dd HH:mm:ss" />
																</c:otherwise>
														</c:choose>
														<span class="date">
															<fmt:formatDate value="${writeDate}" pattern="yyyy.MM" />
															<em>.</em>
															<strong><fmt:formatDate value="${writeDate}" pattern="dd" /></strong>
														</span>
													</li>
												</c:forEach>
											</ul>
										</c:when>
										<c:otherwise>
										</c:otherwise>
									</c:choose>
								</div></li>
							<li><h3>
									<a href="#" onclick="goBoardList('/base/board/list?boardManagementNo=11&menuLevel=2&menuNo=41');">보도자료</a>
								</h3>
								<div class="section-board-list__cont">
									<c:choose>
										<c:when test="${not empty pressBoardLimitList}">
											<ul>
												<c:forEach var="item" items="${pressBoardLimitList}">
													<c:set var="contents" value="${item.content}"/>
													<li>
														<a href="${contextPath}/base/board/read?boardManagementNo=${item.boardManagementNo}&amp;boardNo=${item.boardNo}&amp;menuLevel=2&menuNo=41">
															<c:out value="${item.title}" />
														</a>
														<span class="text">
															<c:out value='${fn:substring(contents.replaceAll("\\\<.*?\\\>",""),0, 80)}' escapeXml="false"/>
														</span>
														<c:choose>
																<c:when test="${item.reservationYn eq 'Y'}">
																	<fmt:parseDate var="writeDate" value="${item.startDate}" pattern="yyyy-MM-dd HH:mm:ss" />
																</c:when>
																<c:otherwise>
																	<fmt:parseDate var="writeDate" value="${item.writeDate}" pattern="yyyy-MM-dd HH:mm:ss" />
																</c:otherwise>
														</c:choose>
														<span class="date">
															<fmt:formatDate value="${writeDate}" pattern="yyyy.MM" />
															<em>.</em>
															<strong><fmt:formatDate value="${writeDate}" pattern="dd" /></strong>
														</span>
													</li>
												</c:forEach>
											</ul>
										</c:when>
										<c:otherwise>
										</c:otherwise>
									</c:choose>
								</div>
							</li>
						</ul>
					</div>
				</section>
			</div>
		</div>

		<div class="main-group-02">
			<div class="main-lay-04">
				${areaMainNabis.content}
			</div>
	
			<div class="main-lay-05">
			<section class="section-popupzone">
				<div class="section-title">
					<h2>팝업존</h2>
					<div class="section-title__control">
						<ul class="section-title__control__arrows">
							<li class="section-title__control__arrows__prev"><a href="javascript:void(0);" title="이전으로">이전</a></li>
							<li class="section-title__control__arrows__pause"><a href="javascript:void(0);" title="일시정지">일시정지</a></li>
							<li class="section-title__control__arrows__start" style="display: none;"><a href="javascript:void(0);" title="재생하기">재생</a></li>
							<li class="section-title__control__arrows__next"><a href="javascript:void(0);" title="다음으로">다음</a></li>
						</ul>
					</div>
				</div>
				<c:choose>
					<c:when test="${not empty mainBannerMiddleList}">
						<div id="slider_popupzone" class="popupzone">
							<c:forEach var="item" items="${mainBannerMiddleList}">
								<div>
									<c:choose>
										<c:when test="${not empty item.linkUrl}">
											<a href="${item.linkUrl}" title="페이지 바로가기" ${item.linkType eq 'BLANK' ? 'target="_blank"' : ''}>
												<%--
												<img src="${contextPath}${item.storageFilePath}/${item.storageFileNewName}.${item.storageFileExtension}" alt="${item.storageFileDescription}">
												--%>
												<img src="${contextPath}/imageView/BANNER_ATTACH?storageNo=${item.storageNo}" alt="${item.storageFileDescription}">
											</a>
										</c:when>
										<c:otherwise>
											<%--<img src="${contextPath}${item.storageFilePath}/${item.storageFileNewName}.${item.storageFileExtension}" alt="${item.storageFileDescription}">--%>
											<img src="${contextPath}/imageView/BANNER_ATTACH?storageNo=${item.storageNo}" alt="${item.storageFileDescription}">
										</c:otherwise>
									</c:choose>
								</div>
							</c:forEach>
						</div>
					</c:when>
				</c:choose>
			</section>
		</div>
		</div>


		<div class="main-lay-06">
			<section class="section-sns">
				<div class="section-title section-title-whitemode">
					<h2 id="sns_title">YOUTUBE</h2>
					<div class="section-title__control">
						<ul class="section-title__control__sns">
							<li><a href="#" title="유튜브 새글 보기" id="sns_youtube"><img src="/template/resources/images/icons/youtube.png" alt="유튜브" /></a></li>
							<li><a href="#" title="페이스북 새글 보기" id="sns_fb"><img src="/template/resources/images/icons/facebook.png" alt="페이스북" /></a></li>
							<li><a href="#" title="블로그 새글 보기" id="sns_blog"><img src="/template/resources/images/icons/blog.png" alt="블로그" /></a></li>
						</ul>
						<ul class="section-title__control__arrows">
							<li class="section-title__control__arrows__prev"><a href="javascript:void(0);" title="이전으로">이전</a></li>
							<li class="section-title__control__arrows__pause"><a href="javascript:void(0);" title="일시정지">일시정지</a></li>
							<li class="section-title__control__arrows__start" style="display: none;"><a href="javascript:void(0);" title="재생">재생</a></li>
							<li class="section-title__control__arrows__next"><a href="javascript:void(0);" title="다음으로">다음</a></li>
						</ul>
					</div>
				</div>
				<div id="slider_sns_youtube" class="section-gallery section-gallery-whitemode">
					<c:forEach var="item" items="${mainYoutubeList}">
					<div>
						<a href="https://www.youtube.com/watch?v=${item.videoId}" target="_blank">
							<div class="thumb">
								<div class="icons">
									<img src="/template/resources/images/main/section-sns-thumb-youtube.png" onerror="this.src='/template/resources/images/global/noimg.jpg'" alt="유튜브" />
								</div>
								<img src="https://i.ytimg.com/vi/${item.videoId}/hqdefault.jpg" onerror="this.src='/template/resources/images/global/noimg.jpg'" alt="" />
							</div>
							<h3>${item.title}</h3> <span>${item.publishDate}</span>
						</a>
					</div>
					</c:forEach>
				</div>
				<div id="slider_sns_fb" class="section-gallery section-gallery-whitemode" style="display:none;">
         
				</div>
				<div id="slider_sns_blog" class="section-gallery section-gallery-whitemode" style="display:none;">
			
				</div>
			</section>
		</div>
		<%--
		<div class="main-lay-06">
			${areaMainSNS.content}
		</div>
		--%>
	</div>
</div>
<aside id="banner">
	<div class="container">
		<div class="logo-banner">
			<div class="logo-banner-title">
				<h2>
					<span class="blind">유관기관 </span>배너존
				</h2>
				<ul class="logo-banner-pagination">
					<li class="logo-banner__prev"><a href="javascript:void(0);" title="이전으로">이전</a></li>
					<li class="logo-banner__pause"><a href="javascript:void(0);" title="일시정지">일시정지</a></li>
					<li class="logo-banner__start" style="display: none;"><a href="javascript:void(0);" title="재생하기">재생</a></li>
					<li class="logo-banner__next"><a href="javascript:void(0);" title="다음으로">다음</a></li>
				</ul>
			</div>
			<c:choose>
				<c:when test="${not empty mainBannerMiddleList}">
					<div id="slider_banner" class="logo-banner-zone">
						<c:forEach var="item" items="${mainBannerBottomList}">
							<div>
								<c:choose>
									<c:when test="${not empty item.linkUrl}">
										<a href="${item.linkUrl}" title="링크 바로가기" ${item.linkType eq 'BLANK' ? 'target="_blank"' : ''}>
											<img src="${contextPath}/imageView/BANNER_ATTACH?storageNo=${item.storageNo}" alt="${item.storageFileDescription}">
											
											<%--
											<img src="${contextPath}${item.storageFilePath}/${item.storageFileNewName}.${item.storageFileExtension}" alt="${item.storageFileDescription}">
											--%>
										</a>
									</c:when>
									<c:otherwise> 
										<%--<img src="${contextPath}${item.storageFilePath}/${item.storageFileNewName}.${item.storageFileExtension}" alt="${item.storageFileDescription}">--%>
										<img src="${contextPath}/imageView/BANNER_ATTACH?storageNo=${item.storageNo}" alt="${item.storageFileDescription}">
									</c:otherwise>
								</c:choose>
							</div>
						</c:forEach>
					</div>
				</c:when>
			</c:choose>
		</div>
	</div>
</aside>
</main>

<script>
	function goBoardList(link){
		if ($(this).closest('li').hasClass("active"))
			location.href = link;

		else
			return false;
	}
</script>