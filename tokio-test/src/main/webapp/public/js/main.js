/**
 * 
 */
function validaAoLogar(){
	 $.ajax({
		 url: "/login",
		 type: "post",
		 data: {
			 login: $("#login").val(),
			 senha: $("#senha").val(),
		 }
	 });
 }

function telaCadastro(){
	$('#carregaPaginas').load('/public/jsps/cadastro.jsp');
}

function telaExclusao(){
	$('#carregaPaginas').load('/public/jsps/exclui.jsp');
}

function telaConsulta(){
	$('#carregaPaginas').load('/public/jsps/consulta.jsp');
}