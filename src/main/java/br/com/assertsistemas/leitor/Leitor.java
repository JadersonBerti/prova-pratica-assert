package br.com.assertsistemas.leitor;

import java.io.InputStream;
import java.util.List;

import br.com.assertsitemas.entity.Usuario;

/**
 * - É importante analizar:
 * 
 * 	- Os nome e sobrenome 
 * 	- Data de nacimento 
 * 
 * pois em algumas das implementações
 * sera necessario a manipulação desses 
 * campos para atingir o objetivo da implementação.
 * 
 * Outro ponto importante no nome e sobrenome é que devem 
 * conter as iniciais maiusculas.
 * 
 * @version 1.0.0
 * 
 * @author Jaderson Berti
 */
public interface Leitor {

	/**
	 * <h3>Leitor de csv</h3>.
	 * Leia o arquivo csv usuarios-report.csv localizada na 'src/resource'
	 * e extraia somente os campos do objeto 'Usuario'<br/>
	 * 
	 * @return List<Usuario>
	 */
	public List<Usuario> leitorCSV();
	
	/**
	 * <h3>Valor total beneficio</h3>.
	 * 
	 * @param List<Usuario>
	 * @return Long
	 */
	public Double getValorTotalBeneficio(List<Usuario> usuarios);

	/**
	 * <h3>Usuarios com mais de trinta anos</h3>.
	 * 
	 * @param List<Usuario> 
	 * @return List<Usuario> 
	 */
	public List<Usuario> getUsuariosComMaisTrintaAnos(List<Usuario> usuarios);
	
	/**
	 * <h3>Leitor de txt</h3>.
	 * Leia o arquivo txt usuarios-report.txt localizada na 'src/resource'
	 * e extraia somente os campos do objeto 'Usuario'
	 * 
	 * @return List<Usuario>
	 */
	public List<Usuario> leitorTXT();
	
	/**
	 * <h3>Leitor de accdb (Data Access).</h3>
	 * Leia o arquivo accdb usuarios-report.accdb localizada na 'src/resource'
	 * e extraia somente os campos do objeto 'Usuario'
	 * 
	 * @return List<Usuario>
	 */
	public List<Usuario> leitorACCDB();
	
	/**
	 * <h3>Gerador de csv.</h3>
	 * Monte um arquivo csv e retorne em byte[]
	 * com apenas o id,cpf,valorBeneficio.
	 * 
	 * @return byte[]
	 */
	public byte[] gerarArquivoCSV(List<Usuario> usuarios);
	
	/**
	 * <h3>Gerador de txt.</h3>
	 * Monte um arquivo txt e retorne em 'InputStream'
	 * com apenas o id, rg ea idade atual.
	 * 
	 * @return InputStream
	 */
	public InputStream gerarArquivoTXT(List<Usuario> usuarios);
	
}
