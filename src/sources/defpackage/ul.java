package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ul extends gl {
    public final yr2[] D0;

    public ul(pi8 pi8Var, yr2 yr2Var, yr2[] yr2VarArr) {
        super(pi8Var, yr2Var);
        this.D0 = yr2VarArr;
    }

    public final ll F0(int i) {
        dh8 dh8VarH0 = H0(i);
        yr2[] yr2VarArr = this.D0;
        return new ll(this, dh8VarH0, this.B0, (yr2VarArr == null || i < 0 || i >= yr2VarArr.length) ? null : yr2VarArr[i], i);
    }

    public abstract int G0();

    public abstract dh8 H0(int i);

    public abstract Class I0(int i);
}
