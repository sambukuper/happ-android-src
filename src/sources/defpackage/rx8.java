package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rx8 extends ux8 {
    public boolean a = false;
    public int b = 0;
    public final /* synthetic */ sx8 c;

    public rx8(sx8 sx8Var) {
        this.c = sx8Var;
    }

    @Override // defpackage.ux8, defpackage.tx8
    public final void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        tx8 tx8Var = this.c.d;
        if (tx8Var != null) {
            tx8Var.b();
        }
    }

    @Override // defpackage.tx8
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        sx8 sx8Var = this.c;
        if (i == sx8Var.a.size()) {
            tx8 tx8Var = sx8Var.d;
            if (tx8Var != null) {
                tx8Var.c();
            }
            this.b = 0;
            this.a = false;
            sx8Var.e = false;
        }
    }
}
