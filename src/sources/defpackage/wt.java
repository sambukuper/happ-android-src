package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wt extends s1 {
    public int Z = -1;
    public final /* synthetic */ xt f0;

    public wt(xt xtVar) {
        this.f0 = xtVar;
    }

    @Override // defpackage.s1
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.Z + 1;
            this.Z = i;
            objArr = this.f0.X;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.X = (byte) 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.Y = obj;
        this.X = (byte) 1;
    }
}
