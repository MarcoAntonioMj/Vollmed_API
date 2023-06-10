package med.voll.api.pacientes;

public record DadosListagenPaciente(
        Long id,
        String nome,
        String CPF,
        String email) {

    public DadosListagenPaciente(Paciente paciente) {
        this(
                paciente.getId(),
                paciente.getNome(),
                paciente.getCPF(),
                paciente.getEmail());
    }

}
