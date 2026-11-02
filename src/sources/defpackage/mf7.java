package defpackage;

import java.io.Closeable;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class mf7 extends s51 {
    public String f0;
    public Closeable g0;
    public Socket h0;
    public q15 i0;
    public int j0;
    public int k0;
    public long l0;
    public /* synthetic */ Object m0;
    public final /* synthetic */ of7 n0;
    public int o0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf7(of7 of7Var, s51 s51Var) {
        super(s51Var);
        this.n0 = of7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        this.m0 = obj;
        this.o0 |= Integer.MIN_VALUE;
        return this.n0.c(null, 0, this);
    }
}
