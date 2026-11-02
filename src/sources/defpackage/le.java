package defpackage;

import android.media.ImageReader;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class le implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ o8 X;
    public final /* synthetic */ Executor Y;
    public final /* synthetic */ p63 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ le(o8 o8Var, Executor executor, p63 p63Var) {
        this.X = o8Var;
        this.Y = executor;
        this.Z = p63Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        o8 o8Var = this.X;
        Executor executor = this.Y;
        p63 p63Var = this.Z;
        synchronized (o8Var.f0) {
            try {
                if (!o8Var.Y) {
                    executor.execute(new sc(o8Var, p63Var, (byte) 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
