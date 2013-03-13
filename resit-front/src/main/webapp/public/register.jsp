<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Resit</title>

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

</head>

<body>
	<%@include file="../header.jsp"%>
	<div class="container">

		<form class="form-horizontal" id="registerForm" method='post'
			action='<%=request.getContextPath()%>/public/registerUser.do'>
			<fieldset>

				<% 
				Object result = request.getAttribute("registerOk");
				Object errorMsg = request.getAttribute("registerError");
				
				if (result != null){
					if ((Boolean)result) {
						out.println("<div class='alert alert-success'>Well done! You successfully read this important alert message.</div>");
					}
					else {
						out.println("<div class='alert alert-error'>"+(String)errorMsg+".</div>");
					}
				}
				%>
				
				<legend>
					<spring:message code="label.register.title" />
				</legend>

				<div class="control-group">
					<input type="text" class="input-xlarge" id="user_name"
						name="user_name" rel="popover"
						data-content="<spring:message code='form.register.popover.body.name' />"
						data-original-title="<spring:message code='form.register.popover.title.name' />"
						placeholder="<spring:message code="form.register.label.name" />">
				</div>

				<div class="control-group">
					<input type="text" class="input-xlarge" id="user_email"
						name="user_email" rel="popover"
						data-content="<spring:message code='form.register.popover.body.email' />"
						data-original-title="<spring:message code='form.register.popover.title.email' />"
						placeholder="<spring:message code="form.register.label.email" />">
				</div>

				<div class="control-group">
					<input type="password" class="input-xlarge" id="user_password"
						name="user_password" rel="popover"
						data-content="<spring:message code='form.register.popover.body.password' />"
						data-original-title="<spring:message code='form.register.popover.title.password' />"
						placeholder="<spring:message code="form.register.label.password" />">
				</div>

				<div class="control-group">
					<input id="agree_terms" style="float: left; margin-right: 10px;"
						type="checkbox" name="agree_terms" value="1"> <label
						class="input-xlarge" for="agree_terms" id="agree_label"> <a
						href="#"><spring:message code="form.register.check.terms" /></a></label>
				</div>

				<div class="control-group">
					<button type="submit" class="btn btn-success">
						<spring:message code="form.register.button.create" />
					</button>
				</div>

			</fieldset>
		</form>

	</div>
	<%@include file="../footer.jsp"%>
	<!-- /container -->

	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../resources/js/jquery.js"></script>
	<script src="../resources/js/bootstrap.min.js"></script>
	<!-- Include Bootstrap Asserts JavaScript Files. -->
	<script type="text/javascript"
		src="../resources/js/jquery.validate.min.js"></script>
	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							// Popover 
							$('#registerForm input').hover(function() {
								$(this).popover('show');
							}, function() {
								$(this).popover('hide');
							});

							$("#registerForm")
									.validate(
											{
												rules : {
													user_name : "required",
													user_email : {
														required : true,
														email : true
													},
													user_password : {
														required : true,
														minlength : 6
													},
													agree_terms : "required"
												},

												messages : {
													user_name : "<spring:message code='form.register.error.name' />",
													user_email : {
														required : "<spring:message code='form.register.error.required.email' />",
														email : "<spring:message code='form.register.error.valid.email' />"
													},
													user_password : {
														required : "<spring:message code='form.register.error.required.password' />",
														minlength : "<spring:message code='form.register.error.valid.password' />"
													},
													agree_terms : "<spring:message code='form.register.error.terms' />"
												},
												errorPlacement : function(
														error, element) {
													if (element.attr("name") == "agree_terms")
														error
																.insertAfter("#agree_label");
													else
														error
																.insertAfter(element);
												},
												errorClass : "help-inline",
												errorElement : "span",
												highlight : function(element,
														errorClass, validClass) {
													$(element).parents(
															'.control-group')
															.addClass('error');
												},
												unhighlight : function(element,
														errorClass, validClass) {
													$(element).parents(
															'.control-group')
															.removeClass(
																	'error');
													$(element)
															.parents(
																	'.control-group')
															.addClass('success');
												}
											});

						});
	</script>
</body>
</html>
