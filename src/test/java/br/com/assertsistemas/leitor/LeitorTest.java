package br.com.assertsistemas.leitor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.assertsitemas.entity.Usuario;

public class LeitorTest {

	private static final Double VALOR_TOTAL_BENEFICIO = 37411.66;
	
	private Leitor leitor;
	private List<Usuario> usuariosCSV;
	private List<Usuario> usuariosTXT;
	private List<Usuario> usuariosACCDB;
	
	public LeitorTest(){
		leitor = new LeitorImpl();
	}
	
	@Test
	public void leitorCSV(){
		usuariosCSV = leitor.leitorCSV();
		Assert.assertNotNull(usuariosCSV);
	}
	
	@Test
	public void valorTotalBeneficio(){
		Double valorTotalBeneficio = leitor.getValorTotalBeneficio(leitor.leitorCSV());
		Double valorTotalBeneficioArredondado = new BigDecimal(valorTotalBeneficio).setScale(3, RoundingMode.HALF_EVEN).doubleValue();
		Assert.assertEquals(valorTotalBeneficioArredondado, VALOR_TOTAL_BENEFICIO);
	}
	
	@Test
	public void usuariosComMaisTrintaAnos(){
		List<Usuario> usuariosComMaisTrintaAnos = leitor.getUsuariosComMaisTrintaAnos(leitor.leitorCSV());
		Assert.assertNotNull(usuariosComMaisTrintaAnos);	
	}
	
	@Test
	public void leitorTXT(){
		usuariosTXT = leitor.leitorTXT();
		Assert.assertNotNull(usuariosTXT);
	}
	
	@Test
	public void leitorACCDB(){
		usuariosACCDB = leitor.leitorACCDB();
		Assert.assertNotNull(usuariosACCDB);
	}
	
	@Test
	public void gerarCSV(){
		byte[] gerarArquivoCSV = leitor.gerarArquivoCSV(usuariosCSV);
		Assert.assertNotNull(gerarArquivoCSV);
	}
	
	@Test
	public void gerarTXT(){
		leitor.gerarArquivoCSV(usuariosTXT);
		Assert.assertNotNull(usuariosTXT);
	}
	
}