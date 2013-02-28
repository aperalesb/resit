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
		<div class="row center">
			<a href="#"	id="suggestionTrigger" class="btn btn-large btn-success"><i
				class="icon-comments-alt">&nbsp;Sugerencias</i></a>
			<a href="#" id="contactTrigger" class="btn btn-large btn-danger"><i
				class="icon-wrench">&nbsp;Informar de error</i></a>
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