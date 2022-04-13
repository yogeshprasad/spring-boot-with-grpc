package com.yogeshprasad.restgrpc.example.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

import com.yogeshprasad.restgrpc.example.Book;
import com.yogeshprasad.restgrpc.example.BookList;
import com.yogeshprasad.restgrpc.example.BookServiceGrpc;

@Service
@Slf4j
public class BookServiceGrpcClient {

    @Autowired
    private Environment env;

    public BookList createBooks(List<Book> bookList) {
        String serverHost = env.getProperty("BOOK_SERVICE_HOST", "localhost");
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress(serverHost, 6565)
            .usePlaintext()
            .build();

        BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub = BookServiceGrpc.newBlockingStub(channel);

        BookList.Builder builder = BookList.newBuilder();
        bookList.forEach(builder::addBook);
        BookList request = builder.build();

        log.debug("Request " + request);
        BookList response = bookServiceBlockingStub.createBooks(request);
        log.debug("Response " + response);

        return response;

    }

}
