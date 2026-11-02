package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eo8 extends n75 {
    public final Integer c;
    public final Integer d;
    public final bx5 e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public eo8(Integer num, Integer num2, bx5 bx5Var, String str, boolean z) {
        Integer num3 = dh3.f(num, num2) ? num : null;
        super(num3, str);
        this.c = num;
        this.d = num2;
        this.e = bx5Var;
        this.f = z;
        if (num3 != null) {
            kf3 kf3Var = new kf3(1, 9, 1);
            int iIntValue = num3.intValue();
            if (1 > iIntValue || iIntValue > kf3Var.Y) {
                xw3.m("Invalid length for field ", str, ": ", num3);
                throw null;
            }
        }
    }

    @Override // defpackage.n75
    public final o75 a(String str, int i, int i2, Object obj) {
        Integer numValueOf;
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new r75((byte) 8, num.intValue());
        }
        Integer num2 = this.c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new r75((byte) 7, num2.intValue());
        }
        int iCharAt = 0;
        while (true) {
            if (i >= i2) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i++;
        }
        if (numValueOf == null) {
            return lh4.m0;
        }
        boolean z = this.f;
        int iIntValue = numValueOf.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        Object objB = this.e.b(obj, Integer.valueOf(iIntValue));
        if (objB == null) {
            return null;
        }
        return new f4(objB);
    }
}
