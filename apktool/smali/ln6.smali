.class public final Lln6;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Ljava/lang/String;

.field public h0:[Ljava/lang/Object;

.field public i0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

.field public j0:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

.field public k0:Z

.field public l0:I

.field public synthetic m0:Ljava/lang/Object;

.field public final synthetic n0:Lmn6;

.field public o0:I


# direct methods
.method public constructor <init>(Lmn6;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lln6;->n0:Lmn6;

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
    .locals 7

    .line 1
    iput-object p1, p0, Lln6;->m0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lln6;->o0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lln6;->o0:I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, Lln6;->n0:Lmn6;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, Lmn6;->E(Ljava/lang/String;Lsu/happ/proxyutility/dto/ProfileRoutingSettings;Ljava/lang/String;[Lfn6;ZLs51;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
