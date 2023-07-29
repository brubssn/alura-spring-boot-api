package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String cpf, String telefone, String email, DadosEndereco endereco) {
}
