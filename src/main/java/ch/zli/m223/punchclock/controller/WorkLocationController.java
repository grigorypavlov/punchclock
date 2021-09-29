package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.WorkLocation;
import ch.zli.m223.punchclock.service.WorkLocationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/locations")
public class WorkLocationController {
    private final WorkLocationService workLocationService;

    public WorkLocationController(WorkLocationService workLocationService) {
        this.workLocationService = workLocationService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK) //gets locations on request
    public List<WorkLocation> getWorkLocations() {
        return workLocationService.findAll();
    }

    //below are the methods locked for admin-use only
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //adds new location on request
    public WorkLocation createWorkLocation(@Valid @RequestBody WorkLocation workLocation) {
        return workLocationService.createWorkLocation;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) //deletes location on request
    public void deleteWorkLocation(@PathVariable long id) {
        workLocationService.deleteWorkLocation(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) //updates location on request
    public WorkLocation updateWorkLocation(@Valid @RequestBody WorkLocation workLocation) {
        return workLocationService.updateLocation(workLocation);
    }
}
