package fila;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Resolucao {
	 static int opcao =-1;
    public static void main(String[] args) {
        Queue<String> FilaAnimais = new LinkedList<>();

        String animal;
       

      while(opcao !=0) {
    	  menu();
    	  switch (opcao){
          case 1:
              animal =  JOptionPane.showInputDialog("Digite o nome do animal: ");
              FilaAnimais.add(animal);
              JOptionPane.showMessageDialog( null, animal+" adicionado com sucesso!");
              break;

          case 2:
              if(FilaAnimais.isEmpty()){
                  System.out.println("A fila está vazia!!!!");
              }else {
                  animal = JOptionPane.showInputDialog("Digite o nome do animal para remover:");
                  FilaAnimais.remove(animal);
                  JOptionPane.showMessageDialog(null, animal+" removido com sucesso!");
              }
              break;

          case 3:
              if(FilaAnimais.isEmpty()) {
                  JOptionPane.showMessageDialog(null, "A fila esta vazia!!!!");
              }else {
                  String exibirPrimeiroElemento = FilaAnimais.peek();
                 JOptionPane.showMessageDialog(null,
                		 "Primeiro elemento da lista é:" + exibirPrimeiroElemento);
              }
              break;

          case 4:
              if(FilaAnimais.isEmpty()) {
            	  JOptionPane.showMessageDialog(null, "A fila esta vazia!!!!");
              }else {
            	  JOptionPane.showMessageDialog(null, "Fila : "+FilaAnimais);
              }
              break;

          case 5:
              if(FilaAnimais.isEmpty()) {
            	  JOptionPane.showMessageDialog(null, "A fila esta vazia!!!!");
              }else {
              	FilaAnimais.clear();
              	JOptionPane.showMessageDialog(null, "Fila esvaziada com sucesso!!!!");
              }
              break;
              
          case 0 : 
        	  JOptionPane.showMessageDialog(null, "Volte sempre!!");
              default:
              	JOptionPane.showMessageDialog(null, "Opcao invalida!!!");
      }
      }
    }
    private static void menu() {
    	  opcao = Integer.parseInt(JOptionPane.showInputDialog("-----Fila dos Animais-----\n"+
    	 "|Opcao 1: Inserir elemento na fila\n"+
    	"|Opcao 2: Remover elemento na fila\n"+
    	 "|Opcao 3: Exibir primeiro elemento\n"+
    	"|Opcao 4: Exibir a fila\n"+
    	 "|Opcao 5: Esvaziar a fila\n"+
    	 "|Opcao 0: Sair\n"+
    	 "|Digite a opção desejada: "));
    }
}


