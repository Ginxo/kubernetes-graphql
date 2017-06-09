package com.paradigma.persistence.repository.car;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.paradigma.persistence.model.CarMO;

/**
 * Repositorio de acceso para los coches
 * 
 * @author manuel
 *
 */
public interface CarRepository extends MongoRepository<CarMO, String> {

}
