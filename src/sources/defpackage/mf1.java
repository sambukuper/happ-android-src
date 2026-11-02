package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import androidx.camera.view.PreviewView;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b;
import io.sentry.android.core.c;
import io.sentry.android.core.d;
import io.sentry.android.core.e;
import io.sentry.android.core.internal.gestures.g;
import io.sentry.b7;
import io.sentry.c7;
import io.sentry.d7;
import io.sentry.e7;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.h4;
import io.sentry.hints.a;
import io.sentry.i4;
import io.sentry.j5;
import io.sentry.n0;
import io.sentry.o;
import io.sentry.protocol.n;
import io.sentry.protocol.r;
import io.sentry.protocol.w;
import io.sentry.s1;
import io.sentry.s5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.url._UrlKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf1 implements uz7, iw7, sd0, gy7, ur6, h4, g7, i4 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ mf1(wr6 wr6Var, Object obj, qz qzVar, byte b) {
        this.X = b;
        this.Y = wr6Var;
        this.f0 = obj;
        this.Z = qzVar;
    }

    @Override // io.sentry.h4
    public void a(d7 d7Var) {
        ConcurrentHashMap concurrentHashMap;
        wg wgVar = (wg) this.Y;
        j5 j5Var = (j5) this.Z;
        n0 n0Var = (n0) this.f0;
        if (d7Var == null) {
            ((SentryAndroidOptions) wgVar.b).getLogger().h(s5.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strE = null;
        c7 c7Var = j5Var.f() != null ? c7.Crashed : null;
        boolean z = c7.Crashed == c7Var || j5Var.g();
        r rVar = j5Var.f0;
        String str = (rVar == null || (concurrentHashMap = rVar.h0) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) j5Var.f0.h0.get("user-agent");
        Object objB = n0Var.b("sentry:typeCheckHint");
        if (objB instanceof a) {
            strE = ((a) objB).e();
            c7Var = c7.Abnormal;
        }
        if (!d7Var.c(c7Var, str, z, strE) || d7Var.i0 == c7.Ok) {
            return;
        }
        d7Var.b(new Date());
    }

    @Override // defpackage.ur6
    public Object apply(Object obj) {
        Object obj2;
        wr6 wr6Var;
        String str;
        long jInsert;
        bf4 bf4Var;
        byte b = this.X;
        String str2 = "bytes";
        int i = 6;
        int i2 = 5;
        int i3 = 3;
        bf4 bf4Var2 = bf4.CACHE_FULL;
        int i4 = 2;
        Object obj3 = null;
        int i5 = 4;
        int i6 = 1;
        Object obj4 = this.f0;
        Object obj5 = this.Z;
        int i7 = 0;
        wr6 wr6Var2 = (wr6) this.Y;
        switch (b) {
            case 6:
                ArrayList arrayList = (ArrayList) obj4;
                qz qzVar = (qz) obj5;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    fu6 fu6Var = new fu6((byte) 4);
                    fu6Var.i0 = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        Object obj6 = obj3;
                        b61.i("Null transportName");
                        return obj6;
                    }
                    fu6Var.Y = string;
                    fu6Var.g0 = Long.valueOf(cursor.getLong(i4));
                    fu6Var.h0 = Long.valueOf(cursor.getLong(i3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        fu6Var.f0 = new s02(string2 == null ? wr6.h0 : new y02(string2), cursor.getBlob(5));
                        wr6Var = wr6Var2;
                        str = str2;
                        obj2 = obj3;
                    } else {
                        String string3 = cursor.getString(4);
                        y02 y02Var = string3 == null ? wr6.h0 : new y02(string3);
                        Cursor cursorQuery = wr6Var2.g().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                                obj3 = obj3;
                            }
                            obj2 = obj3;
                            byte[] bArr = new byte[length];
                            int i8 = 0;
                            int length2 = 0;
                            while (i8 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i8);
                                wr6 wr6Var3 = wr6Var2;
                                String str3 = str2;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i8++;
                                wr6Var2 = wr6Var3;
                                str2 = str3;
                            }
                            wr6Var = wr6Var2;
                            str = str2;
                            cursorQuery.close();
                            fu6Var.f0 = new s02(y02Var, bArr);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        fu6Var.Z = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new zy(j, qzVar, fu6Var.v()));
                    obj3 = obj2;
                    wr6Var2 = wr6Var;
                    str2 = str;
                    i3 = 3;
                    i4 = 2;
                }
                return obj3;
            case 7:
                jy jyVar = (jy) obj4;
                s02 s02Var = jyVar.c;
                String str4 = jyVar.a;
                qz qzVar2 = (qz) obj5;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = wr6Var2.g().compileStatement("PRAGMA page_size").simpleQueryForLong() * wr6Var2.g().compileStatement("PRAGMA page_count").simpleQueryForLong();
                ky kyVar = wr6Var2.f0;
                if (jSimpleQueryForLong >= kyVar.a) {
                    wr6Var2.u(1L, bf4Var2, str4);
                    return -1L;
                }
                Long lK = wr6.k(sQLiteDatabase, qzVar2);
                if (lK != null) {
                    jInsert = lK.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", qzVar2.a);
                    contentValues.put("priority", Integer.valueOf(hu5.a(qzVar2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = qzVar2.b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = kyVar.e;
                byte[] bArr4 = s02Var.b;
                boolean z2 = bArr4.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(jyVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(jyVar.e));
                contentValues2.put("payload_encoding", s02Var.a.a);
                contentValues2.put("code", jyVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i10 - 1) * i9, Math.min(i10 * i9, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(jyVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj5;
                z47 z47Var = (z47) obj4;
                ArrayList arrayList3 = (ArrayList) z47Var.f0;
                Cursor cursor2 = (Cursor) obj;
                wr6Var2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(i7);
                    int i11 = cursor2.getInt(i6);
                    bf4 bf4Var3 = bf4.REASON_UNKNOWN;
                    if (i11 != 0) {
                        if (i11 == i6) {
                            bf4Var3 = bf4.MESSAGE_TOO_OLD;
                        } else if (i11 == 2) {
                            bf4Var = bf4Var2;
                        } else if (i11 == 3) {
                            bf4Var3 = bf4.PAYLOAD_TOO_BIG;
                        } else if (i11 == i5) {
                            bf4Var3 = bf4.MAX_RETRIES_REACHED;
                        } else if (i11 == i2) {
                            bf4Var3 = bf4.INVALID_PAYLOD;
                        } else if (i11 == i) {
                            bf4Var3 = bf4.SERVER_ERROR;
                        } else {
                            mb6.x(Integer.valueOf(i11), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        bf4Var = bf4Var3;
                    } else {
                        bf4Var = bf4Var3;
                    }
                    long j2 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new cf4(j2, bf4Var));
                    i = 6;
                    i2 = 5;
                    i5 = 4;
                    i6 = 1;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i12 = hg4.c;
                    new ArrayList();
                    arrayList3.add(new hg4((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long j3 = wr6Var2.Y.j();
                SQLiteDatabase sQLiteDatabaseG = wr6Var2.g();
                sQLiteDatabaseG.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseG.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        na8 na8Var = new na8(cursorRawQuery.getLong(0), j3);
                        cursorRawQuery.close();
                        sQLiteDatabaseG.setTransactionSuccessful();
                        sQLiteDatabaseG.endTransaction();
                        z47Var.Z = na8Var;
                        z47Var.g0 = new zr2(new yj7(wr6Var2.g().compileStatement("PRAGMA page_size").simpleQueryForLong() * wr6Var2.g().compileStatement("PRAGMA page_count").simpleQueryForLong(), ky.f.a));
                        z47Var.Y = (String) wr6Var2.g0.get();
                        return new fu0((na8) z47Var.Z, Collections.unmodifiableList(arrayList3), (zr2) z47Var.g0, (String) z47Var.Y);
                    } catch (Throwable th2) {
                        cursorRawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    sQLiteDatabaseG.endTransaction();
                    throw th3;
                }
        }
    }

    @Override // defpackage.iw7
    public fb9 b(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.Y;
        String str = (String) this.Z;
        gj4 gj4Var = (gj4) this.f0;
        String str2 = (String) obj;
        y45 y45VarC = FirebaseMessaging.c(firebaseMessaging.b);
        xa2 xa2Var = firebaseMessaging.a;
        xa2Var.a();
        String strC = "[DEFAULT]".equals(xa2Var.b) ? _UrlKt.FRAGMENT_ENCODE_SET : xa2Var.c();
        String strF = firebaseMessaging.i.f();
        synchronized (y45VarC) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str2);
                jSONObject.put("appVersion", strF);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) y45VarC.X).edit();
                editorEdit.putString(strC + "|T|" + str + "|*", string);
                editorEdit.commit();
            }
        }
        if (firebaseMessaging.d.R() || gj4Var == null || !str2.equals((String) gj4Var.Y)) {
            xa2 xa2Var2 = firebaseMessaging.a;
            xa2Var2.a();
            if ("[DEFAULT]".equals(xa2Var2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    xa2Var2.a();
                }
                boolean zR = firebaseMessaging.d.R();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (zR) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new dq(firebaseMessaging.b).K(intent);
            }
        }
        return g28.l(str2);
    }

    public void c() {
        y45 y45Var = (y45) this.Y;
        qt5 qt5Var = (qt5) this.Z;
        cj0 cj0Var = (cj0) this.f0;
        AtomicReference atomicReference = ((PreviewView) y45Var.X).l0;
        do {
            if (atomicReference.compareAndSet(qt5Var, null)) {
                qt5Var.b(ut5.X);
                break;
            }
        } while (atomicReference.get() == qt5Var);
        yo2 yo2Var = qt5Var.e;
        if (yo2Var != null) {
            yo2Var.cancel(false);
            qt5Var.e = null;
        }
        cj0Var.b().i(qt5Var);
    }

    @Override // io.sentry.g7
    public void d(e7 e7Var) {
        c cVarB;
        b7 b7Var = (b7) this.Y;
        g7 g7Var = (g7) this.Z;
        AtomicReference atomicReference = (AtomicReference) this.f0;
        if (g7Var != null) {
            g7Var.d(e7Var);
        }
        e eVar = b7Var.r.i;
        if (eVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) eVar.X;
            WeakReference weakReference = (WeakReference) eVar.Y;
            String str = (String) eVar.Z;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                d dVar = activityLifecycleIntegration.t0;
                w wVarP = b7Var.p();
                io.sentry.util.a aVar = (io.sentry.util.a) dVar.g;
                aVar.g();
                try {
                    if (dVar.e()) {
                        c cVar = null;
                        dVar.g(new b(dVar, activity, (byte) 1), null);
                        c cVar2 = (c) ((WeakHashMap) dVar.e).remove(activity);
                        if (cVar2 != null && (cVarB = dVar.b()) != null) {
                            cVar = new c(cVarB.a - cVar2.a, cVarB.b - cVar2.b, cVarB.c - cVar2.c);
                        }
                        if (cVar != null) {
                            int i = cVar.c;
                            int i2 = cVar.b;
                            int i3 = cVar.a;
                            if (i3 != 0 || i2 != 0 || i != 0) {
                                n nVar = new n(Integer.valueOf(i3), "none");
                                n nVar2 = new n(Integer.valueOf(i2), "none");
                                n nVar3 = new n(Integer.valueOf(i), "none");
                                HashMap map = new HashMap();
                                map.put("frames_total", nVar);
                                map.put("frames_slow", nVar2);
                                map.put("frames_frozen", nVar3);
                                ((ConcurrentHashMap) dVar.d).put(wVarP, map);
                            }
                        }
                    }
                    aVar.close();
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f0;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(s5.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        o oVar = b7Var.q;
        if (oVar != null) {
            atomicReference.set(oVar.f(b7Var));
        }
    }

    @Override // defpackage.gy7
    public void e(mz mzVar) {
        s65 s65Var;
        y45 y45Var = (y45) this.Y;
        cj0 cj0Var = (cj0) this.Z;
        hy7 hy7Var = (hy7) this.f0;
        PreviewView previewView = (PreviewView) y45Var.X;
        Objects.toString(mzVar);
        hi5.z0("PreviewView");
        boolean z = cj0Var.s().j() == 0;
        rt5 rt5Var = previewView.i0;
        Size size = hy7Var.b;
        rt5Var.getClass();
        Objects.toString(mzVar);
        Objects.toString(size);
        hi5.z0("PreviewTransform");
        rt5Var.b = mzVar.a;
        rt5Var.c = mzVar.b;
        int i = mzVar.c;
        rt5Var.e = i;
        rt5Var.a = size;
        rt5Var.f = z;
        rt5Var.g = mzVar.d;
        rt5Var.d = mzVar.e;
        if (i == -1 || ((s65Var = previewView.g0) != null && (s65Var instanceof ly7))) {
            previewView.j0 = true;
        } else {
            previewView.j0 = false;
        }
        previewView.a();
    }

    @Override // defpackage.uz7
    public Object execute() {
        of1 of1Var = (of1) this.Y;
        qz qzVar = (qz) this.Z;
        jy jyVar = (jy) this.f0;
        wr6 wr6Var = of1Var.d;
        wr6Var.getClass();
        fu5 fu5Var = qzVar.c;
        if (Log.isLoggable(mb6.F("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(fu5Var);
        }
        ((Long) wr6Var.m(new mf1(wr6Var, (Object) jyVar, qzVar, (byte) 7))).getClass();
        of1Var.a.z(qzVar, 1, false);
        return null;
    }

    @Override // io.sentry.i4
    public void f(s1 s1Var) {
        g gVar = (g) this.Y;
        g1 g1Var = (g1) this.Z;
        s1 s1Var2 = (s1) this.f0;
        if (s1Var == null) {
            g1Var.F(s1Var2);
        } else {
            gVar.c.getLogger().h(s5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", s1Var2.getName());
        }
    }

    @Override // defpackage.sd0
    public Object t(qd0 qd0Var) {
        byte b = this.X;
        cp1 cp1Var = cp1.X;
        Object obj = this.f0;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        switch (b) {
            case 2:
                String str = (String) obj2;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                qd0Var.a(new yb4(atomicBoolean, (byte) 0), cp1Var);
                ((Executor) obj3).execute(new zb4(atomicBoolean, qd0Var, (dn2) obj, (byte) 0));
                return str;
            default:
                s61 s61Var = (s61) obj3;
                qd0Var.a(new c1((bm3) s61Var.H0(oy1.E0), (byte) 25), cp1Var);
                return w51.G(gv3.c(s61Var), null, (e71) obj2, new r0((rn2) obj, qd0Var, null, (byte) 29), 1);
        }
    }

    public /* synthetic */ mf1(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }
}
