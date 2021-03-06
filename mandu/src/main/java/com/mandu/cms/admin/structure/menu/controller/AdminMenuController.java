/*
 * package com.mandu.cms.admin.structure.menu.controller;
 * 
 * import java.util.List;
 * 
 * import javax.annotation.Resource; import
 * javax.servlet.http.HttpServletRequest;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.ResponseBody;
 * 
 * import com.mandu.cms.admin.common.service.AdminSiteCodeService; import
 * com.mandu.cms.admin.structure.board.domain.BoardManagement; import
 * com.mandu.cms.admin.structure.board.service.AdminBoardManagementService;
 * import com.mandu.cms.admin.structure.contents.domain.Contents; import
 * com.mandu.cms.admin.structure.contents.service.AdminContentsService; import
 * com.mandu.cms.admin.structure.menu.domain.Menu; import
 * com.mandu.cms.admin.structure.menu.service.AdminMenuService; import
 * com.mandu.cms.admin.structure.rental.domain.RentalManagement; import
 * com.mandu.cms.admin.structure.rental.service.AdminRentalManagementService;
 * import com.mandu.cms.admin.structure.schedule.domain.ScheduleManagement;
 * import com.mandu.cms.admin.structure.schedule.service.
 * AdminScheduleManagementService; import
 * com.mandu.cms.log.service.LogProcessService;
 * 
 * 
 * @Controller
 * 
 * @RequestMapping(value="/admin") public class AdminMenuController {
 * 
 * 
 * @Resource(name="adminMenuService") private AdminMenuService adminMenuService;
 * 
 * 
 * @Resource(name="adminBoardManagementService") private
 * AdminBoardManagementService adminBoardManagementService;
 * 
 * 
 * @Resource(name="adminScheduleManagementService") private
 * AdminScheduleManagementService adminScheduleManagementService;
 * 
 * 
 * @Resource(name="adminRentalManagementService") private
 * AdminRentalManagementService adminRentalManagementService;
 * 
 * 
 * @Resource(name="adminContentsService") private AdminContentsService
 * adminContentsService;
 * 
 * 
 * @Resource(name="adminSiteCodeService") private AdminSiteCodeService<Menu>
 * adminSiteCodeService;
 * 
 * 
 * @Resource(name="logProcessService") private LogProcessService
 * logProcessService;
 * 
 * 
 * 
 * 
 * // ?????? ??????
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/view",
 * method=RequestMethod.GET) private String menuView(
 * 
 * @PathVariable("siteCode") String siteCode ) {
 * 
 * return "/cms/admin/structure/menu/adminMenuView"; }
 * 
 * 
 * // ?????? ?????? - AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/listAjax",
 * method=RequestMethod.GET) private String menuListAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("menu") Menu menu, Model model ) {
 * 
 * // ????????? - ????????? ?????? ?????? adminSiteCodeService.setSiteCode(menu, siteCode);
 * 
 * 
 * // ????????? - ?????? ?????? : ?????? 1 List<Menu> menuList1 =
 * adminMenuService.menuFirstList(menu);
 * 
 * model.addAttribute("menuList1", menuList1);
 * 
 * 
 * // ????????? - ?????? ?????? : ?????? 2 List<Menu> menuList2 =
 * adminMenuService.menuSecondList(menu);
 * 
 * model.addAttribute("menuList2", menuList2);
 * 
 * 
 * // ????????? - ?????? ?????? : ?????? 3 List<Menu> menuList3 =
 * adminMenuService.menuThirdList(menu);
 * 
 * model.addAttribute("menuList3", menuList3);
 * 
 * 
 * // ????????? - ?????? ?????? : ?????? 4 List<Menu> menuList4 =
 * adminMenuService.menuFourthList(menu);
 * 
 * model.addAttribute("menuList4", menuList4);
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuList/ajax"; }
 * 
 * 
 * // ?????? ?????? ?????? - AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/createAjax",
 * method=RequestMethod.GET) private String menuCreateAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("menu") Menu menu, Model model ) {
 * 
 * model.addAttribute("menu", menu);
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuCreate/ajax"; }
 * 
 * 
 * // ?????? ?????? ?????? - AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/createAjax",
 * method=RequestMethod.POST) private @ResponseBody String menuCreateAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("menu") Menu menu, HttpServletRequest httpServletRequest ) {
 * 
 * // ????????? - ????????? ?????? ?????? adminSiteCodeService.setSiteCode(menu, siteCode);
 * 
 * 
 * String menuCreateResult = adminMenuService.menuCreate(menu.getMenuLevel(),
 * menu, httpServletRequest);
 * 
 * if (menuCreateResult != null && !menuCreateResult.equals("")) {
 * 
 * // ?????? ???????????? logProcessService.logProcessCreate("CREATE", httpServletRequest);
 * 
 * 
 * return menuCreateResult; }
 * 
 * 
 * return null; }
 * 
 * 
 * // ?????? ?????? ?????? - AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/updateAjax",
 * method=RequestMethod.GET) private String menuUpdateAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("menu") Menu menu, HttpServletRequest httpServletRequest,
 * Model model ) {
 * 
 * // ????????? - ????????? ?????? ?????? adminSiteCodeService.setSiteCode(menu, siteCode);
 * 
 * 
 * // ????????? - ?????? ?????? Menu menuRead = adminMenuService.menuRead(menu);
 * 
 * model.addAttribute("menuRead", menuRead);
 * 
 * 
 * // ?????? ???????????? logProcessService.logProcessCreate("READ", httpServletRequest);
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuUpdate/ajax"; }
 * 
 * 
 * // ?????? ?????? ?????? - AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/updateAjax",
 * method=RequestMethod.POST) private @ResponseBody String menuUpdateAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("menu") Menu menu, HttpServletRequest httpServletRequest ) {
 * 
 * // ????????? - ????????? ?????? ?????? adminSiteCodeService.setSiteCode(menu, siteCode);
 * 
 * 
 * boolean menuUpdateResult = adminMenuService.menuUpdate(menu.getMenuLevel(),
 * menu, httpServletRequest);
 * 
 * if (menuUpdateResult) {
 * 
 * // ?????? ???????????? logProcessService.logProcessCreate("UPDATE", httpServletRequest);
 * 
 * 
 * return "SUCCESS"; }
 * 
 * 
 * return "FAILURE"; }
 * 
 * 
 * // ?????? ?????? - ????????? AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/typeBoardAjax",
 * method=RequestMethod.GET) private String menuTypeBoardAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("boardManagement") BoardManagement boardManagement, Model
 * model ) {
 * 
 * boardManagement.setSiteCode(siteCode);
 * 
 * // ????????? - ????????? ?????? ?????? List <BoardManagement> boardManagementList =
 * adminBoardManagementService.boardManagementList(boardManagement, "Y", 10, 10,
 * model);
 * 
 * model.addAttribute("boardManagementList", boardManagementList);
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuTypeBoard/ajax"; }
 * 
 * 
 * // ?????? ?????? - ?????? AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/typeScheduleAjax",
 * method=RequestMethod.GET) private String menuTypeScheduleAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("scheduleManagement") ScheduleManagement scheduleManagement,
 * Model model ) {
 * 
 * scheduleManagement.setSiteCode(siteCode);
 * 
 * // ????????? - ?????? ?????? ?????? List <ScheduleManagement> scheduleManagementList =
 * adminScheduleManagementService.scheduleManagementList(scheduleManagement,
 * "Y", 10, 10, model);
 * 
 * model.addAttribute("scheduleManagementList", scheduleManagementList);
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuTypeSchedule/ajax"; }
 * 
 * 
 * // ?????? ?????? - ?????? AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/typeRentalAjax",
 * method=RequestMethod.GET) private String menuTypeRentalAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("rentalManagement") RentalManagement rentalManagement, Model
 * model ) {
 * 
 * rentalManagement.setSiteCode(siteCode);
 * 
 * // ????????? - ?????? ?????? ?????? List <RentalManagement> rentalManagementList =
 * adminRentalManagementService.rentalManagementList(rentalManagement, "Y", 10,
 * 10, model);
 * 
 * model.addAttribute("rentalManagementList", rentalManagementList);
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuTypeRental/ajax"; }
 * 
 * 
 * // ?????? ?????? - ????????? AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/typeContentsAjax",
 * method=RequestMethod.GET) private String menuTypeContentsAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("contents") Contents contents, Model model ) {
 * 
 * contents.setSiteCode(siteCode);
 * 
 * // ????????? - ????????? ?????? List <Contents> contentsList =
 * adminContentsService.contentsList(contents, "Y", 10, 10, model);
 * 
 * model.addAttribute("contentsList", contentsList);
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuTypeContents/ajax"; }
 * 
 * 
 * // ?????? ?????? - ?????? ?????? AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/typeLinkAjax",
 * method=RequestMethod.GET) private String menuTypeLinkAjax(
 * 
 * @PathVariable("siteCode") String siteCode, Model model ) {
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuTypeLink/ajax"; }
 * 
 * 
 * // ?????? ?????? - ????????? ?????? AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/typeCustomAjax",
 * method=RequestMethod.GET) private String menuTypeCustomAjax(
 * 
 * @PathVariable("siteCode") String siteCode, Model model ) {
 * 
 * 
 * return "/cms/admin/structure/menu/adminMenuTypeCustom/ajax"; }
 * 
 * 
 * // ?????? ?????? ?????? - AJAX
 * 
 * @RequestMapping(value="/{siteCode}/structure/menu/deleteAjax",
 * method=RequestMethod.POST) private @ResponseBody String menuDeleteAjax(
 * 
 * @PathVariable("siteCode") String siteCode,
 * 
 * @ModelAttribute("menu") Menu menu, HttpServletRequest httpServletRequest,
 * Model model ) {
 * 
 * // ????????? - ????????? ?????? ?????? adminSiteCodeService.setSiteCode(menu, siteCode);
 * 
 * 
 * boolean menuUpdateResult = adminMenuService.menuDelete(menu,
 * httpServletRequest);
 * 
 * if (menuUpdateResult) {
 * 
 * // ?????? ???????????? logProcessService.logProcessCreate("DELETE", httpServletRequest);
 * 
 * 
 * return "SUCCESS"; }
 * 
 * 
 * return "FAILURE"; }
 * 
 * 
 * }
 */