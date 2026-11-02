package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iq8 implements v06 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ jq8 Y;

    public /* synthetic */ iq8(jq8 jq8Var, byte b) {
        this.X = b;
        this.Y = jq8Var;
    }

    @Override // defpackage.v06
    public final Object get() {
        byte b = this.X;
        jq8 jq8Var = this.Y;
        switch (b) {
            case 0:
                return (qi0) jq8Var.a.B(((li0) jq8Var.d.getValue()).a);
            default:
                return ((li0) jq8Var.d.getValue()).b;
        }
    }
}
