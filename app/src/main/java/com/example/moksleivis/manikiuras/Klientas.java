package com.example.moksleivis.manikiuras;

/**
 * Created by moksleivis on 10/04/2017.
 */

public class Klientas {
    private String vardas, numeris, vieta, papildomos, tipas;

    public Klientas(String vardas, String numeris, String vieta, String papildomos, String tipas) {
        this.vardas = vardas;
        this.numeris = numeris;
        this.vieta = vieta;
        this.papildomos = papildomos;
        this.tipas = tipas;
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getVieta() {
        return vieta;
    }

    public void setVieta(String vieta) {
        this.vieta = vieta;
    }

    public String getPapildomos() {
        return papildomos;
    }

    public void setPapildomos(String papildomos) {
        this.papildomos = papildomos;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }
}




