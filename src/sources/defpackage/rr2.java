package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rr2 implements xh7 {
    public final z18 a;

    public rr2(z18 z18Var) {
        this.a = z18Var;
    }

    @Override // defpackage.xh7
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.xh7
    public final boolean b(bz bzVar) {
        int i = bzVar.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.c(bzVar.a);
        return true;
    }
}
