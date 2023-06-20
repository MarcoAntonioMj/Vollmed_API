package med.voll.api.pacientes;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(String nome, String email, String telefone, String CPF, Endereco endereco) { 
    public DadosDetalhamentoPaciente(Paciente paciente) { 
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCPF(), paciente.getEndereco()); 
    }
} 