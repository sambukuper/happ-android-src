package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl7 implements d57 {
    public final /* synthetic */ gl7 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ er8 d;
    public final /* synthetic */ iz e;
    public final /* synthetic */ iz f;

    public /* synthetic */ fl7(gl7 gl7Var, String str, String str2, er8 er8Var, iz izVar, iz izVar2) {
        this.a = gl7Var;
        this.b = str;
        this.c = str2;
        this.d = er8Var;
        this.e = izVar;
        this.f = izVar2;
    }

    @Override // defpackage.d57
    public final void a(f57 f57Var) {
        gl7 gl7Var = this.a;
        if (gl7Var.d() == null) {
            return;
        }
        gl7Var.I();
        gl7Var.G(gl7Var.J(this.b, this.c, this.d, this.e, this.f));
        gl7Var.r();
        oy8 oy8Var = gl7Var.r;
        oy8Var.getClass();
        s08.b();
        Iterator it = oy8Var.X.iterator();
        while (it.hasNext()) {
            oy8Var.d((hq8) it.next());
        }
    }
}
