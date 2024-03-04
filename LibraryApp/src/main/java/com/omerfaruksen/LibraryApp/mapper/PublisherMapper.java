package com.omerfaruksen.LibraryApp.mapper;

import com.omerfaruksen.LibraryApp.dto.response.PublisherResponse;
import com.omerfaruksen.LibraryApp.entity.Publisher;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PublisherMapper {
    PublisherResponse asOutput(Publisher publisher);

    List<PublisherResponse> asOutput(List<Publisher> publishers);
}
