package defpackage;

import java.io.PrintWriter;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc2 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ rc2(long j, lh7 lh7Var) {
        this.X = (byte) 2;
        this.Y = j;
        this.Z = lh7Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        long j = this.Y;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.Z;
        switch (b) {
            case 0:
                ((PrintWriter) obj).println(new Date() + " stories title:" + ((ga1) obj2).X + " expire:" + j);
                break;
            case 1:
                z54 z54Var = (z54) obj2;
                z54Var.d(hf3.b(((hf3) ((oi) obj).d()).a, j));
                z54Var.c.invoke();
                break;
            default:
                sv1.k0((sv1) obj, this.Y, 0L, 0L, x97.m(((Number) ((lh7) obj2).getValue()).floatValue(), 0.0f, 1.0f), 118);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ rc2(Object obj, long j, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = j;
    }
}
