package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface lu8 extends mu8 {
    @Override // defpackage.ju8
    default long d(wk wkVar, wk wkVar2, wk wkVar3) {
        return ((long) (x() + v())) * 1000000;
    }

    int v();

    int x();
}
