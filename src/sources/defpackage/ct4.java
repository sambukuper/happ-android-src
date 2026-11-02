package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ct4 implements jq0 {
    public final /* synthetic */ byte a;
    public final String b;

    public /* synthetic */ ct4(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // defpackage.jq0
    public final String a() {
        byte b = this.a;
        return this.b;
    }

    @Override // defpackage.jq0
    public final /* bridge */ String c(dl3 dl3Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return nr4.F(this, dl3Var);
    }
}
