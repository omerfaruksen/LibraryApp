package com.omerfaruksen.LibraryApp.mapper;

import com.omerfaruksen.LibraryApp.dto.request.AuthorRequest;
import com.omerfaruksen.LibraryApp.dto.response.AuthorResponse;
import com.omerfaruksen.LibraryApp.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface AuthorMapper {
    Author asEntity(AuthorRequest authorRequest);

    AuthorResponse asOutput(Author author);

    List<AuthorResponse> asOutput(List<Author> author);

    void update(@MappingTarget Author entity, AuthorRequest request);
}
