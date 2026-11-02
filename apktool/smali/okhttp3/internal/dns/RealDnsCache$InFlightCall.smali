.class final Lokhttp3/internal/dns/RealDnsCache$InFlightCall;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/RealDnsCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InFlightCall"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0082\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\t\u001a\u000c\u0012\u0008\u0012\u00060\u0007R\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u000c\u0012\u0008\u0012\u00060\u0007R\u00020\u00080\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0008\u0002\u0010\t\u001a\u000c\u0012\u0008\u0012\u00060\u0007R\u00020\u00080\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001e\u001a\u0004\u0008\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010 \u001a\u0004\u0008!\u0010\u000fR!\u0010\t\u001a\u000c\u0012\u0008\u0012\u00060\u0007R\u00020\u00080\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\"\u001a\u0004\u0008#\u0010\u0011\u00a8\u0006$"
    }
    d2 = {
        "Lokhttp3/internal/dns/RealDnsCache$InFlightCall;",
        "",
        "Lokhttp3/internal/dns/DnsQuery;",
        "query",
        "Lqx0;",
        "sentAt",
        "",
        "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;",
        "Lokhttp3/internal/dns/RealDnsCache;",
        "queries",
        "<init>",
        "(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)V",
        "component1",
        "()Lokhttp3/internal/dns/DnsQuery;",
        "component2",
        "()Lqx0;",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)Lokhttp3/internal/dns/RealDnsCache$InFlightCall;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lokhttp3/internal/dns/DnsQuery;",
        "getQuery",
        "Lqx0;",
        "getSentAt",
        "Ljava/util/List;",
        "getQueries",
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
.field private final queries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;",
            ">;"
        }
    .end annotation
.end field

.field private final query:Lokhttp3/internal/dns/DnsQuery;

.field private final sentAt:Lqx0;


# direct methods
.method public constructor <init>(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/dns/DnsQuery;",
            "Lqx0;",
            "Ljava/util/List<",
            "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 14
    .line 15
    iput-object p2, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 16
    .line 17
    iput-object p3, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic copy$default(Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$InFlightCall;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->copy(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Lokhttp3/internal/dns/DnsQuery;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)Lokhttp3/internal/dns/RealDnsCache$InFlightCall;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/dns/DnsQuery;",
            "Lqx0;",
            "Ljava/util/List<",
            "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;",
            ">;)",
            "Lokhttp3/internal/dns/RealDnsCache$InFlightCall;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;-><init>(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 14
    .line 15
    iget-object v3, p1, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 25
    .line 26
    iget-object v3, p1, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 27
    .line 28
    invoke-static {v1, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 36
    .line 37
    iget-object p1, p1, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {p0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final getQueries()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getQuery()Lokhttp3/internal/dns/DnsQuery;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSentAt()Lqx0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 11
    .line 12
    check-cast v2, Lka8;

    .line 13
    .line 14
    iget-wide v2, v2, Lka8;->X:J

    .line 15
    .line 16
    invoke-static {v0, v2, v3, v1}, Lp61;->g(IJI)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v0

    .line 27
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "InFlightCall(query="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->query:Lokhttp3/internal/dns/DnsQuery;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sentAt="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->sentAt:Lqx0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", queries="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->queries:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 p0, 0x29

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
