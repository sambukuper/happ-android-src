package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wm2 extends SQLiteOpenHelper {
    public static final /* synthetic */ int j0 = 0;
    public final Context X;
    public final vk1 Y;
    public final b8 Z;
    public final boolean f0;
    public boolean g0;
    public final zu5 h0;
    public boolean i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm2(Context context, String str, final vk1 vk1Var, final b8 b8Var, boolean z) {
        String string;
        super(context, str, null, b8Var.b, new DatabaseErrorHandler() { // from class: tm2
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = wm2.j0;
                sQLiteDatabase.getClass();
                vk1 vk1Var2 = vk1Var;
                sm2 sm2Var = (sm2) vk1Var2.Y;
                if (sm2Var == null || !sm2Var.X.equals(sQLiteDatabase)) {
                    sm2Var = new sm2(sQLiteDatabase);
                    vk1Var2.Y = sm2Var;
                }
                SQLiteDatabase sQLiteDatabase2 = sm2Var.X;
                b8Var.getClass();
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        b8.e(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                b8.e((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                b8.e(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    sm2Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        b8Var.getClass();
        this.X = context;
        this.Y = vk1Var;
        this.Z = b8Var;
        this.f0 = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.h0 = new zu5(string, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        zu5 zu5Var = this.h0;
        try {
            zu5Var.a(zu5Var.a);
            super.close();
            this.Y.Y = null;
            this.i0 = false;
        } finally {
            zu5Var.b();
        }
    }

    public final sm2 g(boolean z) {
        zu5 zu5Var = this.h0;
        try {
            zu5Var.a((this.i0 || getDatabaseName() == null) ? false : true);
            this.g0 = false;
            SQLiteDatabase sQLiteDatabaseM = m(z);
            if (!this.g0) {
                return k(sQLiteDatabaseM);
            }
            close();
            return g(z);
        } finally {
            zu5Var.b();
        }
    }

    public final sm2 k(SQLiteDatabase sQLiteDatabase) {
        vk1 vk1Var = this.Y;
        sm2 sm2Var = (sm2) vk1Var.Y;
        if (sm2Var != null && sm2Var.X.equals(sQLiteDatabase)) {
            return sm2Var;
        }
        sm2 sm2Var2 = new sm2(sQLiteDatabase);
        vk1Var.Y = sm2Var2;
        return sm2Var2;
    }

    public final SQLiteDatabase m(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.i0;
        Context context = this.X;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof um2) {
                    um2 um2Var = (um2) th;
                    int iOrdinal = um2Var.X.ordinal();
                    th = um2Var.Y;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        b61.c();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f0) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (um2 e) {
                    throw e.Y;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.g0;
        b8 b8Var = this.Z;
        if (!z && b8Var.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            k(sQLiteDatabase);
            b8Var.getClass();
        } catch (Throwable th) {
            throw new um2(vm2.X, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((by0) this.Z.c).f(new ww7(k(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new um2(vm2.Y, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.g0 = true;
        try {
            this.Z.j(k(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new um2(vm2.f0, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.g0) {
            try {
                b8 b8Var = this.Z;
                sm2 sm2VarK = k(sQLiteDatabase);
                by0 by0Var = (by0) b8Var.c;
                by0Var.h(new ww7(sm2VarK));
                by0Var.g = sm2VarK;
            } catch (Throwable th) {
                throw new um2(vm2.g0, th);
            }
        }
        this.i0 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.g0 = true;
        try {
            this.Z.j(k(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new um2(vm2.Z, th);
        }
    }
}
