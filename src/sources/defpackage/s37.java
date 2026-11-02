package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s37 implements Serializable {
    public static final u37[] f0 = new u37[0];
    public static final kx5[] g0 = new kx5[0];
    public final u37[] X;
    public final u37[] Y;
    public final kx5[] Z;

    public s37(u37[] u37VarArr, u37[] u37VarArr2, kx5[] kx5VarArr) {
        u37[] u37VarArr3 = f0;
        this.X = u37VarArr == null ? u37VarArr3 : u37VarArr;
        this.Y = u37VarArr2 == null ? u37VarArr3 : u37VarArr2;
        this.Z = kx5VarArr == null ? g0 : kx5VarArr;
    }

    public final boolean a() {
        return this.Z.length > 0;
    }

    public final lt b() {
        return new lt(this.Z);
    }
}
