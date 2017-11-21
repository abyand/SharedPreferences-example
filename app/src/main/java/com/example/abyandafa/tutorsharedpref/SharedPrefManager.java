package com.example.abyandafa.tutorsharedpref;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Abyan Dafa on 31/10/2017.
 */

public class SharedPrefManager {

    public static final String SP_PENGGUNA ="spPengguna";

    public static final String SP_NAMA = "spNama";
    public static final String SP_EMAIL = "spEmail";
    public static final String SP_NOHP = "spNohp";
    public static final String SP_ALAMAT = "spAlamat";
    public static final String SP_NODAR = "spNodar";
    public static final String SP_PESAN = "spPesan";

    public static final String SP_SUDAH_LOGIN = "spSudahLogin";

    SharedPreferences sp;
    SharedPreferences.Editor spEditor;

    public SharedPrefManager(Context context) {
        sp = context.getSharedPreferences(SP_PENGGUNA, Context.MODE_PRIVATE);
        spEditor = sp.edit();
    }

    public void saveSPString (String keySP, String value)
    {
        spEditor.putString(keySP, value);
        spEditor.commit();
    }
    public void saveSPInt(String keySP, int value)
    {
        spEditor.putInt(keySP, value);
        spEditor.commit();
    }

    public void saveSPBoolean(String keySP, boolean value)
    {
        spEditor.putBoolean(keySP, value);
        spEditor.commit();
    }

    public String getSpNama(){
        return sp.getString(SP_NAMA, "");
    }

    public String getSpEmail(){
        return sp.getString(SP_EMAIL, "");
    }

    public String getSpNohp(){
        return sp.getString(SP_NOHP, "");
    }

    public String getSpAlamat(){
        return sp.getString(SP_ALAMAT, "");
    }

    public String getSpNodar(){
        return sp.getString(SP_NODAR, "");
    }

    public String getSpPesan(){
        return sp.getString(SP_PESAN, "");
    }

    public Boolean getSPSudahLogin(){
        return sp.getBoolean(SP_SUDAH_LOGIN, false);
    }


}
