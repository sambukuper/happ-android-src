package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qc3 implements g44, Serializable {
    public final Object X;

    public qc3(Object obj) {
        this.X = obj;
    }

    @Override // defpackage.g44
    public final boolean d() {
        return true;
    }

    @Override // defpackage.g44
    public final Object getValue() {
        return this.X;
    }

    public final String toString() {
        return String.valueOf(this.X);
    }
}
