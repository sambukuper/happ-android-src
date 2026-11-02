package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qh1 implements wh1, uz7 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ qh1(jl1 jl1Var, Iterable iterable, qz qzVar, long j) {
        this.X = (byte) 2;
        this.Y = jl1Var;
        this.g0 = iterable;
        this.f0 = qzVar;
        this.Z = j;
    }

    @Override // defpackage.wh1
    public ScheduledFuture a(wl6 wl6Var) {
        byte b = this.X;
        Object obj = this.f0;
        long j = this.Z;
        Object obj2 = this.g0;
        vh1 vh1Var = (vh1) this.Y;
        switch (b) {
            case 0:
                return vh1Var.Y.schedule(new th1(vh1Var, (Runnable) obj2, wl6Var, (byte) 1), j, (TimeUnit) obj);
            default:
                return vh1Var.Y.schedule(new uh1(vh1Var, (Callable) obj2, wl6Var, (byte) 0), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.uz7
    public Object execute() {
        jl1 jl1Var = (jl1) this.Y;
        Iterable iterable = (Iterable) this.g0;
        qz qzVar = (qz) this.f0;
        wr6 wr6Var = (wr6) jl1Var.Z;
        wr6Var.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(wr6.D(iterable));
            SQLiteDatabase sQLiteDatabaseG = wr6Var.g();
            sQLiteDatabaseG.beginTransaction();
            try {
                sQLiteDatabaseG.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseG.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        wr6Var.u(cursorRawQuery.getInt(0), bf4.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseG.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseG.setTransactionSuccessful();
                sQLiteDatabaseG.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseG.endTransaction();
                throw th2;
            }
        }
        wr6Var.m(new sr6(((f08) jl1Var.i0).j() + this.Z, qzVar));
        return null;
    }

    public /* synthetic */ qh1(vh1 vh1Var, Object obj, long j, TimeUnit timeUnit, byte b) {
        this.X = b;
        this.Y = vh1Var;
        this.g0 = obj;
        this.Z = j;
        this.f0 = timeUnit;
    }
}
