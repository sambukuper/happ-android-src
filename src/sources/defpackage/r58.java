package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r58 extends bi7 {
    public CharSequence c;
    public List d;
    public f88 e;
    public o88 f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public z24 k;
    public fi2 l;
    public long m;
    public x78 n;

    public r58() {
        super(kd7.h().g());
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.m = s31.b(0, 0, 0, 0, 15);
    }

    @Override // defpackage.bi7
    public final void a(bi7 bi7Var) {
        bi7Var.getClass();
        r58 r58Var = (r58) bi7Var;
        this.c = r58Var.c;
        this.d = r58Var.d;
        this.e = r58Var.e;
        this.f = r58Var.f;
        this.g = r58Var.g;
        this.h = r58Var.h;
        this.i = r58Var.i;
        this.j = r58Var.j;
        this.k = r58Var.k;
        this.l = r58Var.l;
        this.m = r58Var.m;
        this.n = r58Var.n;
    }

    @Override // defpackage.bi7
    public final bi7 b() {
        return new r58();
    }

    public final String toString() {
        CharSequence charSequence = this.c;
        return "CacheRecord(visualText=" + ((Object) charSequence) + ", annotations=" + this.d + ", composition=" + this.e + ", textStyle=" + this.f + ", singleLine=" + this.g + ", softWrap=" + this.h + ", densityValue=" + this.i + ", fontScale=" + this.j + ", layoutDirection=" + this.k + ", fontFamilyResolver=" + this.l + ", constraints=" + q31.l(this.m) + ", layoutResult=" + this.n + ")";
    }
}
