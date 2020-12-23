package com.cadastro.cadastro;

import lombok.Getter;

@Getter
public enum MessagesEnum {
    MESSAGE_1( "Concluido com sucesso");

    private String code;
    private String description;
    private String cause;

    MessagesEnum(String description){
        this(description, description);
    }

    MessagesEnum(String description, String cause){
        this.code = this.name();
        this.description = description;
        this.cause = cause;
    }

    public String getCodAndDescription(){
        return code + " - " + description;
    }

}
