package com.example.Structure.configTurbo;

import com.example.Structure.mapper.TurboMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MapperConfigure {
        @Bean
        public TurboMapper turboMapper (){
            return TurboMapper.INSTANCE;
        }
    }


