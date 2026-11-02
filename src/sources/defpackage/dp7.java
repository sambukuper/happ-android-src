package defpackage;

import su.happ.proxyutility.domain.routing.entity.StateCreateProfile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class dp7 extends uy7 implements rn2 {
    public byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ np7 i0;
    public final /* synthetic */ String j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp7(np7 np7Var, String str, q51 q51Var) {
        super(2, q51Var);
        this.i0 = np7Var;
        this.j0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        dp7 dp7Var = new dp7(this.i0, this.j0, q51Var);
        dp7Var.h0 = obj;
        return dp7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r6.i(defpackage.un7.a, r21) == r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (r6.i(r15, r21) == r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        if (r6.i(defpackage.vn7.a, r21) == r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        if (r6.j(r8, r21) == r14) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object objT;
        np7 np7Var = this.i0;
        h76 h76Var = np7Var.f;
        b71 b71Var = (b71) this.h0;
        byte b = this.g0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            mn6 mn6VarF = np7Var.f();
            String str = ((qn7) h76Var.X.getValue()).a;
            fn6[] fn6VarArr = {np7Var.d};
            this.h0 = b71Var;
            this.g0 = (byte) 1;
            vz7 vz7Var = mn6.j;
            objT = mn6VarF.t(this.j0, str, fn6VarArr, false, this);
            if (objT != c71Var) {
            }
            return c71Var;
        }
        if (b == 1) {
            w39.n0(obj);
            objT = obj;
        } else {
            if (b != 2 && b != 3 && b != 4 && b != 5) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
        StateCreateProfile.DuplicatedName duplicatedName = (StateCreateProfile) objT;
        if ((duplicatedName instanceof StateCreateProfile.Create) || (duplicatedName instanceof StateCreateProfile.Ignored)) {
            this.h0 = null;
            this.g0 = (byte) 2;
        } else if (duplicatedName instanceof StateCreateProfile.EmptyName) {
            this.h0 = null;
            this.g0 = (byte) 3;
        } else if ((duplicatedName instanceof StateCreateProfile.InvalidDeeplink) || (duplicatedName instanceof StateCreateProfile.UnknownError)) {
            this.h0 = null;
            this.g0 = (byte) 4;
        } else {
            if (!(duplicatedName instanceof StateCreateProfile.DuplicatedName)) {
                b61.c();
                return null;
            }
            StateCreateProfile.DuplicatedName duplicatedName2 = duplicatedName;
            tn7 tn7Var = new tn7(duplicatedName2.e(), duplicatedName2.g(), ((qn7) h76Var.X.getValue()).a, duplicatedName2.k(), duplicatedName2.d());
            this.h0 = null;
            this.g0 = (byte) 5;
        }
    }
}
