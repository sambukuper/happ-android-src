package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lq7 extends u77 implements mh7 {
    @Override // defpackage.mh7
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.j0;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.k0 + ((long) ((int) ((r() + ((long) this.m0)) - this.k0)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void y(int i) {
        synchronized (this) {
            Object[] objArr = this.j0;
            objArr.getClass();
            g(Integer.valueOf(((Number) objArr[((int) ((this.k0 + ((long) ((int) ((r() + ((long) this.m0)) - this.k0)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
