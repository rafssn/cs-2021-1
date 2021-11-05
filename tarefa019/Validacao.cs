public class Validacao
{

    public bool ValidaNome(string nome)
    {

        var regexItem = new Regex("^[a-zA-Z0-9 ]*$");

        if (!regexItem.IsMatch(nome)) return false;
        if (nome.Length < 5 || nome.Length > 100) return false;


        return true;
    }

    public bool ValidaSenha(string senha)
    {
        if (senha.Contains(' ')) return false;
        if (senha.Length < 8) return false;

        return true;
    }
}