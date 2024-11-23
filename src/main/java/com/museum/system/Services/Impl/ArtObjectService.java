package com.museum.system.Services.Impl;

import com.museum.system.Entities.ArtObject;
import com.museum.system.Repositories.IArtObjectRepository;
import com.museum.system.Services.IArtObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtObjectService implements IArtObjectService {

    @Autowired
    private IArtObjectRepository artObjectRepository;


    @Override
    public ArtObject createArtObject(ArtObject artObject) {
        return artObjectRepository.save(artObject);
    }

    @Override
    public Optional<ArtObject> getArtObjectById(Long id) {
        return artObjectRepository.findById(id);
    }

    @Override
    public List<ArtObject> getAllArtObjects() {
        return artObjectRepository.findAll();
    }

    @Override
    public ArtObject updateArtObject(Long id, ArtObject artDetails) {

        Optional<ArtObject> existingArtObject = artObjectRepository.findById(id);
        if(existingArtObject.isPresent()){
            ArtObject updatedArtObject = existingArtObject.get();
            updatedArtObject.setDescription(artDetails.getDescription());
            updatedArtObject.setRenderings(artDetails.getRenderings());
            updatedArtObject.setCondition(artDetails.getCondition());
            updatedArtObject.setStatus(artDetails.getStatus());
            updatedArtObject.setLocation(artDetails.getLocation());
            updatedArtObject.setPeriod(artDetails.getPeriod());
            updatedArtObject.setAreaOfOrigin(artDetails.getAreaOfOrigin());
            updatedArtObject.setForm((artDetails.getForm()));
            updatedArtObject.setMaterial(artDetails.getMaterial());
            updatedArtObject.setSecurityLevel(artDetails.getSecurityLevel());
            updatedArtObject.setAppraisalValue(artDetails.getAppraisalValue());
            updatedArtObject.setInsuranceDetails(artDetails.getInsuranceDetails());
            updatedArtObject.setAcquisitionRecord(artDetails.getAcquisitionRecord());
            updatedArtObject.setDisposalRecord(artDetails.getDisposalRecord());
        }
        return artObjectRepository.save(artObject);
    }

    @Override
    public void deleteArtObject(Long id) {

    }
}
