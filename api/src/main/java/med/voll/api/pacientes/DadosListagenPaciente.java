package med.voll.api.pacientes;

public record DadosListagenPaciente(
String nome,
String CPF,
String email){

    public DadosListagenPaciente(Paciente paciente){
        this(
            paciente.getNome(),
            paciente.getCPF(),
            paciente.getEmail() );
    }

}


