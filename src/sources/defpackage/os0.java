package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class os0 {
    public static final Set c;
    public final hl1 a;
    public final vt1 b;

    static {
        fk2 fk2VarI = tg7.c.i();
        c = w45.U(new qs0(fk2VarI.b(), fk2VarI.a.g()));
    }

    public os0(hl1 hl1Var) {
        this.a = hl1Var;
        this.b = hl1Var.a.c(new f0(this, (byte) 11));
    }

    public final sx4 a(qs0 qs0Var, hs0 hs0Var) {
        qs0Var.getClass();
        return (sx4) this.b.B(new ns0(qs0Var, hs0Var));
    }
}
