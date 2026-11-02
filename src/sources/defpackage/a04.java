package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum a04 {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final k32 Y = new k32();
    public static final LinkedHashMap Z;
    public final byte X;

    static {
        a04[] a04VarArrValues = values();
        int iG = aq4.G(a04VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG < 16 ? 16 : iG);
        for (a04 a04Var : a04VarArrValues) {
            linkedHashMap.put(Integer.valueOf(a04Var.X), a04Var);
        }
        Z = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    a04(int i) {
        this.X = i;
    }
}
