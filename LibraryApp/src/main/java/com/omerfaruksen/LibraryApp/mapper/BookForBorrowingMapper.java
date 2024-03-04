package com.omerfaruksen.LibraryApp.mapper;

import com.omerfaruksen.LibraryApp.dto.request.BookForBorrowingRequest;
import com.omerfaruksen.LibraryApp.entity.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookForBorrowingMapper {

    Book asEntity(BookForBorrowingRequest bookForBorrowingRequest);
}
