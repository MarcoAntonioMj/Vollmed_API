package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade Especialidade,
        Endereco endereco,
        String telefone) {
    public DadosDetalhamentoMedico(Medico medico){
        this(
            medico.getId(),
            medico.getNome(),
            medico.getCrm(),
            medico.getEmail(),
            medico.getEspecialidade(),
            medico.getEndereco(),
            medico.getTelefone()
        );
    }

}
