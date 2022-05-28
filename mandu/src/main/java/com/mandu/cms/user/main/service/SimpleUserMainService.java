/*
 * package com.mandu.cms.user.main.service;
 * 
 * import java.util.List;
 * 
 * import javax.annotation.Resource;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.mandu.cms.admin.balance.youtube.domain.Youtube; import
 * com.mandu.cms.admin.function.banner.domain.Banner; import
 * com.mandu.cms.admin.function.popup.domain.Popup; import
 * com.mandu.cms.admin.structure.board.domain.Board; import
 * com.mandu.cms.user.main.dao.UserMainDao;
 * 
 * 
 * 
 * @Service("userMainService") public class SimpleUserMainService implements
 * UserMainService {
 * 
 * 
 * @Resource(name="userMainDao") UserMainDao userMainDao;
 * 
 * 
 * 
 * 
 * @Override public List<Youtube> mainYoutubeList() {
 * 
 * return userMainDao.mainYoutubeList(); }
 * 
 * @Override public List<Popup> mainPopupList() {
 * 
 * return userMainDao.mainPopupList(null); }
 * 
 * 
 * @Override public List<Popup> mainPopupList(Popup popup) {
 * 
 * return userMainDao.mainPopupList(popup); }
 * 
 * 
 * @Override public List<Popup> mainPopupList(String siteCode) {
 * 
 * Popup popup = new Popup();
 * 
 * popup.setSiteCode(siteCode);
 * 
 * 
 * return userMainDao.mainPopupList(popup); }
 * 
 * 
 * @Override public Popup mainPopupRead(Popup popup) {
 * 
 * return userMainDao.mainPopupRead(popup); }
 * 
 * 
 * @Override public Popup mainPopupRead(String popupNo, String type) {
 * 
 * Popup popup = new Popup();
 * 
 * popup.setPopupNo(popupNo); popup.setType(type);
 * 
 * 
 * return mainPopupRead(popup); }
 * 
 * 
 * @Override public Popup mainPopupRead(String popupNo, String type, String
 * siteCode) {
 * 
 * Popup popup = new Popup();
 * 
 * popup.setPopupNo(popupNo); popup.setType(type); popup.setSiteCode(siteCode);
 * 
 * 
 * return mainPopupRead(popup); }
 * 
 * 
 * @Override public List<Banner> mainBannerList(String storageCode, String type)
 * {
 * 
 * Banner banner = new Banner();
 * 
 * banner.setStorageCode(storageCode); banner.setType(type);
 * 
 * 
 * return userMainDao.mainBannerList(banner); }
 * 
 * 
 * @Override public List<Banner> mainBannerList(String storageCode, String type,
 * String siteCode) {
 * 
 * Banner banner = new Banner();
 * 
 * banner.setStorageCode(storageCode); banner.setType(type);
 * banner.setSiteCode(siteCode);
 * 
 * 
 * return userMainDao.mainBannerList(banner); }
 * 
 * }
 */