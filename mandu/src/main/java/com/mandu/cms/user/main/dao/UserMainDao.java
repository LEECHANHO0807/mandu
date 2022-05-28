/*
 * package com.mandu.cms.user.main.dao;
 * 
 * import java.util.List;
 * 
 * import org.springframework.stereotype.Repository;
 * 
 * import com.mandu.cms.abstracts.AbstractDAO; import
 * com.mandu.cms.admin.balance.youtube.domain.Youtube; import
 * com.mandu.cms.admin.function.banner.domain.Banner; import
 * com.mandu.cms.admin.function.popup.domain.Popup;
 * 
 * 
 * 
 * @Repository("userMainDao") public class UserMainDao extends AbstractDAO {
 * 
 * 
 * // 메인 팝업 목록 public List<Popup> mainPopupList(Popup popup) {
 * 
 * return selectList("userMain.mainPopupList", popup); }
 * 
 * 
 * // 메인 팝업 읽기 public Popup mainPopupRead(Popup popup) {
 * 
 * return selectOne("userMain.mainPopupRead", popup); }
 * 
 * 
 * // 메인 배너 목록 public List<Banner> mainBannerList(Banner banner) {
 * 
 * return selectList("userMain.mainBannerList", banner); }
 * 
 * // 메인 유튜브 목록 public List<Youtube> mainYoutubeList() {
 * 
 * return selectList("userMain.mainYoutubeList"); }
 * 
 * 
 * }
 */