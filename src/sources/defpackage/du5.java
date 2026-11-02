package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum du5 {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public final v15 X;
    public final v15 Y;
    public final g44 Z;
    public final g44 f0;
    public static final Set g0 = eu.L0(new du5[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    du5(String str) {
        this.X = v15.e(str);
        this.Y = v15.e(str.concat("Array"));
        cu5 cu5Var = new cu5(this, (byte) 0);
        w74 w74Var = w74.X;
        this.Z = x97.P(w74Var, cu5Var);
        this.f0 = x97.P(w74Var, new cu5(this, (byte) 1));
    }
}
