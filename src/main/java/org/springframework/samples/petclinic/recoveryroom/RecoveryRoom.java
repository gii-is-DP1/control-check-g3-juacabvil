package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RecoveryRoom extends BaseEntity{
    @NotNull
    @Size(min=3,max=50)
    String name;
    @Positive
    double size;
    
    boolean secure;
    
    @ManyToOne
    @NotNull
    RecoveryRoomType roomType;
}
