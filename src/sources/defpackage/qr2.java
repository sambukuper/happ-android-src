package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qr2 implements xh7 {
    public final ts8 a;
    public final z18 b;

    public qr2(ts8 ts8Var, z18 z18Var) {
        this.a = ts8Var;
        this.b = z18Var;
    }

    @Override // defpackage.xh7
    public final boolean a(Exception exc) {
        this.b.b(exc);
        return true;
    }

    @Override // defpackage.xh7
    public final boolean b(bz bzVar) {
        if (bzVar.b == 4 && !this.a.a(bzVar)) {
            String str = bzVar.c;
            if (str != null) {
                this.b.a(new qy(bzVar.e, str, bzVar.f));
                return true;
            }
            b61.i("Null token");
        }
        return false;
    }
}
