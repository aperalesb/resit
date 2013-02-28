<!DOCTYPE html>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Resit</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Estilos CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/resit-main.css" rel="stylesheet">

<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>
<link href="resources/css/bootstrap-responsive.css" rel="stylesheet">

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="ico/apple-touch-icon-57-precomposed.png">
</head>

<body>
	<%@include file="header.jsp"%>
	
	<div class="container">

		<!-- Main hero unit for a primary marketing message or call to action -->
		<div class="hero-unit">
			<h1>Resit</h1>
			<p>This is a template for a simple marketing or informational
				website. It includes a large callout called the hero unit and three
				supporting pieces of content. Use it as a starting point to create
				something more unique.</p>
			<p>
				<a class="btn btn-primary btn-large">Learn more &raquo;</a>
			</p>
		</div>

		<!-- Example row of columns -->
		<div class="row index-benefits-iconlist center">
			<div class="span3">
				<h2>Heading 1</h2>
				<p>
					<img class="index-image-icon"
						src="http://cdn1.iconfinder.com/data/icons/ball/256/leaf.png" />
				</p>
			</div>
			<div class="span3">
				<h2>Heading 2</h2>
				<p>
					<img class="index-image-icon"
						src="http://cdn1.iconfinder.com/data/icons/icloud-style/512/iPhone_Cloud_Icon.png" />

				</p>
			</div>
			<div class="span3">
				<h2>Heading 3</h2>
				<p>
					<img class="index-image-icon"
						src="http://cdn1.iconfinder.com/data/icons/Gifts/512/box3.png" />
				</p>
			</div>
			<div class="span3">
				<h2>Heading 4</h2>
				<p>
					<img class="index-image-icon"
						src="http://cdn1.iconfinder.com/data/icons/Siena/256/currency_dollar%20blue.png" />
				</p>
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="span4">
				<h2>Prensa</h2>
				<p>
					<u>18/11/2012</u>
				</p>
				<p>Noticia 1</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur in tristique libero. Vestibulum pharetra sapien in lorem
					gravida quis vestibulum augue blandit. Nulla facilisi. Proin et dui
					in purus lobortis.</p>
				<hr>
				<p>
					<u>16/11/2012</u>
				</p>
				<p>Noticia 2</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Curabitur in tristique libero. Vestibulum pharetra sapien in lorem
					gravida quis vestibulum augue blandit. Nulla facilisi. Proin et dui
					in purus lobortis.</p>
				<p>
					<a class="btn" href="#">M&aacute;s noticias &raquo;</a>
				</p>
			</div>
			<div class="span4">
				<h2>Estad&iacute;sticas</h2>
				<p>
					<img alt=""
						src="http://docs.fusioncharts.com/charts/contents/AttDesc/Images/SampleChartIntensity.jpg">
				</p>
			</div>
			<div class="span4">
				<h2>Twitter</h2>
				<a class="twitter-timeline" href="https://twitter.com/search?q=nasa"
					data-widget-id="297780099892264960">Tweets sobre "nasa"</a>
				<script>
					!function(d, s, id) {
						var js, fjs = d.getElementsByTagName(s)[0];
						if (!d.getElementById(id)) {
							js = d.createElement(s);
							js.id = id;
							js.src = "//platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js, fjs);
						}
					}(document, "script", "twitter-wjs");
				</script>

			</div>
		</div>
	</div>

	<%@include file="/footer.jsp"%>
	<!-- /container -->

	<!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>
