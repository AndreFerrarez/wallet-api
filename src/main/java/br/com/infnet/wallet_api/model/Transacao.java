package br.com.infnet.wallet_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="transacao")
@Getter@Setter@NoArgsConstructor
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // DEPOSITO ou SAQUE
    private BigDecimal valor;
    private String moeda; // ex. BTC ou ETH
    private LocalDateTime data;

    // garante que o campo data seja preenchido antes de salvar uma nova transacao...
    @PrePersist
    public void prePersist(){
        data = LocalDateTime.now();
    }
}
