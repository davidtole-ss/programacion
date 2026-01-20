package Ejercicio07;

import java.time.LocalTime;

public class RelojDigital extends Reloj {
    LocalTime hora2 = hora;
    protected int aumento;

    public RelojDigital(String marcaReloj, String tipo, int aumento) {
        super(marcaReloj, tipo);
        this.aumento = aumento;
    }

    public void incrementar() throws InterruptedException {
        String hora= String.format("Hora actual: %d:%d:%d",hora2.getHour(),hora2.getMinute(),hora2.getSecond());
        System.out.println(hora);
        LocalTime incremento = LocalTime.of(hora2.getHour(), hora2.getMinute(), hora2.getSecond());
        int horas = incremento.getHour();
        int minuto = incremento.getMinute();
        int segundo = incremento.getSecond();
        for (int x = 0; x < aumento; x++) {
            if (segundo == 59) {
                if (minuto >= 0 && minuto < 10) {
                    System.out.println(horas + ":0" + minuto + ":" + segundo);
                    minuto += 1;
                    segundo = 0;
                    Thread.sleep(1000);
                } else {
                    System.out.println(horas + ":" + minuto + ":" + segundo);
                    minuto += 1;
                    segundo = 0;
                    Thread.sleep(1000);
                }
            } else if (segundo >= 0 && segundo < 10) {
                if (minuto >= 0 && minuto < 10) {
                    System.out.println(horas + ":0" + minuto + ":0" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                } else {
                    System.out.println(horas + ":" + minuto + ":0" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                }
            } else {
                if (minuto >= 0 && minuto < 10) {
                    System.out.println(horas + ":0" + minuto + ":" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                } else {
                    System.out.println(horas + ":" + minuto + ":" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                }
            }
        }
    }

    public void incrementarInfinito() throws InterruptedException {
        String hora= String.format("Hora actual: %d:%d:%d",hora2.getHour(),hora2.getMinute(),hora2.getSecond());
        System.out.println(hora);
        LocalTime incremento = LocalTime.of(hora2.getHour(), hora2.getMinute(), hora2.getSecond());
        int horas = incremento.getHour();
        int minuto = incremento.getMinute();
        int segundo = incremento.getSecond();
        boolean seguir = true;
        while (seguir) {
            if (segundo == 59 && minuto == 59) {
                System.out.println(horas + ":" + minuto + ":" + segundo);
                horas += 1;
                minuto = 0;
                segundo = 0;
                Thread.sleep(1000);
            } else if (segundo == 59) {
                if (minuto >= 0 && minuto < 10) {
                    System.out.println(horas + ":0" + minuto + ":" + segundo);
                    minuto += 1;
                    segundo = 0;
                    Thread.sleep(1000);
                } else {
                    System.out.println(horas + ":" + minuto + ":" + segundo);
                    minuto += 1;
                    segundo = 0;
                    Thread.sleep(1000);
                }
            } else if (segundo >= 0 && segundo < 10) {
                if (minuto >= 0 && minuto < 10) {
                    System.out.println(horas + ":0" + minuto + ":0" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                } else {
                    System.out.println(horas + ":" + minuto + ":0" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                }
            } else {
                if (minuto >= 0 && minuto < 10) {
                    System.out.println(horas + ":0" + minuto + ":" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                } else {
                    System.out.println(horas + ":" + minuto + ":" + segundo);
                    segundo += 1;
                    Thread.sleep(1000);
                }
            }

        }
    }

    @Override
    public void mostrarHora() throws InterruptedException {
        incrementar();


    }


}
