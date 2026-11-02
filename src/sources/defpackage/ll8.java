package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ll8 {
    public static final ll8 a = new ll8();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [byte[], java.io.Serializable] */
    public final Serializable a(byte[] bArr, String str, long j, jh4 jh4Var, s51 s51Var) throws te8.d {
        jl8 jl8Var;
        if (s51Var instanceof jl8) {
            jl8Var = (jl8) s51Var;
            int i = jl8Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jl8Var.h0 = i - Integer.MIN_VALUE;
            } else {
                jl8Var = new jl8(this, s51Var);
            }
        } else {
            jl8Var = new jl8(this, s51Var);
        }
        Object objX = jl8Var.f0;
        int i2 = jl8Var.h0;
        if (i2 == 0) {
            w39.n0(objX);
            hy6 hy6Var = new hy6(str, jh4Var, bArr, j, (q51) null);
            jl8Var.h0 = 1;
            objX = a28.x(j, hy6Var, jl8Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objX);
        }
        ?? r9 = (byte[]) objX;
        if (r9 != 0) {
            return r9;
        }
        throw new te8.d();
    }
}
