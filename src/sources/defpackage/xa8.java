package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xa8 implements fk6 {
    public final long b;
    public final fk6 c;

    public xa8(long j, fk6 fk6Var) {
        mb6.o(j >= 0, "Timeout must be non-negative.");
        this.b = j;
        this.c = fk6Var;
    }

    @Override // defpackage.fk6
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fk6
    public final ek6 b(fk0 fk0Var) {
        ek6 ek6VarB = this.c.b(fk0Var);
        long j = this.b;
        return (j <= 0 || fk0Var.b < j - ((long) ek6VarB.a)) ? ek6VarB : ek6.d;
    }
}
