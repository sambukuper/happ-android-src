package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidComposeView;
import io.sentry.c2;
import java.io.Serializable;
import su.happ.proxyutility.dto.HashedDomain;
import su.happ.proxyutility.dto.InstallId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb extends no2 implements sn2 {
    public final /* synthetic */ byte X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.X = b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public Serializable W(String str, String str2, q51 q51Var) {
        wn wnVar;
        Object objD;
        xn xnVar;
        Object objE;
        yn ynVar;
        Object objD2;
        byte b = this.X;
        c71 c71Var = c71.X;
        switch (b) {
            case 1:
                if (q51Var instanceof wn) {
                    wnVar = (wn) q51Var;
                    int i = wnVar.h0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wnVar.h0 = i - Integer.MIN_VALUE;
                    } else {
                        wnVar = new wn(this, q51Var);
                    }
                } else {
                    wnVar = new wn(this, q51Var);
                }
                Object obj = wnVar.f0;
                int i2 = wnVar.h0;
                if (i2 == 0) {
                    w39.n0(obj);
                    qo qoVar = (qo) this.receiver;
                    wnVar.h0 = 1;
                    objD = qoVar.d(str, str2, wnVar);
                    if (objD == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i2 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                    objD = ((sj6) obj).X;
                }
                return new sj6(objD);
            case 2:
                if (q51Var instanceof xn) {
                    xnVar = (xn) q51Var;
                    int i3 = xnVar.h0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xnVar.h0 = i3 - Integer.MIN_VALUE;
                    } else {
                        xnVar = new xn(this, q51Var);
                    }
                } else {
                    xnVar = new xn(this, q51Var);
                }
                Object obj2 = xnVar.f0;
                int i4 = xnVar.h0;
                if (i4 == 0) {
                    w39.n0(obj2);
                    qo qoVar2 = (qo) this.receiver;
                    xnVar.h0 = 1;
                    objE = qoVar2.e(str, str2, xnVar);
                    if (objE == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i4 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj2);
                    objE = ((sj6) obj2).X;
                }
                return new sj6(objE);
            default:
                if (q51Var instanceof yn) {
                    ynVar = (yn) q51Var;
                    int i5 = ynVar.h0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ynVar.h0 = i5 - Integer.MIN_VALUE;
                    } else {
                        ynVar = new yn(this, q51Var);
                    }
                } else {
                    ynVar = new yn(this, q51Var);
                }
                Object obj3 = ynVar.f0;
                int i6 = ynVar.h0;
                if (i6 == 0) {
                    w39.n0(obj3);
                    qo qoVar3 = (qo) this.receiver;
                    ynVar.h0 = 1;
                    objD2 = qoVar3.d(str, str2, ynVar);
                    if (objD2 == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (i6 != 1) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj3);
                    objD2 = ((sj6) obj3).X;
                }
                return new sj6(objD2);
        }
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        Object value;
        e27 e27Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                if (obj != null) {
                    c2.m();
                    return null;
                }
                AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
                Class cls = AndroidComposeView.J1;
                Resources resources = androidComposeView.getContext().getResources();
                return Boolean.valueOf(jc.a.a(androidComposeView, null, new hz0(new ii1(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((ua7) obj2).a, (gn2) obj3)));
            case 1:
                return W(((InstallId) obj).getValue(), ((HashedDomain) obj2).getValue(), (q51) obj3);
            case 2:
                return W(((InstallId) obj).getValue(), ((HashedDomain) obj2).getValue(), (q51) obj3);
            case 3:
                return W(((InstallId) obj).getValue(), ((HashedDomain) obj2).getValue(), (q51) obj3);
            case 4:
                gn2 gn2Var = ((x90) this.receiver).Y;
                gn2Var.getClass();
                jm4.s(gn2Var, obj2, (s61) obj3);
                return dn8Var;
            case 5:
                Object obj4 = ((up0) obj2).a;
                gn2 gn2Var2 = ((x90) this.receiver).Y;
                gn2Var2.getClass();
                Object objA = up0.a(obj4);
                objA.getClass();
                jm4.s(gn2Var2, objA, (s61) obj3);
                return dn8Var;
            default:
                lv7 lv7Var = (lv7) obj;
                String str = lv7Var.a;
                mv7 mv7Var = (mv7) obj2;
                String str2 = mv7Var.a;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                str2.getClass();
                l27 l27Var = (l27) this.receiver;
                l27Var.getClass();
                oh7 oh7Var = l27Var.e;
                do {
                    value = oh7Var.getValue();
                    e27Var = (e27) value;
                } while (!oh7Var.k(value, e27.a(e27Var, null, zBooleanValue ? oc.z(e27Var.c, lv7Var) : oc.x(oc.x(e27Var.c, lv7Var), mv7Var), null, 11)));
                return dn8Var;
        }
    }
}
