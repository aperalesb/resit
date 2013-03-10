<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Resit</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
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
		<ul class="nav nav-tabs">
			<li class="active"><a href="#">Tickets</a></li>
			<li><a href="#">Graficas</a></li>
		</ul>
		<div class="row-fluid">
			<div class="span4">
				<div class="thumbnail">
					<form action="">
						<fieldset>
							<legend> Filtrar por... </legend>
							<label class="checkbox"> <input type="checkbox">
								Solo favoritos
							</label>
						</fieldset>
					</form>
					<form action="">
						<fieldset>
							<legend> Detalles del vendedor </legend>
							<img class="center"
								src="http://cdn1.iconfinder.com/data/icons/Vibrant-Stickers-Tutorial9/128/Purple-Shop.png" />
						</fieldset>
					</form>
				</div>
			</div>
			<div class="span8">
				<table class="table table-striped">
					<thead>
						<tr>
							<td colspan="5">Header de Tabla de 5 columnas</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Columna1</td>
							<td>Columna2</td>
							<td>Columna3</td>
							<td>Columna4</td>
							<td>Columna5</td>
						</tr>
						<tr>
							<td>Columna1</td>
							<td>Columna2</td>
							<td>Columna3</td>
							<td>Columna4</td>
							<td>Columna5</td>
						</tr>
						<tr>
							<td>Columna1</td>
							<td>Columna2</td>
							<td>Columna3</td>
							<td>Columna4</td>
							<td>Columna5</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="5">
								<div class="pagination">
									<ul>
										<li><a href="#">&laquo;</a></li>
										<li class="active"><a href="#">1</a></li>
										<li><a href="#">2</a></li>
										<li><a href="#">3</a></li>
										<li><a href="#">&raquo;</a></li>
									</ul>
								</div>
							</td>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
	</div>

	<!-- /container -->

	<%@include file="footer.jsp"%>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>
