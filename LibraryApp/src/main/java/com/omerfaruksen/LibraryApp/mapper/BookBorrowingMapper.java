package com.omerfaruksen.LibraryApp.mapper;

import com.omerfaruksen.LibraryApp.dto.request.BookBorrowingRequest;
import com.omerfaruksen.LibraryApp.dto.request.BookBorrowingUpdateRequest;
import com.omerfaruksen.LibraryApp.entity.BookBorrowing;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface BookBorrowingMapper {

    BookBorrowing asEntity(BookBorrowingRequest bookBorrowingRequest);

    BookBorrowing asEntity(BookBorrowingUpdateRequest bookBorrowingUpdateRequest);

    void update(@MappingTarget BookBorrowing entity, BookBorrowingUpdateRequest bookBorrowingUpdateRequest);
}
