package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wr6 implements Closeable {
    public static final y02 h0 = new y02("proto");
    public final dx6 X;
    public final f08 Y;
    public final f08 Z;
    public final ky f0;
    public final v06 g0;

    public wr6(f08 f08Var, f08 f08Var2, ky kyVar, dx6 dx6Var, v06 v06Var) {
        this.X = dx6Var;
        this.Y = f08Var;
        this.Z = f08Var2;
        this.f0 = kyVar;
        this.g0 = v06Var;
    }

    public static String D(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((zy) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object J(Cursor cursor, ur6 ur6Var) {
        try {
            return ur6Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long k(SQLiteDatabase sQLiteDatabase, qz qzVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(qzVar.a, String.valueOf(hu5.a(qzVar.c))));
        byte[] bArr = qzVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final Object C(uz7 uz7Var) {
        SQLiteDatabase sQLiteDatabaseG = g();
        f08 f08Var = this.Z;
        long j = f08Var.j();
        while (true) {
            try {
                sQLiteDatabaseG.beginTransaction();
                try {
                    Object objExecute = uz7Var.execute();
                    sQLiteDatabaseG.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseG.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (f08Var.j() >= ((long) this.f0.c) + j) {
                    throw new tz7("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }

    public final SQLiteDatabase g() {
        dx6 dx6Var = this.X;
        Objects.requireNonNull(dx6Var);
        f08 f08Var = this.Z;
        long j = f08Var.j();
        while (true) {
            try {
                return dx6Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (f08Var.j() >= ((long) this.f0.c) + j) {
                    throw new tz7("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object m(ur6 ur6Var) {
        SQLiteDatabase sQLiteDatabaseG = g();
        sQLiteDatabaseG.beginTransaction();
        try {
            Object objApply = ur6Var.apply(sQLiteDatabaseG);
            sQLiteDatabaseG.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseG.endTransaction();
        }
    }

    public final ArrayList p(SQLiteDatabase sQLiteDatabase, qz qzVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lK = k(sQLiteDatabase, qzVar);
        if (lK == null) {
            return arrayList;
        }
        J(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lK.toString()}, null, null, null, String.valueOf(i)), new mf1(this, (Object) arrayList, qzVar, (byte) 6));
        return arrayList;
    }

    public final void u(long j, bf4 bf4Var, String str) {
        m(new tr6(j, str, bf4Var));
    }
}
