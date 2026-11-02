package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 implements bd6 {
    public final /* synthetic */ byte X;
    public String Y;

    public jh0(String str) {
        this.X = (byte) 0;
        str.getClass();
        this.Y = str;
    }

    @Override // defpackage.bd6
    public void K(Object obj, ed6 ed6Var) {
        ((p43) obj).a(this.Y, ed6Var);
    }

    public String toString() {
        switch (this.X) {
            case 1:
                return this.Y;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jh0(String str, byte b) {
        this.X = b;
        this.Y = str;
    }
}
