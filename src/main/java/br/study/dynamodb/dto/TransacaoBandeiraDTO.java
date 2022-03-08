package br.study.dynamodb.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@Builder
@Getter
@Setter
public class TransacaoBandeiraDTO {

    private String idTransacaoBandeira;
    private String codigoAprovacao;
    private String emissor;
    private Boolean operacaoContabilizada;
    private String data;
}
