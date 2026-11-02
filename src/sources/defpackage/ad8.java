package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ad8 extends w55 {
    public final x90 f;
    public og7 g;

    public ad8(sy6 sy6Var, yy0 yy0Var, fi1 fi1Var) {
        super(sy6Var, yy0Var, fi1Var);
        this.f = gv3.b(Integer.MAX_VALUE, null, null, 6);
    }

    public static yc8 e(x90 x90Var) {
        yc8 yc8Var = null;
        v27 v27VarP = jm4.P(new d(new py4(x90Var, (byte) 1), null));
        while (v27VarP.hasNext()) {
            yc8 yc8VarA = (yc8) v27VarP.next();
            if (yc8Var != null) {
                yc8VarA = yc8Var.a(yc8VarA);
            }
            yc8Var = yc8VarA;
        }
        return yc8Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
    
        if (r16.b.K(r0, r6) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.sy6 r17, defpackage.yc8 r18, defpackage.s51 r19) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad8.c(sy6, yc8, s51):java.lang.Object");
    }

    public final boolean d(aq5 aq5Var) {
        boolean z;
        boolean z2;
        boolean z3;
        x90 x90Var;
        sy6 sy6Var;
        hq5 hq5Var = (hq5) wv0.t0(aq5Var.a);
        if (hq5Var != null) {
            List listB = hq5Var.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                x90Var = this.f;
                sy6Var = this.a;
                if (i >= size) {
                    break;
                }
                m03 m03Var = (m03) listB.get(i);
                long j = m03Var.d ^ (-9223372034707292160L);
                if (!(sy6Var.j(sy6Var.f(j)) == 0.0f)) {
                    z3 = !(x90Var.b(new yc8(j, m03Var.a, false)) instanceof tp0) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = hq5Var.l ^ (-9223372034707292160L);
            boolean z4 = aq5Var.f == 12;
            if (!(sy6Var.j(sy6Var.f(j2)) == 0.0f) || z4) {
                if (!(x90Var.b(new yc8(j2, hq5Var.b, z4)) instanceof tp0) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
