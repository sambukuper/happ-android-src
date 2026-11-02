package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rt6 extends bt6 {
    @Override // defpackage.bt6, defpackage.ct6
    public final void e(gt6 gt6Var) throws gu6 {
        if (gt6Var instanceof qt6) {
            this.i.add(gt6Var);
            return;
        }
        throw new gu6("Text content elements cannot contain " + gt6Var + " elements.");
    }
}
