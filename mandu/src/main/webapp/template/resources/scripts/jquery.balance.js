function getSliderSettings(selector, type) {
	if (type == "gallery") {
		return {
			dots: false,
			infinite: true,
			autoplay: true,
			autoplaySpeed: 5000,
			accessibility: true,
			speed: 300,
			prevArrow: $(selector).parent().find('.section-title__control__arrows__prev'),
			nextArrow: $(selector).parent().find('.section-title__control__arrows__next'),
			slidesToShow: 2,
			slidesToScroll: 1,
			responsive: [
				{
					breakpoint: 480,
					settings: {
						slidesToShow: 1,
					}
				}
			]
		}
	} else if (type == "nabis") {
		return {
			dots: false,
			infinite: true,
			autoplay: true,
			autoplaySpeed: 4000,
			accessibility: true,
			speed: 300,
			prevArrow: $(selector).parent().find('.section-nabis-gallery__arrows__prev'),
			nextArrow: $(selector).parent().find('.section-nabis-gallery__arrows__next')
		}
	} else if (type == "popupzone") {
		return {
			dots: false,
			infinite: true,
			autoplay: true,
			autoplaySpeed: 4000,
			accessibility: true,
			speed: 300,
			prevArrow: $(selector).parent().find('.section-title__control__arrows__prev'),
			nextArrow: $(selector).parent().find('.section-title__control__arrows__next')
		}
	} else if (type == "banner") {
		return {
            dots: false,
            infinite: true,
            accessibility: true,
            autoplay: true,
            autoplaySpeed: 3000,
            speed: 300,
            prevArrow: $(selector).parent().find('.logo-banner__prev'),
            nextArrow: $(selector).parent().find('.logo-banner__next'),
            slidesToShow: 7,
            slidesToScroll: 1,
            responsive: [
                {
                    breakpoint: 1400,
                    settings: {
                    slidesToShow: 6,
                    }
                },
                {
                    breakpoint: 1200,
                    settings: {
                    slidesToShow: 5,
                    }
                },
                {
                    breakpoint: 992,
                    settings: {
                    slidesToShow: 4,
                    }
                },
                {
                    breakpoint: 768,
                    settings: {
                    slidesToShow: 3,
                    }
                },
                {
                    breakpoint: 600,
                    settings: {
                    slidesToShow: 2,
                    }
                },
                {
                    breakpoint: 480,
                    settings: {
                    slidesToShow: 1,
                    }
                }
            ]
        }
	} else {
		return {}
	}
}

$(document).ready(function() {
	$(".section-gallery").find(".thumb > img").each(function() {
		$(this).parent().prepend("<div class='thumb-overlay' style='background-image: url(" + $(this).attr("src") + ");'></div>");
	});
	$(".section-nabis-gallery__cont").find(".thumb > img").each(function() {
		$(this).parent().prepend("<div class='thumb-overlay' style='background-image: url(" + $(this).attr("src") + ");'></div>");
	});
	$(".section-nabis-gallery__cont").find(".thumb > img").each(function() {
		$(this).parent().prepend("<div class='thumb-overlay' style='background-image: url(" + $(this).attr("src") + ");'></div>");
	});

	// $("#slider_sns_fb").slick(getSliderSettings("#slider_sns_fb", "gallery"));
	// $("#slider_sns_blog").slick(getSliderSettings("#slider_sns_blog", "gallery"));
	$("#slider_sns_youtube").slick(getSliderSettings("#slider_sns_youtube", "gallery"));
	$("#slider_committee").slick(getSliderSettings("#slider_committee", "gallery"));
	$("#slider_popupzone").slick(getSliderSettings("#slider_popupzone", "popupzone"));
	$("#slider_banner").slick(getSliderSettings("#slider_banner", "banner"));
	$("#slider_nabis01").slick(getSliderSettings("#slider_nabis01", "nabis"));
	$("#slider_nabis02").slick(getSliderSettings("#slider_nabis02", "nabis"));


	// 시작 및 일시정지 사용시 아래 배열에 추가
	var slider = ["#slider_sns_fb", "#slider_sns_blog", "#slider_sns_youtube", "#slider_committee", "#slider_popupzone", "#slider_banner", "#slider_nabis01", "slider_nabis02"]

	slider.forEach(function (item, index, array) {
		// 슬라이더 시작버튼
		$(item).parent().find('[class$="start"]').click(function() {
			$(item).slick('slickPlay');
			$(this).hide();
			$(item).parent().find('[class$="pause"]').show();
		});

		// 슬라이더 정지버튼
		$(item).parent().find('[class$="pause"]').click(function() {
			$(item).slick('slickPause');
			$(this).hide();
			$(item).parent().find('[class$="start"]').show();
		});
	});

	// 메인 탭게시판 섹션 온오프
	$(".section-board-list > li > h3 > a").bind({
		focusin: function() {
			$(this).parents(".section-board-list").find(">li.active").removeClass("active");
			$(this).parents("li").addClass("active");
		},
		click: function() {
			$(this).parents(".section-board-list").find(">li.active").removeClass("active");
			$(this).parents("li").addClass("active");

			return false;
		}
	});

	// 메인 NABIS 탭게시판 섹션 온오프
	$(".section-nabis-gallery > li > h3 > a").bind({
		focusin: function() {
			if ($(this).parents("li").find(".section-nabis-gallery__cont").length > 0) {
				$(this).parents(".section-nabis-gallery").find(">li.active").removeClass("active");
				$(this).parents("li").addClass("active");
			}
		},
		click: function() {
			if ($(this).parents("li").find(".section-nabis-gallery__cont").length > 0) {
				$(this).parents(".section-nabis-gallery").find(">li.active").removeClass("active");
				$(this).parents("li").addClass("active");

				return false;
			}
		}
	});

	$("#header ul.menus > li").bind({
		mouseover: function() {
			$(this).find(">ul").stop().slideDown();
		},
		mouseleave: function() {
			$(this).find(">ul").stop().slideUp();
		}
	});

	$("#header ul.menus > li > a").bind({
		focusin: function() {
			$(this).parent().find(">ul.dropdown-menu").stop().slideDown();
		}
	});

	$("#header ul.menus > li > ul.dropdown-menu > li a").bind({
		focusin: function() {
			$(this).parents("ul.dropdown-menu").stop().slideDown();
		},
		focusout: function() {
			$(this).parents("ul.dropdown-menu").stop().slideUp();
		}
	});

	// 최상단으로 스크롤
	$(".scroll-top").click(function() {
		$('html, body, body > .scroll-wrapper, body > .scroll-wrapper > .scroll-content').stop().animate({scrollTop : 0}, 500);
		$("header h1 a").focus();
		return false;
	});

	// footer family site
	$(document).ready(function() {
		$(".footer-copyright__family h3").click(function() {
			$(this).parent().find(">ul").stop().slideToggle();
		});

		$(".footer-copyright__family h3").keydown(function(key) {
			if (key.keyCode == 13) {
				$(this).parent().find(">ul").stop().slideToggle();
			}
		});

		$(".footer-copyright__family ul li a").last().focusout(function() {
			$(this).parents("ul").slideUp();
		});

		$(".footer-menu__family h3").click(function() {
			$(this).parent().find(">ul").stop().slideToggle();
		});

		$(".footer-menu__family h3").keydown(function(key) {
			if (key.keyCode == 13) {
				$(this).parent().find(">ul").stop().slideToggle();
			}
		});

		$(".footer-menu__family ul li a").last().focusout(function() {
			$(this).parents("ul").slideUp();
		});
	})

	// sub page navigation
	$(document).ready(function() {
		$(".subpage-nav .subpage-nav__inner > ul > li").not(":first-child").find("> h3").click(function() {
			if (!$(this).parents("li").hasClass("active")) {
				$(this).parents("li").addClass("active");
				$(this).parents("li").find(">ul").stop().slideDown();
			} else {
				$(this).parents("li").removeClass("active");
				$(this).parents("li").find(">ul").stop().slideUp();
			}
		});

		$(".subpage-nav .subpage-nav__inner > ul > li").not(":first-child").find("> h3").keydown(function(key) {
			if (key.keyCode == 13) {
				if (!$(this).parents("li").hasClass("active")) {
					$(this).parents("li").addClass("active");
					$(this).parents("li").find(">ul").stop().slideDown();
				} else {
					$(this).parents("li").removeClass("active");
					$(this).parents("li").find(">ul").stop().slideUp();
				}
			}
		});

		$(".subpage-nav .subpage-nav__inner > ul > li").not(":first-child").find("> h3").focusout(function() {
			if (!$(this).parents("li").parents("li").hasClass("active")) {
				$(this).parents("li").parents("li").addClass("active");
				$(this).parents("li").parents("li").find(">ul").stop().slideDown();
			} else {
				$(this).parents("li").parents("li").removeClass("active");
				$(this).parents("li").parents("li").find(">ul").stop().slideUp();
			}
		});
	})

	// Custom Scrollbar
	$(".scrollbar").addClass("scrollbar-macosx"); // scrollbar 스타일 지정
	$(".scrollbar").scrollbar(); // scrollbar 장착

	/* skip navigation */
	$('.skiptoContent').focusin(function(){
		$('.skiptoContent').animate({
			top: 0,
			height: 30,
			opacity: 1
		}, 0);
	});
	$('.skiptoContent').focusout(function(){
		$('.skiptoContent').animate({
			top: -40,
			height: 0,
			opacity: 0
		}, 150);
	});

	// gnb-open
	$(".gnb-open").click(function() {
		$(this).hide();
		$(".gnb-close").show();
		$(".gnb-close").focus();
		$(".gnb-close").addClass("click-focus");
		$(".search-open").attr("tabindex", "-1");
		$(".search-close").attr("tabindex", "-1");

		$("body").css("width", "100%");
		$("body").css("position", "fixed");
		$("body > .scrollbar > .scroll-element > .scroll-element_outer").css("opacity", "0");

		$("#gnb").stop().slideDown();

		return false;
	});

	$("#gnb").find("a").last().on('keydown blur', function(e) {
		if (!e.shiftKey && e.keyCode === 9) {
			if ($(".search-open").css("display") == "block") {
				$(".search-open").focus();
			} else {
				$(".search-close").focus();
			}

			$(".gnb-close").hide();
			$(".gnb-open").show();

			$("body").css("width", "auto%");
			$("body").css("position", "static");
			$("body > .scrollbar > .scroll-element > .scroll-element_outer").css("opacity", "1");

			$("#gnb").stop().slideUp();

			return false;
		}
	});

	// gnb-close
	$(".gnb-close").click(function() {
		$(this).hide();
		$(".gnb-open").show();
		$(".gnb-open").focus();

		$("body").css("width", "auto%");
		$("body").css("position", "static");
		$("body > .scrollbar > .scroll-element > .scroll-element_outer").css("opacity", "1");

		$("#gnb").stop().slideUp();

		return false;
	})

	// gnb-open
	$(".search-open").click(function() {
		$(this).hide();
		$(".search-close").show();
		$(".search-close").focus();

		$("#search").stop().slideDown();

		return false;
	})

	// gnb-close
	$(".search-close").click(function() {
		$(this).hide();
		$(".search-open").show();
		$(".search-open").focus();

		$("#search").stop().slideUp();

		return false;
	});

	$("#search").find("button").on('keydown blur', function(e) {
		if (!e.shiftKey && e.keyCode === 9) {
			$(".search-close").hide();
			$(".search-open").show();

			$("#search").stop().slideUp();

			return false;
		}
	});

	$("#gnb ul.menus > li > a").click(function() {
		if ($(document).width() < 576 && $(this).parent().find(">ul").length > 0) {
			if (!$(this).parent().hasClass("active")) {
				$(this).parent().addClass("active");
				$(this).parent().find(">ul").stop().slideDown();
			} else {
				$(this).parent().removeClass("active");
				$(this).parent().find(">ul").stop().slideUp();
			}
			return false;
		}
	});

	// sns-select
	var sns_select = ["fb", "blog", "youtube"];

	sns_select.forEach(function (item, index, array) {
		// 슬라이더 시작버튼
		$("#sns_" + item).click(function() {

			$(this).parents("ul").find(">li").each(function() {
				if ($("#slider_sns_" + $(this).find(">a").attr("id").split("_").pop()).hasClass("slick-slider")) {
					$("#slider_sns_" + $(this).find(">a").attr("id").split("_").pop()).slick("unslick");
					$("#slider_sns_" + $(this).find(">a").attr("id").split("_").pop()).hide();
				}
			});

			$("#slider_sns_" + item).show();
			$("#slider_sns_" + item).slick(getSliderSettings("#slider_sns_" + item, "gallery"));

			return false;
		});
	});

	$(".accordion_tab").each(function() {
		$(this).attr("data-length", $(this).find(">li").length);
	});

	$(".accrodion[data-toggle='true'] .accordion_tab li a").click(function() {
		var id = $(this).attr("aria-controls");
		var nth = $(this).parent().index() + 1;

		$(this).parent().addClass("active");
		$(this).attr("aria-expanded", "true");
		$("#" + id).show();

		$(this).parent().siblings().removeClass("active");
		$(this).parent().siblings().find(">a").removeAttr("aria-expanded", "true");
		$("#" + id).siblings().hide();

		return false;
	});

	$(".video-manu .video-scroll-delete").click(function() {
		$(this).parents(".video-manu").find(".video-manu-content-inner").css("overflow-y", "visible");
		$(this).parents(".video-manu").find(".video-manu-content-inner").css("max-height", "none");
		$(this).hide();
		$(this).siblings().css("display", "block");
	});

	$(".video-manu .video-scroll-append").click(function() {
		$(this).parents(".video-manu").find(".video-manu-content-inner").removeAttr("style");
		$(this).hide();
		$(this).siblings().css("display", "block");
	});
});
