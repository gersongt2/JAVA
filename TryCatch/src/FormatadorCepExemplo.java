
public class FormatadorCepExemplo {

	public static void main(String[] args) {
		try {
		String cepFormatado = formatarCep("22222222");
		System.out.print(cepFormatado);
		}
		catch(CepinvalidoException e){
			
			System.out.print("cep errado");
			
		}
		
	}
	
	public static String formatarCep(String cep) throws CepinvalidoException{
		
		if(cep.length() != 8)
			throw new CepinvalidoException();
		
		return cep;
	}

}
