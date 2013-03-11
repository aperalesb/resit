<!DOCTYPE html>
<html>
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

		<form class="form-horizontal" id="registerHere" method='post'
			action=''>
			<fieldset>
			
<!-- 				<div class="alert alert-success">Well done! You successfully -->
<!-- 					read this important alert message.</div> -->
		
				<legend><spring:message code="label.register.title" /></legend>

				<div class="control-group">
					<div class="controls">
						<input type="text" class="input-xlarge" id="user_name"
							name="user_name" rel="popover"
							data-content="Enter your first and last name."
							data-original-title="Full Name"
							placeholder="<spring:message code="form.register.label.name" />">
					</div>
				</div>

				<div class="control-group">
					<div class="controls">
						<input type="text" class="input-xlarge" id="user_email"
							name="user_email" rel="popover"
							data-content="What’s your email address?"
							data-original-title="Email"
							placeholder="<spring:message code="form.register.label.email" />">
					</div>
				</div>

				<div class="control-group">
					<div class="controls">
						<input type="text" class="input-xlarge" id="user_password"
							name="user_email" rel="popover"
							data-content="What’s your email address?"
							data-original-title="Email"
							placeholder="<spring:message code="form.register.label.password" />">
					</div>
				</div>

				<div class="control-group">
					<div class="controls">
						<input type="check" class="input-xlarge" id="agree_terms"
							name="agree_terms" rel="popover"
							data-content="I accept terms & conditions"
							data-original-title="Terms & Conditions"
							placeholder="<spring:message code="form.register.check.terms" />">
					</div>
				</div>

				<div class="control-group">
					<label class="control-label"></label>
					<div class="controls">
						<button type="submit" class="btn btn-success"><spring:message code="form.register.button.create" /></button>
					</div>
				</div>

			</fieldset>
		</form>

	</div>
	<%@include file="../footer.jsp"%>
	<!-- /container -->

	<script type="text/javascript"
		src="http://jira.4bytes.net/s/es_ES-d25tap/785/3/1.1.2/_/download/batch/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector.js?collectorId=cffdcdce"></script>
	<script type="text/javascript"
		src="http://jira.4bytes.net/s/es_ES-d25tap/785/3/1.1.2/_/download/batch/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector/com.atlassian.jira.collector.plugin.jira-issue-collector-plugin:issuecollector.js?collectorId=297bf22b"></script>

</body>
</html>