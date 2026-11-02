package defpackage;

import su.happ.proxyutility.domain.routing.entity.StateExportProfile;
import su.happ.proxyutility.domain.routing.entity.StateExportProfile$Success;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class jp7 extends uy7 implements rn2 {
    public byte g0;
    public final /* synthetic */ StateExportProfile h0;
    public final /* synthetic */ np7 i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp7(StateExportProfile stateExportProfile, np7 np7Var, q51 q51Var) {
        super(2, q51Var);
        this.h0 = stateExportProfile;
        this.i0 = np7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new jp7(this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r5.i(defpackage.wn7.a, r7) == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r5.i(defpackage.xn7.a, r7) == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r5.i(r0, r7) == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        byte b = this.g0;
        if (b == 0) {
            w39.n0(obj);
            StateExportProfile stateExportProfile = this.h0;
            boolean z = stateExportProfile instanceof StateExportProfile.Error;
            np7 np7Var = this.i0;
            c71 c71Var = c71.X;
            if (z) {
                this.g0 = (byte) 1;
            } else if (stateExportProfile instanceof StateExportProfile.NoProfileSelected) {
                this.g0 = (byte) 2;
            } else {
                if (!(stateExportProfile instanceof StateExportProfile$Success)) {
                    b61.c();
                    return null;
                }
                String value = ((StateExportProfile$Success) stateExportProfile).getValue();
                value.getClass();
                yn7 yn7Var = new yn7(value);
                this.g0 = (byte) 3;
            }
        } else {
            if (b != 1 && b != 2 && b != 3) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
