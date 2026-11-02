package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bt4 extends ct4 {
    public static final bt4 d = new bt4("must be a member function", 0);
    public static final bt4 e = new bt4("must be a member or an extension function", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt4(String str, byte b) {
        super(str, (byte) 0);
        this.c = b;
    }

    @Override // defpackage.jq0
    public final boolean b(dl3 dl3Var) {
        switch (this.c) {
            case 0:
                return dl3Var.n0 != null;
            default:
                return (dl3Var.n0 == null && dl3Var.m0 == null) ? false : true;
        }
    }
}
