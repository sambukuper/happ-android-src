package defpackage;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zr1 extends uy7 implements rn2 {
    public byte g0;
    public final /* synthetic */ long h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ br1 j0;
    public final /* synthetic */ short k0;
    public final /* synthetic */ gn2 l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ LinkedHashMap n0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public zr1(long j, String str, br1 br1Var, long j2, gn2 gn2Var, String str2, LinkedHashMap linkedHashMap, q51 q51Var) {
        super(2, q51Var);
        this.h0 = j;
        this.i0 = str;
        this.j0 = br1Var;
        this.k0 = (int) j2;
        this.l0 = gn2Var;
        this.m0 = str2;
        this.n0 = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new zr1(this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r13 == r4) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws NoSuchAlgorithmException, InvalidKeyException {
        zr1 zr1Var;
        byte b = this.g0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            long j = this.h0;
            if (j > 0) {
                this.g0 = (byte) 1;
                if (u70.F(j, this) != c71Var) {
                }
            }
            return c71Var;
        }
        if (b == 1) {
            w39.n0(obj);
        } else {
            if (b != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            zr1Var = this;
        }
        n28 n28Var = (n28) obj;
        zr1Var.l0.B("domainStr:" + zr1Var.m0 + " result:" + n28Var);
        int i = yr1.a[n28Var.b.ordinal()];
        dn8 dn8Var = dn8.a;
        if (i != 1) {
            return dn8Var;
        }
        Integer num = n28Var.c;
        if (num == null) {
            return null;
        }
        zr1Var.n0.put(n28Var.a, new Integer(num.intValue()));
        return dn8Var;
        bs1 bs1Var = bs1.a;
        long j2 = this.k0;
        this.g0 = (byte) 2;
        zr1Var = this;
        obj = bs1Var.c(this.i0, this.j0, j2, this.l0, zr1Var);
    }
}
