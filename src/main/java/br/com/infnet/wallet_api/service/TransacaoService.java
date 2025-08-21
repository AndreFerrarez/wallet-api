package br.com.infnet.wallet_api.service;

import br.com.infnet.wallet_api.model.Transacao;
import br.com.infnet.wallet_api.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransacaoService {

    private final TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    public List<Transacao> listarTodos() {
        return transacaoRepository.findAll();
    }

    public Optional<Transacao> buscarPorId(Long id) {
        return transacaoRepository.findById(id);
    }

    public Transacao criar(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public Optional<Transacao> atualizar(Long id, Transacao transacaoAtualizada) {
        return transacaoRepository.findById(id)
                .map(transacaoExistente -> {
                    transacaoExistente.setTipo(transacaoAtualizada.getTipo());
                    transacaoExistente.setValor(transacaoAtualizada.getValor());
                    transacaoExistente.setMoeda(transacaoAtualizada.getMoeda());
                    // A data não é atualizada, pois representa o momento da transação original.
                    return transacaoRepository.save(transacaoExistente);
                });
    }

    public boolean deletar(Long id) {
        if(transacaoRepository.existsById(id)) {
            transacaoRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
