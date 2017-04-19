package com.youtube.app.copelmenorte.io.response;

import com.google.gson.annotations.SerializedName;
import com.youtube.app.copelmenorte.model.Hoja;

import java.util.ArrayList;

public class HojasResponse {

    @SerializedName("hojas")
    private ArrayList<Hoja> hojas;

    @SerializedName("error")
    private boolean error;

    public ArrayList<Hoja> getHojas() {
        return hojas;
    }

    public void setHojas(ArrayList<Hoja> hojas) {
        this.hojas = hojas;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
