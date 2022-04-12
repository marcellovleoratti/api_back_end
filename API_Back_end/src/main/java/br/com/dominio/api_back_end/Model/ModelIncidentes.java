package br.com.dominio.api_back_end.Model;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Calendar;

@Entity
@Getter
@Setter
@Data
@EqualsAndHashCode
@ToString

public class ModelIncidentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    private Calendar dia;
    private String nomeUser;
}
