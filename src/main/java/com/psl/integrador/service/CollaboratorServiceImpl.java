package com.psl.integrador.service;

import com.psl.integrador.model.Collaborator;
import com.psl.integrador.repository.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaboratorServiceImpl implements CollaboratorService {

    private final CollaboratorRepository collaboratorRepository;

    @Autowired
    public CollaboratorServiceImpl(CollaboratorRepository collaboratorRepository) {
        this.collaboratorRepository = collaboratorRepository;

    }

    @Override
    public List<Collaborator> getCollaborators() {
        return collaboratorRepository.findAll();
    }
}
