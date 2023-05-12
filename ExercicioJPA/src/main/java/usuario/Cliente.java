package art;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
   
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy =  GenerationType.IDENTITY)
   private Integer id;
  @Column(name = "nome")
  private String nome;
   
    public void setNome(String nome){
        this.nome = nome;
    }
    public Integer getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
   
  }