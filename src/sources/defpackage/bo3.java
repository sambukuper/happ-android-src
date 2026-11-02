package defpackage;

import com.google.gson.internal.bind.JsonElementTypeAdapter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bo3 {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final en3 b() {
        if (this instanceof en3) {
            return (en3) this;
        }
        u52.r(this, "Not a JSON Array: ");
        return null;
    }

    public final bq3 c() {
        if (this instanceof bq3) {
            return (bq3) this;
        }
        u52.r(this, "Not a JSON Object: ");
        return null;
    }

    public String d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            hs3 hs3Var = new hs3(new rl7(sb));
            hs3Var.j0 = 1;
            JsonElementTypeAdapter.a.getClass();
            JsonElementTypeAdapter.f(this, hs3Var);
            return sb.toString();
        } catch (IOException e) {
            bt.g(e);
            return null;
        }
    }
}
