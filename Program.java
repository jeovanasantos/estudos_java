import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Joao");
        list.add("Pamela");
        list.add("Mariana");
        //adicionando o nome "Leal" na posição 2 da lista
        list.add(2, "Leal");
        //imprime o tamanho da lista
        System.out.println(list.size());
        //remove um elemento da lista, tanto pela posição quanto pelo nome
       //list.remove(0);

        for (String x : list){
            System.out.println(x);

        }
        System.out.println("----------------------");
        list.remove(1);
        //removendo os elementos que começam com 'M' através do predicato
        //list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);

        }
        System.out.println("----------------------");
        //Mostra em qual posição esta o elemento na lista
        System.out.println("Index of Leal:" + list.indexOf("Leal"));
        System.out.println("----------------------");
        //mostra uma lista apenas com elementos que iniciam com letra 'M'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
    }
}