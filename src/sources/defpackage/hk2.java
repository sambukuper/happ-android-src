package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hk2 extends n75 {
    public final int c;
    public final int d;
    public final bx5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk2(int i, int i2, bx5 bx5Var, String str) {
        super(i == i2 ? Integer.valueOf(i) : null, str);
        bx5Var.getClass();
        str.getClass();
        this.c = i;
        this.d = i2;
        this.e = bx5Var;
        if (1 > i || i >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i + " for field " + str + ": expected 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            StringBuilder sb = new StringBuilder("Invalid maximum length ");
            sb.append(i2);
            sb.append(" for field ");
            sb.append(str);
            sb.append(": expected ");
            em7.c(oi0.n(sb, i, "..9"));
            throw null;
        }
    }

    @Override // defpackage.n75
    public final o75 a(String str, int i, int i2, Object obj) {
        int i3 = i2 - i;
        int i4 = this.c;
        if (i3 < i4) {
            return new r75((byte) 7, i4);
        }
        int i5 = this.d;
        if (i3 > i5) {
            return new r75((byte) 8, i5);
        }
        int iCharAt = 0;
        while (i < i2) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        Object objB = this.e.b(obj, new cd1(iCharAt, i3));
        if (objB == null) {
            return null;
        }
        return new f4(objB);
    }
}
