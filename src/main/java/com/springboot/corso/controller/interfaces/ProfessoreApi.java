package com.springboot.corso.controller.interfaces;

import com.springboot.corso.entity.Corso;
import com.springboot.corso.entity.Professore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Professore", description = "Api del Professore")
public interface ProfessoreApi {

    @Operation(
            summary = "Estrarre tutti i Professori",
            description = "estrae tutte le entità professore e i loro dati dal database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public List<Professore> getAllProfessori();

    @Operation(
            summary = "Estrarre il singolo Professore",
            description = "estrae il signolo professore e i suoi dati dal database, utilizzando l'id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Professore getProfessoreById(Integer idProfessore);

    @Operation(
            summary = "Inserire nuovo Professore",
            description = "inserisce una nuova entità professore nel database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Professore insertProfessore(Professore professore);

    @Operation(
            summary = "Aggiornare un Professore",
            description = "aggiorna un professore già esistente nel database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public Professore updateProfessore(Professore professore);

    @Operation(
            summary = "Rimuovere un Professore",
            description = "rimuove un professore già dal database, utilizzando l'id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation")
    })
    public void deleteProfessoreById(Integer idProfessore);
}
