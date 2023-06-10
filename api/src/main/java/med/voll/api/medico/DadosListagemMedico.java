package med.voll.api.medico;

public record DadosListagemMedico(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade EspecialidadeString) {
    public DadosListagemMedico(Medico medico) {

        this(
                medico.getId(),
                medico.getNome(),
                medico.getCrm(),
                medico.getEmail(),
                medico.getEspecialidade());

    }

}
