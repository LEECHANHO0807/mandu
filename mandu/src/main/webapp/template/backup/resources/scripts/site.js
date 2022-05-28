/*
 * GNB
 *
;(function() {
	var AccessibleNav = function() {
		this.status = false;
		this.anchor = [];
	};

	AccessibleNav.prototype = {
		initialize:function() {
			var that = this;
			that.hook = $(that.options.hook);
			that.listParent = that.options.listParent;
			that._map();

			that.anchor.on('focus', function() {
					that._focus.apply(that, [this, 'focus']);
				}).on('focusout', function() {
					that.status = false;
					setTimeout(function() {
						if(that.status === false) {
							that._blur();
						}
					}, 12);
				}).on('focusin', function() {
					that.status = true;
				}).on('mouseenter', function() {
					that._focus.apply(that, [this, 'mouseover']);
				});

			that.hook.on('mouseleave', function() {
				$(this).find(that.listParent).removeClass(that.options.mouseoverClass);
				that.hook.removeClass(that.options.selectClass);
			});
		},
		_map:function() {
			var that = this;

			that.hook.find('a').each(function() {
				that.anchor = $.merge($(this), that.anchor);
			});
		},
		_focus:function(el, type) {
			var that = this,
				_class = type === 'focus' ? that.options.focusClass : that.options.mouseoverClass;

			$(el).closest(that.hook).addClass(that.options.selectClass);

			$(el).closest(that.listParent).addClass(_class)
				.siblings().removeClass(_class);
		},
		_blur:function() {
			var that = this;

			that.hook.removeClass(that.options.selectClass)
				.find(that.listParent).removeClass(that.options.focusClass);
		}
	};

	var gnb = new AccessibleNav();

	return {
		load:function() {
			var that = this;
			$(window).on('load', function() {
				gnb.options = {
					hook:'.gnb',
					listParent:'li.gnb-menu',
					selectClass:'selected',
					focusClass:'focus',
					mouseoverClass:'over'
				};

				gnb.initialize();
			});
		}
	};
})().load();
*/


/* 3차 추가 */
function gnbThird() {

	jQuery('.gnb .sub-nav__3rd a').closest('.sub-nav__box__list').addClass('has_3rd');


	var oldIndex = 0;

	jQuery('.gnb .has_3rd').mouseenter(function() {
		var thisIndex = jQuery('.has_3rd').index(this);

		jQuery('.gnb .has_3rd').removeClass('focus');
		jQuery('.gnb .has_3rd .sub-nav__3rd').eq(thisIndex).addClass('on');
		jQuery('.gnb .has_3rd').eq(thisIndex).addClass('on');
		if(oldIndex != null && thisIndex != oldIndex){
			jQuery('.gnb .has_3rd .sub-nav__3rd').eq(oldIndex).removeClass('on');
			jQuery('.gnb .has_3rd').eq(oldIndex).removeClass('on');

			}
		oldIndex = thisIndex;

		return false;
	});

	jQuery('.gnb .has_3rd').mouseleave(function() {
		var thisIndex = jQuery('.gnb .has_3rd').index(this);

			jQuery('.gnb .has_3rd .sub-nav__3rd').eq(oldIndex).removeClass('on');
			jQuery('.gnb .has_3rd').eq(oldIndex).removeClass('on');

		oldIndex = thisIndex;

		return false;
	});
	jQuery('.gnb .sub-nav__box__list > a').focusin(function() {
		var thisIndex = jQuery('.gnb .has_3rd > a').index(this);
		var momItem = jQuery(this).closest('.sub-nav__box__list');

		jQuery('.gnb .has_3rd').removeClass('focus');

		if(momItem.hasClass('has_3rd') == true){
			jQuery('.gnb .has_3rd').eq(thisIndex).addClass('focus');
		} else if (momItem.hasClass('has_3rd') != true){
			jQuery('.gnb .has_3rd').removeClass('focus');
		}
		oldIndex = thisIndex;

		return false;
	});
	jQuery('.gnb-menu > a').focusin(function() {
		jQuery('.gnb .has_3rd').removeClass('focus');
	});

	jQuery('.gnb .gnb-menu').each(function(i) {
		$(this).addClass('sel_' + (i + 1));
	});
}



/* skip navigation */

function skipNavi() {

	jQuery('.skiptoContent').focusin(function(){
		jQuery('.skiptoContent').addClass('on');

	});
	jQuery('.skiptoContent').focusout(function(){
		jQuery('.skiptoContent').removeClass('on');

	});
}

/*탭*/
function mainTab(tabName) {
	var oldIndex = 0;
	jQuery(tabName).find('.js-nav__list').click(function() {
		var thisIndex = jQuery(tabName).find('.js-nav__list').index(this);
		var tabItem = jQuery(tabName).find('.js-nav__list');
		//var nextItem = jQuery(tabName).find('.js-nav__list').next();
		var boxItem = jQuery(tabName).find('.js-box');

		tabItem.removeClass('on');
		boxItem.removeClass('on');
		//nextItem.removeClass('next-item');
		tabItem.eq(thisIndex).addClass('on');
		boxItem.eq(thisIndex).addClass('on');
		//nextItem.eq(thisIndex).addClass('next-item');

		return false;
	});
};

/*서브탭*/
function subTab(tabName) {

	document.title =  jQuery(tabName).find( '.js-nav__list.on a' ).html() + ' /' + jQuery('.loc_tit').html() + ' ▦ ';

	var oldIndex = 0;

	jQuery(tabName).find('.js-nav__list').click(function() {
		var thisIndex = jQuery(tabName).find('.js-nav__list').index(this);
		var tabItem = jQuery(tabName).find('.js-nav__list');
		var boxItem = jQuery(tabName).find('.js-box');
		//var siteTitle = jQuery('header h1').text();

		tabItem.removeClass('on');
		boxItem.removeClass('on');
		tabItem.eq(thisIndex).addClass('on');
		boxItem.eq(thisIndex).addClass('on');
		document.title =  jQuery(tabName).find( '.js-nav__list.on a' ).text() + ' /' + jQuery('.loc_tit').text() + ' ▦ ' + siteTitle;
		return false;
	});
};
/* 아이디 비번찾기쪽 탭 */
function idTab(tabName) {

	//document.title =  jQuery(tabName).find( '.js-nav__list.on a' ).html() + ' /' + jQuery('.loc_tit').html() + ' ▦ ';

	var oldIndex = 0;

	jQuery(tabName).find('.js-nav__list').click(function() {
		var thisIndex = jQuery(tabName).find('.js-nav__list').index(this);
		var tabItem = jQuery(tabName).find('.js-nav__list');
		var boxItem = jQuery(tabName).find('.js-box');
		//var siteTitle = jQuery('header h1').text();

		tabItem.removeClass('on');
		boxItem.removeClass('on');
		tabItem.eq(thisIndex).addClass('on');
		boxItem.eq(thisIndex).addClass('on');
		//document.title =  jQuery(tabName).find( '.js-nav__list.on a' ).text() + ' /' + jQuery('.loc_tit').text() + ' ▦ ' + siteTitle;
		return false

	});
};
/*자동사이즈*/
function menuSize(menuName) {
	var menuWd = 100/jQuery(menuName).find('> ul > li').length;
		jQuery(menuName).find('> ul > li').css('width',menuWd + '%' );
};

/*갯수 숫자 클래스 삽입*/
function menuNumbering(menuName){
	var menuLength = jQuery(menuName).find('> ul > li').length;
	jQuery(menuName).addClass('menu-num-'+ menuLength);
}

/* title_copy */
function title_copy(){
	var sjLine = jQuery('tr').hasClass('sj_line');
	var siteTitle = jQuery('h1 img').attr('alt');
	var mainLocate = jQuery('body').hasClass('mainpage');

	if (sjLine == true ){
		document.title =  jQuery('.sj_line td').text() + ' / ' + jQuery( '.loc_tit' ).text() + ' ▦ ' + siteTitle ;
	}
	else if (mainLocate == true) {
		document.title = siteTitle ;
	}
	else {
		document.title = jQuery( '.loc_tit' ).text() + ' ▦ ' + siteTitle ;
	}
};


/* font size *
var $window = jQuery(window),
	$document = jQuery(document),
	$html = jQuery('html'),
	fontIndex = jQuery.cookie('webFontSize') ? jQuery.cookie('webFontSize') : 1;

function setFontSizeClass() {
	$html.removeClass(function(index,class_list_str){
		var class_list = class_list_str.split(' ');
		for(var i = 0 ; i < class_list.length ; i ++) {
			var cls = class_list[i];
			if(cls.match(/websize\-[0-9]+/)) {
				return cls;
			}
		}
	}).addClass('websize-' + fontIndex);
	jQuery.cookie('webFontSize', fontIndex, { path: '/' });
}
function js_font_plus(){
	if(fontIndex >= 5) return false;
	fontIndex++;
	setFontSizeClass();
}
function js_font_minus(){
	if(fontIndex <= 1) return false;
	fontIndex--;
	setFontSizeClass();
}

jQuery(function() {
	$html.addClass('websize-' + fontIndex);
});
*/

/*배너형 스크롤*/
function mainRolling() {
		$.fn.roll = function(){
			var hook = $(this);
			var UL = hook.find('.listwrap');
			var LI = UL.find('li');
			var ULwidth = LI.outerWidth() * LI.length;
			var prev = jQuery('.r_prev');
			var next = jQuery('.r_next');
			var pause = jQuery('.r_pause');
			var start = jQuery('.r_start');
			var interval;
			var intervalPosition = 'next';

			var nextEvent = function(){
				clearInterval(interval);
				intervalPosition = 'next';
				interval = setInterval(intervalFN, 5000);

				LI = UL.find('li');
				UL.animate({left:-LI.outerWidth()},	function(){
					UL.css({left:0});
					var firstLI = LI.eq(0).remove();
					firstLI.appendTo(UL);
				});
				return false;
			};

			var prevEvent = function(){
				clearInterval(interval);
				intervalPosition = 'prev';
				interval = setInterval(intervalFN, 5000);

				LI = UL.find('li');
				var lastLI = LI.eq(LI.length-1).remove();
				lastLI.prependTo(UL);
				UL.css({left:-LI.outerWidth()});
				UL.animate({left:0});
				return false;
			};

			var pauseEvent = function() {
				clearInterval(interval);
				return false;
			};

			var startEvent = function() {
				clearInterval(interval);
				interval = setInterval(intervalFN, 5000);
				return false;
			};

			var intervalFN = function() {
				if(intervalPosition == 'next')
					nextEvent();
				else
					prevEvent();
			};

			interval = setInterval(intervalFN, 5000);

			UL.css({width:ULwidth});
			next.bind('click', nextEvent);
			prev.bind('click', prevEvent);
			start.bind('click', startEvent);
			pause.bind('click', pauseEvent);
			pauseEvent(); //stop;

		/*
			if(jQuery('.listwrap li').length <= 3) {
				jQuery('.r_next').addClass('hide');
				jQuery('.r_prev').addClass('hide');
			}else if (jQuery('.listwrap li').length >= 4) {
				jQuery('.r_next').removeClass('hide');
				jQuery('.r_prev').removeClass('hide');
			}
		*/
		}
		jQuery('#test').roll();
}

/* 상하식 롤링 */
function RollingUpDown() {
	$.fn.roll = function(){
		var hook = $(this);
		var UL = hook.find('.listwrap2');
		var LI = UL.find('li');
		var ULwidth = LI.outerHeight() * LI.length;
		var prev = $('.r_prev2');
		var next = $('.r_next2');
		var pause = $('.r_pause');
		var start = $('.r_start');
		var interval;
		var intervalPosition = 'next';

		var nextEvent = function(){
			clearInterval(interval);
			intervalPosition = 'next';
			interval = setInterval(intervalFN, 5000);

			LI = UL.find('li');
			UL.animate({top:-LI.outerHeight()},	function(){
				UL.css({top:0});
				var firstLI = LI.eq(0).remove();
				firstLI.appendTo(UL);
			});
			return false;
		};

		var prevEvent = function(){
			clearInterval(interval);
			intervalPosition = 'prev';
			interval = setInterval(intervalFN, 5000);

			LI = UL.find('li');
			var lastLI = LI.eq(LI.length-1).remove();
			lastLI.prependTo(UL);
			UL.css({top:-LI.outerHeight()});
			UL.animate({top:0});
			return false;
		};

		var pauseEvent = function() {
			clearInterval(interval);
			return false;
		};

		var startEvent = function() {
			clearInterval(interval);
			interval = setInterval(intervalFN, 5000);
			return false;
		};

		var intervalFN = function() {
			if(intervalPosition == 'next')
				nextEvent();
			else
				prevEvent();
		};

		interval = setInterval(intervalFN, 5000);

		UL.css({width:ULwidth});
		next.bind('click', nextEvent);
		prev.bind('click', prevEvent);
		start.bind('click', startEvent);
		pause.bind('click', pauseEvent);
	}
	jQuery('#rollup').roll();
}

/* 모바일 메뉴 오픈 */
function mobile_menu() {
	jQuery('.mobile_on_off').on('click',function(){
		jQuery('body').toggleClass('mobile_menu_open');
		jQuery('#gnb_nav_mobile').toggleClass('selected');
		jQuery('.mobile_top_nav').toggleClass('selected');
		jQuery('.mobile_top_nav .gnb').toggleClass('selected');
		jQuery('.header__links').toggleClass('selected');
		return false;
	});
}

function mainGnbMobile() {
	var oldIndex = 0;

	jQuery('.sub-nav__box__ul > li').closest('.gnb-menu').addClass('has-menu'); //2차메뉴 있을시 클래스 삽입
	jQuery('.has-menu').siblings().addClass('no-has-menu');
	jQuery('.has-menu.no-has-menu').removeClass('no-has-menu');

	//
	jQuery('.mobile_top_nav li.gnb-menu.has-menu > .sub-nav').slideUp();
	jQuery('.mobile_top_nav li.gnb-menu.has-menu.on > .sub-nav').addClass('on').slideDown();
	jQuery('.mobile_top_nav .has-menu .gnb-menu__a').attr("href","#none"); //

	jQuery('.mobile_top_nav li.gnb-menu.has-menu > a').click(function() {
		var thisIndex = jQuery('.mobile_top_nav li.gnb-menu.has-menu > a').index(this);

		if (jQuery('.mobile_top_nav .has-menu div.sub-nav').eq(thisIndex).hasClass('on') == true) {

			jQuery('.mobile_top_nav .has-menu div.sub-nav').eq(thisIndex).slideUp();
			jQuery('.mobile_top_nav li.gnb-menu.has-menu').eq(thisIndex).removeClass('on');
			jQuery('.mobile_top_nav .has-menu div.sub-nav').eq(thisIndex).removeClass('on');

		} else {

			jQuery('.mobile_top_nav .has-menu div.sub-nav').slideUp();
			jQuery('.mobile_top_nav li.gnb-menu.has-menu').removeClass('on');
			jQuery('.mobile_top_nav .has-menu div.sub-nav').removeClass('on');

			jQuery('.mobile_top_nav .has-menu div.sub-nav').eq(thisIndex).slideDown();
			jQuery('.mobile_top_nav li.gnb-menu.has-menu').eq(thisIndex).addClass('on');
			jQuery('.mobile_top_nav .has-menu div.sub-nav').eq(thisIndex).addClass('on');
		}
		//return false;
	});



};

/* 사이드메뉴 */
function side_open(){
		jQuery('.side-list__li__inbox').closest('.side-list__li').addClass('open-type');
		jQuery('.spp__in__small').closest('.spp__in').addClass('sp-open-type');

		var oldIndex = 0;
		jQuery('.open-type span').bind('click',function() {//alert(jQuery('div').index(this));
			var thisIndex = jQuery('.open-type span').index(this);

			jQuery('.open-type').eq(thisIndex).toggleClass('on');
			oldIndex = thisIndex;

			return false;
		});

		jQuery('.spp__in > a').bind('click',function() {
			var smallBox = jQuery(this).closest('.spp__in').children('.spp__in__small').length;
				if ( smallBox == 1 )
				{
					jQuery(this).closest('.spp__in').toggleClass('on')
				return false;
				}
			}

		) ;
}

function side_open2(){
		jQuery('.side-list__li__inbox').closest('.side-list__li').addClass('open-type');
		jQuery('.spp__in__small').closest('.spp__in').addClass('sp-open-type');

}

function sizeLength(){
	var sLength = $('.sidebar__h2').html();

	if (sLength.length > 8) {
		$('.sidebar__h2').addClass('long-type')
	} else {
		$('.sidebar__h2').addClass('short-type')
	}
	return false
}

function menuLight() {

	var menuNum = jQuery("#menuNo").val();
	var subNum = jQuery("#subMenuNo").val();
	var thirdMenuNo = jQuery("#thirdMenuNo").val();
	var menuWd = 100/jQuery('#submenu > ul > li').length;

	jQuery('#sidebar > div > ul > li.2dep_'+subNum).addClass('on');
	jQuery('#sidebar > div > ul > li > div > ul >  li.3dep_'+thirdMenuNo).addClass('on');

}

function mobileMenuOpen() {
	jQuery('.mobile-submenu-btn').on('click',function() {
		jQuery('.sidebar').toggleClass('selected');
		jQuery('.mobile-submenu-btn').toggleClass('selected');
		return false;
	});
	jQuery('.spp__in.selected').closest('.side-list__li').addClass('on');
	jQuery('.sub-nav__box__list.on').closest('.gnb-menu').addClass('on');
}

/**/
function sizeComp(){
	var thisIndex = jQuery('#gnb .gnb-ul > li').index(this);
	var size_top = jQuery('#gnb').width();
	var size_item = jQuery('#gnb .gnb-ul ').width();
	var gnbli = jQuery('#gnb .gnb-ul > li').length;
	var size_resize = ((size_top - size_item) / gnbli );
	var size_result = size_resize / 2;


		jQuery('#gnb .gnb-menu > a').css({paddingLeft:size_result});
		jQuery('#gnb .gnb-menu > a').css({paddingRight:size_result - 1});


		jQuery('#gnb .sub-nav').each(function(i) {
			var size_box = jQuery(this).eq(thisIndex).closest('.gnb-menu').children('.t_item').width();
			jQuery(this).eq(thisIndex).css({width:size_box + size_resize -2 });
		});

}


/* 비주얼부분 타이틀 */
function subVisualTit() {
	var subTit = jQuery('.sidebar__h2').text();
	jQuery('.sub-visual__tit').text(subTit)

}


/* 가로형*/
/*
function liNum(){
	var liLength = $('.side-list__li').length;
	if (liLength <= 3) {
		$('.sidebar').addClass('ver-low')
	}
}
*/
function retrPos(){
	var orgPos = $('.side-list__li.on em');
	var liWidth = $('.side-list__li.on em').width();

	$('.selected-bar').css('width',liWidth +40);
	$('.selected-bar').stop().animate({
		left:orgPos.position().left -20
	}, 200);


}

function pageChange() {
	var hook = $(this).find('em');
	var liWidth = $(this).find('em').width();

	$('.selected-bar').stop().animate({
		left:hook.position().left -20,
		width:liWidth +40
	}, 200);

}



/* video 테그 일시정지,플레이*/
function videoPlay(videoId,playPause){
	var video = document.getElementById(videoId);
	var playButton = document.getElementById(playPause);

	playButton.addEventListener("click", function() {
		if (video.paused == true) {
			video.play();
			playButton.innerHTML = "일시정지";
		} else {
			video.pause();
			playButton.innerHTML = "재생";
		}
		return false;
	});
}



//총결제금액 숫자 콤마 넣기
function comma(num) {
	num = num.toString();

	document.write(num.replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,'));
}


// radio 클릭시 클래스 삽입 (설문조사)

function radioSel() {
	//jQuery('.radio-type-survey:checked').closest('div').addClass('on');
	jQuery('.radio-type-survey').on('click',function(){
		jQuery('.radio-type-survey').closest('div').removeClass('on');
		jQuery('.radio-type-survey:checked').closest('div').addClass('on');
	});

}

// 그래프

function reslutGrph() {
	jQuery('.survey-result__grph__bar__in').css('width', function(){
		var barLength = jQuery(this).closest('.survey-result__grph').find('em').text();
		jQuery(this).css('width',barLength);
	});
}

// FAQ
function faqNew() {

	jQuery('.faq-box__list__tit__opener.type1').on('click',function() {
		jQuery(this).closest('.faq-box__list').addClass('on');
		jQuery(this).closest('.faq-box__list').children('.faq-box__list__answer').slideDown();
		return false;
	});

	jQuery('.faq-box__list__tit__opener.type2').on('click',function() {
		jQuery(this).closest('.faq-box__list').removeClass('on');
		jQuery(this).closest('.faq-box__list').children('.faq-box__list__answer').slideUp();
		return false;
	});

}