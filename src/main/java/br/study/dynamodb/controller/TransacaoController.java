package br.study.dynamodb.controller;

import br.study.dynamodb.dto.EmissorDTO;
import br.study.dynamodb.dto.FindTransacaoParams;
import br.study.dynamodb.dto.TransacaoDTO;
import br.study.dynamodb.repository.DynamoDbTransacaoRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transacao")
@Slf4j
public class TransacaoController {

    @Autowired
    private DynamoDbTransacaoRepository repository;

    @GetMapping
    public ResponseEntity<TransacaoDTO> findTransacaoByIdTransacaoBandeiraEmissor(
            @RequestParam String idTransacaoBandeira,
            @RequestParam String emissor){
        return new ResponseEntity<>(repository.findTransacaoPorIdBandeiraEmissor(idTransacaoBandeira, emissor), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TransacaoDTO> saveTransacao(
            @RequestBody TransacaoDTO transacaoDTO){
        log.info("Save transacao");
        return new ResponseEntity<>(repository.saveTransacao(transacaoDTO), HttpStatus.OK);
    }

    @GetMapping("/consulta")
    public ResponseEntity<TransacaoDTO> findTransacaoByNumeroTransacao(
            @RequestParam String numerotransacap){
        return new ResponseEntity<>(repository.findTransacaobyNumerotransacao(numerotransacap), HttpStatus.OK);
    }

    @GetMapping("/transacaoes")
    public  ResponseEntity<List<EmissorDTO>> findTransacaoByIdsbandeiraAndEmissores(@RequestBody FindTransacaoParams findTransacaoParams){
        return new ResponseEntity<>(repository.findTransacaoByIdsbandeiraAndEmissores(findTransacaoParams.getIdsTransacaoBandeira(), findTransacaoParams.getEmissores()), HttpStatus.OK);
    }
}
