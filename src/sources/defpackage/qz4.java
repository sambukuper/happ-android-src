package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qz4 implements dn2 {
    public final /* synthetic */ byte X;
    public final rz4 Y;

    public /* synthetic */ qz4(rz4 rz4Var, byte b) {
        this.X = b;
        this.Y = rz4Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() throws IOException {
        byte b = this.X;
        rz4 rz4Var = this.Y;
        switch (b) {
            case 0:
                qs0 qs0Var = rz4Var.Y;
                yy3 yy3VarB = va0.b(qs0Var);
                if (yy3VarB != null) {
                    return yy3VarB;
                }
                throw new p14("Builtin class metadata not found for " + qs0Var + '.');
            case 1:
                li8 li8Var = li8.d;
                ArrayList arrayList = ((yy3) rz4Var.Z.getValue()).c;
                ev3 ev3Var = rz4Var.X;
                return hw7.a(arrayList, null, ev3Var, ia6.d(zc1.M(ev3Var)));
            default:
                ArrayList arrayList2 = ((yy3) rz4Var.Z.getValue()).d;
                ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(ys0.a0((mz3) it.next(), ia6.d(zc1.M(rz4Var.X)), (li8) rz4Var.f0.getValue(), null, 12));
                }
                return arrayList3;
        }
    }
}
