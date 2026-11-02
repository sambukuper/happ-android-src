package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class by0 {
    public boolean a;
    public boolean b;
    public Object c;
    public final Object d;
    public final Collection e;
    public final Object f;
    public Object g;

    public by0(lb1 lb1Var, td5 td5Var) {
        int i;
        w11 w11Var;
        pl6 pl6Var = lb1Var.g;
        zw7 zw7Var = lb1Var.c;
        String str = lb1Var.b;
        this.c = lb1Var;
        this.d = td5Var;
        Collection collection = lb1Var.e;
        this.e = collection == null ? d02.X : collection;
        rr6 rr6Var = lb1Var.p;
        if (rr6Var != null) {
            if (str == null) {
                w11Var = new w11(new dq(this, rr6Var));
            } else {
                dq dqVar = new dq(this, rr6Var);
                int iOrdinal = pl6Var.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        kp5.s(pl6Var, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = pl6Var.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    kp5.s(pl6Var, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                w11Var = new w11(dqVar, str, i);
            }
            this.f = w11Var;
        } else {
            if (zw7Var == null) {
                bt.q("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            this.f = new xw7(new lr5(zw7Var.f(new yw7(lb1Var.a, str, new b8(this, td5Var.a), false, false))));
        }
        boolean z = pl6Var == pl6.Y;
        ax7 ax7VarE = e();
        if (ax7VarE != null) {
            ax7VarE.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void c(qr6 qr6Var) {
        xr6 xr6VarX0 = qr6Var.X0("PRAGMA busy_timeout");
        try {
            xr6VarX0.S0();
            long j = xr6VarX0.getLong(0);
            u15.h(xr6VarX0, null);
            if (j < 3000) {
                nr4.r(qr6Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(xr6VarX0, th);
                throw th2;
            }
        }
    }

    public void a(li1 li1Var) {
        if (((HashSet) this.d).contains(li1Var.a)) {
            bt.q("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            ((HashSet) this.e).add(li1Var);
        }
    }

    public cy0 b() {
        if (!(((ry0) this.g) != null)) {
            bt.i("Missing required property: factory.");
            return null;
        }
        return new cy0((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a ? 1 : 0, this.b ? 1 : 0, (ry0) this.g, (HashSet) this.f);
    }

    public void d(qr6 qr6Var) throws Throwable {
        Object rj6Var;
        td5 td5Var = (td5) this.d;
        lb1 lb1Var = (lb1) this.c;
        pl6 pl6Var = lb1Var.g;
        pl6 pl6Var2 = pl6.Y;
        if (pl6Var == pl6Var2) {
            nr4.r(qr6Var, "PRAGMA journal_mode = WAL");
        } else {
            nr4.r(qr6Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (lb1Var.g == pl6Var2) {
            nr4.r(qr6Var, "PRAGMA synchronous = NORMAL");
        } else {
            nr4.r(qr6Var, "PRAGMA synchronous = FULL");
        }
        c(qr6Var);
        xr6 xr6VarX0 = qr6Var.X0("PRAGMA user_version");
        try {
            xr6VarX0.S0();
            int i = (int) xr6VarX0.getLong(0);
            u15.h(xr6VarX0, null);
            int i2 = td5Var.a;
            int i3 = td5Var.a;
            if (i != i2) {
                nr4.r(qr6Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        f(qr6Var);
                    } else {
                        g(qr6Var, i, i3);
                    }
                    nr4.r(qr6Var, "PRAGMA user_version = " + i3);
                    rj6Var = dn8.a;
                } catch (Throwable th) {
                    rj6Var = new rj6(th);
                }
                if (!(rj6Var instanceof rj6)) {
                    nr4.r(qr6Var, "END TRANSACTION");
                }
                Throwable thA = sj6.a(rj6Var);
                if (thA != null) {
                    nr4.r(qr6Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            h(qr6Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                u15.h(xr6VarX0, th2);
                throw th3;
            }
        }
    }

    public ax7 e() {
        t11 t11Var = (t11) this.f;
        xw7 xw7Var = t11Var instanceof xw7 ? (xw7) t11Var : null;
        if (xw7Var != null) {
            return (ax7) xw7Var.X.Y;
        }
        return null;
    }

    public void f(qr6 qr6Var) {
        td5 td5Var = (td5) this.d;
        qr6Var.getClass();
        xr6 xr6VarX0 = qr6Var.X0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (xr6VarX0.S0() && xr6VarX0.getLong(0) == 0) {
                z = true;
            }
            u15.h(xr6VarX0, null);
            td5Var.a(qr6Var);
            if (!z) {
                rl6 rl6VarW = td5Var.w(qr6Var);
                if (!rl6VarW.a) {
                    kp5.q(rl6VarW.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            i(qr6Var);
            td5Var.s(qr6Var);
            Iterator it = ((List) this.e).iterator();
            while (it.hasNext()) {
                ((ol6) it.next()).getClass();
                if (qr6Var instanceof ww7) {
                    ((ww7) qr6Var).X.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u15.h(xr6VarX0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[LOOP:4: B:9:0x0028->B:121:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public void g(qr6 qr6Var, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        qg5 qg5Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        td5 td5Var = (td5) this.d;
        qr6Var.getClass();
        lb1 lb1Var = (lb1) this.c;
        t91 t91Var = lb1Var.d;
        if (i == i2) {
            iterable = d02.X;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        linkedHashMap = t91Var.a;
                        if (z2) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                qg5Var = null;
                            } else {
                                qg5Var = new qg5(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                qg5Var = null;
                            } else {
                                qg5Var = new qg5(treeMap, treeMap.keySet());
                            }
                        }
                        if (qg5Var == null) {
                            Map map = (Map) qg5Var.X;
                            it = ((Iterable) qg5Var.Y).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z2) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = t91Var.a;
                    if (z2) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            qg5Var = null;
                        } else {
                            qg5Var = new qg5(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            qg5Var = null;
                        } else {
                            qg5Var = new qg5(treeMap, treeMap.keySet());
                        }
                    }
                    if (qg5Var == null) {
                        Map map2 = (Map) qg5Var.X;
                        it = ((Iterable) qg5Var.Y).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        if (iterable != null) {
            td5Var.v(qr6Var);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((pv4) it2.next()).b(qr6Var);
            }
            rl6 rl6VarW = td5Var.w(qr6Var);
            if (!rl6VarW.a) {
                kp5.q(rl6VarW.b, "Migration didn't properly handle: ");
                return;
            } else {
                td5Var.u(qr6Var);
                i(qr6Var);
                return;
            }
        }
        if (jb5.x(lb1Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (lb1Var.o) {
            xr6 xr6VarX0 = qr6Var.X0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                gb4 gb4VarR = i21.r();
                while (xr6VarX0.S0()) {
                    String strP0 = xr6VarX0.p0(0);
                    if (!mm7.Z(strP0, false, "sqlite_") && !strP0.equals("android_metadata")) {
                        gb4VarR.add(new qg5(strP0, Boolean.valueOf(dh3.f(xr6VarX0.p0(1), "view"))));
                    }
                }
                gb4 gb4VarJ = i21.j(gb4VarR);
                u15.h(xr6VarX0, null);
                ListIterator listIterator = gb4VarJ.listIterator(0);
                while (true) {
                    o03 o03Var = (o03) listIterator;
                    if (!o03Var.hasNext()) {
                        break;
                    }
                    qg5 qg5Var2 = (qg5) o03Var.next();
                    String str = (String) qg5Var2.X;
                    if (((Boolean) qg5Var2.Y).booleanValue()) {
                        nr4.r(qr6Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        nr4.r(qr6Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u15.h(xr6VarX0, th);
                    throw th2;
                }
            }
        } else {
            td5Var.c(qr6Var);
        }
        Iterator it3 = ((List) this.e).iterator();
        while (it3.hasNext()) {
            ((ol6) it3.next()).getClass();
            if (qr6Var instanceof ww7) {
                ((ww7) qr6Var).X.getClass();
            }
        }
        td5Var.a(qr6Var);
    }

    public void h(qr6 qr6Var) throws Throwable {
        Object rj6Var;
        qr6Var.getClass();
        td5 td5Var = (td5) this.d;
        xr6 xr6VarX0 = qr6Var.X0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = xr6VarX0.S0() && xr6VarX0.getLong(0) != 0;
            u15.h(xr6VarX0, null);
            if (z) {
                xr6 xr6VarX1 = qr6Var.X0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strP0 = xr6VarX1.S0() ? xr6VarX1.p0(0) : null;
                    u15.h(xr6VarX1, null);
                    if (!((String) td5Var.b).equals(strP0) && !((String) td5Var.c).equals(strP0)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) td5Var.b) + ", found: " + strP0).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u15.h(xr6VarX1, th);
                        throw th2;
                    }
                }
            } else {
                nr4.r(qr6Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    rl6 rl6VarW = td5Var.w(qr6Var);
                    if (!rl6VarW.a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + rl6VarW.b).toString());
                    }
                    td5Var.u(qr6Var);
                    i(qr6Var);
                    rj6Var = dn8.a;
                    if (!(rj6Var instanceof rj6)) {
                        nr4.r(qr6Var, "END TRANSACTION");
                    }
                    Throwable thA = sj6.a(rj6Var);
                    if (thA != null) {
                        nr4.r(qr6Var, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    rj6Var = new rj6(th3);
                }
            }
            td5Var.t(qr6Var);
            for (ol6 ol6Var : (List) this.e) {
                ol6Var.getClass();
                if (qr6Var instanceof ww7) {
                    ol6Var.a(((ww7) qr6Var).X);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                u15.h(xr6VarX0, th4);
                throw th5;
            }
        }
    }

    public void i(qr6 qr6Var) {
        nr4.r(qr6Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        nr4.r(qr6Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((td5) this.d).b) + "')");
    }

    public by0(lb1 lb1Var, zw5 zw5Var) {
        this.c = lb1Var;
        this.d = new ll6(_UrlKt.FRAGMENT_ENCODE_SET, -1, _UrlKt.FRAGMENT_ENCODE_SET);
        List list = lb1Var.e;
        d02 d02Var = d02.X;
        this.e = list == null ? d02Var : list;
        wv0.I0(list == null ? d02Var : list, new ml6(new t16((Object) this, (byte) 3)));
        Executor executor = lb1Var.h;
        Executor executor2 = lb1Var.i;
        executor.getClass();
        executor2.getClass();
        throw new g65(0);
    }

    public by0(Class cls, Class... clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = false;
        this.b = false;
        this.f = new HashSet();
        hashSet.add(e26.a(cls));
        for (Class cls2 : clsArr) {
            jb5.i(cls2, "Null interface");
            ((HashSet) this.d).add(e26.a(cls2));
        }
    }

    public by0(e26 e26Var, e26... e26VarArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = false;
        this.b = false;
        this.f = new HashSet();
        hashSet.add(e26Var);
        for (e26 e26Var2 : e26VarArr) {
            jb5.i(e26Var2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, e26VarArr);
    }
}
