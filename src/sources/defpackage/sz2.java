package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sz2 {
    public static final js5 b = new js5("fire-global");
    public static final js5 c = new js5("fire-count");
    public static final js5 d = new js5("last-used-date");
    public final ak3 a;

    public sz2(Context context, String str) {
        this.a = new ak3(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        return Build.VERSION.SDK_INT >= 26 ? DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) : new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public static js5 c(o05 o05Var, String str) {
        for (Map.Entry entry : o05Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((js5) entry.getKey()).a;
                        str2.getClass();
                        return new js5(str2);
                    }
                }
            }
        }
        return null;
    }

    public static void d(o05 o05Var, String str) {
        js5 js5VarC = c(o05Var, str);
        if (js5VarC == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) ci8.x(o05Var, js5VarC, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            o05Var.d(js5VarC);
        } else {
            o05Var.f(js5VarC, hashSet);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) z51.R(b02.X, new r5((Object) this.a, (q51) null, (byte) 16))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new my(((js5) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new bd(jCurrentTimeMillis, (byte) 3));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(js5 js5Var, long j) {
        if (b(((Long) this.a.b(js5Var, -1L)).longValue()).equals(b(j))) {
            return false;
        }
        return true;
    }
}
