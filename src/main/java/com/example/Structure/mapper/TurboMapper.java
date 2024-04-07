package com.example.Structure.mapper;

import com.example.Structure.entity.dto.request.TurboRequest;
import com.example.Structure.entity.dto.response.TurboResponse;
import com.example.Structure.entity.model.Turbo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TurboMapper {
        TurboMapper INSTANCE = Mappers.getMapper(TurboMapper.class);
        List<TurboResponse> toCarResponseList(List<Turbo> carList);
        @Mapping(target = "id", source = "id", qualifiedByName = "buildUserCar")
        TurboResponse toCarResponse(Turbo turbo );
        @Named("buildUserCar")
        default Long buildUserCar(Long id){
            if(id == null){
                return null;
            }
            return  id+1;
        };

        Turbo toCar (TurboRequest turboRequest );


        Turbo toCar (Long id, TurboRequest turboRequest);

    }


