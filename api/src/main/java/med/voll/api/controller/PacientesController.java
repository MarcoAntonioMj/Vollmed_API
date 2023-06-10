package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.pacientes.DadosAtualizacaoPaciente;
import med.voll.api.pacientes.DadosCadastroPaciente;
import med.voll.api.pacientes.DadosListagenPaciente;
import med.voll.api.pacientes.Paciente;
import med.voll.api.pacientes.PacientesRepository;

@RestController
@RequestMapping("pacientes")
public class PacientesController {

    @Autowired
    private PacientesRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagenPaciente> listar(
            @PageableDefault(page = 0, size = 10, sort = { "nome" }) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagenPaciente::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados) {
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable long id) {
        repository.deleteById(id);

    }

}
