<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
<body>
	<!-- <h1>Index.jsp</h1>
	<h1><a href="http://www.naver.com">Naver.com</a></h1>
	<h1><a href="./test.do?myName=Kimyongkuk">이름을 알려주세요~!~!</a></h1> -->
	<div class="w-full max-w-xs">
		<a href="./list.do">[ -List-> ]</a>
		<form action="./writeSave.do" method="post" class="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4">
			 	<div class="mb-4">		
					<h2 style="text-align: center;">연습용 게시판 글쓰기</h2>
				</div>
				<div class="mb-6">	
					<label class="block text-gray-700 text-sm font-bold mb-2" for="title">제목</label>
					<input type="text" placeholder="제목을 입력하세요!" name="title" required >
			
					<label class="block text-gray-700 text-sm font-bold mb-2" for="author">글쓴이</label>
					<input type="text" placeholder="글쓴이를 입력하세요!" name="author" required>
			
					<label class="block text-gray-700 text-sm font-bold mb-2" for="content">내용</label>
					<textarea cols="40" rows="5" name="content"></textarea>
					
					<label class="block text-gray-700 text-sm font-bold mb-2" for="email">연락처</label>
					<input type="email" placeholder="이메일을 입력하세요!" name="email">
					
					<div class="mb-4">		
						<input type="submit" value="글작성 완료">&nbsp;
						<input type="reset" value="다시작성">
					</div>
			 	</div>
		</form>
	</div>
</body>
</html>