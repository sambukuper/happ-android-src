package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v66 extends sz0 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ y45 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v66(y45 y45Var, byte b) {
        super((byte) 1);
        this.Y = b;
        this.Z = y45Var;
    }

    @Override // defpackage.sz0
    public final void i(String[] strArr) {
        byte b = this.Y;
        y45 y45Var = this.Z;
        switch (b) {
            case 0:
                if (strArr == null) {
                    bt.q("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                } else {
                    ((x66) y45Var.X).f0 = strArr;
                }
                break;
            default:
                if (strArr == null) {
                    bt.q("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                } else {
                    ((x66) y45Var.X).g0 = strArr;
                }
                break;
        }
    }
}
