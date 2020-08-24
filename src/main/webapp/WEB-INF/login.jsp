<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="https://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>

<div data-role="page" id="pageone">
  <div data-role="header">
    <h1>GJUN</h1>
  </div>

  <div data-role="content">
    <form action="../member/checkUser" method="post">
    	<table width=30% align=center>
    		<tr>
    			<td colspan=2 align=center>會員登入
    		<tr>
    			<td>帳號
    			<td><input type="text" name="username">
    		<tr>
    			<td>密碼
    			<td><input type="password" name="password">
    		<tr>
    			<td colspan=2 align=center>
    			<input type="submit" value="ok">
    	</table>
    
    
    </form>
  </div>

  <div data-role="footer">
    <h1>台北市</h1>
  </div>
</div>

</body>
</html>