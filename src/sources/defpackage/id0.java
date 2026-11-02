package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class id0 {
    public static final w35 a(Response response) {
        ba0 bodySource;
        int iCode = response.code();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        Headers headers = response.headers();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (qg5 qg5Var : headers) {
            String str = (String) qg5Var.X;
            String str2 = (String) qg5Var.Y;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        q35 q35Var = new q35(zp4.Q(linkedHashMap));
        ResponseBody responseBodyBody = response.body();
        return new w35(iCode, jSentRequestAtMillis, jReceivedResponseAtMillis, q35Var, (responseBodyBody == null || (bodySource = responseBodyBody.getBodySource()) == null) ? null : new pe7(bodySource), response);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[LOOP:1: B:24:0x0083->B:26:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Request b(t35 t35Var, s51 s51Var) {
        hd0 hd0Var;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        t35 t35Var2;
        RequestBody requestBodyCreate$default;
        Headers.Builder builder3;
        String str2;
        Iterator it;
        if (s51Var instanceof hd0) {
            hd0Var = (hd0) s51Var;
            int i = hd0Var.g0;
            if ((i & Integer.MIN_VALUE) != 0) {
                hd0Var.g0 = i - Integer.MIN_VALUE;
            } else {
                hd0Var = new hd0(s51Var);
            }
        } else {
            hd0Var = new hd0(s51Var);
        }
        Object obj = hd0Var.f0;
        int i2 = hd0Var.g0;
        Request.Builder builder4 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            kb0 kb0Var = (kb0) obj;
            if (kb0Var != null) {
                requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, kb0Var, (MediaType) null, 1, (Object) null);
                t35Var2 = null;
                builder2 = null;
                str = null;
            } else {
                t35Var = null;
                builder = null;
                builder2 = null;
                str = null;
            }
            builder4.method(str, requestBodyCreate$default);
            q35 q35Var = t35Var2.c;
            builder3 = new Headers.Builder();
            for (Map.Entry entry : q35Var.a.entrySet()) {
                str2 = (String) entry.getKey();
                it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    builder3.addUnsafeNonAscii(str2, (String) it.next());
                }
            }
            builder2.headers(builder3.build());
            return builder2.build();
        }
        w39.n0(obj);
        builder = new Request.Builder();
        builder.url(t35Var.a);
        str = t35Var.b;
        builder2 = builder;
        Request.Builder builder5 = builder;
        t35Var2 = t35Var;
        requestBodyCreate$default = null;
        builder4 = builder5;
        builder4.method(str, requestBodyCreate$default);
        q35 q35Var2 = t35Var2.c;
        builder3 = new Headers.Builder();
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                builder3.addUnsafeNonAscii(str2, (String) it.next());
            }
        }
        builder2.headers(builder3.build());
        return builder2.build();
    }
}
