package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pv4 {
    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public pv4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(sm2 sm2Var) {
        sm2Var.getClass();
        throw new g65("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(qr6 qr6Var) {
        qr6Var.getClass();
        if (!(qr6Var instanceof ww7)) {
            throw new g65("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((ww7) qr6Var).X);
    }
}
