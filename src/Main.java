import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Da vinci Tournament");

        Date comienzoDeCursada = new Date(2022,7,18);
        Date finDeCursada = new Date(2022,11,5);
        Date fechaParcial = new Date(2022,8,29);

        Season torneoDaVinci = new Season(
                "Torneo 2022, 2do cuatri",
                comienzoDeCursada,
                finDeCursada);


        Team profesPoo= new Team( "Profes POO");
        profesPoo.addPlayer(new Player ("Sergio Medina", "Goal keeper"));
        profesPoo.addPlayer(new Player ("Suplente", "Defender"));
        profesPoo.addPlayer(new Player ("Profe ux", "Goal keeper"));
        profesPoo.addPlayer(new Player ("Profe web", "left corner"));
        profesPoo.addPlayer(new Player ("Profe BD", "right corner"));


        Team estudiantesPoo = new Team("Estudiantes POO");
        estudiantesPoo.addPlayer(new Player ("Vicky", "Goal keeper"));
        estudiantesPoo.addPlayer(new Player ("Tati", "Defender"));
        estudiantesPoo.addPlayer(new Player ("Lucas", "Goal keeper"));
        estudiantesPoo.addPlayer(new Player ("Santino", "left corner"));
        estudiantesPoo.addPlayer(new Player ("Anto", "right corner"));


        Match primerParcial = new Match("aula 116",
                fechaParcial,
                profesPoo,
                estudiantesPoo);

        primerParcial.setLocalTeam(profesPoo);
        primerParcial.setVisitantTeam(estudiantesPoo);

        System.out.println(primerParcial.generateMarker());



    }
}
