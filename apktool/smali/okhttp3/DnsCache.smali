.class public final Lokhttp3/DnsCache;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B;\u0008\u0016\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0004\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0011\u0012\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u00068G\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u00068G\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0013R\u0011\u0010\t\u001a\u00020\u00068G\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0013R\u0011\u0010\n\u001a\u00020\u00068G\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u000b8G\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0015\u00a8\u0006\u001a"
    }
    d2 = {
        "Lokhttp3/DnsCache;",
        "",
        "Lokhttp3/internal/dns/RealDnsCache;",
        "-delegate",
        "<init>",
        "(Lokhttp3/internal/dns/RealDnsCache;)V",
        "Lgx1;",
        "minimumTimeToLive",
        "maximumTimeToLive",
        "failureTimeToLive",
        "revalidateBeforeExpire",
        "",
        "maxEntryCount",
        "(JJJJILge1;)V",
        "Ldn8;",
        "evictAll",
        "()V",
        "Lokhttp3/internal/dns/RealDnsCache;",
        "get-delegate$okhttp$annotations",
        "()J",
        "maxSize",
        "()I",
        "size",
        "networkCount",
        "hitCount",
        "requestCount",
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
.field public final -delegate:Lokhttp3/internal/dns/RealDnsCache;


# direct methods
.method private constructor <init>(JJJJI)V
    .locals 13

    .line 85
    new-instance v0, Lokhttp3/internal/dns/RealDnsCache;

    .line 86
    sget-object v1, Lokhttp3/internal/concurrent/TaskRunner;->INSTANCE:Lokhttp3/internal/concurrent/TaskRunner;

    .line 87
    sget-object v2, Llh4;->J0:Llh4;

    const/4 v12, 0x0

    move-wide v3, p1

    move-wide/from16 v5, p3

    move-wide/from16 v7, p5

    move-wide/from16 v9, p7

    move/from16 v11, p9

    .line 88
    invoke-direct/range {v0 .. v12}, Lokhttp3/internal/dns/RealDnsCache;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lla8;JJJJILge1;)V

    .line 89
    invoke-direct {p0, v0}, Lokhttp3/DnsCache;-><init>(Lokhttp3/internal/dns/RealDnsCache;)V

    return-void
.end method

.method public synthetic constructor <init>(JJJJIILge1;)V
    .locals 10

    .line 1
    and-int/lit8 v0, p10, 0x1

    .line 2
    .line 3
    sget-object v1, Llx1;->f0:Llx1;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lgx1;->Y:Lbe;

    .line 10
    .line 11
    invoke-static {v2, v1}, Lvj8;->l0(ILlx1;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide v3, p1

    .line 17
    :goto_0
    and-int/lit8 v0, p10, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object v0, Lgx1;->Y:Lbe;

    .line 22
    .line 23
    const/16 v0, 0x12c

    .line 24
    .line 25
    invoke-static {v0, v1}, Lvj8;->l0(ILlx1;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-wide v5, p3

    .line 31
    :goto_1
    and-int/lit8 v0, p10, 0x4

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Lgx1;->Y:Lbe;

    .line 36
    .line 37
    invoke-static {v2, v1}, Lvj8;->l0(ILlx1;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v7

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-wide v7, p5

    .line 43
    :goto_2
    and-int/lit8 v0, p10, 0x8

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    sget-object v0, Lgx1;->Y:Lbe;

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-static {v0, v1}, Lvj8;->l0(ILlx1;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    move-wide/from16 v0, p7

    .line 56
    .line 57
    :goto_3
    and-int/lit8 v2, p10, 0x10

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    const/16 v2, 0x3e8

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_4
    move/from16 v2, p9

    .line 65
    .line 66
    :goto_4
    const/4 v9, 0x0

    .line 67
    move-object p1, p0

    .line 68
    move-wide/from16 p8, v0

    .line 69
    .line 70
    move/from16 p10, v2

    .line 71
    .line 72
    move-wide p2, v3

    .line 73
    move-wide p4, v5

    .line 74
    move-wide/from16 p6, v7

    .line 75
    .line 76
    move-object/from16 p11, v9

    .line 77
    .line 78
    invoke-direct/range {p1 .. p11}, Lokhttp3/DnsCache;-><init>(JJJJILge1;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public synthetic constructor <init>(JJJJILge1;)V
    .locals 0

    .line 84
    invoke-direct/range {p0 .. p9}, Lokhttp3/DnsCache;-><init>(JJJJI)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/dns/RealDnsCache;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    return-void
.end method

.method public static synthetic get-delegate$okhttp$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final evictAll()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->evictAll()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final failureTimeToLive()J
    .locals 2

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getFailureTimeToLive-UwyO8pc$okhttp()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final hitCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getHitCount$okhttp()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final maxSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getMaxSize$okhttp()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final maximumTimeToLive()J
    .locals 2

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getMaximumTimeToLive-UwyO8pc$okhttp()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final minimumTimeToLive()J
    .locals 2

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getMinimumTimeToLive-UwyO8pc$okhttp()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final networkCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getNetworkCount$okhttp()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final requestCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getRequestCount$okhttp()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final revalidateBeforeExpire()J
    .locals 2

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getRevalidateBeforeExpire-UwyO8pc$okhttp()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 2
    .line 3
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache;->getSize$okhttp()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
