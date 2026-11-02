package okhttp3.internal.dns;

import defpackage.dh3;
import defpackage.ge1;
import defpackage.oi0;
import defpackage.pc6;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/dns/Question;", _UrlKt.FRAGMENT_ENCODE_SET, "name", _UrlKt.FRAGMENT_ENCODE_SET, "type", _UrlKt.FRAGMENT_ENCODE_SET, "class", "<init>", "(Ljava/lang/String;II)V", "getName", "()Ljava/lang/String;", "getType", "()I", "getClass", "component1", "component2", "component3", "copy", "equals", _UrlKt.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Question {
    private final int class;
    private final String name;
    private final int type;

    public Question(String str, int i, int i2) {
        str.getClass();
        this.name = str;
        this.type = i;
        this.class = i2;
    }

    public static /* synthetic */ Question copy$default(Question question, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = question.name;
        }
        if ((i3 & 2) != 0) {
            i = question.type;
        }
        if ((i3 & 4) != 0) {
            i2 = question.class;
        }
        return question.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getClass() {
        return this.class;
    }

    public final Question copy(String name, int type, int i) {
        name.getClass();
        return new Question(name, type, i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question question = (Question) other;
        return dh3.f(this.name, question.name) && this.type == question.type && this.class == question.class;
    }

    public final int getClass() {
        return this.class;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.class) + oi0.e(this.type, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Question(name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", class=");
        return pc6.r(sb, this.class, ')');
    }

    public /* synthetic */ Question(String str, int i, int i2, int i3, ge1 ge1Var) {
        this(str, i, (i3 & 4) != 0 ? 1 : i2);
    }
}
