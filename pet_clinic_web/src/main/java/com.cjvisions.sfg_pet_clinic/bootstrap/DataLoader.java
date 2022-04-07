package com.cjvisions.sfg_pet_clinic.bootstrap;

import com.cjvisions.sfg_pet_clinic.model.Owner;
import com.cjvisions.sfg_pet_clinic.model.Vet;
import com.cjvisions.sfg_pet_clinic.services.OwnerService;
import com.cjvisions.sfg_pet_clinic.services.VetService;
import com.cjvisions.sfg_pet_clinic.services.map.OwnerServiceMap;
import com.cjvisions.sfg_pet_clinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Sampson");
        owner1.setLastName("Tims");

        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Yeolanda");
        owner2.setLastName("Grims");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.............................................");

        Vet vet1 = new Vet();

        vet1.setId(1L);
        vet1.setFirstName("George");
        vet1.setLastName("Gun");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setId(2L);
        vet2.setFirstName("Quinn");
        vet2.setLastName("Oliver");

        vetService.save(vet2);


    }
}
