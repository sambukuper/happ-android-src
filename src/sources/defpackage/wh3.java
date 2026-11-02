package defpackage;

import su.happ.proxyutility.dto.AdditionalInfoCode;
import su.happ.proxyutility.dto.AdditionalInfoCode$$serializer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class wh3 implements dq2 {
    public static final wh3 a;
    private static final e37 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        wh3 wh3Var = new wh3();
        a = wh3Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.util.InvalidSystemTimeInterceptor.JwtResponse", wh3Var, 1);
        zp5Var.k("additional_info_code", true);
        descriptor = zp5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ol7 ol7Var, Object obj) {
        yh3 yh3Var = (yh3) obj;
        yh3Var.getClass();
        AdditionalInfoCode additionalInfoCode = yh3Var.a;
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        if (ol7VarA.w(e37Var) || additionalInfoCode != null) {
            ol7VarA.p(e37Var, 0, AdditionalInfoCode$$serializer.INSTANCE, additionalInfoCode);
        }
        ol7VarA.v(e37Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: fn8 */
    public final Object b(rd1 rd1Var) throws fn8 {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        AdditionalInfoCode additionalInfoCode = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else {
                if (iE != 0) {
                    throw new fn8(iE);
                }
                additionalInfoCode = (AdditionalInfoCode) f01VarT.x(e37Var, 0, AdditionalInfoCode$$serializer.INSTANCE, additionalInfoCode);
                i = 1;
            }
        }
        f01VarT.n(e37Var);
        return new yh3(i, additionalInfoCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ow3[] c() {
        return new ow3[]{zc1.Q(AdditionalInfoCode$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e37 d() {
        return descriptor;
    }
}
