package com.psl.integrador.service;

import com.psl.integrador.model.Collaborator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CollaboratorService {
    List<Collaborator> getCollaborators();
}
