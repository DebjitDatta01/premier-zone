package player;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "player_data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Player {

    @Id
    @Column(name = "player_name" , unique = true)
    private String name;
    private String nation;
    private String pos;
    private Integer age;
    private Integer mp;
    private Integer starts;
    private Double min;
    private Double gls;
    private Double ast;
    private Double pk;
    private Double crdy;
    private Double crdr;
    private Double xg;
    private Double xag;
    private String team;
}
