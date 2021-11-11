public interface EnderecoService
{
    public List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro);
    public List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco);
    public List<Endereco> consultaPorCep(int cep);
    public List<Endereco> consultaPorLogradouro(Logradouro logradouro);
    public List<Endereco> consultaPorBairro(Bairro bairro);
    public List<Endereco> consultaPorCidade(Cidade cidade);
    public List<Cidade> public ListaCidadesPorEstado(Estado estado);
    public List<Estado> consultaPorPais(Pais pais);
}