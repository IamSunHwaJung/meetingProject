<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

<link rel="stylesheet" type="text/css" href="../../css/LoginForm.css">

</head>
<body>
	<!-- All the files that are required -->
	<!--    <link rel="stylesheet"
      href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
   <link href='http://fonts.googleapis.com/css?family=Varela+Round'
      rel='stylesheet' type='text/css'>
   <script
      src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js"></script>
   <meta name="viewport"
      content="width=device-width, initial-scale=1, maximum-scale=1" />
 -->
	<!-- Where all the magic happens -->
	<!-- LOGIN FORM -->
	<div class="text-center" style="padding: 50px 0">
		<div class="logo">Login</div>
		<!-- Main Form -->
		<div class="login-form-1">
			<form id="login-form" class="text-left">
				<div class="login-form-main-message"></div>
				<div class="main-login-form">
					<div class="login-group">
						<div class="form-group">
							<label for="lg_username" class="sr-only">ID</label><br> <input
								type="text" class="form-control" id="lg_username"
								name="uid" placeholder="아이디를 입력하세요">
						</div>
						<div class="form-group">
							<label for="lg_password" class="sr-only">Password</label> <input
								type="password" class="form-control" id="lg_password"
								name="upwd" placeholder="패스워드를 입력하세요">
						</div>

						<!-- 아이디 저장 체크박스 -->
						<!-- <div class="form-group login-group-checkbox">
                  <input type="checkbox" id="lg_remember" name="lg_remember">
                  <label for="lg_remember">remember</label>
               </div> -->
					</div>
					<button type="submit" class="login-button">
						<i class="fa fa-chevron-right"></i>
					</button>
				</div>
				<div class="etc-login-form">
					<p>
						아이디가 없으신가요?<br> <a href="#">회원가입</a>
					</p>
				</div>
			</form>
		</div>
		<!-- end:Main Form -->
	</div>
</body>
</html>