package com.omerfaruksen.LibraryApp.repository;
import com.omerfaruksen.LibraryApp.entity.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BookBorrowingRepository extends JpaRepository<BookBorrowing,Long> {
}
