<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>

<%-- 사용자 공통 --%>
<%@ include file="/WEB-INF/jsp/cms/user/common/userCommon.jsp" %>


<c:choose>
	<c:when test="${not empty menuList1}">

		<ul class="menus">
			<c:forEach var="first" items="${menuList1}">
				<%-- 메뉴명 - 레벨 1 --%>
				<c:choose>
					<c:when test="${not empty topInformation.firstMenuNo and (topInformation.firstMenuNo eq first.menuNo) }">
						<li class="active">
					</c:when>
					<c:otherwise>
						<li>
					</c:otherwise>
				</c:choose>
					<c:choose>
						<c:when test="${first.type eq 'BASE'}">
							<a href="${contextPath}/${siteCode}/menu/baseView?menuLevel=${first.menuLevel}&amp;menuNo=${first.menuNo}"><span>${first.title}</span></a>
						</c:when>
						<c:when test="${first.type eq 'BOARD'}">
							<a href="${contextPath}/${siteCode}/board/list?boardManagementNo=${first.referenceNo}&amp;menuLevel=${first.menuLevel}&amp;menuNo=${first.menuNo}"><span>${first.title}</span></a>
						</c:when>
						<c:when test="${first.type eq 'SCHEDULE'}">
							<a href="${contextPath}/${siteCode}/schedule/list?scheduleManagementNo=${first.referenceNo}&amp;menuLevel=${first.menuLevel}&amp;menuNo=${first.menuNo}"><span>${first.title}</span></a>
						</c:when>
						<c:when test="${first.type eq 'RENTAL'}">
							<a href="${contextPath}/${siteCode}/rental/calendar?rentalManagementNo=${first.referenceNo}&amp;menuLevel=${first.menuLevel}&amp;menuNo=${first.menuNo}"><span>${first.title}</span></a>
						</c:when>
						<c:when test="${first.type eq 'CONTENTS'}">
							<a href="${contextPath}/${siteCode}/contents/view?contentsNo=${first.referenceNo}&amp;menuLevel=${first.menuLevel}&amp;menuNo=${first.menuNo}"><span>${first.title}</span></a>
						</c:when>
						<c:when test="${first.type eq 'LINK'}">
							<c:choose>
								<c:when test="${not empty first.linkUrl}">
									<c:choose>
										<c:when test="${first.linkType eq 'SELF'}">
											<a href="${first.linkUrl}" target="_self"><span>${first.title}</span></a>
										</c:when>
										<c:when test="${first.linkType eq 'BLANK'}">
											<a href="${first.linkUrl}" target="_blank"><span>${first.title}</span></a>
										</c:when>
										<c:otherwise>
											<a href="${first.linkUrl}"><span>${first.title}</span></a>
										</c:otherwise>
									</c:choose>
								</c:when>
								<c:otherwise>
									<a href="#" onclick="return false;"><span>${first.title}</span></a>
								</c:otherwise>
							</c:choose>
						</c:when>
						<c:when test="${first.type eq 'CUSTOM'}">
							<c:choose>
								<c:when test="${not empty first.customUrl}">
									<a href="${first.customUrl}?menuLevel=${first.menuLevel}&amp;menuNo=${first.menuNo}">${first.title}</a>
								</c:when>
								<c:otherwise>
									<a href="#" onclick="return false;">${first.title}</a>
								</c:otherwise>
							</c:choose>
						</c:when>


						<c:otherwise>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${not empty menuList2}">
							<ul class="dropdown-menu">
								<c:forEach var="second" items="${menuList2}">

									<c:choose>
										<c:when test="${second.upperMenuNo eq first.menuNo}">
											<%-- 메뉴명 - 레벨 2 --%>
											<c:choose>
												<c:when test="${not empty topInformation.secondMenuNo and (topInformation.secondMenuNo eq second.menuNo) }">
													<li class="active">
												</c:when>
												<c:otherwise>
													<li>
												</c:otherwise>
											</c:choose>
												<c:choose>
													<c:when test="${second.type eq 'BASE'}">
														<a href="${contextPath}/${siteCode}/menu/baseView?menuLevel=${second.menuLevel}&amp;menuNo=${second.menuNo}">${second.title}</a>
													</c:when>
													<c:when test="${second.type eq 'BOARD'}">
														<a href="${contextPath}/${siteCode}/board/list?boardManagementNo=${second.referenceNo}&amp;menuLevel=${second.menuLevel}&amp;menuNo=${second.menuNo}">${second.title}</a>
													</c:when>
													<c:when test="${second.type eq 'SCHEDULE'}">
														<a href="${contextPath}/${siteCode}/schedule/list?scheduleManagementNo=${second.referenceNo}&amp;menuLevel=${second.menuLevel}&amp;menuNo=${second.menuNo}">${second.title}</a>
													</c:when>
													<c:when test="${second.type eq 'RENTAL'}">
														<a href="${contextPath}/${siteCode}/rental/calendar?rentalManagementNo=${second.referenceNo}&amp;menuLevel=${second.menuLevel}&amp;menuNo=${second.menuNo}">${second.title}</a>
													</c:when>
													<c:when test="${second.type eq 'CONTENTS'}">
														<a href="${contextPath}/${siteCode}/contents/view?contentsNo=${second.referenceNo}&amp;menuLevel=${second.menuLevel}&amp;menuNo=${second.menuNo}">${second.title}</a>
													</c:when>
													<c:when test="${second.type eq 'LINK'}">
														<c:choose>
															<c:when test="${not empty second.linkUrl}">
																<c:choose>
																	<c:when test="${second.linkType eq 'SELF'}">
																		<a href="${second.linkUrl}" target="_self">${second.title}</a>
																	</c:when>
																	<c:when test="${second.linkType eq 'BLANK'}">
																		<a href="${second.linkUrl}" target="_blank">${second.title}</a>
																	</c:when>
																	<c:otherwise>
																		<a href="${second.linkUrl}">${second.title}</a>
																	</c:otherwise>
																</c:choose>
															</c:when>
															<c:otherwise>
																<a href="#" onclick="return false;">${second.title}</a>
															</c:otherwise>
														</c:choose>
													</c:when>
													<c:when test="${second.type eq 'CUSTOM'}">
														<c:choose>
															<c:when test="${not empty second.customUrl}">
																<a href="${second.customUrl}?menuLevel=${second.menuLevel}&amp;menuNo=${second.menuNo}">${second.title}</a>
															</c:when>
															<c:otherwise>
																<a href="#" onclick="return false;">${second.title}</a>
															</c:otherwise>
														</c:choose>
													</c:when>

													<c:otherwise>
													</c:otherwise>
												</c:choose>

												<c:choose>
													<c:when test="${not empty menuList3}">

														<ul>
															<c:forEach var="third" items="${menuList3}">

																<c:choose>
																	<c:when test="${third.referenceNo eq 13 or third.referenceNo eq 14 or third.referenceNo eq 15}">
																	</c:when>
																	<c:when test="${third.upperMenuNo eq second.menuNo}">
																		<%-- 메뉴명 - 레벨 3 --%>
																		<c:choose>
																			<c:when test="${not empty topInformation.thirdMenuNo and (topInformation.thirdMenuNo eq third.menuNo) }">
																				<li>
																			</c:when>
																			<c:otherwise>
																				<li>
																			</c:otherwise>
																		</c:choose>

																			<c:choose>
																				<c:when test="${third.type eq 'BASE'}">
																					<a href="#" onclick="return false">${third.title}</a>
																				</c:when>
																				<c:when test="${third.type eq 'BOARD'}">
																					<a href="${contextPath}/${siteCode}/board/list?boardManagementNo=${third.referenceNo}&amp;menuLevel=${third.menuLevel}&amp;menuNo=${third.menuNo}">${third.title}</a>
																				</c:when>
																				<c:when test="${third.type eq 'SCHEDULE'}">
																					<a href="${contextPath}/${siteCode}/schedule/list?scheduleManagementNo=${third.referenceNo}&amp;menuLevel=${third.menuLevel}&amp;menuNo=${third.menuNo}">${third.title}</a>
																				</c:when>
																				<c:when test="${third.type eq 'RENTAL'}">
																					<a href="${contextPath}/${siteCode}/rental/calendar?rentalManagementNo=${third.referenceNo}&amp;menuLevel=${third.menuLevel}&amp;menuNo=${third.menuNo}">${third.title}</a>
																				</c:when>
																				<c:when test="${third.type eq 'CONTENTS'}">
																					<a href="${contextPath}/${siteCode}/contents/view?contentsNo=${third.referenceNo}&amp;menuLevel=${third.menuLevel}&amp;menuNo=${third.menuNo}">${third.title}</a>
																				</c:when>
																				<c:when test="${third.type eq 'LINK'}">
																					<c:choose>
																						<c:when test="${not empty third.linkUrl}">
																							<c:choose>
																								<c:when test="${third.linkType eq 'SELF'}">
																									<a href="${third.linkUrl}" target="_self">${third.title}</a>
																								</c:when>
																								<c:when test="${third.linkType eq 'BLANK'}">
																									<a href="${third.linkUrl}" target="_blank">${third.title}</a>
																								</c:when>
																								<c:otherwise>
																									<a href="${third.linkUrl}">${third.title}</a>
																								</c:otherwise>
																							</c:choose>
																						</c:when>
																						<c:otherwise>
																							<a href="#" onclick="return false;">${third.title}</a>
																						</c:otherwise>
																					</c:choose>
																				</c:when>
																				<c:when test="${third.type eq 'CUSTOM'}">
																					<c:choose>
																						<c:when test="${not empty third.customUrl}">
																							<a href="${third.customUrl}?menuLevel=${third.menuLevel}&amp;menuNo=${third.menuNo}">${third.title}</a>
																						</c:when>
																						<c:otherwise>
																							<a href="#" onclick="return false;">${third.title}</a>
																						</c:otherwise>
																					</c:choose>
																				</c:when>
																				<c:otherwise>
																				</c:otherwise>
																			</c:choose>
																		</li>
																	</c:when>
																	<c:otherwise>
																	</c:otherwise>
																</c:choose>

															</c:forEach>
														</ul>

													</c:when>

													<c:otherwise>
													</c:otherwise>
												</c:choose>
											</li>
										</c:when>
									</c:choose>

								</c:forEach>
							</ul>


						</c:when>

						<c:otherwise>
						</c:otherwise>
					</c:choose>

				</li>
			</c:forEach>
		</ul>

	</c:when>

	<c:otherwise>
	</c:otherwise>
</c:choose>
