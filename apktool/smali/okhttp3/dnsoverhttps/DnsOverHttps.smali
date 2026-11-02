.class public final Lokhttp3/dnsoverhttps/DnsOverHttps;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Dns;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;,
        Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u0000 \"2\u00020\u0001:\u0002!\"BQ\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00058\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0012R\u0013\u0010\u0006\u001a\u00020\u00078\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0013R\u0013\u0010\u0008\u001a\u00020\t8\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0014R\u0013\u0010\n\u001a\u00020\u000b8\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0015R\u0013\u0010\u000c\u001a\u00020\u000b8\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0015R\u0013\u0010\r\u001a\u00020\u000b8\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0015R\u0013\u0010\u000e\u001a\u00020\u000b8\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0015R\u0013\u0010\u000f\u001a\u00020\u000b8\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lokhttp3/dnsoverhttps/DnsOverHttps;",
        "Lokhttp3/Dns;",
        "taskRunner",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "client",
        "Lokhttp3/OkHttpClient;",
        "url",
        "Lokhttp3/HttpUrl;",
        "cache",
        "Lokhttp3/DnsCache;",
        "includeIPv6",
        "",
        "includeServiceMetadata",
        "post",
        "resolvePrivateAddresses",
        "resolvePublicAddresses",
        "<init>",
        "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Lokhttp3/DnsCache;ZZZZZ)V",
        "()Lokhttp3/OkHttpClient;",
        "()Lokhttp3/HttpUrl;",
        "()Lokhttp3/DnsCache;",
        "()Z",
        "queryFactory",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "newCall",
        "Lokhttp3/Dns$Call;",
        "request",
        "Lokhttp3/Dns$Request;",
        "lookup",
        "",
        "Ljava/net/InetAddress;",
        "hostname",
        "",
        "Builder",
        "Companion",
        "okhttp-dnsoverhttps"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;

.field private static final DNS_MESSAGE:Lokhttp3/MediaType;

.field public static final MAX_RESPONSE_SIZE:I = 0x10000


# instance fields
.field private final cache:Lokhttp3/DnsCache;

.field private final client:Lokhttp3/OkHttpClient;

.field private final includeIPv6:Z

.field private final includeServiceMetadata:Z

.field private final post:Z

.field private final queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

.field private final resolvePrivateAddresses:Z

.field private final resolvePublicAddresses:Z

.field private final taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

.field private final url:Lokhttp3/HttpUrl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;-><init>(Lge1;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/dnsoverhttps/DnsOverHttps;->Companion:Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;

    .line 8
    .line 9
    sget-object v0, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 10
    .line 11
    const-string v1, "application/dns-message"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lokhttp3/dnsoverhttps/DnsOverHttps;->DNS_MESSAGE:Lokhttp3/MediaType;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Lokhttp3/DnsCache;ZZZZZ)V
    .locals 7

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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 17
    .line 18
    iput-object p2, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->client:Lokhttp3/OkHttpClient;

    .line 19
    .line 20
    iput-object p3, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->url:Lokhttp3/HttpUrl;

    .line 21
    .line 22
    iput-object p4, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->cache:Lokhttp3/DnsCache;

    .line 23
    .line 24
    iput-boolean p5, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->includeIPv6:Z

    .line 25
    .line 26
    iput-boolean p6, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->includeServiceMetadata:Z

    .line 27
    .line 28
    iput-boolean p7, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->post:Z

    .line 29
    .line 30
    iput-boolean p8, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->resolvePrivateAddresses:Z

    .line 31
    .line 32
    move/from16 v3, p9

    .line 33
    .line 34
    iput-boolean v3, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->resolvePublicAddresses:Z

    .line 35
    .line 36
    iget-object p4, p4, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    .line 37
    .line 38
    new-instance v0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    move-object v4, p2

    .line 42
    move-object v5, p3

    .line 43
    move v6, p7

    .line 44
    move v2, p8

    .line 45
    invoke-direct/range {v0 .. v6}, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;-><init>(Lokhttp3/internal/concurrent/TaskRunner;ZZLokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p4, v0}, Lokhttp3/internal/dns/RealDnsCache;->wrap(Lokhttp3/internal/dns/DnsQuery$Factory;)Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 53
    .line 54
    return-void
.end method

.method public static final synthetic access$getDNS_MESSAGE$cp()Lokhttp3/MediaType;
    .locals 1

    .line 1
    sget-object v0, Lokhttp3/dnsoverhttps/DnsOverHttps;->DNS_MESSAGE:Lokhttp3/MediaType;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final cache()Lokhttp3/DnsCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->cache:Lokhttp3/DnsCache;

    .line 2
    .line 3
    return-object p0
.end method

.method public final client()Lokhttp3/OkHttpClient;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->client:Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    return-object p0
.end method

.method public final includeIPv6()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->includeIPv6:Z

    .line 2
    .line 3
    return p0
.end method

.method public final includeServiceMetadata()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->includeServiceMetadata:Z

    .line 2
    .line 3
    return p0
.end method

.method public lookup(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokhttp3/dnsoverhttps/DnsOverHttps;

    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 7
    .line 8
    iget-object v2, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->client:Lokhttp3/OkHttpClient;

    .line 9
    .line 10
    iget-object v3, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->url:Lokhttp3/HttpUrl;

    .line 11
    .line 12
    iget-object v4, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->cache:Lokhttp3/DnsCache;

    .line 13
    .line 14
    iget-boolean v5, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->includeIPv6:Z

    .line 15
    .line 16
    iget-boolean v7, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->post:Z

    .line 17
    .line 18
    iget-boolean v8, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->resolvePrivateAddresses:Z

    .line 19
    .line 20
    iget-boolean v9, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->resolvePublicAddresses:Z

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-direct/range {v0 .. v9}, Lokhttp3/dnsoverhttps/DnsOverHttps;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Lokhttp3/DnsCache;ZZZZZ)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Lokhttp3/Dns$Request;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {p0, p1, v3, v1, v2}, Lokhttp3/Dns$Request;-><init>(Ljava/lang/String;IILge1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p0}, Lokhttp3/dnsoverhttps/DnsOverHttps;->newCall(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lokhttp3/internal/dns/_ExecuteDnsKt;->execute(Lokhttp3/Dns$Call;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    instance-of v1, v0, Lokhttp3/Dns$Record$IpAddress;

    .line 62
    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 70
    .line 71
    const/16 v0, 0xa

    .line 72
    .line 73
    invoke-static {p1, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lokhttp3/Dns$Record$IpAddress;

    .line 95
    .line 96
    invoke-virtual {v0}, Lokhttp3/Dns$Record$IpAddress;->address()Ljava/net/InetAddress;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    return-object p0
.end method

.method public newCall(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokhttp3/internal/dns/StateMachineDnsCall;

    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 7
    .line 8
    iget-object v3, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 9
    .line 10
    iget-boolean v4, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->includeIPv6:Z

    .line 11
    .line 12
    iget-boolean v5, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->includeServiceMetadata:Z

    .line 13
    .line 14
    move-object v2, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/dns/StateMachineDnsCall;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns$Request;Lokhttp3/internal/dns/DnsQuery$Factory;ZZ)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final post()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->post:Z

    .line 2
    .line 3
    return p0
.end method

.method public final resolvePrivateAddresses()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->resolvePrivateAddresses:Z

    .line 2
    .line 3
    return p0
.end method

.method public final resolvePublicAddresses()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->resolvePublicAddresses:Z

    .line 2
    .line 3
    return p0
.end method

.method public final url()Lokhttp3/HttpUrl;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps;->url:Lokhttp3/HttpUrl;

    .line 2
    .line 3
    return-object p0
.end method
