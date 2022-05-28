package com.mandu.cms.user.main.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/*import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*import com.mandu.cms.admin.balance.youtube.domain.Youtube;
import com.mandu.cms.admin.common.service.AdminSiteCodeService;
import com.mandu.cms.admin.function.area.domain.Area;
import com.mandu.cms.admin.function.area.service.AdminAreaService;
import com.mandu.cms.admin.function.banner.domain.Banner;
import com.mandu.cms.admin.function.meta.domain.Meta;
import com.mandu.cms.admin.function.popup.domain.Popup;
import com.mandu.cms.admin.structure.board.domain.Board;
import com.mandu.cms.exception.CMSException;
import com.mandu.cms.user.board.service.UserBoardService;
import com.mandu.cms.user.main.service.UserMainService;*/
import com.mandu.cms.user.meta.service.UserMetaService;
import com.mandu.cms.admin.function.meta.domain.Meta;
//import com.mandu.cms.user.site.service.UserSiteService;


@Controller
public class UserMainController {
	

/*	@Resource(name="userMainService")
	private UserMainService userMainService;	
	
	
	@Resource(name="userSiteService")
	private UserSiteService userSiteService;*/

	
	@Resource(name="userMetaService")
	private UserMetaService userMetaService;
	
	
/*	
	@Resource(name="adminAreaService")
	private AdminAreaService adminAreaService;
	
	
	@Resource(name="userBoardService")
	private UserBoardService userBoardService;
	
	
	@Resource(name="adminSiteCodeService")
	private AdminSiteCodeService<Board> adminSiteCodeBoardService;	
	
	*/
	
	
	// 사이트 리다이렉트
	/*
	@RequestMapping(value="/{siteCode}", method=RequestMethod.GET)
	private String siteRedirect(
				@PathVariable("siteCode") String siteCode
			) {
		
		boolean siteLiveCheckResult = userSiteService.siteLiveCheck(siteCode);
		
		if (siteLiveCheckResult) {
			return "redirect:/" + siteCode + "/main/view";
		}
		
		
		return "/code404";
	}
	*/
	
	
	// 사용자 메인
	@RequestMapping(value="/{siteCode}/main/view", method=RequestMethod.GET)
	private String mainView(
				@PathVariable("siteCode") String siteCode, 
				HttpServletRequest httpServletRequest,
				Model model
			) {
		
/*		Cookie[] cookies = httpServletRequest.getCookies();
		
		// 서비스 - 메인 팝업 목록
		List<Popup> mainPopupList = userMainService.mainPopupList(siteCode);
		
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Popup popupItem = null;
				Iterator<Popup> mainPopupItem = mainPopupList.iterator();
				while (mainPopupItem.hasNext()) {
					popupItem = mainPopupItem.next();

					if (cookies[i].getName().equals("CMS_POPUP_LAYER_" + popupItem.getPopupNo())) {
						if ((cookies[i].getValue() != null && cookies[i].getValue().equals("done"))) {
							mainPopupItem.remove();
						}
					}
				}
			}
		}		
		
		model.addAttribute("mainPopupList", mainPopupList);

		
		
		// 서비스 - 게시판 목록 (공지사항)
		List<Board> noticeBoardLimitList = userBoardService.boardLimitList("10", 4);
		
		model.addAttribute("noticeBoardLimitList", noticeBoardLimitList);
		
		
		
		// 서비스 - 게시판 목록 (보도자료)
		List<Board> pressBoardLimitList = userBoardService.boardLimitList("11", 4);
		
		model.addAttribute("pressBoardLimitList", pressBoardLimitList);
		
		
		Board activityBoard = new Board();
		activityBoard.setStorageCode("GALLERY_IMAGE");
		activityBoard.setBoardManagementNo("12");
		
		// 서비스 - 게시판 목록 (위원회 활동)
		List<Board> activityBoardList = userBoardService.boardList(activityBoard, 10, 1, model);
		
		model.addAttribute("activityBoardList", activityBoardList);
		
		// 서비스 - 메인 배너 목록 (상단)
		List<Banner> mainBannerTopList = userMainService.mainBannerList("BANNER_ATTACH", "TOP", siteCode);
		
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Banner bannerItem = null;
				Iterator<Banner> mainBannerTopItem = mainBannerTopList.iterator();
				while (mainBannerTopItem.hasNext()) {
					bannerItem = mainBannerTopItem.next();

					if (cookies[i].getName().equals("CMS_BANNER_TOP_" + bannerItem.getBannerNo())) {
						if ((cookies[i].getValue() != null && cookies[i].getValue().equals("done"))) {
							mainBannerTopItem.remove();
						}
					}
				}
			}
		}
		
		model.addAttribute("mainBannerTopList", mainBannerTopList);
		
		
		// 서비스 - 메인 배너 목록 (중단)
		List<Banner> mainBannerMiddleList = userMainService.mainBannerList("BANNER_ATTACH", "MIDDLE", siteCode);
		
		model.addAttribute("mainBannerMiddleList", mainBannerMiddleList);
		
		
		// 서비스 - 메인 배너 목록 (하단)
		List<Banner> mainBannerBottomList = userMainService.mainBannerList("BANNER_ATTACH", "BOTTOM", siteCode);
		
		model.addAttribute("mainBannerBottomList", mainBannerBottomList);
		
 		// 서비스 - 영역 (메인 유튜브)
		Area areaMainSNS =  adminAreaService.areaRead(siteCode, "MAIN_SNS");
				
		model.addAttribute("areaMainSNS", areaMainSNS);
		
		// 서비스 - 영역 (메인 나비스)
		Area areaMainNabis =  adminAreaService.areaRead(siteCode, "MAIN_NABIS");
		
		model.addAttribute("areaMainNabis", areaMainNabis);
		
		// 서비스 - 메인 유튜브 목록 
		List<Youtube> mainYoutubeList =  userMainService.mainYoutubeList();
		
		model.addAttribute("mainYoutubeList", mainYoutubeList);*/
		
		// 서비스 - 메타 정보
		Meta metaInformation = userMetaService.metaInformation(siteCode);
				
		model.addAttribute("metaInformation", metaInformation);
		
		String metaTitle = metaInformation != null ? metaInformation.getMetaTitle() : "";
		
		
		model.addAttribute("title", "메인 | " + metaTitle);		
		
		
		return "/cms/user/" + (siteCode != null && siteCode.equals("base") ? "base" : "site") + "/main/userMainView";
	}
	
	
/*	// 사용자 메인 - 팝업 창 뷰
	@RequestMapping(value="/{siteCode}/popup/windowView", method=RequestMethod.GET)
	private String popupWindowView(
				@PathVariable("siteCode") String siteCode, 
				@RequestParam(value="popupNo", required=false) String popupNo, 
				HttpServletRequest httpServletRequest, 
				Model model
			) {
		
		// 서비스 - 메인 팝업 목록
		Popup mainPopupRead = userMainService.mainPopupRead(popupNo, "WINDOW", siteCode);

		model.addAttribute("mainPopupRead", mainPopupRead);		
		
		
		return "/cms/user/" + (siteCode != null && siteCode.equals("base") ? "base" : "site") + "/popup/userPopupWindowView";
	}
	
	@RequestMapping(value="/{siteCode}/main/naverBlog", produces = "text/xml; charset=utf8")
	@ResponseBody
	public String getNaverBlogContent(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws DOMException, JSONException, ParseException{
		response.setHeader("Content-Type", "text/xml;charset=UTF-8");
		// 서비스 - SNS API 목록 (네이버 블로그)
		JSONArray jarr = new JSONArray();
		String url = "http://blog.rss.naver.com/redis12";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.US);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy. MM. dd.");

		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = null;
		try {
			doc = db.parse(url);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doc.getDocumentElement().normalize();
		
		NodeList itemList = doc.getDocumentElement().getElementsByTagName("item");
		
		for(int i = 0 ; i < 6; i++){
			Node item =  itemList.item(i);
			NodeList infoList = item.getChildNodes();
			
			JSONObject jobj = new JSONObject();
			for(int a = 0; a < infoList.getLength(); a++){
				Node info = infoList.item(a);
				if(info.getNodeType() == Node.ELEMENT_NODE){
					Element ele = (Element)info;
					if(ele.getNodeName().equals("link")){
						jobj.put("link", ele.getTextContent());
					}
					
					else if(ele.getNodeName().equals("pubDate")){
						String date = "";
						
						Date temp = dateFormat.parse(ele.getTextContent());
							
						date = dateFormat2.format(temp);

						jobj.put("writeDate", date);
						break;
					}
					
					else if(ele.getNodeName().equals("title")){
						jobj.put("title", ele.getTextContent());
					}
				}
			}
			jarr.put(jobj);
		}
		return jarr.toString();
	}
	
	@RequestMapping(value="/{siteCode}/main/nabisLocal", produces = "text/xml; charset=utf8")
	@ResponseBody
	public String getNabisLocalNewsContent(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws DOMException, JSONException{
		response.setHeader("Content-Type", "text/xml;charset=UTF-8");
		// 서비스 - NABIS API 목록 (지역뉴스)
		JSONArray jarr = new JSONArray();
		String url = "http://bs1.eyesurfer.com/DataService/PaperService.asmx/GetCheckCustomerNewsList?eyeusrferID=itep&kno=0&knoList=&startDate=&endDate=&searchArea=&keyword=&mediaType=&startRowIndex=0&maximumRows=6";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = null;
		try {
			doc = db.parse(url);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doc.getDocumentElement().normalize();
		
		NodeList itemList = doc.getDocumentElement().getElementsByTagName("SOAPBSList");
		
		for(int i = 0 ; i < 6; i++){
			Node item =  itemList.item(i);
			NodeList infoList = item.getChildNodes();
			
			JSONObject jobj = new JSONObject();
			for(int a = 0; a < infoList.getLength(); a++){
				Node info = infoList.item(a);
				if(info.getNodeType() == Node.ELEMENT_NODE){
					Element ele = (Element)info;
					if(ele.getNodeName().equals("url")){
						jobj.put("link", ele.getTextContent());
					}
					
					else if(ele.getNodeName().equals("RegDate")){
						jobj.put("writeDate", ele.getTextContent().substring(0, 10).replace("-", ". ")+".");
					}
					
					else if(ele.getNodeName().equals("subject")){
						jobj.put("title", ele.getTextContent());
					}
					
					else if(ele.getNodeName().equals("contents")){
						jobj.put("contents", ele.getTextContent());
					}
					
					else if(ele.getNodeName().equals("images_url")){
						jobj.put("thumbnail", ele.getTextContent());
						break;
					}
				}
			}
			jarr.put(jobj);
		}
		return jarr.toString();
	}
	
	
	@RequestMapping(value="/{siteCode}/main/nabisCurator", produces = "text/xml; charset=utf8")
	@ResponseBody
	public String getNabisCuratorNewsContent(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws DOMException, JSONException{
		response.setHeader("Content-Type", "text/xml;charset=UTF-8");
		// 서비스 - NABIS API 목록 (큐레이터)
		JSONArray jarr = new JSONArray();
		String url = "https://www.nabis.go.kr/openApiCuratorList.do?apiKey=15d4c60a1303407db35cb193bdb0d472";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = null;
		try {
			doc = db.parse(url);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doc.getDocumentElement().normalize();
		
		NodeList itemList = doc.getDocumentElement().getElementsByTagName("data");
		
		for(int i = 0 ; i < 6; i++){
			Node item =  itemList.item(i);
			NodeList infoList = item.getChildNodes();
			
			JSONObject jobj = new JSONObject();
			for(int a = 0; a < infoList.getLength(); a++){
				Node info = infoList.item(a);
				if(info.getNodeType() == Node.ELEMENT_NODE){
					Element ele = (Element)info;
					if(ele.getNodeName().equals("url")){
						jobj.put("link", ele.getTextContent());
					}
					else if(ele.getNodeName().equals("title")){
						jobj.put("title", ele.getTextContent());
					}
					else if(ele.getNodeName().equals("regionName")){
						jobj.put("region", ele.getTextContent());
					}
					else if(ele.getNodeName().equals("curatorNm")){
						jobj.put("name", ele.getTextContent());
					}
					else if(ele.getNodeName().equals("imgUrl")){
						jobj.put("thumbnail", ele.getTextContent());
					}
					else if(ele.getNodeName().equals("yyyy")){
						jobj.put("writeDate", ele.getTextContent().substring(0, 10).replace("-", ". ")+".");
					}
				}
			}
			jarr.put(jobj);
		}
		return jarr.toString();
	}*/
}