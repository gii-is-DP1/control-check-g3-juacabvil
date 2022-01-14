package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecoveryRoomService {
	
	@Autowired
	RecoveryRoomRepository recoveryRoomRepository;
	
    public List<RecoveryRoom> getAll(){
    	List<RecoveryRoom> rr= recoveryRoomRepository.findAll();
        return rr;
    }
    
   

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return null;
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
    	RecoveryRoomType r = recoveryRoomRepository.getRecoveryRoomType(typeName);
        return r;
    }

    public List<RecoveryRoom> getRecoveryRoomsBiggerThan(double size) {
    	List<RecoveryRoom> out = recoveryRoomRepository.findBySizeMoreThan(size);
        return out;
    }

    public RecoveryRoom save(RecoveryRoom p) {
        return null;       
    }

    
}
