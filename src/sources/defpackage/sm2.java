package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sm2 implements Closeable {
    public static final String[] Y = {_UrlKt.FRAGMENT_ENCODE_SET, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] Z = new String[0];
    public static final g44 f0;
    public static final g44 g0;
    public final SQLiteDatabase X;

    static {
        j72 j72Var = new j72((byte) 11);
        w74 w74Var = w74.Y;
        f0 = x97.P(w74Var, j72Var);
        g0 = x97.P(w74Var, new j72((byte) 12));
    }

    public sm2(SQLiteDatabase sQLiteDatabase) {
        this.X = sQLiteDatabase;
    }

    public final void C(Object[] objArr) {
        this.X.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean D() {
        return this.X.inTransaction();
    }

    public final void J() {
        this.X.setTransactionSuccessful();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }

    public final void g() {
        this.X.beginTransaction();
    }

    public final void k() {
        this.X.beginTransactionNonExclusive();
    }

    public final zm2 m(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.X.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new zm2(sQLiteStatementCompileStatement);
    }

    public final void p() {
        this.X.endTransaction();
    }

    public final void u(String str) {
        this.X.execSQL(str);
    }
}
