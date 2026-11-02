package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a74 extends nx5 implements jw3 {
    public final /* synthetic */ byte X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a74(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.X = b;
    }

    @Override // defpackage.nd0
    public final xu3 S() {
        return yb6.a.f(this);
    }

    @Override // defpackage.nw3
    public final iw3 b() {
        return ((jw3) V()).b();
    }

    @Override // defpackage.jw3
    public final Object get() {
        switch (this.X) {
            case 0:
                return ((lh7) this.receiver).getValue();
            case 1:
                return this.receiver.getClass().getSimpleName();
            case 2:
                return ((lh7) this.receiver).getValue();
            case 3:
                return ((lh7) this.receiver).getValue();
            case 4:
                return ((lh7) this.receiver).getValue();
            default:
                return ((lh7) this.receiver).getValue();
        }
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return get();
    }
}
