package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ei8 {
    public static final ei8 i = new ei8(new ei8(null, 2047), 2012);
    public final boolean a;
    public final boolean b;
    public final ei8 c;
    public final boolean d;
    public final ei8 e;
    public final ei8 f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ei8(ei8 ei8Var, int i2) {
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        ei8 ei8Var2 = (i2 & 32) != 0 ? null : ei8Var;
        this(z, z2, ei8Var2, true, ei8Var2, ei8Var2, (i2 & 512) == 0, (i2 & 1024) == 0);
    }

    public ei8(boolean z, boolean z2, ei8 ei8Var, boolean z3, ei8 ei8Var2, ei8 ei8Var3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = ei8Var;
        this.d = z3;
        this.e = ei8Var2;
        this.f = ei8Var3;
        this.g = z4;
        this.h = z5;
    }
}
