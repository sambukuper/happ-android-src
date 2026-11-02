package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.gson.a;
import com.tencent.mmkv.MMKV;
import defpackage.an7;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.util.SubBlacklistUtil$mMsgReceiver$1;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class an7 {
    public static final List g = i21.L(new String[]{"https://cdn.jsdelivr.net/gh/Happ-proxy/app_domain@main/list.json", "https://raw.githubusercontent.com/Happ-proxy/app_domain/refs/heads/main/list.json"});
    public final HappApplication a;
    public final m51 b;
    public final vz7 c;
    public final SubBlacklistUtil$mMsgReceiver$1 d;
    public Set e;
    public os1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [su.happ.proxyutility.util.SubBlacklistUtil$mMsgReceiver$1] */
    public an7(HappApplication happApplication) {
        this.a = happApplication;
        happApplication.getApplicationContext();
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.b = gv3.c(g33.K(ow7VarB, dm4.a));
        this.c = new vz7(new r47((byte) 25));
        this.d = new BroadcastReceiver() { // from class: su.happ.proxyutility.util.SubBlacklistUtil$mMsgReceiver$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                context.getClass();
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key", 0)) : null;
                if (numValueOf != null && numValueOf.intValue() == 31) {
                    an7 an7Var = this.a;
                    jm4.Q(an7Var.b, (u61) null, new tk0(an7Var, (q51) null, (byte) 6), 3);
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, s51 s51Var) {
        wm7 wm7Var;
        HashSet rj6Var;
        Object objC;
        if (s51Var instanceof wm7) {
            wm7Var = (wm7) s51Var;
            int i = wm7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                wm7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                wm7Var = new wm7(this, s51Var);
            }
        } else {
            wm7Var = new wm7(this, s51Var);
        }
        Object obj = wm7Var.f0;
        int i2 = wm7Var.h0;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                e72 e72Var = (e72) this.a.z0.getValue();
                wm7Var.h0 = 1;
                objC = e72Var.c(str, wm7Var);
                c71 c71Var = c71.X;
                if (objC == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                objC = ((sj6) obj).X;
            }
            w39.n0(objC);
            Object objC2 = new a().c(((pr) objC).a, new yi8(String[].class));
            objC2.getClass();
            Object[] objArr = (Object[]) objC2;
            rj6Var = new HashSet(aq4.G(objArr.length));
            eu.I0(objArr, rj6Var);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            return null;
        }
        return rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:20:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable b(s51 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.xm7
            if (r0 == 0) goto L13
            r0 = r6
            xm7 r0 = (defpackage.xm7) r0
            int r1 = r0.i0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i0 = r1
            goto L18
        L13:
            xm7 r0 = new xm7
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.g0
            int r1 = r0.i0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            java.util.Iterator r1 = r0.f0
            w39.n0(r6)
            goto L51
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            bt.i(r5)
            return r3
        L2e:
            w39.n0(r6)
            java.util.List r6 = defpackage.an7.g
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
        L38:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.f0 = r1
            r0.i0 = r2
            java.io.Serializable r6 = r5.a(r6, r0)
            c71 r4 = c71.X
            if (r6 != r4) goto L51
            return r4
        L51:
            java.util.HashSet r6 = (java.util.HashSet) r6
            if (r6 == 0) goto L38
            return r6
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an7.b(s51):java.io.Serializable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(uy7 uy7Var) {
        nf1 nf1Var = tp1.a;
        Object objW = w51.W(ye1.Z, new ym7(this, null, (byte) 0), uy7Var);
        return objW == c71.X ? objW : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(s51 s51Var) {
        zm7 zm7Var;
        if (s51Var instanceof zm7) {
            zm7Var = (zm7) s51Var;
            int i = zm7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                zm7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                zm7Var = new zm7(this, s51Var);
            }
        } else {
            zm7Var = new zm7(this, s51Var);
        }
        Object objB = zm7Var.f0;
        int i2 = zm7Var.h0;
        if (i2 == 0) {
            w39.n0(objB);
            zm7Var.h0 = 1;
            objB = b(zm7Var);
            Object obj = c71.X;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objB);
        }
        HashSet hashSet = (HashSet) objB;
        dn8 dn8Var = dn8.a;
        if (hashSet == null) {
            return dn8Var;
        }
        vz7 vz7Var = this.c;
        ((MMKV) vz7Var.getValue()).n("pref_blacklist", hashSet);
        ((MMKV) vz7Var.getValue()).m(System.currentTimeMillis(), "pref_blacklist_last_update");
        return dn8Var;
    }
}
