package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

@Entity
public class Overtime {
    private final int employeeWorkingHours = 40;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    public double currentTotalOvertime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double calcOvertime() {

        return currentTotalOvertime;
    }
}