var gulp = require('gulp');
var sass = require('gulp-sass');
var autoprefixer = require('gulp-autoprefixer');
var sourcemaps = require('gulp-sourcemaps');
var spritesmith = require('gulp.spritesmith');
var imagemin = require('gulp-imagemin');
var buffer = require('vinyl-buffer');
var merge = require('merge-stream');
var ttf2woff = require('gulp-ttf2woff');

sass.compiler = require('node-sass');

gulp.task('sass', function () {
	return gulp.src('./resources/scss/**/*.scss')
		.pipe(sourcemaps.init({
			loadMaps: true
		}))
		.pipe(sass({
			outputStyle: 'expanded'
		}).on('error', sass.logError))
		.pipe(autoprefixer({
			cascade: true
		}))
		.pipe(sourcemaps.write('./maps'))
		.pipe(gulp.dest('./resources/styles'));
});

gulp.task('watch', function () {
	gulp.watch('./resources/scss/**/*.scss', gulp.series('sass'));
});


gulp.task('sprite', function () {
	var spriteData = gulp.src('./resources/images/icons/*.png')
		.pipe(spritesmith({
			imgPath: '../images/sprite.png',
			imgName: 'sprite.png',
			cssName: '_icons.scss',
			padding: 50,
			cssTemplate: './resources/scss/_template/scss.component.template.handlebars'
		}));

	var imgStream = spriteData.img
		.pipe(buffer())
		.pipe(imagemin())
		.pipe(gulp.dest('./resources/images'));

	var cssStream = spriteData.css
		.pipe(gulp.dest('./resources/scss/components/'));

	return merge(imgStream, cssStream);
});


gulp.task('ttf2woff', function(){
  gulp.src(['./resources/fonts/*.ttf'])
    .pipe(ttf2woff())
    .pipe(gulp.dest('./resources/fonts/'));
});
