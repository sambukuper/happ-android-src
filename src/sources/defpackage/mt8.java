package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mt8 extends ct4 {
    public static final mt8 d = new mt8("must have no value parameters", 0);
    public static final mt8 e = new mt8("must have a single value parameter", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt8(String str, byte b) {
        super(str, (byte) 1);
        this.c = b;
    }

    @Override // defpackage.jq0
    public final boolean b(dl3 dl3Var) {
        switch (this.c) {
            case 0:
                return dl3Var.L().isEmpty();
            case 1:
                return dl3Var.L().size() == 1;
            default:
                return dl3Var.L().size() == 2;
        }
    }
}
