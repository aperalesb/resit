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
<link href="../resources/css/bootstrap.min.css" rel="stylesheet">
<link href="../resources/css/font-awesome.min.css" rel="stylesheet">
<link href="../resources/css/resit-main.css" rel="stylesheet">

<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}
</style>
<link href="../resources/css/bootstrap-responsive.css" rel="stylesheet">

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

<!-- Placed at the end of the document so the pages load faster -->
<script src="../resources/js/jquery.js"></script>
<script src="../resources/js/bootstrap.min.js"></script>


</head>

<body>
	<%@include file="../header.jsp"%>
	<div class="container">
		<div id="page-content">
			<div id="help-view">

				<h1>Centro de ayuda</h1>

				<fieldset>
					<legend>Ayuda para la b&uacute;squeda</legend>
					<form action="/help/search" method="get" id="help-search">
						<div class="row">
							<input type="text" id="search-input" name="search" tabindex="5"
								class="pull-left search-query span5"
								placeholder="Escribe tu b&uacute;squeda aqu&iacute;"> <a
								class="btn btn-primary"><i class="icon-search">&nbsp;Buscar</i></a>
						</div>
					</form>
				</fieldset>
				<br>
				<fieldset>
					<legend>F.A.Q.</legend>
					<div class="row">
						<div class="span5">
							<h2>Las preguntas m&aacute;s frecuentes</h2>
							<ol id="faq">
								<li><a href="/help/167">How do I link to a file or
										folder?</a></li>
								<li><a href="/help/90">How do I add or upload files to
										my Resit?</a></li>
								<li><a href="/help/4">C&oacute;mo hago para sincronizar
										archivos entre computadoras?</a></li>
								<li><a href="/help/27">How secure is Resit?</a></li>
								<li><a href="/help/20">Can I share files with
										non-Resit users?</a></li>
								<li><a href="/help/14">How much space does my Resit
										have?</a></li>
								<li><a href="/help/15">Is there any way to get more
										space?</a></li>
								<li><a href="/help/274">How do I share a file or folder
										with others?</a></li>
								<li><a href="/help/11">How do I recover old versions of
										files? </a></li>
								<li><a href="/help/32">Can I access Resit on my
										mobile device?</a></li>
							</ol>
						</div>
						<div class="span5 pull-right">
							<h2>Categor&iacute;as</h2>
							<ul id="categories">
								<li><a href="/help/category/Basics"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Basics icon" class="sprite sprite_web  s_web_basics_36 ">
										Informaci&oacute;n b&aacute;sica</a></li>
								<li><a href="/help/category/Sharing"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Sharing icon"
										class="sprite sprite_web  s_web_folder_user_36 ">
										Compartir</a></li>
								<li><a href="/help/category/Photos%20and%20Videos"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Photos and Videos icon"
										class="sprite sprite_web  s_web_picture "> Fotos y
										videos</a></li>
								<li><a href="/help/category/Referrals"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Referrals icon"
										class="sprite sprite_web  s_web_giftbox_36 ">
										Recomendaciones</a></li>
								<li><a href="/help/category/Desktop"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Desktop icon" class="sprite sprite_web  s_web_desktop ">
										Escritorio</a></li>
								<li><a href="/help/category/Mobile"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Mobile icon" class="sprite sprite_web  s_web_mobile ">
										M&oacute;vil</a></li>
								<li><a href="/help/category/Account"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Account icon"
										class="sprite sprite_web  s_web_settings_36 "> Cuenta</a></li>
								<li><a href="/help/category/Payments%20and%20Billing"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Payments and Billing icon"
										class="sprite sprite_web  s_web_cashmunny "> Pagos y
										facturaci&oacute;n</a></li>
								<li><a href="/help/category/Security%20and%20Privacy"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Security and Privacy icon"
										class="sprite sprite_web  s_web_shield "> Seguridad y
										privacidad</a></li>
								<li><a href="/help/category/Teams"
									class="background-icon-swapless"><img
										src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
										alt="Teams icon" class="sprite sprite_web  s_web_teams ">
										Equipos</a></li>
							</ul>
						</div>
					</div>
				</fieldset>
				<br class="clear"> <br> <br>

				<div class="row center">
					<a href="#" id="suggestionTrigger"
						class="btn btn-large btn-success"><i class="icon-comments-alt">&nbsp;Sugerencias</i></a>
					<a href="#" id="contactTrigger" class="btn btn-large btn-danger"><i
						class="icon-wrench">&nbsp;Informar de error</i></a>
				</div>

				<fieldset>
					<legend>Otros recursos</legend>
					<div id="other-resources">
						<table
							summary="Estos son otros recursos que puedes visitar para obtener ayuda con Resit.">
							<tbody>
								<tr>
									<td><a href="/tour"><img
											src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
											alt="" class="sprite sprite_web  s_web_tour "></a>
										<h3>
											<a href="/tour">Visita guiada</a>
										</h3>
										<p>Un breve visita guiada por las funciones que ofrece
											Resit</p></td>
									<td class="padding"></td>
									<td><a href="https://forums.Resit.com"><img
											src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
											alt="" class="sprite sprite_web  s_web_forums64 "></a>
										<h3>
											<a href="https://forums.Resit.com/">Foros</a>
										</h3>
										<p>Conversa con el equipo de Resit y otros usuarios de
											Resit.</p></td>
									<td class="padding"></td>
									<td><a class="support-link" href="/support"><img
											src="https://dt8kf6553cww8.cloudfront.net/static/images/icons/icon_spacer-vflN3BYt2.gif"
											alt="" class="sprite sprite_web  s_web_letter "></a>

										<h3>
											<a class="support-link" href="/support">Enviar una
												solicitud de ayuda</a>
										</h3>
										<p>Contacta al soporte t&eacute;cnico de Resit para
											resolver tus preguntas y problemas</p></td>
								</tr>
							</tbody>
						</table>
					</div>
				</fieldset>
			</div>
		</div>

	</div>
	<%@include file="../footer.jsp"%>
	<!-- /container -->

	<script type="text/javascript"
		src="http://jira.4bytes.net/s/es_ES-d25tap/785/3/1.1.2/_/download/batch/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector.js?collectorId=cffdcdce"></script>
	<script type="text/javascript"
		src="http://jira.4bytes.net/s/es_ES-d25tap/785/3/1.1.2/_/download/batch/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector.js?collectorId=297bf22b"></script>

</body>
</html>