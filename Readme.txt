
<!DOCTYPE html>
<html>
<head>
	<title>Registration Form</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
body{
	background-color: #c0c0c0;
}
	.hj{
		height: 300px;
		width: 40%;
		background-color: white;
		border-radius: 20px 20px 20px 20px;
	}
	.hj:hover{
		background-color: #303030;
		transition: 1.8s;
	}
	label{
		text-align: center;
		color :goldenrod;
	}
	h1{
		padding: 12px;
		color: goldenrod;
	}
	.btn{
		color: goldenrod;

	}
</style>
</head>
<form method="post" action="#">
	<center>
	<div class="hj">
		<center><h1>LOGIN PAGE</h1></center>
		<div class="form-group">
				<div class="col-md-12">
		<label>Username</label>
	
		<input type="text" name="uname" class="form-control" placeholder="Username"></div></div>
		<div class="form-group">
			<div class="col-md-12">
			<label>Password</label>
			
				<input type="Password" name="pwd" class="form-control" placeholder="Password">
			<br>
				<button class="btn btn-default">Submit</button>
			
	</div>
</center>
</form>
<body>

</body>
</html>
