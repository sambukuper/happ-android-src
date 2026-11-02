package defpackage;

import java.util.Arrays;
import su.happ.proxyutility.dto.SocketServerInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class u17 {
    public final qo a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u17(qo qoVar) {
        qoVar.getClass();
        this.a = qoVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(SocketServerInfo socketServerInfo, String[] strArr, s51 s51Var) {
        r17 r17Var;
        if (s51Var instanceof r17) {
            r17Var = (r17) s51Var;
            int i = r17Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                r17Var.h0 = i - Integer.MIN_VALUE;
            } else {
                r17Var = new r17(this, s51Var);
            }
        } else {
            r17Var = new r17(this, s51Var);
        }
        Object obj = r17Var.f0;
        int i2 = r17Var.h0;
        if (i2 != 0) {
            if (i2 == 1) {
                w39.n0(obj);
                return ((sj6) obj).X;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        String uid = socketServerInfo.getUid();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        r17Var.h0 = 1;
        Object objL = this.a.l(uid, strArr2, r17Var);
        c71 c71Var = c71.X;
        return objL == c71Var ? c71Var : objL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(SocketServerInfo socketServerInfo, String[] strArr, s51 s51Var) {
        s17 s17Var;
        if (s51Var instanceof s17) {
            s17Var = (s17) s51Var;
            int i = s17Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                s17Var.h0 = i - Integer.MIN_VALUE;
            } else {
                s17Var = new s17(this, s51Var);
            }
        } else {
            s17Var = new s17(this, s51Var);
        }
        Object objN = s17Var.f0;
        int i2 = s17Var.h0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objN);
            t17 t17Var = new t17(socketServerInfo, strArr, q51Var, (byte) 0);
            s17Var.h0 = 1;
            objN = gv3.n(t17Var, s17Var);
            c71 c71Var = c71.X;
            if (objN == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objN);
        }
        return ((sj6) objN).X;
    }
}
