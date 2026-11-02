package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr6 implements ur6, uz7 {
    public final /* synthetic */ long X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ tr6(long j, Object obj, Object obj2) {
        this.Y = obj;
        this.Z = obj2;
        this.X = j;
    }

    @Override // defpackage.ur6
    public Object apply(Object obj) {
        String str = (String) this.Y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((bf4) this.Z).X;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.X;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(b));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.uz7
    public Object execute() {
        jl1 jl1Var = (jl1) this.Y;
        qz qzVar = (qz) this.Z;
        wr6 wr6Var = (wr6) jl1Var.Z;
        long j = ((f08) jl1Var.i0).j() + this.X;
        wr6Var.getClass();
        wr6Var.m(new sr6(j, qzVar));
        return null;
    }
}
