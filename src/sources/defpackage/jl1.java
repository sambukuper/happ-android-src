package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 implements ov8 {
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;

    public jl1(hl1 hl1Var, w15 w15Var, ed1 ed1Var, ux4 ux4Var, dv8 dv8Var, s50 s50Var, xl1 xl1Var, fc8 fc8Var, List list) {
        w15Var.getClass();
        ed1Var.getClass();
        dv8Var.getClass();
        s50Var.getClass();
        list.getClass();
        this.X = hl1Var;
        this.Y = w15Var;
        this.Z = ed1Var;
        this.f0 = ux4Var;
        this.g0 = dv8Var;
        this.h0 = s50Var;
        this.i0 = xl1Var;
        this.j0 = new fc8(this, fc8Var, list, "Deserializer for \"" + ed1Var.getName() + '\"', xl1Var != null ? xl1Var.m() : "[container not found]");
        this.k0 = new ys4(this);
    }

    public jl1 a(ed1 ed1Var, List list, w15 w15Var, ux4 ux4Var, dv8 dv8Var, s50 s50Var) {
        list.getClass();
        w15Var.getClass();
        dv8Var.getClass();
        s50Var.getClass();
        hl1 hl1Var = (hl1) this.X;
        int i = s50Var.b;
        if ((i != 1 || s50Var.c < 4) && i <= 1) {
            dv8Var = (dv8) this.g0;
        }
        return new jl1(hl1Var, w15Var, ed1Var, ux4Var, dv8Var, s50Var, (xl1) this.i0, (fc8) this.j0, list);
    }

    public void c(qz qzVar, int i) {
        byte[] bArr;
        se8 se8Var;
        long j;
        sx sxVar;
        String str;
        sx sxVar2;
        int i2;
        ro0 ro0VarE;
        String str2;
        Integer numValueOf;
        long j2;
        fc8 fc8Var;
        final jl1 jl1Var = this;
        final qz qzVar2 = qzVar;
        byte[] bArr2 = qzVar2.b;
        wr6 wr6Var = (wr6) jl1Var.h0;
        se8 se8VarA = ((zu4) jl1Var.Y).a(qzVar2.a);
        long jMax = 0;
        while (true) {
            final byte b = 0;
            if (!((Boolean) wr6Var.C(new uz7(jl1Var) { // from class: cq8
                public final /* synthetic */ jl1 Y;

                {
                    this.Y = jl1Var;
                }

                @Override // defpackage.uz7
                public final Object execute() {
                    Boolean bool;
                    byte b2 = b;
                    qz qzVar3 = qzVar2;
                    jl1 jl1Var2 = this.Y;
                    switch (b2) {
                        case 0:
                            wr6 wr6Var2 = (wr6) jl1Var2.Z;
                            SQLiteDatabase sQLiteDatabaseG = wr6Var2.g();
                            sQLiteDatabaseG.beginTransaction();
                            try {
                                Long lK = wr6.k(sQLiteDatabaseG, qzVar3);
                                if (lK == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = wr6Var2.g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lK.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseG.setTransactionSuccessful();
                                sQLiteDatabaseG.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseG.endTransaction();
                                throw th2;
                            }
                        default:
                            wr6 wr6Var3 = (wr6) jl1Var2.Z;
                            wr6Var3.getClass();
                            return (Iterable) wr6Var3.m(new jn0(wr6Var3, qzVar3, (byte) 11));
                    }
                }
            })).booleanValue()) {
                wr6Var.C(new tr6(jMax, jl1Var, qzVar2));
                return;
            }
            final byte b2 = 1;
            Iterable iterable = (Iterable) wr6Var.C(new uz7(jl1Var) { // from class: cq8
                public final /* synthetic */ jl1 Y;

                {
                    this.Y = jl1Var;
                }

                @Override // defpackage.uz7
                public final Object execute() {
                    Boolean bool;
                    byte b3 = b2;
                    qz qzVar3 = qzVar2;
                    jl1 jl1Var2 = this.Y;
                    switch (b3) {
                        case 0:
                            wr6 wr6Var2 = (wr6) jl1Var2.Z;
                            SQLiteDatabase sQLiteDatabaseG = wr6Var2.g();
                            sQLiteDatabaseG.beginTransaction();
                            try {
                                Long lK = wr6.k(sQLiteDatabaseG, qzVar3);
                                if (lK == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = wr6Var2.g().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lK.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseG.setTransactionSuccessful();
                                sQLiteDatabaseG.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseG.endTransaction();
                                throw th2;
                            }
                        default:
                            wr6 wr6Var3 = (wr6) jl1Var2.Z;
                            wr6Var3.getClass();
                            return (Iterable) wr6Var3.m(new jn0(wr6Var3, qzVar3, (byte) 11));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte b3 = 4;
            if (se8VarA == null) {
                mb6.x(qzVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                sxVar2 = new sx(3, -1L);
                bArr = bArr2;
                se8Var = se8VarA;
                j = jMax;
            } else {
                ArrayList<jy> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zy) it.next()).c);
                }
                if (bArr2 != null) {
                    wr6 wr6Var2 = (wr6) jl1Var.k0;
                    Objects.requireNonNull(wr6Var2);
                    fu0 fu0Var = (fu0) wr6Var.C(new aq8(wr6Var2, b));
                    fu6 fu6Var = new fu6(b3);
                    fu6Var.i0 = new HashMap();
                    fu6Var.g0 = Long.valueOf(((f08) jl1Var.i0).j());
                    fu6Var.h0 = Long.valueOf(((f08) jl1Var.j0).j());
                    fu6Var.Y = "GDT_CLIENT_METRICS";
                    y02 y02Var = new y02("proto");
                    fu0Var.getClass();
                    zz2 zz2Var = f06.a;
                    zz2Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        zz2Var.X(fu0Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    fu6Var.f0 = new s02(y02Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((so0) se8VarA).a(fu6Var.v()));
                }
                so0 so0Var = (so0) se8VarA;
                HashMap map = new HashMap();
                for (jy jyVar : arrayList) {
                    String str3 = jyVar.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(jyVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(jyVar);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    jy jyVar2 = (jy) ((List) entry.getValue()).get(0);
                    c26 c26Var = c26.X;
                    long j3 = so0Var.f.j();
                    long j4 = so0Var.e.j();
                    yx yxVar = new yx(new qx(Integer.valueOf(jyVar2.b("sdk-version")), jyVar2.a("model"), jyVar2.a("hardware"), jyVar2.a("device"), jyVar2.a("product"), jyVar2.a("os-uild"), jyVar2.a("manufacturer"), jyVar2.a("fingerprint"), jyVar2.a("locale"), jyVar2.a("country"), jyVar2.a("mcc_mnc"), jyVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (jy jyVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        s02 s02Var = jyVar3.c;
                        se8 se8Var2 = se8VarA;
                        y02 y02Var2 = s02Var.a;
                        byte[] bArr4 = s02Var.b;
                        if (y02Var2.equals(new y02("proto"))) {
                            fc8Var = new fc8();
                            fc8Var.g0 = bArr4;
                            j2 = jMax;
                        } else {
                            j2 = jMax;
                            if (y02Var2.equals(new y02("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                fc8 fc8Var2 = new fc8();
                                fc8Var2.h0 = str4;
                                fc8Var = fc8Var2;
                            } else if (Log.isLoggable(mb6.F("CctTransportBackend"), 5)) {
                                y02Var2.toString();
                            }
                            bArr2 = bArr3;
                            se8VarA = se8Var2;
                            jMax = j2;
                        }
                        fc8Var.Y = Long.valueOf(jyVar3.d);
                        fc8Var.f0 = Long.valueOf(jyVar3.e);
                        String str5 = (String) jyVar3.f.get("tz-offset");
                        fc8Var.i0 = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        fc8Var.j0 = new wy((h35) h35.X.get(jyVar3.b("net-type")), (g35) g35.X.get(jyVar3.b("mobile-subtype")));
                        Integer num = jyVar3.b;
                        if (num != null) {
                            fc8Var.Z = num;
                        }
                        String strConcat = ((Long) fc8Var.Y) == null ? " eventTimeMs" : _UrlKt.FRAGMENT_ENCODE_SET;
                        if (((Long) fc8Var.f0) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) fc8Var.i0) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            bt.i("Missing required properties:".concat(strConcat));
                            return;
                        }
                        arrayList4.add(new ty(((Long) fc8Var.Y).longValue(), (Integer) fc8Var.Z, ((Long) fc8Var.f0).longValue(), (byte[]) fc8Var.g0, (String) fc8Var.h0, ((Long) fc8Var.i0).longValue(), (wy) fc8Var.j0));
                        bArr2 = bArr3;
                        se8VarA = se8Var2;
                        jMax = j2;
                    }
                    arrayList3.add(new uy(j3, j4, yxVar, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                se8Var = se8VarA;
                j = jMax;
                tx txVar = new tx(arrayList3);
                URL urlB = so0Var.d;
                if (bArr != null) {
                    try {
                        ob0 ob0VarA = ob0.a(bArr);
                        str = ob0VarA.b;
                        if (str == null) {
                            str = null;
                        }
                        urlB = so0.b(ob0VarA.a);
                    } catch (IllegalArgumentException unused3) {
                        sxVar = new sx(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    lr lrVar = new lr((Object) urlB, (Object) txVar, (Object) str, (byte) 17);
                    o61 o61Var = new o61(so0Var, (byte) 6);
                    int i3 = 5;
                    do {
                        ro0VarE = o61Var.e(lrVar);
                        URL url = ro0VarE.b;
                        if (url != null) {
                            mb6.x(url, "CctTransportBackend", "Following redirect to: %s");
                            lrVar = new lr((Object) url, lrVar.Z, lrVar.f0, (byte) 17);
                        } else {
                            lrVar = null;
                        }
                        if (lrVar == null) {
                            break;
                        } else {
                            i3--;
                        }
                    } while (i3 >= 1);
                    int i4 = ro0VarE.a;
                    if (i4 == 200) {
                        sxVar2 = new sx(1, ro0VarE.c);
                    } else {
                        if (i4 >= 500 || i4 == 404) {
                            sxVar = new sx(2, -1L);
                        } else if (i4 == 400) {
                            try {
                                sxVar = new sx(4, -1L);
                            } catch (IOException unused4) {
                                mb6.F("CctTransportBackend");
                                i2 = 2;
                                sxVar2 = new sx(2, -1L);
                            }
                        } else {
                            sxVar = new sx(3, -1L);
                        }
                        sxVar2 = sxVar;
                    }
                } catch (IOException unused5) {
                }
            }
            i2 = 2;
            int i5 = sxVar2.a;
            if (i5 == i2) {
                wr6Var.C(new qh1(this, iterable, qzVar, j));
                ((f63) this.f0).z(qzVar, i + 1, true);
                return;
            }
            jl1Var = this;
            qzVar2 = qzVar;
            jMax = j;
            byte b4 = 1;
            wr6Var.C(new jn0(jl1Var, iterable, (byte) 16));
            if (i5 == 1) {
                jMax = Math.max(jMax, sxVar2.b);
                if (bArr != null) {
                    wr6Var.C(new j78(jl1Var, b4));
                }
            } else if (i5 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str6 = ((zy) it2.next()).c.a;
                    if (map2.containsKey(str6)) {
                        map2.put(str6, Integer.valueOf(((Integer) map2.get(str6)).intValue() + 1));
                    } else {
                        map2.put(str6, 1);
                    }
                }
                wr6Var.C(new jn0(jl1Var, map2, (byte) 17));
            }
            bArr2 = bArr;
            se8VarA = se8Var;
        }
    }

    @Override // defpackage.ov8
    public View getRoot() {
        return (CoordinatorLayout) this.X;
    }

    public /* synthetic */ jl1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.X = obj;
        this.Y = obj2;
        this.Z = obj3;
        this.f0 = obj4;
        this.g0 = obj5;
        this.h0 = obj6;
        this.i0 = obj7;
        this.j0 = obj8;
        this.k0 = obj9;
    }
}
