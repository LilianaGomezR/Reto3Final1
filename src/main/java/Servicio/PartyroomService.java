package Servicio;

import Modelo.Partyroom;
import Repositorio.PartyroomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PartyroomService {
    @Autowired
    private PartyroomRepository partyroomRepository;

    public List<Partyroom> getAll() {
        return partyroomRepository.getAll();
    }

    public Optional<Partyroom> getPartyroom(int id) {
        return partyroomRepository.getPartyroom(id);
    }

    public Partyroom save(Partyroom partyroom) {
        if (partyroom.getId() == null) {
            return partyroomRepository.save(partyroom);
        } else {
            Optional<Partyroom> partyroom1 = partyroomRepository.getPartyroom(partyroom.getId());
            if (partyroom1.isPresent()) {
                return partyroomRepository.save(partyroom);
            } else {
                return partyroom;
            }
        }
    }
    /*public Partyroom update(Partyroom partyroom){
        if(partyroom.getId()!=null){
            Optional<Partyroom> partyroom1= partyroomRepository.getPartyroom(partyroom.getId());
            if(partyroom1.isPresent()){
                if(partyroom.getName()!=null){
                    partyroom1.get().setName(partyroom.getName());
                }
                if(partyroom.getOwner()!=null){
                    partyroom1.get().setOwner(partyroom.getOwner());
                }
                if(partyroom.getCapacity()!=null){
                    partyroom1.get().setCapacity(partyroom.getCapacity());
                }
                if(partyroom.getDescription()!=null){
                    partyroom1.get().setDescription(partyroom.getDescription());
                }
                if(partyroom.getCategory()!=null){
                    partyroom1.get().setCategory(partyroom.getCategory());
                }
                partyroomRepository.save(partyroom1.get());
                return partyroom1.get();
            }else{
                return partyroom;
            }
        }else{
            return partyroom;
        }
    }*/
    /*public boolean deletePartyroom(int id) {
        Boolean d = getPartyroom(id).map(partyroom -> {
            partyroomRepository.delete(partyroom);
            return true;
        }).orElse(false);
        return d;
    }*/
}
