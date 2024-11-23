package com.museum.system.Services;

import com.museum.system.Entities.ArtObject;

import java.util.List;
import java.util.Optional;

public interface IArtObjectService {
    public ArtObject createArtObject(ArtObject artObject);

    public Optional<ArtObject> getArtObjectById(Long id) ;

    public List<ArtObject> getAllArtObjects();

    public ArtObject updateArtObject(Long id, ArtObject artDetails);

    public void deleteArtObject(Long id);
}
