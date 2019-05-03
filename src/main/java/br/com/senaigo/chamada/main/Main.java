
package br.com.senaigo.chamada.main;

import br.com.senaigo.chamada.model.Aluno1;
import br.com.senaigo.chamada.model.Aluno10;
import br.com.senaigo.chamada.model.Aluno11;
import br.com.senaigo.chamada.model.Aluno12;
import br.com.senaigo.chamada.model.Aluno13;
import br.com.senaigo.chamada.model.Aluno14;
import br.com.senaigo.chamada.model.Aluno15;
import br.com.senaigo.chamada.model.Aluno2;
import br.com.senaigo.chamada.model.Aluno3;
import br.com.senaigo.chamada.model.Aluno4;
import br.com.senaigo.chamada.model.Aluno5;
import br.com.senaigo.chamada.model.Aluno6;
import br.com.senaigo.chamada.model.Aluno7;
import br.com.senaigo.chamada.model.Aluno8;
import br.com.senaigo.chamada.model.Aluno9;
import br.com.senaigo.chamada.model.RespondeChamada;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<RespondeChamada> alunos = new ArrayList();
        
        alunos.add(new Aluno1());
        alunos.add(new Aluno2());
        alunos.add(new Aluno3());
        alunos.add(new Aluno4());
        alunos.add(new Aluno5());
        alunos.add(new Aluno6());
        alunos.add(new Aluno7());
        alunos.add(new Aluno8());
        alunos.add(new Aluno9());
        alunos.add(new Aluno10());
        alunos.add(new Aluno11());
        alunos.add(new Aluno12());
        alunos.add(new Aluno13());
        alunos.add(new Aluno14());
        alunos.add(new Aluno15());
        
        for(RespondeChamada aluno : alunos) {
            System.out.println(aluno.responderChamada());
        }
        
        
    }
    
}
