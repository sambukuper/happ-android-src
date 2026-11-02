package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h35 {
    public static final SparseArray X;
    public static final /* synthetic */ h35[] Y;

    /* JADX INFO: Fake field, exist only in values array */
    h35 EF1;

    static {
        h35 h35Var = new h35("MOBILE", 0);
        h35 h35Var2 = new h35("WIFI", 1);
        h35 h35Var3 = new h35("MOBILE_MMS", 2);
        h35 h35Var4 = new h35("MOBILE_SUPL", 3);
        h35 h35Var5 = new h35("MOBILE_DUN", 4);
        h35 h35Var6 = new h35("MOBILE_HIPRI", 5);
        h35 h35Var7 = new h35("WIMAX", 6);
        h35 h35Var8 = new h35("BLUETOOTH", 7);
        h35 h35Var9 = new h35("DUMMY", 8);
        h35 h35Var10 = new h35("ETHERNET", 9);
        h35 h35Var11 = new h35("MOBILE_FOTA", 10);
        h35 h35Var12 = new h35("MOBILE_IMS", 11);
        h35 h35Var13 = new h35("MOBILE_CBS", 12);
        h35 h35Var14 = new h35("WIFI_P2P", 13);
        h35 h35Var15 = new h35("MOBILE_IA", 14);
        h35 h35Var16 = new h35("MOBILE_EMERGENCY", 15);
        h35 h35Var17 = new h35("PROXY", 16);
        h35 h35Var18 = new h35("VPN", 17);
        h35 h35Var19 = new h35("NONE", 18);
        Y = new h35[]{h35Var, h35Var2, h35Var3, h35Var4, h35Var5, h35Var6, h35Var7, h35Var8, h35Var9, h35Var10, h35Var11, h35Var12, h35Var13, h35Var14, h35Var15, h35Var16, h35Var17, h35Var18, h35Var19};
        SparseArray sparseArray = new SparseArray();
        X = sparseArray;
        sparseArray.put(0, h35Var);
        sparseArray.put(1, h35Var2);
        sparseArray.put(2, h35Var3);
        sparseArray.put(3, h35Var4);
        sparseArray.put(4, h35Var5);
        sparseArray.put(5, h35Var6);
        sparseArray.put(6, h35Var7);
        sparseArray.put(7, h35Var8);
        sparseArray.put(8, h35Var9);
        sparseArray.put(9, h35Var10);
        sparseArray.put(10, h35Var11);
        sparseArray.put(11, h35Var12);
        sparseArray.put(12, h35Var13);
        sparseArray.put(13, h35Var14);
        sparseArray.put(14, h35Var15);
        sparseArray.put(15, h35Var16);
        sparseArray.put(16, h35Var17);
        sparseArray.put(17, h35Var18);
        sparseArray.put(-1, h35Var19);
    }

    public static h35 valueOf(String str) {
        return (h35) Enum.valueOf(h35.class, str);
    }

    public static h35[] values() {
        return (h35[]) Y.clone();
    }
}
