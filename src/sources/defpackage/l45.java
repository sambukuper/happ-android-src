package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l45 {
    public final kc6 a = new kc6("^(.+):(\\d+)$");

    /* JADX WARN: Code duplicated, block: B:36:0x008c A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x009e, B:39:0x00a4, B:40:0x00ad, B:36:0x008c), top: B:56:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:31:0x007c, B:33:0x0082, B:35:0x0088, B:37:0x009e, B:39:0x00a4, B:40:0x00ad, B:36:0x008c), top: B:56:0x007c }] */
    public final k45 a(SubscriptionItem subscriptionItem, String str) {
        Object rj6Var;
        fq4 fq4VarA;
        String str2;
        if (str.length() == 0) {
            return e45.a;
        }
        if (!subscriptionItem.b0()) {
            return i45.a;
        }
        String strM = subscriptionItem.m();
        String authority = Uri.parse(strM).getAuthority();
        String strDecode = Uri.decode(str);
        strDecode.getClass();
        String strY0 = fm7.y0(fm7.x0("https://", fm7.x0("http://", strDecode)), "/");
        if (fm7.d0(strY0, "/", false) || fm7.d0(strY0, "#", false)) {
            return new g45(strY0);
        }
        kc6 kc6Var = this.a;
        if (kc6Var.d(strY0) && (fq4VarA = kc6.a(kc6Var, strY0)) != null && (str2 = (String) wv0.u0(1, fq4VarA.a())) != null) {
            strY0 = str2;
        }
        if (dh3.f(authority, strY0)) {
            return h45.a;
        }
        MetaParams metaParams = subscriptionItem.getMetaParams();
        if ((metaParams != null ? metaParams.getHost() : null) != null) {
            try {
                if (subscriptionItem.T() != null) {
                    MetaParams metaParams2 = subscriptionItem.getMetaParams();
                    if (metaParams2 != null) {
                        metaParams2.F1(strY0);
                    }
                } else {
                    String string = rp7.h(Uri.parse(strM), strY0).toString();
                    string.getClass();
                    subscriptionItem.w0(string);
                }
                if (subscriptionItem.getEncryptedUrl()) {
                    subscriptionItem.j0(false);
                    subscriptionItem.k0(null);
                    subscriptionItem.n0(true);
                }
                rj6Var = dn8.a;
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
        } else {
            String string2 = rp7.h(Uri.parse(strM), strY0).toString();
            string2.getClass();
            subscriptionItem.w0(string2);
            if (subscriptionItem.getEncryptedUrl()) {
                subscriptionItem.j0(false);
                subscriptionItem.k0(null);
                subscriptionItem.n0(true);
            }
            rj6Var = dn8.a;
        }
        if (sj6.a(rj6Var) != null) {
            return f45.a;
        }
        return j45.a;
    }
}
