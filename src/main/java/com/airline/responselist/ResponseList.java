package com.airline.responselist;
import com.airline.mapper.ResponseDto;
import com.airline.model.Airline;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Created by jt on 2019-05-12.
 * 
 *   malikyasirhome  gmail.com
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseList extends PageImpl<ResponseDto> implements Serializable {

    static final long serialVersionUID = 1114715135625836949L;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public ResponseList(@JsonProperty("content") List<ResponseDto> content,
                         @JsonProperty("number") int number,
                         @JsonProperty("size") int size,
                         @JsonProperty("totalElements") Long totalElements
//                         @JsonProperty("pageable") JsonNode pageable,
//                         @JsonProperty("last") boolean last,
//                         @JsonProperty("totalPages") int totalPages,
//                         @JsonProperty("sort") JsonNode sort,
//                         @JsonProperty("first") boolean first,
//                         @JsonProperty("numberOfElements") int numberOfElements
                         ) {
            
        super(content, PageRequest.of(number, size), totalElements);
        System.out.println(" this is calling method  ");
    }

    public ResponseList(List<ResponseDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public ResponseList(List<ResponseDto> content) {
        super(content);
    }
}
