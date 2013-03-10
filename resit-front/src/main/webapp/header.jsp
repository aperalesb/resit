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
					<li><a href="<%=request.getContextPath()%>/support.do">Help</a></li>
				</ul>
				<sec:authorize access="isAnonymous()">
					<form class="form-inline navbar-form pull-right"
						action="<%=request.getContextPath()%>/j_spring_security_check" method="post">
						<input type="text" class="input-small" placeholder="Email"
							name="j_username"> <input type="password"
							class="input-small" placeholder="Password" name="j_password">
						<label class="checkbox"> <input type="checkbox"
							name='_spring_security_remember_me'> Remember me
						</label>
						<button type="submit" class="btn">
							<i class="icon-signin">&nbsp;</i>Sign in
						</button>
					</form>
				</sec:authorize>
				<sec:authorize access="isAuthenticated()">
					<form class="navbar-form pull-right" action="logout" method="post">
						<div class="navbar-text pull-right">
							<ul class="nav pull-right">
								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" style="text-decoration: none;"> <i
										class="icon-cog"></i>&nbsp;<i class="icon-angle-down"></i>
								</a>
									<ul class="dropdown-menu">
										<li><a href="#">Action</a></li>
										<li><a href="#">Another action</a></li>
										<li><a href="#">Something else here</a></li>
										<li class="divider"></li>
										<li class="nav-header">Session</li>
										<li><a href="#">Preferences</a></li>
										<li><a href="<%=request.getContextPath()%>/logout"><i
												class="icon-signout">&nbsp;</i>Sign Out</a></li>
									</ul></li>
							</ul>
							<span id="userName" class="nav pull-right"> <sec:authentication
									property="principal.login" />
							</span>
						</div>
					</form>
				</sec:authorize>
				<div class="navbar-text pull-right">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" style="text-decoration: none;">
						<spring:message code="header.language.selector"/>&nbsp;<i class="icon-angle-down"></i>
						</a>
							<ul class="dropdown-menu">
								<li><a href="?lang=es"><spring:message code="language.spanish"/></a></li>
								<li><a href="?lang=en"><spring:message code="language.english"/></a></li>
							</ul></li>
					</ul>
				</div>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</div>