package com.cocacola.cocacola.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("CLIENT")
public class Client
{
    @Id
    private String id;
    private String name_client;
    private String surname_client;
    private String email;
    private int age;
}