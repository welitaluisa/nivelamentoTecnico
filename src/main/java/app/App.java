package app;
import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        Viagem viagem = new Viagem(Destinos.OSASCO);
        viagem.setDestino(Destinos.MARINGA);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Priscila");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Isabelle");
        acompanhante2.setConfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);
        
        try {
            viagem.setAcompanhantes(acompanhantes);
        } catch (Exception execao){
            System.out.println("Ocorreu um erro:");
            System.out.println(execao.getMessage());
        }


        System.out.println(viagem.getDestino().getCidade());
        System.out.println(viagem.getAcompanhantes().size());
        System.out.println(viagem.getAcompanhantes().get(0).getNome());
        System.out.println(viagem.getAcompanhantes().get(1).getNome());

        for ( Acompanhante acompanhante : viagem.getAcompanhantes()){
            System.out.println(acompanhante.getNome() + " " + acompanhante.isConfirmouCadastro());
        }

        ViagemNacional ViagemNacional1 = new ViagemNacional(Destinos.MANAUS);

        try{
            ViagemNacional1.setAcompanhantes(acompanhantes);
        } catch (Exception execao){
            System.out.println(" Ocorreu um problema:");
            System.out.println(execao.getMessage());
        }

        ViagemNacional1.setCpf("9422208845");

        ViagemInternacional ViagemInternacional1 = new ViagemInternacional(Destinos.ACAPULCO);
        try{
            ViagemInternacional1.setAcompanhantes(acompanhantes);
        } catch (Exception execao){
            System.out.println(" Ocorreu um problema:");
            System.out.println(execao.getMessage());
        }
        
        ViagemInternacional1.setPassaporte("1111-5");

        System.out.println(ViagemNacional1.getDestino().getCidade());
        System.out.println(ViagemInternacional1.getDestino().getCidade());

        System.out.println(ViagemNacional1.getCpf());
        System.out.println(ViagemInternacional1.getPassaporte());
        System.out.println(ViagemInternacional1.calcularPrevisaoDeDiasParaRetorno());
        System.out.println(ViagemNacional1.calcularPrevisaoDeDiasParaRetorno());
    }
}
