package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q99 extends Exception {
    public final x11 X;

    public q99(x11 x11Var) {
        w45.n((x11Var.Y == 0 || x11Var.Z == null) ? false : true, "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.X = x11Var;
    }
}
