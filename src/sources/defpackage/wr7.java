package defpackage;

import su.happ.proxyutility.dto.ImportResult;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wr7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ sn2 j0;
    public final /* synthetic */ String k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr7(sn2 sn2Var, String str, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = sn2Var;
        this.k0 = str;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        ImportResult importResult = (ImportResult) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((wr7) n(q51Var, importResult)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        String str = this.k0;
        sn2 sn2Var = this.j0;
        switch (b) {
            case 0:
                wr7 wr7Var = new wr7(sn2Var, str, q51Var, (byte) 0);
                wr7Var.i0 = obj;
                return wr7Var;
            default:
                wr7 wr7Var2 = new wr7(sn2Var, str, q51Var, (byte) 1);
                wr7Var2.i0 = obj;
                return wr7Var2;
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        String str = this.k0;
        sn2 sn2Var = this.j0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                ImportResult importResult = (ImportResult) this.i0;
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                if (sn2Var == null) {
                    return dn8Var;
                }
                this.i0 = null;
                this.h0 = true;
                return sn2Var.x(str, importResult, this) == c71Var ? c71Var : dn8Var;
            default:
                ImportResult importResult2 = (ImportResult) this.i0;
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                if (sn2Var == null) {
                    return dn8Var;
                }
                this.i0 = null;
                this.h0 = true;
                return sn2Var.x(str, importResult2, this) == c71Var ? c71Var : dn8Var;
        }
    }
}
