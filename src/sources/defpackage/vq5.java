package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vq5 implements o66, tq5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vq5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.o66
    public final qr6 b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((br5) obj).a;
            default:
                return ((cx7) obj).a;
        }
    }

    @Override // defpackage.tq5
    public final Object d(String str, gn2 gn2Var, s51 s51Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((br5) obj).d(str, gn2Var, s51Var);
            default:
                return ((cx7) obj).d(str, gn2Var, s51Var);
        }
    }
}
