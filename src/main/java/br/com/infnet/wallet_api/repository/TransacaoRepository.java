package br.com.infnet.wallet_api.repository;

import br.com.infnet.wallet_api.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
