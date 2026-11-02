.class public final Lokhttp3/internal/dns/RealDnsCache;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/dns/RealDnsCache$CacheQuery;,
        Lokhttp3/internal/dns/RealDnsCache$Entry;,
        Lokhttp3/internal/dns/RealDnsCache$InFlightCall;,
        Lokhttp3/internal/dns/RealDnsCache$Result;,
        Lokhttp3/internal/dns/RealDnsCache$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0015*\u0001\u001d\u0008\u0007\u0018\u00002\u00020\u0001:\u000501234B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0008\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\"R\u0014\u0010\'\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0014\u0010)\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010&R\u0014\u0010+\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010&R\u0014\u0010-\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010&R\u0014\u0010/\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010&\u00a8\u00065"
    }
    d2 = {
        "Lokhttp3/internal/dns/RealDnsCache;",
        "",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "taskRunner",
        "Lla8;",
        "timeSource",
        "Lgx1;",
        "minimumTimeToLive",
        "maximumTimeToLive",
        "failureTimeToLive",
        "revalidateBeforeExpire",
        "",
        "maxEntryCount",
        "<init>",
        "(Lokhttp3/internal/concurrent/TaskRunner;Lla8;JJJJILge1;)V",
        "Ldn8;",
        "evictAll",
        "()V",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "delegate",
        "wrap",
        "(Lokhttp3/internal/dns/DnsQuery$Factory;)Lokhttp3/internal/dns/DnsQuery$Factory;",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "J",
        "getMinimumTimeToLive-UwyO8pc$okhttp",
        "()J",
        "getMaximumTimeToLive-UwyO8pc$okhttp",
        "getFailureTimeToLive-UwyO8pc$okhttp",
        "getRevalidateBeforeExpire-UwyO8pc$okhttp",
        "okhttp3/internal/dns/RealDnsCache$cache$1",
        "cache",
        "Lokhttp3/internal/dns/RealDnsCache$cache$1;",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "atomicNetworkCount",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "atomicHitCount",
        "atomicRequestCount",
        "getSize$okhttp",
        "()I",
        "size",
        "getMaxSize$okhttp",
        "maxSize",
        "getNetworkCount$okhttp",
        "networkCount",
        "getHitCount$okhttp",
        "hitCount",
        "getRequestCount$okhttp",
        "requestCount",
        "CacheQuery",
        "Entry",
        "State",
        "InFlightCall",
        "Result",
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


# instance fields
.field private final atomicHitCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final atomicNetworkCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final atomicRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final cache:Lokhttp3/internal/dns/RealDnsCache$cache$1;

.field private final failureTimeToLive:J

.field private final maximumTimeToLive:J

.field private final minimumTimeToLive:J

.field private final revalidateBeforeExpire:J

.field private final taskRunner:Lokhttp3/internal/concurrent/TaskRunner;


# direct methods
.method private constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lla8;JJJJI)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 11
    .line 12
    iput-wide p3, p0, Lokhttp3/internal/dns/RealDnsCache;->minimumTimeToLive:J

    .line 13
    .line 14
    iput-wide p5, p0, Lokhttp3/internal/dns/RealDnsCache;->maximumTimeToLive:J

    .line 15
    .line 16
    iput-wide p7, p0, Lokhttp3/internal/dns/RealDnsCache;->failureTimeToLive:J

    .line 17
    .line 18
    iput-wide p9, p0, Lokhttp3/internal/dns/RealDnsCache;->revalidateBeforeExpire:J

    .line 19
    .line 20
    new-instance p1, Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 21
    .line 22
    invoke-direct {p1, p2, p11}, Lokhttp3/internal/dns/RealDnsCache$cache$1;-><init>(Lla8;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache;->cache:Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicNetworkCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicHitCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    .line 48
    sget-object p0, Lgx1;->Y:Lbe;

    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    sget-object p1, Llx1;->f0:Llx1;

    .line 52
    .line 53
    invoke-static {p0, p1}, Lvj8;->l0(ILlx1;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-static {p7, p8, v0, v1}, Lgx1;->c(JJ)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    const/4 p7, 0x0

    .line 62
    const-string p8, "Failed requirement."

    .line 63
    .line 64
    if-ltz p2, :cond_3

    .line 65
    .line 66
    invoke-static {p0, p1}, Lvj8;->l0(ILlx1;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    invoke-static {p3, p4, v0, v1}, Lgx1;->c(JJ)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-ltz p2, :cond_2

    .line 75
    .line 76
    invoke-static {p5, p6, p3, p4}, Lgx1;->c(JJ)I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-ltz p2, :cond_1

    .line 81
    .line 82
    invoke-static {p0, p1}, Lvj8;->l0(ILlx1;)J

    .line 83
    .line 84
    .line 85
    move-result-wide p0

    .line 86
    invoke-static {p9, p10, p0, p1}, Lgx1;->c(JJ)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-ltz p0, :cond_0

    .line 91
    .line 92
    return-void

    .line 93
    :cond_0
    invoke-static {p8}, Lbt;->q(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p7

    .line 97
    :cond_1
    invoke-static {p8}, Lbt;->q(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p7

    .line 101
    :cond_2
    invoke-static {p8}, Lbt;->q(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p7

    .line 105
    :cond_3
    invoke-static {p8}, Lbt;->q(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p7
.end method

.method public synthetic constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lla8;JJJJILge1;)V
    .locals 0

    .line 109
    invoke-direct/range {p0 .. p11}, Lokhttp3/internal/dns/RealDnsCache;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lla8;JJJJI)V

    return-void
.end method

.method public static synthetic a()Lokhttp3/internal/dns/RealDnsCache$Entry;
    .locals 1

    .line 1
    invoke-static {}, Lokhttp3/internal/dns/RealDnsCache;->wrap$lambda$0$0()Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic access$getAtomicHitCount$p(Lokhttp3/internal/dns/RealDnsCache;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicHitCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getAtomicNetworkCount$p(Lokhttp3/internal/dns/RealDnsCache;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicNetworkCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getAtomicRequestCount$p(Lokhttp3/internal/dns/RealDnsCache;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getCache$p(Lokhttp3/internal/dns/RealDnsCache;)Lokhttp3/internal/dns/RealDnsCache$cache$1;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->cache:Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTaskRunner$p(Lokhttp3/internal/dns/RealDnsCache;)Lokhttp3/internal/concurrent/TaskRunner;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lokhttp3/internal/dns/RealDnsCache;Lokhttp3/internal/dns/DnsQuery$Factory;Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lokhttp3/internal/dns/RealDnsCache;->wrap$lambda$0(Lokhttp3/internal/dns/RealDnsCache;Lokhttp3/internal/dns/DnsQuery$Factory;Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final wrap$lambda$0(Lokhttp3/internal/dns/RealDnsCache;Lokhttp3/internal/dns/DnsQuery$Factory;Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache;->cache:Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 5
    .line 6
    new-instance v1, Ldw4;

    .line 7
    .line 8
    const/16 v2, 0x1d

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ldw4;-><init>(B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2, v1}, Lokhttp3/internal/dns/MemoryCache;->computeIfAbsent(Ljava/lang/Object;Ldn2;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 18
    .line 19
    new-instance v1, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;

    .line 20
    .line 21
    invoke-direct {v1, p0, p2, p1, v0}, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;-><init>(Lokhttp3/internal/dns/RealDnsCache;Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery$Factory;Lokhttp3/internal/dns/RealDnsCache$Entry;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method private static final wrap$lambda$0$0()Lokhttp3/internal/dns/RealDnsCache$Entry;
    .locals 1

    .line 1
    new-instance v0, Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/internal/dns/RealDnsCache$Entry;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final evictAll()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->cache:Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/MemoryCache;->evictAll()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getFailureTimeToLive-UwyO8pc$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/dns/RealDnsCache;->failureTimeToLive:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getHitCount$okhttp()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicHitCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getMaxSize$okhttp()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->cache:Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/MemoryCache;->getMaxSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getMaximumTimeToLive-UwyO8pc$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/dns/RealDnsCache;->maximumTimeToLive:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMinimumTimeToLive-UwyO8pc$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/dns/RealDnsCache;->minimumTimeToLive:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getNetworkCount$okhttp()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicNetworkCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getRequestCount$okhttp()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->atomicRequestCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getRevalidateBeforeExpire-UwyO8pc$okhttp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lokhttp3/internal/dns/RealDnsCache;->revalidateBeforeExpire:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSize$okhttp()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache;->cache:Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/MemoryCache;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final wrap(Lokhttp3/internal/dns/DnsQuery$Factory;)Lokhttp3/internal/dns/DnsQuery$Factory;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljn0;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, v1}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
