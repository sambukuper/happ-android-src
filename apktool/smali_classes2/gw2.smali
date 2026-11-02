.class public final Lgw2;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Lsu/happ/proxyutility/dto/ServerConfig;

.field public h0:Ljava/util/Map;

.field public i0:Lca6;

.field public j0:Lea6;

.field public k0:Ljava/lang/String;

.field public l0:Ljava/util/Iterator;

.field public m0:Z

.field public n0:I

.field public synthetic o0:Ljava/lang/Object;

.field public final synthetic p0:Lkw2;

.field public q0:I


# direct methods
.method public constructor <init>(Lkw2;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgw2;->p0:Lkw2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls51;-><init>(Lq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lgw2;->o0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lgw2;->q0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lgw2;->q0:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lgw2;->p0:Lkw2;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p1, v0, p0}, Lkw2;->d(Ljava/lang/String;Ljava/lang/String;ZLs51;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
