package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String crm, Especialidade especialidade, String email, DadosEndereco endereco) {
}
