package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o06 implements it8 {
    public boolean a = false;
    public boolean b = false;
    public x82 c;
    public final n06 d;

    public o06(n06 n06Var) {
        this.d = n06Var;
    }

    @Override // defpackage.it8
    public final it8 b(String str) {
        if (this.a) {
            throw new z02("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.f(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.it8
    public final it8 c(boolean z) {
        if (this.a) {
            throw new z02("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
