package com.devsuperior.dsmovie.controllers.doc;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@ApiOperation(value = "Realiza a busca paginada de todos os filmes")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK")
})
public @interface FindAllMoviesDoc {
}
