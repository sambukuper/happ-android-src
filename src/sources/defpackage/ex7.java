package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ex7 extends gx7 {
    public int[] f0;
    public long[] g0;
    public double[] h0;
    public String[] i0;
    public byte[][] j0;
    public Cursor k0;

    public static void p(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            nr4.T(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.xr6
    public final boolean S0() {
        g();
        m();
        Cursor cursor = this.k0;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        bt.i("Required value was null.");
        return false;
    }

    @Override // defpackage.xr6
    public final void T(int i, String str) {
        str.getClass();
        g();
        k(3, i);
        this.f0[i] = 3;
        this.i0[i] = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.Z) {
            g();
            this.f0 = new int[0];
            this.g0 = new long[0];
            this.h0 = new double[0];
            this.i0 = new String[0];
            this.j0 = new byte[0][];
            reset();
        }
        this.Z = true;
    }

    @Override // defpackage.xr6
    public final byte[] getBlob(int i) {
        g();
        Cursor cursorU = u();
        p(cursorU, i);
        byte[] blob = cursorU.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.xr6
    public final int getColumnCount() {
        g();
        m();
        Cursor cursor = this.k0;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.xr6
    public final String getColumnName(int i) {
        g();
        m();
        Cursor cursor = this.k0;
        if (cursor == null) {
            bt.i("Required value was null.");
            return null;
        }
        p(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.xr6
    public final long getLong(int i) {
        g();
        Cursor cursorU = u();
        p(cursorU, i);
        return cursorU.getLong(i);
    }

    @Override // defpackage.xr6
    public final void h(int i, double d) {
        g();
        k(2, i);
        this.f0[i] = 2;
        this.h0[i] = d;
    }

    @Override // defpackage.xr6
    public final void i(int i, long j) {
        g();
        k(1, i);
        this.f0[i] = 1;
        this.g0[i] = j;
    }

    @Override // defpackage.xr6
    public final boolean isNull(int i) {
        g();
        Cursor cursorU = u();
        p(cursorU, i);
        return cursorU.isNull(i);
    }

    @Override // defpackage.xr6
    public final void j(int i, byte[] bArr) {
        g();
        k(4, i);
        this.f0[i] = 4;
        this.j0[i] = bArr;
    }

    public final void k(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f0;
        if (iArr.length < i3) {
            this.f0 = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.g0;
            if (jArr.length < i3) {
                this.g0 = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.h0;
            if (dArr.length < i3) {
                this.h0 = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.i0;
            if (strArr.length < i3) {
                this.i0 = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.j0;
        if (bArr.length < i3) {
            this.j0 = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.xr6
    public final void l(int i) {
        g();
        k(5, i);
        this.f0[i] = 5;
    }

    public final void m() {
        if (this.k0 == null) {
            y45 y45Var = new y45(this);
            sm2 sm2Var = this.X;
            sm2Var.getClass();
            final jf jfVar = new jf(y45Var, (byte) 1);
            Cursor cursorRawQueryWithFactory = sm2Var.X.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: rm2
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) jfVar.F(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((ex7) y45Var.X).Y, sm2.Z, null);
            cursorRawQueryWithFactory.getClass();
            this.k0 = cursorRawQueryWithFactory;
        }
    }

    @Override // defpackage.xr6
    public final String p0(int i) {
        g();
        Cursor cursorU = u();
        p(cursorU, i);
        String string = cursorU.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.xr6
    public final void reset() {
        g();
        Cursor cursor = this.k0;
        if (cursor != null) {
            cursor.close();
        }
        this.k0 = null;
    }

    public final Cursor u() {
        Cursor cursor = this.k0;
        if (cursor != null) {
            return cursor;
        }
        nr4.T(21, "no row");
        throw null;
    }
}
