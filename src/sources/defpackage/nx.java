package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nx extends g24 implements dn2 {
    public static final nx Z;
    public static final nx f0;
    public static final nx g0;
    public final /* synthetic */ byte Y;

    static {
        int i = 0;
        Z = new nx((byte) 0, i);
        f0 = new nx((byte) 1, i);
        g0 = new nx((byte) 2, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx(byte b, int i) {
        super(i);
        this.Y = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        switch (this.Y) {
            case 0:
                return new px();
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
