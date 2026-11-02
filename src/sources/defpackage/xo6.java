package defpackage;

import su.happ.proxyutility.domain.routing.entity.StateCreateProfile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xo6 extends uy7 implements rn2 {
    public byte g0;
    public final /* synthetic */ ep6 h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ String j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo6(ep6 ep6Var, String str, String str2, q51 q51Var) {
        super(2, q51Var);
        this.h0 = ep6Var;
        this.i0 = str;
        this.j0 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new xo6(this.h0, this.i0, this.j0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r10.k(defpackage.wn6.a, r12) == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r10.k(r2, r12) == r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (r10.k(defpackage.xn6.a, r12) == r11) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        byte b = this.g0;
        String str = this.j0;
        ep6 ep6Var = this.h0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            this.g0 = (byte) 1;
            obj = ep6Var.e().e(this.i0, str, new fn6[0], this);
            if (obj != c71Var) {
            }
            return c71Var;
        }
        if (b == 1) {
            w39.n0(obj);
        } else if (b == 2 || b == 3) {
            w39.n0(obj);
        } else {
            if (b != 4) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            ep6Var.j(true);
        }
        return dn8.a;
        StateCreateProfile.DuplicatedName duplicatedName = (StateCreateProfile) obj;
        if ((duplicatedName instanceof StateCreateProfile.Create) || (duplicatedName instanceof StateCreateProfile.Ignored)) {
            ep6Var.h();
        } else {
            if (!(duplicatedName instanceof StateCreateProfile.EmptyName)) {
                if ((duplicatedName instanceof StateCreateProfile.InvalidDeeplink) || (duplicatedName instanceof StateCreateProfile.UnknownError)) {
                    ep6Var.h();
                    this.g0 = (byte) 3;
                } else {
                    if (!(duplicatedName instanceof StateCreateProfile.DuplicatedName)) {
                        b61.c();
                        return null;
                    }
                    ep6Var.h();
                    StateCreateProfile.DuplicatedName duplicatedName2 = duplicatedName;
                    vn6 vn6Var = new vn6(duplicatedName2.e(), duplicatedName2.g(), str, duplicatedName2.k(), duplicatedName2.d());
                    this.g0 = (byte) 4;
                }
                return c71Var;
            }
            this.g0 = (byte) 2;
        }
        return dn8.a;
    }
}
