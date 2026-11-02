package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sm3 {
    public static final z31 a = new z31("COMPLETING_ALREADY", (byte) 3);
    public static final z31 b = new z31("COMPLETING_WAITING_CHILDREN", (byte) 3);
    public static final z31 c = new z31("COMPLETING_RETRY", (byte) 3);
    public static final z31 d = new z31("TOO_LATE_TO_CANCEL", (byte) 3);
    public static final z31 e = new z31("SEALED", (byte) 3);
    public static final tz1 f = new tz1(false);
    public static final tz1 g = new tz1(true);

    public static final Object a(Object obj) {
        fb3 fb3Var = obj instanceof fb3 ? (fb3) obj : null;
        return fb3Var != null ? fb3Var.a : obj;
    }
}
