package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

@Entity
public class Overtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private int employeeWorkingHours = 40;
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