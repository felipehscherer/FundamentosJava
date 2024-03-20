package org.example;

public class Time {
    int hora;
    int min;
    int seg;

    public Time(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Time(int hora, int min){
        this.hora = hora;
        this.min = min;
    }

    public String exibirHoraUniversal(){
        return formatarNumero(this.hora) + ":" + formatarNumero(this.min) + ":" + formatarNumero(this.seg);
    }

    public String exibirHoraPadrao(){
        if (hora > 12 && hora <= 23){
            hora = hora - 12;
            return this.hora + ":" + this.min + ":" + this.seg + " - PM";
        } else if (hora == 12){
            return this.hora + ":" + this.min + ":" + this.seg + " - PM";
        } else if (hora == 24) {
            hora = hora - 12;
            return this.hora + ":" + this.min + ":" + this.seg + " - AM";
        } else {
            return this.hora + ":" + this.min + ":" + this.seg + " - AM";
        }
    }

    private String formatarNumero(int num){
        if (num >= 0 && num < 10)
            return "0" + num;
        else
            return String.valueOf(num);
    }



}
