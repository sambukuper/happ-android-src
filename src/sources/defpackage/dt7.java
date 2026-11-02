package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import su.happ.proxyutility.dto.enums.SubscriptionSortType;
import su.happ.proxyutility.receiver.WidgetProvider;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class dt7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(SubscriptionSortType subscriptionSortType, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        subscriptionSortType.getClass();
        gn2Var.getClass();
        lp2Var.X(1433628575);
        int i2 = (i & 6) == 0 ? (lp2Var.d(subscriptionSortType.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 256 : 128;
        }
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            FillElement fillElement = b.a;
            String[] stringArray = ((Resources) lp2Var.j(pc.c)).getStringArray(m26.subscription_config_sort_type);
            boolean zF = lp2Var.f(stringArray);
            Object objK = lp2Var.K();
            if (zF || objK == zz0.a) {
                qm5 qm5VarC = ec7.Y.c();
                for (String str : stringArray) {
                    qm5VarC.add(new ox2(str));
                }
                objK = qm5VarC.c();
                lp2Var.g0(objK);
            }
            j2 j2Var = (j2) objK;
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            ci8.a(b.a, vj8.j0(y46.sub_properties_server_sort_title, lp2Var), jm4.U(-1342928907, new h64(subscriptionSortType, j2Var, gn2Var, fillElement), lp2Var), lp2Var, 390, 0);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(subscriptionSortType, gn2Var, kx4Var, i, (byte) 20);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(LinearLayout linearLayout, View view) {
        while (view != null) {
            if (view == linearLayout) {
                return true;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final u27 c(BufferedReader bufferedReader) {
        return new t21(new hu(bufferedReader, (byte) 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ArrayList d(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : c(bufferedReader)) {
                str.getClass();
                arrayList.add(str);
            }
            bufferedReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                oc.h(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String e(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(Context context, Integer num) {
        context.sendBroadcast(new Intent(context.getApplicationContext(), (Class<?>) WidgetProvider.class).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class))).putExtra("key", num));
    }

    public abstract zk6 g(jh8 jh8Var, x14 x14Var);
}
