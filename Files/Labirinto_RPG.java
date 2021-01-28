/* Autor: Fernando H. Filter
 * Data: 27/05/2020 */

/*Detalhes da atividade:
 - Voce devera criar uma narrativa para o seu labirinto.
 - Voce devera criar uma matriz para armazenar os inimigos/adversarios que o jogador ira encontrar dentro do labirinto.
 - Voce devera incrementar o contador para cada inimigo derrotado, fazendo com que sempre o proximo item dentro da matriz de inimigos/adversarios seja carregado.
 - Voce devera criar metodos para: impressao dos dados do personagem, soma de vida e perda de vida. */

import javax.swing.*;

public class Labirinto_RPG{
  public static void main(String [] args){
    JOptionPane.showMessageDialog(null, "    Lutando por Vinganca", "", JOptionPane.INFORMATION_MESSAGE);
    
    // Dificuldade
    int dif = Entrada.leiaOpcao("Escolha a dificuldade","Facil","Medio","Dificil");
    
    // Personagem
    String nome = Entrada.leiaString("Digite seu nome");
    int classe = Entrada.leiaOpcao("Escolha a classe do seu personagem","Barbaro","Patrulheiro","Mago","Paladino");
    int vida = 0, dano = 0, vidaMax = 0;
    
    if(classe == 1){ // Barbaro
      vida = 130; dano = 30;
    }else if(classe == 2){ // Patrulheiro
      vida = 70; dano = 90;
    }else if(classe == 3){ // Mago
      vida = 50; dano = 110;
    }else if(classe == 4){ // Paladino
      vida = 100; dano = 60;
    }
    vidaMax = vida;
    
    // Monstros
    String[] mons_Name = {"Goblin","Warg","Troll","Orc","Drider","Demonio","Cavaleiro da Morte","Rei Fantasma","Feiticeiro Nhilrak","Dragao Negro"};
    int[][] monster = new int [10][2];
    
    for(int x = 0; x < 10; x++){
      monster[x][0] = (15 * (x + 1)) * dif; // Vida do Monstro
      monster[x][1] = (5 * (x + 1)) * dif; // Dano do Monstro
    }
    
    // Jogo
    int d20 = 0; int direc = 0; int deathEnemy = 0;
    int[] faseDirec = new int [9]; int[] cam = {0,1,2,3,4,5,6,7,8};
    int fase_dice = 0; int dice;
    
    System.out.println("----------------------------------------- H I S T O R I A -----------------------------------------");
    System.out.println("  Enviados em uma missao do Rei Frederico, quatro bravos guerreiros sao necessarios para derrotar");
    System.out.println("seu impetuoso irmao, o Feiticeiro Nhilrak. Cuja maldade ameacava a paz do reino com seu exercito");
    System.out.println("e sua magia maligna capaz de destruir nao apenas o reino, mas o mundo inteiro.\n");
    System.out.println("  Convocados pelo rei dado a sua reputacao, " + nome + " e seu grupo partem a cacada do irmao cruel.");
    System.out.println("Atravessaram arduos desertos, extensas florestas e profundos lagos, em meio disso, restara apenas");
    System.out.println("o lider do grupo que atualmente busca concluir sua missao e vingar seus companheiros. Por isso, e");
    System.out.println("necessario percorrer o labirinto do feiticeiro e assim terminar sua jornada.");
    System.out.println("---------------------------------------------------------------------------------------------------\n");
    
    System.out.println("------------------------------------ F U N C I O N A M E N T O ------------------------------------");
    System.out.println("- O Labirinto possui 10 niveis com caminhos aleatarios. Acertando o caminho, avancara de fase.");
    System.out.println("- Ao errar, enfrentara monstros cada vez mais fortes, conforme o progresso, em um duelo mortal.");
    System.out.println("- As batalhas sao feitas entre turnos do jogador e de quem ele esta enfrentando no momento.");
    System.out.println("- Voce decide se quer Atacar ou Defender. O dano e decidido pelo numero do dado lancado.");
    System.out.println("- Durante sua jornada, encontrara pocoes e itens magicos para te fortalecer e seguir em frente.");
    System.out.println("- Para vencer e necessario chegar a ultima fase e terminar o Labirinto do Feiticeiro Nhilrak.");
    System.out.println("---------------------------------------------------------------------------------------------------");
    
    JOptionPane.showMessageDialog(null, "      Clique para Comecar", "titulo", JOptionPane.INFORMATION_MESSAGE);

    do{ // Caminho Aleat�rio
      dice = (int) (Math.random() * 9);
      for(int i = 0; i < cam.length; i++){
        if(cam[i] == dice){
          faseDirec[i] = (int) (Math.random() * 3) + 1;
          cam[i] = 100;
          fase_dice += 1;
        }
      }
    }while(fase_dice < 9);
    
    // In�cio
    for(int i = 0; i < 10; i++){
      System.out.println("        NIVEL " + (i+1));
      fichaPerson(nome, classe, vida, dano, deathEnemy);
      
      if(i == 9){ // FASE FINAL
        JOptionPane.showMessageDialog(null, "Voce entra na Sala do Dragao", "Ultimo Nivel", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("  Voce se encanta ao ver o maior monstro que ja existiu, o misterioso Dragao Negro. Era o momento ");
        System.out.println("de matar a ultima fera e terminar com tudo isso, levando sua cabeca como simbolo de vitoria.");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        fichaMonstro(mons_Name, monster, i);
        
        while(monster[i][0] > 0){
          
          if(vida <= 0){
            vida = 0;
            game_over(nome, i);
            i = 100;
            break;
          }
          
          boolean action = Entrada.leiaBoolean("O que voce faz?","Atacar","Defender");
          
          int enemyAct = (int) (Math.random() * 2) + 1; // 1 = Atacar | 2 = Desviar
          
          if(action == true){ // ATACAR
            monster[i][0] = CharAtacar(mons_Name, dano, i, monster, d20);
            
            if(monster[i][0] <= 0){
              monster[i][0] = 0;
            }else{
              if(enemyAct == 1){ // Monster Action
                if(vida <= 0){
                  vida = 0;
                  fichaPerson(nome, classe, vida, dano, deathEnemy);
                }else{
                  vida = MonstroAtacar(vida, i, monster, d20, mons_Name);
                }
              }else{
                monster[i][0] = MonstroDefesa(mons_Name, dano, i, monster, d20);
              }
            }
            
          }else{ // DESVIAR
            vida = CharDefesa(nome, vida, i, monster, d20);
            if(vida <= 0){
              vida = 0;
            }else{
              if(monster[i][0] <= 0){
                monster[i][0] = 0;
              }else{
                if(enemyAct == 1){ // Monster Action
                  vida = MonstroAtacar(vida, i, monster, d20, mons_Name);
                }else{
                  monster[i][0] = MonstroDefesa(mons_Name, dano, i, monster, d20);
                }
              }
            }
          }
          
          fichaPerson(nome, classe, vida, dano, deathEnemy);
          fichaMonstro(mons_Name, monster, i);
          
          if(monster[i][0] <= 0){
            monster[i][0] = 0;
            JOptionPane.showMessageDialog(null, "Voce derrotou o inimigo", "", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("  " + nome + " retorna ao reino ensanguentado, carregando a cabeca do dragao como recompensa, para finalmente concluir sua maior jornada.");
            System.out.println("O Rei se admira com sua coragem e o nomeia como: '" + nome + ", o destemido'. Voce se sente honrado pelo titulo e por vingar seus amigos ");
            System.out.println("que nao tiveram a mesma sorte mas que com certeza morreram como herois.");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            JOptionPane.showMessageDialog(null, "VOCE VENCEU", "", JOptionPane.INFORMATION_MESSAGE);
            deathEnemy += 1;
            i = 100;
            break;
          }
        }
        
      }else{ // OUTROS N�VEIS
        
        direc = Entrada.leiaOpcao("Escolha a direcao","Esquerda","Frente","Direita");
        
        if(direc == faseDirec[i]){ // CAMINHO CERTO
          JOptionPane.showMessageDialog(null, "CAMINHO CERTO", "Avancando de Nivel", JOptionPane.INFORMATION_MESSAGE);
          
          if(i == 2 || i == 4 || i == 8){ // POCAO
            vida = Pocao(vida, dif, vidaMax);
          }else if(i == 5){
            
            JOptionPane.showMessageDialog(null, "Ao entrar na sala, voce se depara com oito artefatos e surge uma voz do alem:", "Sala Misteriosa", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "'Apenas um desses itens deve ser usado para lhe ajudar em sua jornada, escolha com sabedoria.'", "Sala Misteriosa", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Voce percebe que estao separados por classes e devem ser usados apenas pelas pessoas certas.", "Sala Misteriosa", JOptionPane.INFORMATION_MESSAGE);
            
            boolean item;
            if(classe == 1){ // Barbaro
              JOptionPane.showMessageDialog(null, "Ao se aproximar dos equipamentos pesados para Barbaros, outra placa e encontrada:", "", JOptionPane.INFORMATION_MESSAGE);
              item = Entrada.leiaBoolean("'O primeiro lhe dara Vida e o outro Dano'","Cinturao dos Gigantes","Machado de Dois Gumes");
              if(item == true){
                vida += 60 / dif;
                vidaMax += 60 / dif;
              }else{
                dano += 90 / dif;
              }
            }else if(classe == 2){ // Patrulheiro
              JOptionPane.showMessageDialog(null, "Ao se aproximar dos armamentos adequados para Patrulheiros, outra placa e encontrada:", "", JOptionPane.INFORMATION_MESSAGE);
              item = Entrada.leiaBoolean("'O primeiro lhe dara Vida e o outro Dano'","Malha de Mithril","Arco do Juramento");
              if(item == true){
                vida += 75 / dif;
                vidaMax += 75 / dif;
              }else{
                dano += 45 / dif;
              }
            }else if(classe == 3){ // Mago
              JOptionPane.showMessageDialog(null, "Ao se aproximar dos artefatos magicos para Magos, outra placa e encontrada:", "", JOptionPane.INFORMATION_MESSAGE);
              item = Entrada.leiaBoolean("'O primeiro lhe dara Vida e o outro Dano'","Anel de Poder","Bola de Fogo");
              if(item == true){
                vida += 120 / dif;
                vidaMax += 120 / dif;
              }else{
                dano += 45 / dif;
              }
            }else if(classe == 4){ // Paladino
              JOptionPane.showMessageDialog(null, "Ao se aproximar dos equipamentos divinos para Paladinos, outra placa e encontrada:", "", JOptionPane.INFORMATION_MESSAGE);
              item = Entrada.leiaBoolean("'O primeiro lhe dara Vida e o outro Dano'","Escudo Sagrado","Espada Celestial");
              if(item == true){
                vida += 90 / dif;
                vidaMax += 90 / dif;
              }else{
                dano += 80 / dif;
              }
            }
          }
        }else{ // CAMINHO ERRADO ------------------------------------------------------------------------------------------------
          JOptionPane.showMessageDialog(null, "CAMINHO ERRADO", "", JOptionPane.INFORMATION_MESSAGE);
          fichaMonstro(mons_Name, monster, i);
          
          if(monster[i][0] <= 0){
            monster[i][0] = 0;
            JOptionPane.showMessageDialog(null, "Voce derrotou o inimigo", "", JOptionPane.INFORMATION_MESSAGE);
          }
          
          while(monster[i][0] > 0){
            
            if(vida <= 0){
              vida = 0;
              game_over(nome, i);
              i = 100;
              break;
            }
            
            boolean action = Entrada.leiaBoolean("O que voce faz?","Atacar","Defender");
            
            int enemyAct = (int) (Math.random() * 2) + 1; // 1 = Atacar | 2 = Desviar
            
            if(action == true){ // ATACAR
              monster[i][0] = CharAtacar(mons_Name, dano, i, monster, d20);
              
              if(monster[i][0] <= 0){
                monster[i][0] = 0;
                JOptionPane.showMessageDialog(null, "Voce derrotou o inimigo", "", JOptionPane.INFORMATION_MESSAGE);
                deathEnemy += 1;
              }else{
                if(enemyAct == 1){ // Monster Action
                  if(vida <= 0){
                    vida = 0;
                    fichaPerson(nome, classe, vida, dano, deathEnemy);
                  }else{
                    vida = MonstroAtacar(vida, i, monster, d20, mons_Name);
                  }
                }else{
                  monster[i][0] = MonstroDefesa(mons_Name, dano, i, monster, d20);
                  if(monster[i][0] <= 0){
                    monster[i][0] = 0;
                    JOptionPane.showMessageDialog(null, "Voce derrotou o inimigo", "", JOptionPane.INFORMATION_MESSAGE);
                    deathEnemy += 1;
                  }
                }
              }
              
              fichaPerson(nome, classe, vida, dano, deathEnemy);
              fichaMonstro(mons_Name, monster, i);
              
            }else{ // DEFENDER
              vida = CharDefesa(nome, vida, i, monster, d20);
              if(vida <= 0){
                vida = 0;
                fichaPerson(nome, classe, vida, dano, deathEnemy);
              }else{
                if(enemyAct == 1){ // Monster Action
                  if(vida <= 0){
                    vida = 0;
                    fichaPerson(nome, classe, vida, dano, deathEnemy);
                  }else{
                    vida = MonstroAtacar(vida, i, monster, d20, mons_Name);
                  }
                }else{
                  monster[i][0] = MonstroDefesa(mons_Name, dano, i, monster, d20);
                  if(monster[i][0] <= 0){
                    monster[i][0] = 0;
                    JOptionPane.showMessageDialog(null, "Voce derrotou o inimigo", "", JOptionPane.INFORMATION_MESSAGE);
                    deathEnemy += 1;
                  }
                }
                fichaMonstro(mons_Name, monster, i);
              }
              
              fichaPerson(nome, classe, vida, dano, deathEnemy);
            }
          }
          i = (i-1);
        }
      }
    }
  }
  
  // FICHA PERSONAGEM  -----------------------------------------------------------
  private static void fichaPerson(String nome, int classe, int vida, int dano, int deathEnemy){
    System.out.println("-----------------------");
    System.out.println("  FICHA DO PERSONAGEM  ");
    System.out.println("Nome: " + nome);
    if(classe == 1){
      System.out.println("Classe: Barbaro");
    }else if(classe == 2){
      System.out.println("Classe: Patrulheiro");
    }else if(classe == 3){
      System.out.println("Classe: Feiticeiro");
    }else if(classe == 4){
      System.out.println("Classe: Paladino");
    }
    System.out.println("Vida: " + vida);
    System.out.println("Dano Maximo: " + dano);
    System.out.println("Inimigos Derrotados: " + deathEnemy);
    System.out.println("-----------------------");
  }
  
  // POCAO
  private static int Pocao(int vida, int dif, int vidaMax){ 
    int pocao = 15 * dif;
    JOptionPane.showMessageDialog(null, "Voce encontra uma pocao que regenera sua vida ao bebe-la (+" + pocao + ")", "", JOptionPane.INFORMATION_MESSAGE);
    if(vida < vidaMax){
      vida += pocao;
      if(vida > vidaMax){
        vida = vidaMax;
      }
    }
    return vida;
  }
  
  private static void fichaMonstro(String[] mons_Name, int[][] monster, int fase){
    System.out.println("Monstro: " + mons_Name[fase]);
    System.out.println("Vida: " + monster[fase][0] + " | Dano: " + monster[fase][1]);
    System.out.println("-----------------------");
  }
  
  private static int CharAtacar(String[] mons_Name, int dano, int fase, int[][] monster, int d20){
    int porc_dano = dano * (30 / 100); // 30% do Dano Max
    int danoChar_Baixo = (int) (Math.random() * (dano / 2)) + 1;
    int danoChar_Alto = (int) (Math.random() * (dano - porc_dano)) + 5;
    d20 = (int) (Math.random() * 20) + 1;
    
    if(monster[fase][0] > 0){
      if(d20 <= 3){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") O inimigo foi mais rapido e faz com que voce erre seu golpe.", "Acao de Ataque do Heroi", JOptionPane.INFORMATION_MESSAGE);
      }else if(d20 > 3 && d20 <= 10){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") Voce golpeia o " + mons_Name[fase] + " com dano regular. ( -" + danoChar_Baixo + " )", "Acao de Ataque do Heroi", JOptionPane.INFORMATION_MESSAGE);
        monster[fase][0] -= danoChar_Baixo;
      }else if(d20 > 10 && d20 <= 17){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") Voce golpeia " + mons_Name[fase] + " com precisao e perde vida. ( -" + danoChar_Alto + " )", "Acao de Ataque do Heroi", JOptionPane.INFORMATION_MESSAGE);
        monster[fase][0] -= danoChar_Alto;
      }else if(d20 > 17){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") " + mons_Name[fase] + " recebe um golpe com Dano Critico. ( -" + dano + " )", "Acao de Ataque do Heroi", JOptionPane.INFORMATION_MESSAGE);
        monster[fase][0] -= dano;
      }
    }else{
      monster[fase][0] = 0; 
    }
    return monster[fase][0];
  }
  
  private static int CharDefesa(String nome, int vida, int fase, int[][] monster, int d20){
    int porc_dano = monster[fase][1] * (30 / 100); // 30% do Dano Max
    int danoMons_Baixo = (int) (Math.random() * (monster[fase][1] / 2)) + 1;
    int danoMons_Alto = (int) (Math.random() * (monster[fase][1] - porc_dano)) + 5;
    d20 = (int) (Math.random() * 20) + 1;
    
    if(vida > 0){
      if(d20 <= 3){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") " + nome + " demora para defender e recebe Dano Critico. ( -" + monster[fase][1] + " )", "Acao de Defesa do Heroi", JOptionPane.INFORMATION_MESSAGE);
        vida -= monster[fase][1];
      }else if(d20 > 3 && d20 <= 10){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") Voce se defende com dificuldade e recebe um golpe poderoso do inimigo. ( -" + danoMons_Alto + " )", "Acao de Defesa do Heroi", JOptionPane.INFORMATION_MESSAGE);
        vida -= danoMons_Alto;
      }else if(d20 > 10 && d20 <= 17){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") " + nome + " se defende agilmente porem recebe um golpe indigno. ( -" + danoMons_Baixo + " )", "Acao de Defesa do Heroi", JOptionPane.INFORMATION_MESSAGE);
        vida -= danoMons_Baixo;
      }else if(d20 > 17){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") Voce defende-se com perfeicao", "Acao de Defesa do Heroi", JOptionPane.INFORMATION_MESSAGE);
      }
    }else if(vida <= 0){
      vida = 0;
    }
    return vida;
  }
  
  // Monster Actions
  private static int MonstroAtacar(int vida, int fase, int[][] monster, int d20, String[] mons_Name){
    int porc_dano = monster[fase][1] * (30 / 100); // 30% do Dano Max
    int danoMons_Baixo = (int) (Math.random() * (monster[fase][1] / 2)) + 1;
    int danoMons_Alto = (int) (Math.random() * (monster[fase][1] - porc_dano)) + 5;
    d20 = (int) (Math.random() * 20) + 1;
    
    if(d20 > 17){
      JOptionPane.showMessageDialog(null, "(" + d20 + ") Voce recebeu Dano Critico de " + mons_Name[fase] + " ( -" + (monster[fase][1]) + " )", "Acao de Ataque do Inimigo", JOptionPane.INFORMATION_MESSAGE);
      vida -= monster[fase][1];
    }else if(d20 > 10 && d20 <= 17){
      JOptionPane.showMessageDialog(null, "(" + d20 + ") " + mons_Name[fase] + " te ataca e voce perde vida. ( -" + danoMons_Alto + " )", "Acao de Ataque do Inimigo", JOptionPane.INFORMATION_MESSAGE);
      vida -= danoMons_Alto;
    }else if(d20 > 3 && d20 <= 10){
      JOptionPane.showMessageDialog(null, "(" + d20 + ") O monstro quase erra o golpe mas te acerta. ( -" + danoMons_Baixo + " )", "Acao de Ataque do Inimigo", JOptionPane.INFORMATION_MESSAGE);
      vida -= danoMons_Baixo;
    }else if(d20 <= 3){
      JOptionPane.showMessageDialog(null, "(" + d20 + ") O " + mons_Name[fase] + " errou o golpe.", "Acao de Ataque do Inimigo", JOptionPane.INFORMATION_MESSAGE);
    }
    if(vida <= 0){
      vida = 0;
    }
    return vida;
  }
  
  private static int MonstroDefesa(String[] mons_Name, int dano, int fase, int[][] monster, int d20){
    int porc_dano = dano * (30 / 100); // 30% do Dano Max
    int danoChar_Baixo = (int) (Math.random() * (dano / 2)) + 1;
    int danoChar_Alto = (int) (Math.random() * (dano - porc_dano)) + 5;
    d20 = (int) (Math.random() * 20) + 1;
    
    if(monster[fase][0] > 0){
      if(d20 <= 3){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") O inimigo nao consegue se defender a tempo e recebe Dano Critico ( -" + dano + " )", "Acao de Defesa do Inimigo", JOptionPane.INFORMATION_MESSAGE);
        monster[fase][0] -= dano;
      }else if(d20 > 3 && d20 <= 10){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") " + mons_Name[fase] + " demora para se defender e recebe um golpe ( -" + danoChar_Alto + " )", "Acao de Defesa do Inimigo", JOptionPane.INFORMATION_MESSAGE);
        monster[fase][0] -= danoChar_Alto;
      }else if(d20 > 10 && d20 <= 17){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") Ao tentar se defender, " + mons_Name[fase] + " perde vida ( -" + danoChar_Baixo + " )", "Acao de Defesa do Inimigo", JOptionPane.INFORMATION_MESSAGE);
        monster[fase][0] -= danoChar_Baixo;
      }else if(d20 > 17){
        JOptionPane.showMessageDialog(null, "(" + d20 + ") O inimigo defende-se com eximia maestria", "Acao de Defesa do Inimigo", JOptionPane.INFORMATION_MESSAGE);
      }
    }
    if(monster[fase][0] <= 0){
      monster[fase][0] = 0;
    }
    return monster[fase][0];
  }
  
  private static void game_over(String nome, int i){
    JOptionPane.showMessageDialog(null, "VOCE PERDEU", "", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Apos a morte de " + nome + ", o reino nao resiste o contra-ataque e acaba sendo destruido.", "", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, nome + " morreu no nivel " + (i+1), "", JOptionPane.INFORMATION_MESSAGE);
  }
  
}