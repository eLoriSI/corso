package com.springboot.corso.controller.interfaces;

import com.springboot.corso.entity.Corso;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Corso", description = "Api del Corso")
public interface CorsoApi {

    @Operation(
            summary = "Estrarre tutti i Corsi",
            description = "estrae tutte le entità corso e i loro dati dal database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public List<Corso> getAllCorsi();

    @Operation(
            summary = "Estrarre il singolo Corso",
            description = "estrae il signolo corso e i suoi dati dal database, utilizzando l'id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Corso getCorsoById(Integer idCorso);

    @Operation(
            summary = "Inserire nuovo Corso",
            description = "inserisce una nuova entità corso nel database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Corso insertCorso(Corso corso);

    @Operation(
            summary = "Aggiornare un Corso",
            description = "aggiorna un corso già esistente nel database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Corso updateCorso(Corso corso);

    @Operation(
            summary = "Rimuovere un Corso",
            description = "rimuove un corso già dal database, utilizzando l'id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public void deleteCorsoById(Integer idCorso);
}
