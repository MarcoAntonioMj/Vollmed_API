package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.pacientes.DadosListagenPaciente;
import med.voll.api.pacientes.PacientesRepository;

@RestController
@RequestMapping("pacientes")
public class PacientesController {

    @Autowired
    private PacientesRepository repository;

    @PostMapping
    @Transactional
    public Page <DadosListagenPaciente> listar(@PageableDefault(size = 10, sort = {"nome"} ) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagenPaciente::new);

    }
}