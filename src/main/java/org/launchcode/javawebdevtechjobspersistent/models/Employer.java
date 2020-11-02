package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @Valid
    @Size(max = 100, message = "Location value is too long")
    @NotBlank(message= "Location is required")
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();


    public Employer(@Valid @NotNull(message= "Location is required")String location) {
        super();
        this.location= location;
    }
    public Employer(){}

        public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
