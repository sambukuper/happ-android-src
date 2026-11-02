package okhttp3.internal.dns;

import defpackage.d02;
import defpackage.dh3;
import defpackage.ge1;
import defpackage.i21;
import defpackage.oi0;
import defpackage.p61;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J]\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, d2 = {"Lokhttp3/internal/dns/DnsMessage;", _UrlKt.FRAGMENT_ENCODE_SET, "id", _UrlKt.FRAGMENT_ENCODE_SET, "flags", _UrlKt.FRAGMENT_ENCODE_SET, "questions", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/dns/Question;", "answers", "Lokhttp3/internal/dns/ResourceRecord;", "authorityRecords", "additionalRecords", "<init>", "(SILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getId", "()S", "getFlags", "()I", "getQuestions", "()Ljava/util/List;", "getAnswers", "getAuthorityRecords", "getAdditionalRecords", "responseCode", "getResponseCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", _UrlKt.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", _UrlKt.FRAGMENT_ENCODE_SET, "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DnsMessage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<ResourceRecord> additionalRecords;
    private final List<ResourceRecord> answers;
    private final List<ResourceRecord> authorityRecords;
    private final int flags;
    private final short id;
    private final List<Question> questions;

    /* JADX WARN: Multi-variable type inference failed */
    public DnsMessage(short s, int i, List<Question> list, List<? extends ResourceRecord> list2, List<? extends ResourceRecord> list3, List<? extends ResourceRecord> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.id = s;
        this.flags = i;
        this.questions = list;
        this.answers = list2;
        this.authorityRecords = list3;
        this.additionalRecords = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DnsMessage copy$default(DnsMessage dnsMessage, short s, int i, List list, List list2, List list3, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            s = dnsMessage.id;
        }
        if ((i2 & 2) != 0) {
            i = dnsMessage.flags;
        }
        if ((i2 & 4) != 0) {
            list = dnsMessage.questions;
        }
        if ((i2 & 8) != 0) {
            list2 = dnsMessage.answers;
        }
        if ((i2 & 16) != 0) {
            list3 = dnsMessage.authorityRecords;
        }
        if ((i2 & 32) != 0) {
            list4 = dnsMessage.additionalRecords;
        }
        List list5 = list3;
        List list6 = list4;
        return dnsMessage.copy(s, i, list, list2, list5, list6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    public final List<Question> component3() {
        return this.questions;
    }

    public final List<ResourceRecord> component4() {
        return this.answers;
    }

    public final List<ResourceRecord> component5() {
        return this.authorityRecords;
    }

    public final List<ResourceRecord> component6() {
        return this.additionalRecords;
    }

    public final DnsMessage copy(short id, int flags, List<Question> questions, List<? extends ResourceRecord> answers, List<? extends ResourceRecord> authorityRecords, List<? extends ResourceRecord> additionalRecords) {
        questions.getClass();
        answers.getClass();
        authorityRecords.getClass();
        additionalRecords.getClass();
        return new DnsMessage(id, flags, questions, answers, authorityRecords, additionalRecords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DnsMessage)) {
            return false;
        }
        DnsMessage dnsMessage = (DnsMessage) other;
        return this.id == dnsMessage.id && this.flags == dnsMessage.flags && dh3.f(this.questions, dnsMessage.questions) && dh3.f(this.answers, dnsMessage.answers) && dh3.f(this.authorityRecords, dnsMessage.authorityRecords) && dh3.f(this.additionalRecords, dnsMessage.additionalRecords);
    }

    public final List<ResourceRecord> getAdditionalRecords() {
        return this.additionalRecords;
    }

    public final List<ResourceRecord> getAnswers() {
        return this.answers;
    }

    public final List<ResourceRecord> getAuthorityRecords() {
        return this.authorityRecords;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final short getId() {
        return this.id;
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }

    public final int getResponseCode() {
        return this.flags & 15;
    }

    public int hashCode() {
        return this.additionalRecords.hashCode() + p61.f(p61.f(p61.f(oi0.e(this.flags, Short.hashCode(this.id) * 31, 31), 31, this.questions), 31, this.answers), 31, this.authorityRecords);
    }

    public String toString() {
        return "DnsMessage(id=" + ((int) this.id) + ", flags=" + this.flags + ", questions=" + this.questions + ", answers=" + this.answers + ", authorityRecords=" + this.authorityRecords + ", additionalRecords=" + this.additionalRecords + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J,\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/dns/DnsMessage$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "query", "Lokhttp3/internal/dns/DnsMessage;", "question", "Lokhttp3/internal/dns/Question;", "response", "id", _UrlKt.FRAGMENT_ENCODE_SET, "questions", _UrlKt.FRAGMENT_ENCODE_SET, "answers", "Lokhttp3/internal/dns/ResourceRecord;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(ge1 ge1Var) {
            this();
        }

        public static /* synthetic */ DnsMessage response$default(Companion companion, short s, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                s = 0;
            }
            return companion.response(s, list, list2);
        }

        public final DnsMessage query(Question question) {
            question.getClass();
            return new DnsMessage((short) 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, i21.K(question), null, null, null, 56, null);
        }

        public final DnsMessage response(short id, List<Question> questions, List<? extends ResourceRecord> answers) {
            questions.getClass();
            answers.getClass();
            return new DnsMessage(id, 32768, questions, answers, null, null, 48, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DnsMessage(short s, int i, List list, List list2, List list3, List list4, int i2, ge1 ge1Var) {
        int i3 = i2 & 8;
        d02 d02Var = d02.X;
        this(s, i, list, i3 != 0 ? d02Var : list2, (i2 & 16) != 0 ? d02Var : list3, (i2 & 32) != 0 ? d02Var : list4);
    }
}
