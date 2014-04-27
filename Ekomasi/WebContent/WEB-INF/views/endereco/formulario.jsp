<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar Endereço</title>
</head>
<body>

<form action="adicionaEndereco">
Logradouro: <input type="text" name="logradouro" /><br />
Número: <input type="text" name="numero" /><br />
Bairro: <input type="text" name="bairro" /><br />
Município: <input type="text" name="municipio" /><br />
UF: <input type="text" name="uf" /><br />
Complemento: <input type="text" name="complemento" /><br />
cep: <input type="text" name="cep" /><br />
País: <input type="text" name="pais" /><br />
<input type="submit" value="Gravar" />
</form>

</body>
</html>