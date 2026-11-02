.class public final Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/dnsoverhttps/DnsOverHttps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u00109\u001a\u00020:J\u000e\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001bJ\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u001bJ\u000e\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001bJ\u0016\u0010,\u001a\u00020\u00002\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-J\u001f\u0010,\u001a\u00020\u00002\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020.0;\"\u00020.\u00a2\u0006\u0002\u0010<J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\'R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u001d\"\u0004\u0008\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010\u001d\"\u0004\u0008%\u0010\u001fR\u001a\u0010&\u001a\u00020\'X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\u001a\u00103\u001a\u00020\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00084\u0010\u001d\"\u0004\u00085\u0010\u001fR\u001a\u00106\u001a\u00020\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00087\u0010\u001d\"\u0004\u00088\u0010\u001f\u00a8\u0006="
    }
    d2 = {
        "Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;",
        "",
        "<init>",
        "()V",
        "taskRunner",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "getTaskRunner$okhttp_dnsoverhttps",
        "()Lokhttp3/internal/concurrent/TaskRunner;",
        "client",
        "Lokhttp3/OkHttpClient;",
        "getClient$okhttp_dnsoverhttps",
        "()Lokhttp3/OkHttpClient;",
        "setClient$okhttp_dnsoverhttps",
        "(Lokhttp3/OkHttpClient;)V",
        "url",
        "Lokhttp3/HttpUrl;",
        "getUrl$okhttp_dnsoverhttps",
        "()Lokhttp3/HttpUrl;",
        "setUrl$okhttp_dnsoverhttps",
        "(Lokhttp3/HttpUrl;)V",
        "cache",
        "Lokhttp3/DnsCache;",
        "getCache$okhttp_dnsoverhttps",
        "()Lokhttp3/DnsCache;",
        "setCache$okhttp_dnsoverhttps",
        "(Lokhttp3/DnsCache;)V",
        "includeIPv6",
        "",
        "getIncludeIPv6$okhttp_dnsoverhttps",
        "()Z",
        "setIncludeIPv6$okhttp_dnsoverhttps",
        "(Z)V",
        "includeServiceMetadata",
        "getIncludeServiceMetadata$okhttp_dnsoverhttps",
        "setIncludeServiceMetadata$okhttp_dnsoverhttps",
        "post",
        "getPost$okhttp_dnsoverhttps",
        "setPost$okhttp_dnsoverhttps",
        "systemDns",
        "Lokhttp3/Dns;",
        "getSystemDns$okhttp_dnsoverhttps",
        "()Lokhttp3/Dns;",
        "setSystemDns$okhttp_dnsoverhttps",
        "(Lokhttp3/Dns;)V",
        "bootstrapDnsHosts",
        "",
        "Ljava/net/InetAddress;",
        "getBootstrapDnsHosts$okhttp_dnsoverhttps",
        "()Ljava/util/List;",
        "setBootstrapDnsHosts$okhttp_dnsoverhttps",
        "(Ljava/util/List;)V",
        "resolvePrivateAddresses",
        "getResolvePrivateAddresses$okhttp_dnsoverhttps",
        "setResolvePrivateAddresses$okhttp_dnsoverhttps",
        "resolvePublicAddresses",
        "getResolvePublicAddresses$okhttp_dnsoverhttps",
        "setResolvePublicAddresses$okhttp_dnsoverhttps",
        "build",
        "Lokhttp3/dnsoverhttps/DnsOverHttps;",
        "",
        "([Ljava/net/InetAddress;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;",
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


# instance fields
.field private bootstrapDnsHosts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation
.end field

.field private cache:Lokhttp3/DnsCache;

.field private client:Lokhttp3/OkHttpClient;

.field private includeIPv6:Z

.field private includeServiceMetadata:Z

.field private post:Z

.field private resolvePrivateAddresses:Z

.field private resolvePublicAddresses:Z

.field private systemDns:Lokhttp3/Dns;

.field private final taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

.field private url:Lokhttp3/HttpUrl;


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lokhttp3/internal/concurrent/TaskRunner;->INSTANCE:Lokhttp3/internal/concurrent/TaskRunner;

    .line 5
    .line 6
    iput-object v0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 7
    .line 8
    new-instance v1, Lokhttp3/DnsCache;

    .line 9
    .line 10
    const/16 v11, 0x1f

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    const-wide/16 v8, 0x0

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-direct/range {v1 .. v12}, Lokhttp3/DnsCache;-><init>(JJJJIILge1;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->cache:Lokhttp3/DnsCache;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeIPv6:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeServiceMetadata:Z

    .line 31
    .line 32
    sget-object v1, Lokhttp3/Dns;->SYSTEM:Lokhttp3/Dns;

    .line 33
    .line 34
    iput-object v1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->systemDns:Lokhttp3/Dns;

    .line 35
    .line 36
    iput-boolean v0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePublicAddresses:Z

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final bootstrapDnsHosts(Ljava/util/List;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/net/InetAddress;",
            ">;)",
            "Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;"
        }
    .end annotation

    .line 13
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->bootstrapDnsHosts:Ljava/util/List;

    return-object p0
.end method

.method public final varargs bootstrapDnsHosts([Ljava/net/InetAddress;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Leu;->K0([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->bootstrapDnsHosts(Ljava/util/List;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final build()Lokhttp3/dnsoverhttps/DnsOverHttps;
    .locals 12

    .line 1
    iget-object v0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->client:Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v3, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Lokhttp3/dnsoverhttps/DnsOverHttps;->Companion:Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;

    .line 13
    .line 14
    invoke-static {v2, p0}, Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;->access$buildBootstrapClient(Lokhttp3/dnsoverhttps/DnsOverHttps$Companion;Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;)Lokhttp3/Dns;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->url:Lokhttp3/HttpUrl;

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    iget-object v6, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->cache:Lokhttp3/DnsCache;

    .line 31
    .line 32
    iget-boolean v7, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeIPv6:Z

    .line 33
    .line 34
    iget-boolean v8, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeServiceMetadata:Z

    .line 35
    .line 36
    iget-boolean v9, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->post:Z

    .line 37
    .line 38
    iget-boolean v10, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePrivateAddresses:Z

    .line 39
    .line 40
    iget-boolean v11, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePublicAddresses:Z

    .line 41
    .line 42
    new-instance v2, Lokhttp3/dnsoverhttps/DnsOverHttps;

    .line 43
    .line 44
    invoke-direct/range {v2 .. v11}, Lokhttp3/dnsoverhttps/DnsOverHttps;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Lokhttp3/DnsCache;ZZZZZ)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_0
    const-string p0, "url not set"

    .line 49
    .line 50
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_1
    const-string p0, "client not set"

    .line 55
    .line 56
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1
.end method

.method public final cache(Lokhttp3/DnsCache;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->cache:Lokhttp3/DnsCache;

    .line 5
    .line 6
    return-object p0
.end method

.method public final client(Lokhttp3/OkHttpClient;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->client:Lokhttp3/OkHttpClient;

    .line 5
    .line 6
    return-object p0
.end method

.method public final getBootstrapDnsHosts$okhttp_dnsoverhttps()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->bootstrapDnsHosts:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCache$okhttp_dnsoverhttps()Lokhttp3/DnsCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->cache:Lokhttp3/DnsCache;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getClient$okhttp_dnsoverhttps()Lokhttp3/OkHttpClient;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->client:Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIncludeIPv6$okhttp_dnsoverhttps()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeIPv6:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getIncludeServiceMetadata$okhttp_dnsoverhttps()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeServiceMetadata:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getPost$okhttp_dnsoverhttps()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->post:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getResolvePrivateAddresses$okhttp_dnsoverhttps()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePrivateAddresses:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getResolvePublicAddresses$okhttp_dnsoverhttps()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePublicAddresses:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getSystemDns$okhttp_dnsoverhttps()Lokhttp3/Dns;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->systemDns:Lokhttp3/Dns;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTaskRunner$okhttp_dnsoverhttps()Lokhttp3/internal/concurrent/TaskRunner;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUrl$okhttp_dnsoverhttps()Lokhttp3/HttpUrl;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->url:Lokhttp3/HttpUrl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final includeIPv6(Z)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeIPv6:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final includeServiceMetadata(Z)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeServiceMetadata:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final post(Z)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->post:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final resolvePrivateAddresses(Z)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePrivateAddresses:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final resolvePublicAddresses(Z)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePublicAddresses:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final setBootstrapDnsHosts$okhttp_dnsoverhttps(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/net/InetAddress;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->bootstrapDnsHosts:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setCache$okhttp_dnsoverhttps(Lokhttp3/DnsCache;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->cache:Lokhttp3/DnsCache;

    .line 5
    .line 6
    return-void
.end method

.method public final setClient$okhttp_dnsoverhttps(Lokhttp3/OkHttpClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->client:Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    return-void
.end method

.method public final setIncludeIPv6$okhttp_dnsoverhttps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeIPv6:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setIncludeServiceMetadata$okhttp_dnsoverhttps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->includeServiceMetadata:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setPost$okhttp_dnsoverhttps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->post:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setResolvePrivateAddresses$okhttp_dnsoverhttps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePrivateAddresses:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setResolvePublicAddresses$okhttp_dnsoverhttps(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->resolvePublicAddresses:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSystemDns$okhttp_dnsoverhttps(Lokhttp3/Dns;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->systemDns:Lokhttp3/Dns;

    .line 5
    .line 6
    return-void
.end method

.method public final setUrl$okhttp_dnsoverhttps(Lokhttp3/HttpUrl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->url:Lokhttp3/HttpUrl;

    .line 2
    .line 3
    return-void
.end method

.method public final systemDns(Lokhttp3/Dns;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->systemDns:Lokhttp3/Dns;

    .line 5
    .line 6
    return-object p0
.end method

.method public final url(Lokhttp3/HttpUrl;)Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/dnsoverhttps/DnsOverHttps$Builder;->url:Lokhttp3/HttpUrl;

    .line 5
    .line 6
    return-object p0
.end method
