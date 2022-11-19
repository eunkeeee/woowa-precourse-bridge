package bridge.model;

import java.util.ArrayList;
import java.util.List;

public class Diagram {

    public enum Status {
        SURVIVE("O"),
        DIE("X");

        private final String display;

        Status(String display) {
            this.display = display;
        }

        public String getDisplay(Status status) {
            return status.display;
        }

    }

    private static List<String> upDiagram = new ArrayList<>();
    private static List<String> downDiagram = new ArrayList<>();


    public static void updateDiagram(String position, Status status) {
        if (position.equals("U")) {
            if (status == Status.SURVIVE) {
                upDiagram.add("O");
                downDiagram.add(" ");
                return;
            }
            upDiagram.add("X");
            downDiagram.add(" ");
            return;
        }
        if (position.equals("D")) {
            if (status == Status.SURVIVE) {
                upDiagram.add(" ");
                downDiagram.add("O");
                return;
            }
            upDiagram.add(" ");
            downDiagram.add("X");
        }
    }

    public static void printDiagrams() {
        System.out.println(upDiagram);
        System.out.println(downDiagram);
    }
}