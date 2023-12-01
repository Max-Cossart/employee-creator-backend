package com.example.EmployeeCreatorBackend.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.EmployeeCreatorBackend.converters.StringTrimConverter;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();

        mapper.typeMap(String.class, String.class).setConverter(new StringTrimConverter());
        mapper.getConfiguration().setSkipNullEnabled(true);

        return mapper;
    }

}
