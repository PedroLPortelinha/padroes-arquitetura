package FactoryMethod;

public class ServicoFactory {

    public static IServico obterServico(String servico) {

        Class<?> classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(
                "padroescriacao.factorymethod.Servico" + servico
            );

            objeto = classe.getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            throw new IllegalArgumentException("Serviço inexistente");
        }

        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }

        return (IServico) objeto;
    }
}