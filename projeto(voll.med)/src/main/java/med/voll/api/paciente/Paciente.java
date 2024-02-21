package med.voll.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Paciente")
@Table(name = "pacientes")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    @Embedded
    private Endereco endereco;
    private Boolean ativo;

    public Paciente(DadosCadastroPaciente dadosp){
        this.ativo = true;
        this.nome = dadosp.nome();
        this.email = dadosp.email();
        this.telefone = dadosp.telefone();
        this.cpf = dadosp.cpf();
        this.endereco = new Endereco(dadosp.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoPaciente dadosp) {
        if (dadosp.nome() != null)
            this.nome = dadosp.nome();

        if (dadosp.telefone() != null)
            this.telefone = dadosp.telefone();

        if (dadosp.endereco() != null)
            endereco.atualizarInformacoes(dadosp.endereco());
    }

    public void inativar() {
        this.ativo=false;
    }





}
