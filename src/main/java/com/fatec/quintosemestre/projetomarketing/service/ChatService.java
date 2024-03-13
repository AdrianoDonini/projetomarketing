package com.fatec.quintosemestre.projetomarketing.service;

import org.springframework.http.ResponseEntity;

import com.fatec.quintosemestre.projetomarketing.model.dto.ChatDTO;
import com.fatec.quintosemestre.projetomarketing.service.util.CrudService;

public interface ChatService extends CrudService<ChatDTO> {

    ResponseEntity<Object> listarPorUsuarioAbertura(Long idUsuarioAbertura);

}
