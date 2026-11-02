package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wx0 implements q51 {
    public static final wx0 Y = new wx0(0);
    public static final wx0 Z = new wx0(1);
    public final /* synthetic */ byte X;

    public /* synthetic */ wx0(byte b) {
        this.X = b;
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        switch (this.X) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.X) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.q51
    public final s61 w() {
        switch (this.X) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return b02.X;
        }
    }

    private final void a(Object obj) {
    }
}
