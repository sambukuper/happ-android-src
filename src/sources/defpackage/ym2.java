package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ym2 implements dx7 {
    public final /* synthetic */ byte X;
    public final Closeable Y;

    public /* synthetic */ ym2(Closeable closeable, byte b) {
        this.X = b;
        this.Y = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.X) {
            case 0:
                ((SQLiteProgram) this.Y).close();
                break;
        }
    }

    @Override // defpackage.dx7
    public final void h(int i, double d) {
        byte b = this.X;
        Closeable closeable = this.Y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindDouble(i, d);
                break;
            default:
                ((sl6) closeable).h(i, d);
                break;
        }
    }

    @Override // defpackage.dx7
    public final void i(int i, long j) {
        byte b = this.X;
        Closeable closeable = this.Y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindLong(i, j);
                break;
            default:
                ((sl6) closeable).i(i, j);
                break;
        }
    }

    @Override // defpackage.dx7
    public final void j(int i, byte[] bArr) {
        byte b = this.X;
        Closeable closeable = this.Y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindBlob(i, bArr);
                break;
            default:
                ((sl6) closeable).j(i, bArr);
                break;
        }
    }

    @Override // defpackage.dx7
    public final void l(int i) {
        byte b = this.X;
        Closeable closeable = this.Y;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindNull(i);
                break;
            default:
                ((sl6) closeable).l(i);
                break;
        }
    }

    @Override // defpackage.dx7
    public final void t(int i, String str) {
        byte b = this.X;
        Closeable closeable = this.Y;
        switch (b) {
            case 0:
                str.getClass();
                ((SQLiteProgram) closeable).bindString(i, str);
                break;
            default:
                ((sl6) closeable).t(i, str);
                break;
        }
    }

    private final void g() {
    }
}
