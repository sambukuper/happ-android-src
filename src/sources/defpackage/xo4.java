package defpackage;

import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xo4 extends s51 {
    public String f0;
    public EPingType g0;
    public q15 h0;
    public boolean i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ MainViewModel k0;
    public int l0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo4(MainViewModel mainViewModel, s51 s51Var) {
        super(s51Var);
        this.k0 = mainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        this.j0 = obj;
        this.l0 |= Integer.MIN_VALUE;
        return this.k0.N(null, null, false, this);
    }
}
