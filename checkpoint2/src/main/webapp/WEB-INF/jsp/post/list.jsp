<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<p>Posts</p>
	
	<p><a href="posts/form">Adicionar</a></p>		
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Titulo</th>
				<th>Autor</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="post" items="${posts}">
				<tr>
					<td>${post.id}</td>
					<td>${post.title}</td>
					<td>${post.author}</td>
					<td><a href="posts/${post.id}">Edit</a></td>
					<td><a href="posts/${post.id}/delete">Deletar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>