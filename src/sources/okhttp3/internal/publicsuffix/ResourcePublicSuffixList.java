package okhttp3.internal.publicsuffix;

import defpackage.g55;
import defpackage.ge1;
import defpackage.je7;
import defpackage.oi5;
import defpackage.s92;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/ResourcePublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Loi5;", "path", "Ls92;", "fileSystem", "<init>", "(Loi5;Ls92;)V", "Lje7;", "listSource", "()Lje7;", "Loi5;", "getPath", "()Loi5;", "Ls92;", "getFileSystem", "()Ls92;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourcePublicSuffixList extends BasePublicSuffixList {
    public static final oi5 PUBLIC_SUFFIX_RESOURCE;
    private final s92 fileSystem;
    private final oi5 path;

    static {
        String str = oi5.Y;
        PUBLIC_SUFFIX_RESOURCE = g55.r("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list");
    }

    public /* synthetic */ ResourcePublicSuffixList(oi5 oi5Var, s92 s92Var, int i, ge1 ge1Var) {
        this((i & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : oi5Var, (i & 2) != 0 ? s92.RESOURCES : s92Var);
    }

    public final s92 getFileSystem() {
        return this.fileSystem;
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public je7 listSource() {
        return this.fileSystem.source(getPath());
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public oi5 getPath() {
        return this.path;
    }

    public ResourcePublicSuffixList(oi5 oi5Var, s92 s92Var) {
        oi5Var.getClass();
        s92Var.getClass();
        this.path = oi5Var;
        this.fileSystem = s92Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourcePublicSuffixList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
