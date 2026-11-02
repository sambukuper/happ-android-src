package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x03 implements x67 {
    public static final x03 b = new x03(0);
    public static final x03 c = new x03(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ x03(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.x67
    public final mb6 a(long j, z24 z24Var, fi1 fi1Var) {
        switch (this.a) {
            case 0:
                float fX0 = fi1Var.x0(30.0f);
                return new ae5(new s86(0.0f, -fX0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fX0));
            case 1:
                float fX1 = fi1Var.x0(30.0f);
                return new ae5(new s86(-fX1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fX1, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new ae5(u70.n(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
