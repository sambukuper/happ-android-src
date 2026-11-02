package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x96 extends n75 {
    public final bx5 c;
    public final int d;
    public final int e;
    public final int f;

    public x96(bx5 bx5Var, String str) {
        super(2, str);
        this.c = bx5Var;
        int i = yn0.d[2];
        this.d = i;
        int i2 = 2000 % i;
        this.e = i2;
        this.f = 2000 - i2;
    }

    @Override // defpackage.n75
    public final o75 a(String str, int i, int i2, Object obj) {
        int iCharAt = 0;
        while (i < i2) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        int i3 = this.e;
        int i4 = this.f;
        if (iCharAt < i3) {
            i4 += this.d;
        }
        Object objB = this.c.b(obj, Integer.valueOf(i4 + iCharAt));
        if (objB == null) {
            return null;
        }
        return new f4(objB);
    }

    @Override // defpackage.n75
    public final Integer b() {
        return 2;
    }
}
