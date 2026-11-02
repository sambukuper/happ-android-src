package defpackage;

import su.happ.proxyutility.domain.routing.entity.StateCreateProfile;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cp7 extends uy7 implements rn2 {
    public byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ np7 i0;
    public final /* synthetic */ String j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp7(np7 np7Var, String str, q51 q51Var) {
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
        cp7 cp7Var = new cp7(this.i0, this.j0, q51Var);
        cp7Var.h0 = obj;
        return cp7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r1.i(defpackage.un7.a, r29) == r12) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (r1.i(r13, r29) == r12) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        if (r1.i(defpackage.vn7.a, r29) == r12) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0159, code lost:
    
        if (r1.j(r4, r29) == r12) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object objE;
        Object value;
        Object value2;
        Object value3;
        np7 np7Var = this.i0;
        h76 h76Var = np7Var.f;
        oh7 oh7Var = np7Var.e;
        b71 b71Var = (b71) this.h0;
        byte b = this.g0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            this.h0 = b71Var;
            this.g0 = (byte) 1;
            objE = np7Var.f().e(this.j0, ((qn7) h76Var.X.getValue()).a, new fn6[0], this);
            if (objE != c71Var) {
            }
            return c71Var;
        }
        if (b == 1) {
            w39.n0(obj);
            objE = obj;
        } else {
            if (b != 2 && b != 3 && b != 4 && b != 5) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
        StateCreateProfile.DuplicatedName duplicatedName = (StateCreateProfile) objE;
        if ((duplicatedName instanceof StateCreateProfile.Create) || (duplicatedName instanceof StateCreateProfile.Ignored)) {
            oh7Var.getClass();
            do {
                value = oh7Var.getValue();
            } while (!oh7Var.k(value, qn7.a((qn7) value, null, null, false, false, false, null, null, false, null, null, false, false, false, null, 30719)));
            this.h0 = null;
            this.g0 = (byte) 2;
        } else if (duplicatedName instanceof StateCreateProfile.EmptyName) {
            this.h0 = null;
            this.g0 = (byte) 3;
        } else if ((duplicatedName instanceof StateCreateProfile.InvalidDeeplink) || (duplicatedName instanceof StateCreateProfile.UnknownError)) {
            oh7Var.getClass();
            do {
                value2 = oh7Var.getValue();
            } while (!oh7Var.k(value2, qn7.a((qn7) value2, null, null, false, false, false, null, null, false, null, null, false, false, false, null, 30719)));
            this.h0 = null;
            this.g0 = (byte) 4;
        } else {
            if (!(duplicatedName instanceof StateCreateProfile.DuplicatedName)) {
                b61.c();
                return null;
            }
            oh7Var.getClass();
            do {
                value3 = oh7Var.getValue();
            } while (!oh7Var.k(value3, qn7.a((qn7) value3, null, null, false, false, false, null, null, false, null, null, false, false, false, null, 30719)));
            StateCreateProfile.DuplicatedName duplicatedName2 = duplicatedName;
            tn7 tn7Var = new tn7(duplicatedName2.e(), duplicatedName2.g(), ((qn7) h76Var.X.getValue()).a, duplicatedName2.k(), duplicatedName2.d());
            this.h0 = null;
            this.g0 = (byte) 5;
        }
    }
}
