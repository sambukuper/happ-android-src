package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class io3 implements Serializable {
    public static final int k0;
    public static final int l0;
    public static final r37 m0;
    public final int X;
    public final int Y;
    public final sq3 Z;
    public z75 f0;
    public final md0 g0;
    public final md0 h0;
    public final r37 i0;
    public final char j0;

    static {
        int iB = 0;
        for (int i : p61.G(5)) {
            if (i == 0) {
                throw null;
            }
            iB |= ie2.b(i);
        }
        k0 = iB;
        for (fq3 fq3Var : fq3.values()) {
            boolean z = fq3Var.X;
        }
        int i2 = 0;
        for (qo3 qo3Var : qo3.values()) {
            if (qo3Var.X) {
                i2 |= qo3Var.Y;
            }
        }
        l0 = i2;
        m0 = new r37(" ");
    }

    public io3(np3 np3Var) {
        System.currentTimeMillis();
        boolean z = false;
        new AtomicReference(new ra((byte) 7, z));
        this.X = k0;
        this.Y = l0;
        this.i0 = m0;
        this.Z = sq3.Z;
        this.f0 = np3Var;
        this.j0 = '\"';
        this.h0 = md0.g0;
        this.g0 = md0.Z;
        System.identityHashCode(this);
        new AtomicReference(new ra((byte) 11, z));
    }
}
