package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y55 implements ae8 {
    public final ke8 a;
    public final c73 b;

    public y55(ke8 ke8Var, c73 c73Var) {
        this.a = ke8Var;
        this.b = c73Var;
    }

    @Override // defpackage.ae8
    public final void a() {
        c73 c73Var = this.b;
        boolean z = c73Var instanceof jw7;
        ke8 ke8Var = this.a;
        if (z) {
            ke8Var.onSuccess(((jw7) c73Var).a);
        } else if (c73Var instanceof m32) {
            ke8Var.onError(((m32) c73Var).a);
        } else {
            b61.c();
        }
    }
}
