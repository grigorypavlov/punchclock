package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Overtime;
import ch.zli.m223.punchclock.service.OvertimeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/overtime")
public class OvertimeController {
    private final OvertimeService overtimeService;

    public OvertimeController(OvertimeService overtimeService) {
        this.overtimeService = overtimeService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Overtime> getOvertime() {
        return overtimeService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Overtime createOvertime(@Valid @RequestBody Overtime overtime) {
        return overtimeService.createOvertime(overtime);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOvertime(@PathVariable long id) {
        overtimeService.deleteOvertime(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Overtime updateOvertime(@Valid @RequestBody Overtime overtime) {
        return overtimeService.updateOvertime(overtime);
    }
}