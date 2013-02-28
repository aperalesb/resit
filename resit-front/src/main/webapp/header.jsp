<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="<%=request.getContextPath()%>/index.jsp">Resit</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li><a href="<%=request.getContextPath()%>/home.do">Home</a></li>
						<li><a href="#about">About</a></li>
						<li><a href="<%=request.getContextPath()%>/public/support.jsp">Help</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Dropdown <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="bar.do">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li class="divider"></li>
								<li class="nav-header">Nav header</li>
								<li><a href="#">Separated link</a></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>
					</ul>
					<sec:authorize access="isAnonymous()">
						<form class="navbar-form pull-right"
							action="j_spring_security_check" method="post">
							<input class="span2" name="j_username" type="text"
								placeholder="Email"> <input class="span2"
								name="j_password" type="password" placeholder="Password">
							<button type="submit" class="btn"><i class="icon-signin">&nbsp;Sign in</i></button>
							<div class="row">
								<div class="right">
									<label class="forCheckbox" for='_spring_security_remember_me'>
										Remember me: <input type='checkbox'
										name='_spring_security_remember_me' />
									</label>
								</div>
								<div class="cl"></div>
							</div>
						</form>
					</sec:authorize>
					<sec:authorize access="isAuthenticated()">
						<form class="navbar-form pull-right" action="logout" method="post">
							<div class="navbar-text pull-right">
								<sec:authentication property="principal.login" />
								<button type="submit" class="btn"><i class="icon-signout">&nbsp;Sign out</i></button>
							</div>
						</form>
					</sec:authorize>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>