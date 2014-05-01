<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adiciona Pessoa</title>
</head>
<body>
	<form action="adicionaPessoa">
	Login: <input type="text" name="login"/><br/>
	Nome: <input type="text" name="nome"/> <br/>
	Data Nascimento: <input type="text" name="dataNascimento"><br />
	Telefone 1: <input type="text" name="telefone1"/> <br/>
	Telefone 2: <input type="text" name="telefone2" /> <br/>
	Email: <input type="text" name="email"/> <br/>
	CPF: <input type="text" name="cpf"/> <br/>
	Senha: <input type="password" name="senha"/> <br/>
	<input type="submit" value="Gravar">
	
	</form>
</body>
</html>