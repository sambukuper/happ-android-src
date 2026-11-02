package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ob1 {
    public static final pb1 a;

    static {
        for (r22 r22Var : r22.values()) {
            r22Var.getClass();
        }
        int i = 0;
        for (vp3 vp3Var : vp3.values()) {
            if (vp3Var.X) {
                i |= vp3Var.Y;
            }
        }
        a = new pb1(0, i);
    }
}
