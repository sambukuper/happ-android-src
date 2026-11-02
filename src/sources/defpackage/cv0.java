package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cv0 extends pu {
    public final /* synthetic */ byte B;
    public final Object C;

    public /* synthetic */ cv0(Object obj, byte b) {
        this.B = b;
        this.C = obj;
    }

    @Override // defpackage.pu
    public final int u() {
        byte b = this.B;
        Object obj = this.C;
        switch (b) {
            case 0:
                return ((char[]) obj).length;
            case 1:
                return ((int[]) obj).length;
            default:
                return ((byte[]) obj).length;
        }
    }

    @Override // defpackage.pu
    public final int v(int i) {
        byte b = this.B;
        Object obj = this.C;
        switch (b) {
            case 0:
                return ((char[]) obj)[i];
            case 1:
                return ((int[]) obj)[i];
            default:
                return ((byte[]) obj)[i] & 255;
        }
    }
}
