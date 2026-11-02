package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ox1 extends q06 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox1(dn2 dn2Var, byte b) {
        super(dn2Var);
        this.b = b;
    }

    @Override // defpackage.q06
    public final t06 a(Object obj) {
        switch (this.b) {
            case 0:
                return new t06(this, obj, obj == null, qe4.v0, null, true);
            default:
                return new t06(this, obj, obj == null, null, null, false);
        }
    }
}
