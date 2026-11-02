package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aq8 implements uz7 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ wr6 Y;

    public /* synthetic */ aq8(wr6 wr6Var, byte b) {
        this.X = b;
        this.Y = wr6Var;
    }

    @Override // defpackage.uz7
    public final Object execute() {
        byte b = this.X;
        wr6 wr6Var = this.Y;
        boolean z = false;
        switch (b) {
            case 0:
                wr6Var.getClass();
                int i = fu0.e;
                z47 z47Var = new z47((byte) 10, z);
                z47Var.Z = null;
                z47Var.f0 = new ArrayList();
                z47Var.g0 = null;
                z47Var.Y = _UrlKt.FRAGMENT_ENCODE_SET;
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseG = wr6Var.g();
                sQLiteDatabaseG.beginTransaction();
                try {
                    fu0 fu0Var = (fu0) wr6.J(sQLiteDatabaseG.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new mf1((Object) wr6Var, (Object) map, (Object) z47Var, (byte) 8));
                    sQLiteDatabaseG.setTransactionSuccessful();
                    return fu0Var;
                } finally {
                    sQLiteDatabaseG.endTransaction();
                }
            default:
                long j = wr6Var.Y.j() - wr6Var.f0.d;
                SQLiteDatabase sQLiteDatabaseG2 = wr6Var.g();
                sQLiteDatabaseG2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(j)};
                    Cursor cursorRawQuery = sQLiteDatabaseG2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            wr6Var.u(cursorRawQuery.getInt(0), bf4.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseG2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseG2.setTransactionSuccessful();
                    sQLiteDatabaseG2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseG2.endTransaction();
                    throw th2;
                }
        }
    }
}
