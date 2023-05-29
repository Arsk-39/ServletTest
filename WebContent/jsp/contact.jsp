<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="minus"method="post">
<p>氏名</p>
<input type="text" name="name">
<p>会社</p>
<input type="text" name="company">
<p>メールアドレス</p>
<input type="text" name="mail">
<p>お問い合わせ内容</p>
<textarea name="review" cols="30" rows="5">お問い合わせ:</textarea>
<p>メルマガ種類</p>
<form action="checkbox" method="post">
<p><input type="checkbox" name="melmaga" value="総合案内">「総合案内」
<input type="checkbox" name="melmaga" value="セミナー案内">「セミナー案内」
<input type="checkbox" name="melmaga" value="求人採用情報">「求人採用情報」</p>
<p>資料請求希望</p>
<input type="radio" name="document" value="Yes" checked> Yes
<input type="radio" name="document" value="No">No
<input type="submit" name="確定">
</form>
</body>
</html>