.class public final Lk95;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lz47;

.field public final b:Lwl6;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Lem7;

.field public f:Ld61;

.field public g:Loq1;

.field public h:Ljava/net/Proxy;

.field public i:Ljavax/net/SocketFactory;

.field public j:Ljavax/net/ssl/SSLSocketFactory;

.field public k:Ljavax/net/ssl/X509TrustManager;

.field public final l:Ljava/util/List;

.field public final m:Ljava/util/List;

.field public n:Ljavax/net/ssl/HostnameVerifier;

.field public final o:Lto0;

.field public p:Lg33;

.field public q:I

.field public r:I

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz47;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lz47;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lk95;->a:Lz47;

    .line 12
    .line 13
    new-instance v0, Lwl6;

    .line 14
    .line 15
    const/16 v1, 0x15

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lwl6;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lk95;->b:Lwl6;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lk95;->c:Ljava/util/ArrayList;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lk95;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-instance v0, Lem7;

    .line 37
    .line 38
    const/16 v1, 0x14

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lem7;-><init>(B)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lk95;->e:Lem7;

    .line 44
    .line 45
    sget-object v0, Ld61;->l:Lra;

    .line 46
    .line 47
    iput-object v0, p0, Lk95;->f:Ld61;

    .line 48
    .line 49
    sget-object v0, Loq1;->m:Lra;

    .line 50
    .line 51
    iput-object v0, p0, Lk95;->g:Loq1;

    .line 52
    .line 53
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lk95;->i:Ljavax/net/SocketFactory;

    .line 61
    .line 62
    sget-object v0, Ll95;->w0:Ljava/util/List;

    .line 63
    .line 64
    iput-object v0, p0, Lk95;->l:Ljava/util/List;

    .line 65
    .line 66
    sget-object v0, Ll95;->v0:Ljava/util/List;

    .line 67
    .line 68
    iput-object v0, p0, Lk95;->m:Ljava/util/List;

    .line 69
    .line 70
    sget-object v0, Lj95;->a:Lj95;

    .line 71
    .line 72
    iput-object v0, p0, Lk95;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 73
    .line 74
    sget-object v0, Lto0;->c:Lto0;

    .line 75
    .line 76
    iput-object v0, p0, Lk95;->o:Lto0;

    .line 77
    .line 78
    const/16 v0, 0x2710

    .line 79
    .line 80
    iput v0, p0, Lk95;->r:I

    .line 81
    .line 82
    iput v0, p0, Lk95;->s:I

    .line 83
    .line 84
    iput v0, p0, Lk95;->t:I

    .line 85
    .line 86
    return-void
.end method
