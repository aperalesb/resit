<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Bootstrap, example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="resources/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
    </style>
    <link href="resources/css/bootstrap-responsive.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
    <link rel="shortcut icon" href="../assets/ico/favicon.png">								   
</head>

<body>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">Resit</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">About</a></li>
              <li><a href="#contact">Contact</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li class="nav-header">Nav header</li>
                  <li><a href="#">Separated link</a></li>
                  <li><a href="#">One more separated link</a></li>
                </ul>
              </li>
            </ul>
            <form class="navbar-form pull-right">
              <input class="span2" type="text" placeholder="Email">
              <input class="span2" type="password" placeholder="Password">
              <button type="submit" class="btn">Sign in</button>
            </form>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container"> 
		<ul class="nav nav-tabs">
			<li class="active">
				<a href="#">Tickets</a>
			</li>
			<li>
				<a href="#">Graficas</a>
			</li>		
		</ul>
		<div class="row-fluid">
			<div class="span4">
				<div class="thumbnail">
					<form action="">
						<fieldset>
							<legend>
								Filtrar por...
							</legend>
							<label class="checkbox">
						      <input type="checkbox"> Solo favoritos
						    </label>
						</fieldset>
					</form>
					<form action="">
						<fieldset>
							<legend>
								Detalles del vendedor
							</legend>
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
						<td colspan="5">
							Header de Tabla de 5 columnas
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>	
							Columna1
						</td>
						<td>	
							Columna2
						</td>
						<td>	
							Columna3
						</td>
						<td>	
							Columna4
						</td>
						<td>	
							Columna5
						</td>
					</tr>
					<tr>
						<td>	
							Columna1
						</td>
						<td>	
							Columna2
						</td>
						<td>	
							Columna3
						</td>
						<td>	
							Columna4
						</td>
						<td>	
							Columna5
						</td>
					</tr>
					<tr>
						<td>	
							Columna1
						</td>
						<td>	
							Columna2
						</td>
						<td>	
							Columna3
						</td>
						<td>	
							Columna4
						</td>
						<td>	
							Columna5
						</td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="5">
							<div class="pagination">
								<ul>
									<li><a href="#">&laquo;</a></li>
									<li class="active">
										<a href="#">1</a>
									</li>
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
	<%@include file="/footer.jsp"%>
	<!-- /container -->

	<!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

  </body>
</html>
