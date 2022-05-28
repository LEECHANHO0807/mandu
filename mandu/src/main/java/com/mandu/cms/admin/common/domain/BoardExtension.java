package com.mandu.cms.admin.common.domain;

import java.io.Serializable;

public class BoardExtension extends SiteExtension implements Serializable {
	
	
	private static final long serialVersionUID = 246499244478000972L;
	
	
	/**
	 * 프로세스 종류
	 */
	private String processType;
	
	/**
	 * 오류 메세지
	 */
	private String errorMessage;
	
	/**
	 * 오류 코드
	 */
	private String errorCode;

	/**
	 * 되돌아가는 URL
	 */
	private String returnUrl;
	
	/**
	 * 권한 관리 제목
	 */
	private String authManagementTitle;
	
	/**
	 * 상위 여부
	 */
	private String topYn;

	/**
	 * 새 글 여부
	 */
	private String newYn;
	
	/**
	 * 작성자
	 */
	private String writer;
	
	/**
	 * 작성자 이름
	 */
	private String writerName;
	
	/**
	 * 수정자
	 */
	private String updater;
	
	/**
	 * 수정자 이름
	 */
	private String updaterName;
	
	/**
	 * 게시판 제목
	 */
	private String boardTitle;
	
	/**
	 * 게시판 종류 제목
	 */
	private String boardTypeTitle;
	
	/**
	 * 게시판 템플릿 제목
	 */
	private String boardTemplateTitle;
	
	/**
	 * 게시판 구분 제목
	 */
	private String boardCategoryTitle;
	
	/**
	 * 게시판 번호 배열
	 */
	private String[] boardNoArray;
	
	/**
	 * 게시물 수
	 */
	private String boardCount;
	
	/**
	 * 댓글 수
	 */
	private String commentCount;
	
	/**
	 * 댓글 답글 수
	 */
	private String commentReplyCount;
	
	/**
	 * 참조 제목
	 */
	private String referenceTitle;
	
	/**
	 * 참조 번호
	 */
	private String referenceNo;
	
	/**
	 * 참조 종류
	 */
	private String referenceType;
	
	/**
	 * 참조 번호 배열
	 */
	private String[] referenceNoArray;
	
	/**
	 * 메뉴 레벨
	 */
	private String menuLevel;
	
	/**
	 * 메뉴 번호
	 */
	private String menuNo;
	
	/**
	 * 메뉴 위치
	 */
	private String menuLocation;
	
	/**
	 * 메뉴 제목
	 */
	private String menuTitle;
	
	/**
	 * 메뉴 번호 (레벨 1)
	 */
	private String firstMenuNo;
	
	/**
	 * 메뉴 번호 (레벨 2)
	 */
	private String secondMenuNo;
	
	/**
	 * 메뉴 번호 (레벨 3)
	 */
	private String thirdMenuNo;
	
	/**
	 * 메뉴 번호 (레벨 4)
	 */
	private String fourthMenuNo;
	
	/**
	 * 메뉴 제목 (레벨 1)
	 */
	private String firstTitle;
	
	/**
	 * 메뉴 제목 (레벨 2)
	 */
	private String secondTitle;
	
	/**
	 * 메뉴 제목 (레벨 3)
	 */
	private String thirdTitle;
	
	/**
	 * 메뉴 제목 (레벨 4)
	 */
	private String fourthTitle;
	
	/**
	 * 구분
	 */
	private String searchCategory;
	
	/**
	 * 검색 상태
	 */
	private String searchStatus;
	
	/**
	 * 검색 종류
	 */
	private String searchType;

	/**
	 * 검색 단어
	 */
	private String searchWord;

	/**
	 * 검색 시작 일자
	 */
	private String searchStartDate;

	/**
	 * 검색 종료 일자
	 */
	private String searchEndDate;
	
	/**
	 * 검색 일자
	 */
	private String searchDate;
	
	/**
	 * 검색 일자 시간
	 */
	private String searchDateTime;
	
	/**
	 * 페이지
	 */
	private String page;

	/**
	 * 첫번째 페이지
	 */
	private int firstPage;

	/**
	 * 마지막 페이지
	 */
	private int lastPage;

	/**
	 * 전체 페이지
	 */
	private int totalPage;
	
	/**
	 * 게시판 페이지 사이즈
	 */
	private int boardPageSize;

	/**
	 * 첫번째 열
	 */
	private Integer firstRow;

	/**
	 * 마지막 열
	 */
	private Integer lastRow;

	/**
	 * 행 개수
	 */
	private int rowCount;

	/**
	 * 시작 년
	 */
	private Integer startYear;
	
	/**
	 * 시작 월
	 */
	private Integer startMonth;
	
	/**
	 * 시작 일
	 */
	private Integer startDay;
	
	/**
	 * 종료 년
	 */
	private Integer endYear;
	
	/**
	 * 종료 월
	 */
	private Integer endMonth;
	
	/**
	 * 종료 일
	 */
	private Integer endDay;
	
	/**
	 * 현재 일자
	 */
	private String currentDate;
	
	/**
	 * 년
	 */
	private String year;
	
	/**
	 * 월
	 */
	private String month;
	
	/**
	 * 일
	 */
	private String day;
	
	/**
	 * 모드
	 */
	private String mode;
	
	/**
	 * 상태
	 */
	private String status;
	
	/**
	 * 상태 제목
	 */
	private String statusTitle;
	
	/**
	 * 존재 확인
	 */
	private boolean exist;
	
	/**
	 * 사용자 아이디 확인
	 */
	private boolean userIdCheck;
	
	/**
	 * 비밀번호 상태
	 */
	private String passwordStatus;
	
	/**
	 * 비밀번호 확인
	 */
	private String passwordConfirm;
	
	/**
	 * 저장소_번호
	 */
	private String storageNo;

	/**
	 * 저장소_코드
	 */
	private String storageCode;

	/**
	 * 저장소_파일_설명
	 */
	private String storageFileDescription;

	/**
	 * 저장소_파일_원본_이름
	 */
	private String storageFileOriginalName;

	/**
	 * 저장소_파일_새로운_이름
	 */
	private String storageFileNewName;

	/**
	 * 저장소_파일_확장자
	 */
	private String storageFileExtension;
	
	/**
	 * 저장소_파일_경로
	 */
	private String storageFilePath;
	
	/**
	 * 오류 (썸네일)
	 */
	private String errorThumbnail;
	
	
	/**
	 * 활성화 여부
	 */
	private String activeYn;
	
	/**
	 * 종류
	 */
	private String type;
	
	/**
	 * 보내는 자
	 */
	private String sender;
	
	/**
	 * 받는 자
	 */
	private String receiver;
	
	/**
	 * 이전 구분
	 */
	private String oldYn;
	
	
	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getAuthManagementTitle() {
		return authManagementTitle;
	}

	public void setAuthManagementTitle(String authManagementTitle) {
		this.authManagementTitle = authManagementTitle;
	}

	public String getTopYn() {
		return topYn;
	}

	public void setTopYn(String topYn) {
		this.topYn = topYn;
	}

	public String getNewYn() {
		return newYn;
	}

	public void setNewYn(String newYn) {
		this.newYn = newYn;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public String getUpdaterName() {
		return updaterName;
	}

	public void setUpdaterName(String updaterName) {
		this.updaterName = updaterName;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardTypeTitle() {
		return boardTypeTitle;
	}

	public void setBoardTypeTitle(String boardTypeTitle) {
		this.boardTypeTitle = boardTypeTitle;
	}

	public String getBoardTemplateTitle() {
		return boardTemplateTitle;
	}

	public void setBoardTemplateTitle(String boardTemplateTitle) {
		this.boardTemplateTitle = boardTemplateTitle;
	}

	public String getBoardCategoryTitle() {
		return boardCategoryTitle;
	}

	public void setBoardCategoryTitle(String boardCategoryTitle) {
		this.boardCategoryTitle = boardCategoryTitle;
	}

	public String[] getBoardNoArray() {
		return boardNoArray;
	}

	public void setBoardNoArray(String[] boardNoArray) {
		this.boardNoArray = boardNoArray;
	}

	public String getBoardCount() {
		return boardCount;
	}

	public void setBoardCount(String boardCount) {
		this.boardCount = boardCount;
	}

	public String getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(String commentCount) {
		this.commentCount = commentCount;
	}

	public String getCommentReplyCount() {
		return commentReplyCount;
	}

	public void setCommentReplyCount(String commentReplyCount) {
		this.commentReplyCount = commentReplyCount;
	}

	public String getReferenceTitle() {
		return referenceTitle;
	}

	public void setReferenceTitle(String referenceTitle) {
		this.referenceTitle = referenceTitle;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(String referenceType) {
		this.referenceType = referenceType;
	}

	public String[] getReferenceNoArray() {
		return referenceNoArray;
	}

	public void setReferenceNoArray(String[] referenceNoArray) {
		this.referenceNoArray = referenceNoArray;
	}

	public String getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public String getMenuLocation() {
		return menuLocation;
	}

	public void setMenuLocation(String menuLocation) {
		this.menuLocation = menuLocation;
	}

	public String getMenuTitle() {
		return menuTitle;
	}

	public void setMenuTitle(String menuTitle) {
		this.menuTitle = menuTitle;
	}

	public String getFirstMenuNo() {
		return firstMenuNo;
	}

	public void setFirstMenuNo(String firstMenuNo) {
		this.firstMenuNo = firstMenuNo;
	}

	public String getSecondMenuNo() {
		return secondMenuNo;
	}

	public void setSecondMenuNo(String secondMenuNo) {
		this.secondMenuNo = secondMenuNo;
	}

	public String getThirdMenuNo() {
		return thirdMenuNo;
	}

	public void setThirdMenuNo(String thirdMenuNo) {
		this.thirdMenuNo = thirdMenuNo;
	}

	public String getFourthMenuNo() {
		return fourthMenuNo;
	}

	public void setFourthMenuNo(String fourthMenuNo) {
		this.fourthMenuNo = fourthMenuNo;
	}

	public String getFirstTitle() {
		return firstTitle;
	}

	public void setFirstTitle(String firstTitle) {
		this.firstTitle = firstTitle;
	}

	public String getSecondTitle() {
		return secondTitle;
	}

	public void setSecondTitle(String secondTitle) {
		this.secondTitle = secondTitle;
	}

	public String getThirdTitle() {
		return thirdTitle;
	}

	public void setThirdTitle(String thirdTitle) {
		this.thirdTitle = thirdTitle;
	}

	public String getFourthTitle() {
		return fourthTitle;
	}

	public void setFourthTitle(String fourthTitle) {
		this.fourthTitle = fourthTitle;
	}

	public String getSearchCategory() {
		return searchCategory;
	}

	public void setSearchCategory(String searchCategory) {
		this.searchCategory = searchCategory;
	}

	public String getSearchStatus() {
		return searchStatus;
	}

	public void setSearchStatus(String searchStatus) {
		this.searchStatus = searchStatus;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getSearchStartDate() {
		return searchStartDate;
	}

	public void setSearchStartDate(String searchStartDate) {
		this.searchStartDate = searchStartDate;
	}

	public String getSearchEndDate() {
		return searchEndDate;
	}

	public void setSearchEndDate(String searchEndDate) {
		this.searchEndDate = searchEndDate;
	}

	public String getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}

	public String getSearchDateTime() {
		return searchDateTime;
	}

	public void setSearchDateTime(String searchDateTime) {
		this.searchDateTime = searchDateTime;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getBoardPageSize() {
		return boardPageSize;
	}

	public void setBoardPageSize(int boardPageSize) {
		this.boardPageSize = boardPageSize;
	}

	public Integer getFirstRow() {
		return firstRow;
	}

	public void setFirstRow(Integer firstRow) {
		this.firstRow = firstRow;
	}

	public Integer getLastRow() {
		return lastRow;
	}

	public void setLastRow(Integer lastRow) {
		this.lastRow = lastRow;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Integer getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(Integer startMonth) {
		this.startMonth = startMonth;
	}

	public Integer getStartDay() {
		return startDay;
	}

	public void setStartDay(Integer startDay) {
		this.startDay = startDay;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public Integer getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(Integer endMonth) {
		this.endMonth = endMonth;
	}

	public Integer getEndDay() {
		return endDay;
	}

	public void setEndDay(Integer endDay) {
		this.endDay = endDay;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusTitle() {
		return statusTitle;
	}

	public void setStatusTitle(String statusTitle) {
		this.statusTitle = statusTitle;
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	public boolean isUserIdCheck() {
		return userIdCheck;
	}

	public void setUserIdCheck(boolean userIdCheck) {
		this.userIdCheck = userIdCheck;
	}

	public String getPasswordStatus() {
		return passwordStatus;
	}

	public void setPasswordStatus(String passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public String getStorageNo() {
		return storageNo;
	}

	public void setStorageNo(String storageNo) {
		this.storageNo = storageNo;
	}

	public String getStorageCode() {
		return storageCode;
	}

	public void setStorageCode(String storageCode) {
		this.storageCode = storageCode;
	}

	public String getStorageFileDescription() {
		return storageFileDescription;
	}

	public void setStorageFileDescription(String storageFileDescription) {
		this.storageFileDescription = storageFileDescription;
	}

	public String getStorageFileOriginalName() {
		return storageFileOriginalName;
	}

	public void setStorageFileOriginalName(String storageFileOriginalName) {
		this.storageFileOriginalName = storageFileOriginalName;
	}

	public String getStorageFileNewName() {
		return storageFileNewName;
	}

	public void setStorageFileNewName(String storageFileNewName) {
		this.storageFileNewName = storageFileNewName;
	}

	public String getStorageFileExtension() {
		return storageFileExtension;
	}

	public void setStorageFileExtension(String storageFileExtension) {
		this.storageFileExtension = storageFileExtension;
	}

	public String getStorageFilePath() {
		return storageFilePath;
	}

	public void setStorageFilePath(String storageFilePath) {
		this.storageFilePath = storageFilePath;
	}

	public String getErrorThumbnail() {
		return errorThumbnail;
	}

	public void setErrorThumbnail(String errorThumbnail) {
		this.errorThumbnail = errorThumbnail;
	}

	public String getActiveYn() {
		return activeYn;
	}

	public void setActiveYn(String activeYn) {
		this.activeYn = activeYn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getOldYn() {
		return oldYn;
	}

	public void setOldYn(String oldYn) {
		this.oldYn = oldYn;
	}

	
}