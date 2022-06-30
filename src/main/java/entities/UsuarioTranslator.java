package entities;

public final class UsuarioTranslator {

    private UsuarioTranslator() {}

    public static Usuario of(final String nome, final Integer idade) {
        final Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setIdade(idade);

        return usuario;
    }
}
