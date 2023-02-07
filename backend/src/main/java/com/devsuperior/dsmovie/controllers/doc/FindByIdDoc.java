package com.devsuperior.dsmovie.controllers.doc;

import io.swagger.annotations.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@ApiOperation(value = "Realiza a busca de um filme por id")
@ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "ID do filme", required = true)
})
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 404, message = "Filme não encontrado")
})
public @interface FindByIdDoc {
}
