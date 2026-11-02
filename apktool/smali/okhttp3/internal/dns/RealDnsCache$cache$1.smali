.class public final Lokhttp3/internal/dns/RealDnsCache$cache$1;
.super Lokhttp3/internal/dns/MemoryCache;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/dns/RealDnsCache;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lla8;JJJJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lokhttp3/internal/dns/MemoryCache<",
        "Lokhttp3/internal/dns/Question;",
        "Lokhttp3/internal/dns/RealDnsCache$Entry;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "okhttp3/internal/dns/RealDnsCache$cache$1",
        "Lokhttp3/internal/dns/MemoryCache;",
        "Lokhttp3/internal/dns/Question;",
        "Lokhttp3/internal/dns/RealDnsCache$Entry;",
        "Lqx0;",
        "now",
        "value",
        "lastRequestedAt",
        "(Lqx0;Lokhttp3/internal/dns/RealDnsCache$Entry;)Lqx0;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lla8;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/dns/MemoryCache;-><init>(Lla8;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic lastRequestedAt(Lqx0;Ljava/lang/Object;)Lqx0;
    .locals 0

    .line 51
    check-cast p2, Lokhttp3/internal/dns/RealDnsCache$Entry;

    invoke-virtual {p0, p1, p2}, Lokhttp3/internal/dns/RealDnsCache$cache$1;->lastRequestedAt(Lqx0;Lokhttp3/internal/dns/RealDnsCache$Entry;)Lqx0;

    move-result-object p0

    return-object p0
.end method

.method public lastRequestedAt(Lqx0;Lokhttp3/internal/dns/RealDnsCache$Entry;)Lqx0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 16
    .line 17
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-nez p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache$State;->getResult()Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-interface {p2}, Lokhttp3/internal/dns/RealDnsCache$Result;->getExpireAt()Lqx0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    check-cast p2, Lka8;

    .line 38
    .line 39
    invoke-virtual {p2, p1}, Lka8;->a(Lqx0;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-gtz p1, :cond_2

    .line 44
    .line 45
    :cond_1
    :goto_0
    return-object v0

    .line 46
    :cond_2
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache$State;->getLastRequestedAt()Lqx0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
