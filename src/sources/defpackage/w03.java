package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w03 {
    public final rn2 a;
    public final /* synthetic */ byte b;

    public w03(rn2 rn2Var, byte b) {
        this.b = b;
        this.a = rn2Var;
    }

    public final float a(float f, y24 y24Var, y24 y24Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (y24Var2.C(y24Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (y24Var.j() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (y24Var2.C(y24Var, (((long) Float.floatToRawIntBits(((int) (y24Var.j() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
