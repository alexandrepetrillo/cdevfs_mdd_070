package pacman.modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DessinateurMonde {

    private World world;

    public DessinateurMonde() {
        world = new World(1, 2);
        world.set(0, 0, new Wall(WallTypeId.TOPLEFT));
        world.set(0, 1, new Wall(WallTypeId.VERTICAL));
    }

    public void dessiner() {
        //mauvaise façon
        for (int i = 0; i < world.getHeight(); i++) {
            for (int j = 0; j < world.getWidth(); j++) {
                StaticElement element = world.getElements()[i][j];
                System.out.println(element);
            }
        }

        //bonne façon
        for (Iterator<StaticElement> iterator = world.iterator(); iterator.hasNext(); ) {
            StaticElement element = iterator.next();
            System.out.println(element);
        }
        for (StaticElement element : world) {
            System.out.println(element);

        }

        //FOCUS ITERATOR
        List<Integer> list = new ArrayList<>();
        //NB Set (une autre collection mais les éléments n'ont pas d'index, et donc la boucle numéro 2 est impossible

        for (Integer integer : list) {
        }
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
        }
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer integer = iterator.next();
        }


    }
}
