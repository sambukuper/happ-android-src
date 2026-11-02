package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum go8 {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(jb5.t("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(jb5.t("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(jb5.t("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(jb5.t("kotlin/ULong", false));

    public final qs0 X;
    public final v15 Y;
    public final qs0 Z;

    go8(qs0 qs0Var) {
        this.X = qs0Var;
        v15 v15VarF = qs0Var.f();
        this.Y = v15VarF;
        this.Z = new qs0(qs0Var.a, v15.e(v15VarF.b() + "Array"));
    }
}
