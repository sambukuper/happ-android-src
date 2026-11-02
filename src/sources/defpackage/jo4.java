package defpackage;

import su.happ.proxyutility.domain.routing.entity.StateCreateProfile;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jo4 extends uy7 implements rn2 {
    public byte g0;
    public final /* synthetic */ MainViewModel h0;
    public final /* synthetic */ String i0;
    public final /* synthetic */ String j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo4(q51 q51Var, String str, String str2, MainViewModel mainViewModel) {
        super(2, q51Var);
        this.h0 = mainViewModel;
        this.i0 = str;
        this.j0 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new jo4(q51Var, this.i0, this.j0, this.h0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r15.z(defpackage.cn4.a, r16) == r10) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object objT;
        byte b = this.g0;
        String str = this.j0;
        MainViewModel mainViewModel = this.h0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            this.g0 = (byte) 1;
            vz7 vz7Var = mn6.j;
            objT = ((mn6) mainViewModel.l.getValue()).t(this.i0, str, new fn6[0], false, this);
            if (objT != c71Var) {
            }
            return c71Var;
        }
        if (b == 1) {
            w39.n0(obj);
            objT = obj;
        } else if (b == 2 || b == 3 || b == 4) {
            w39.n0(obj);
        } else {
            if (b != 5) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            mainViewModel.x(true);
        }
        return dn8.a;
        StateCreateProfile.DuplicatedName duplicatedName = (StateCreateProfile) objT;
        if ((duplicatedName instanceof StateCreateProfile.Create) || (duplicatedName instanceof StateCreateProfile.Ignored)) {
            this.g0 = (byte) 2;
            if (mainViewModel.z(en4.a, this) == c71Var) {
                return c71Var;
            }
        } else if (duplicatedName instanceof StateCreateProfile.EmptyName) {
            this.g0 = (byte) 3;
        } else if ((duplicatedName instanceof StateCreateProfile.InvalidDeeplink) || (duplicatedName instanceof StateCreateProfile.UnknownError)) {
            this.g0 = (byte) 4;
            if (mainViewModel.z(dn4.a, this) == c71Var) {
                return c71Var;
            }
        } else {
            if (!(duplicatedName instanceof StateCreateProfile.DuplicatedName)) {
                b61.c();
                return null;
            }
            StateCreateProfile.DuplicatedName duplicatedName2 = duplicatedName;
            bn4 bn4Var = new bn4(duplicatedName2.e(), duplicatedName2.g(), duplicatedName2.k(), str, duplicatedName2.d());
            this.g0 = (byte) 5;
            if (mainViewModel.z(bn4Var, this) == c71Var) {
                return c71Var;
            }
            mainViewModel.x(true);
        }
        return dn8.a;
    }
}
