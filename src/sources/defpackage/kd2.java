package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kd2 extends ld2 {
    public final bg3[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public kd2(int i, bg3[] bg3VarArr) {
        if (bg3VarArr == null) {
            bt.q("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            throw null;
        }
        int i2 = 1;
        int length = bg3VarArr.length - 1;
        if (length != 0) {
            for (int i3 = 31; i3 >= 0; i3--) {
                if (((1 << i3) & length) != 0) {
                    i2 = 1 + i3;
                }
            }
            bt.p(bg3VarArr.getClass(), "Empty enum: ");
            throw null;
        }
        super(i, i2, (byte) 0);
        this.d = bg3VarArr;
    }

    @Override // defpackage.ld2
    public final Object e(int i) {
        int i2 = (1 << this.c) - 1;
        int i3 = this.b;
        int i4 = (i & (i2 << i3)) >> i3;
        for (bg3 bg3Var : this.d) {
            if (bg3Var.a() == i4) {
                return bg3Var;
            }
        }
        return null;
    }
}
