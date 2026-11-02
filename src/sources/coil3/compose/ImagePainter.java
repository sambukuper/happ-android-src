package coil3.compose;

import defpackage.d53;
import defpackage.fb;
import defpackage.lr;
import defpackage.og5;
import defpackage.p61;
import defpackage.sv1;
import defpackage.wl6;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/ImagePainter;", "Log5;", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImagePainter extends og5 {
    public final d53 h0;

    public ImagePainter(d53 d53Var) {
        this.h0 = d53Var;
    }

    @Override // defpackage.og5
    public final long h() {
        d53 d53Var = this.h0;
        int iB = d53Var.b();
        float f = iB > 0 ? iB : Float.NaN;
        int iA = d53Var.a();
        return (((long) Float.floatToRawIntBits(iA > 0 ? iA : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    @Override // defpackage.og5
    public final void i(sv1 sv1Var) {
        d53 d53Var = this.h0;
        int iB = d53Var.b();
        float fIntBitsToFloat = iB > 0 ? Float.intBitsToFloat((int) (sv1Var.e() >> 32)) / iB : 1.0f;
        int iA = d53Var.a();
        float fIntBitsToFloat2 = iA > 0 ? Float.intBitsToFloat((int) (sv1Var.e() & 4294967295L)) / iA : 1.0f;
        lr lrVarN0 = sv1Var.n0();
        long jP = lrVarN0.p();
        lrVarN0.k().g();
        try {
            ((wl6) lrVarN0.Y).U(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            d53Var.d(fb.b(sv1Var.n0().k()));
        } finally {
            p61.w(lrVarN0, jP);
        }
    }
}
