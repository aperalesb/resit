<!DOCTYPE html>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<meta charset="utf-8">

<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-collapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" href="<%=request.getContextPath()%>/index.do">Resit</a>
			<div class="nav-collapse collapse">
				<ul class="nav">
					<sec:authorize access="isAuthenticated()">
						<li><a href="<%=request.getContextPath()%>/home.do">Home</a></li>
					</sec:authorize>
					<li><a href="#about">About</a></li>
					<li><a href="<%=request.getContextPath()%>/public/support.do">Help</a></li>
				</ul>
				<sec:authorize access="isAnonymous()">
					<ul class="nav pull-right">
						<li><a href="/users/sign_up"><spring:message
									code="form.login.button.signup" /></a></li>
						<li class="divider-vertical"></li>
						<li class="dropdown"><a class="dropdown-toggle" href="#"
							data-toggle="dropdown"><spring:message
									code="form.login.button.signin" />&nbsp;<strong class="caret"></strong></a>
							<div class="dropdown-menu"
								style="padding: 15px; padding-bottom: 0px;">
								<form
									action="<%=request.getContextPath()%>/j_spring_security_check"
									method="post" accept-charset="UTF-8">
									<input id="user_username" style="margin-bottom: 15px;"
										type="text" name="j_username" size="30"
										placeholder="<spring:message code="form.login.email"/>" /> <input
										id="user_password" style="margin-bottom: 15px;"
										type="password" name="j_password" size="30"
										placeholder="<spring:message code="form.login.password"/>" />
									<input id="user_remember_me"
										style="float: left; margin-right: 10px;" type="checkbox"
										name="_spring_security_remember_me" value="1" /> <label
										class="string optional" for="user_remember_me"><spring:message
											code="form.login.rememberme" /></label>

									<button
										style="clear: left; width: 100%; height: 32px; font-size: 13px;"
										type="submit" class="btn btn-primary">
										<i class="icon-signin">&nbsp;</i>
										<spring:message code="form.login.button.signin" />
									</button>
								</form>
							</div></li>
					</ul>
				</sec:authorize>
				<sec:authorize access="isAuthenticated()">
					<div class="nav pull-right">
						<form class="navbar-form" action="logout" method="post">
							<div class="navbar-text pull-right">
								<span id="userName" class="nav pull-left"> <sec:authentication
										property="principal.login" />
								</span>
								<ul class="nav pull-right">
									<li class="dropdown"><a href="#" class="dropdown-toggle"
										data-toggle="dropdown" style="text-decoration: none;"> <i
											class="icon-cog"></i>&nbsp;<strong class="caret"></strong>
									</a>
										<ul class="dropdown-menu">
											<li><a href="#">Action</a></li>
											<li><a href="#">Another action</a></li>
											<li><a href="#">Something else here</a></li>
											<li class="divider"></li>
											<li class="nav-header">Session</li>
											<li><a href="#">Preferences</a></li>
											<li><a href="<%=request.getContextPath()%>/logout"><i
													class="icon-signout">&nbsp;</i> <spring:message
														code="form.login.button.signout" /></a></li>
										</ul></li>
								</ul>
							</div>
						</form>
					</div>
				</sec:authorize>
				<div class="navbar-text pull-right">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" style="text-decoration: none;"> <i
								class="icon-flag"></i> <spring:message
									code="header.language.selector" />&nbsp;<strong class="caret"></strong>
						</a>
							<ul class="dropdown-menu">
								<li><a href="?lang=es"><spring:message
											code="language.spanish" /></a></li>
								<li><a href="?lang=en"><spring:message
											code="language.english" /></a></li>
							</ul></li>
					</ul>
				</div>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</div>